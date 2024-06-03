public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray09 bta = new BinaryTreeArray09();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populatedData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    
        System.out.println("\n==============================");
        System.out.println("     Hasil Tugas NO 5          ");
        System.out.println("==============================");
        bta.add(90);
        bta.add(72);
        System.out.println("method traverse PreOrder");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("method traverse PostOrder");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
