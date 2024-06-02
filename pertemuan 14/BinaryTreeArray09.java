public class BinaryTreeArray09 {
    int[] data;
    int idxLast;

    public BinaryTreeArray09() {
        data = new int [10];
    }
    void populatedData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int data){
        if(idxLast == this.data.length -1){
            System.out.println("Tree Array sudah Penuh");
        }else{
            this.data[++idxLast] = data;
        }
    }
    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            System.out.print(" "+data[idxStart]);
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(" "+data[idxStart]);
        }
    }
}
