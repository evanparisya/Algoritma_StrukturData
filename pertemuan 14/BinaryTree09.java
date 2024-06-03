/**
 * BinaryTree09
 */
public class BinaryTree09 {

    Node09 root;

    public BinaryTree09() {
        root = null;
    }

    boolean isEmpty() {
        return root== null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node09(data);
        } else {
            Node09 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.right==null) {
                        current.right = new Node09(data);
                    } else{
                        current = current.right;
                    }
                } else if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node09(data);
                    } else {
                        current = current.left;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node09 current = root;
        while (current !=null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.right;
            } else if (data < current.data) {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node09 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node09 getSuccessor(Node09 del) {
        Node09 successor = del.right;
        Node09 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor  = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data==data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current==null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left==null) {
                if (current==root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else {
                Node09 successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void addNodeR(int key) {
        root = addNodeR(root, key);;
    }
// soal 1
    Node09 addNodeR (Node09 current, int data) {
        if (current == null) {
            return new Node09(data);
        }
        if (data < current.data) {
            current.left = addNodeR(current.left, data);
        } else if (data > current.data) {
            current.right = addNodeR(current.left, data);
        } else {
            return current;
        }
        return current;
    }



// soal 2
void maksimal() {
    if (root == null) {
        System.out.println("Pohon biner masih kosong");
        return;
    }
    Node09 current = root;
    while (current.right != null) {
        current = current.right;
    }
    System.out.println(current.data);
}
void minimal() {
    if (root == null) {
        System.out.println("Pohon biner masih kosong");
    }
     Node09 current = root;
     while (current.left != null) {
        current = current.left;
     }
     System.out.println(current.data);
}

// soal 3
void printLeft(Node09 root) {
    if (root == null) {
        return;
    }
    if (root.left == null && root.right == null) {
        System.out.print(" "+ root.data);
        return;
    } if (root.left != null) {
        printLeft(root.left);
    } if (root.right != null) {
        printLeft(root.right);
    }
}

// soal 4
int jumlahLeft() {
    return jumlahLeft(root);
}
int jumlahLeft(Node09 node) {
    if (node == null) {
        return 0;
    }
    if (node.left == null && node.right == null) {
        return 1;
    } else {
        return jumlahLeft(node.left) + jumlahLeft(node.right);
    }
}
}