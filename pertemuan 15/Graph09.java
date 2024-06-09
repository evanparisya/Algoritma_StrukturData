
public class Graph09 {
    int vertex;
    DoubleLinkedList09 list[];

    public Graph09(int v) {
        vertex = v; 
        list = new DoubleLinkedList09[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList09();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        //list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut=0;
        for ( int i= 0; i < vertex; i++) {
            //inDegree
            for (int j = 0 ; j <list[i].size(); j++){
                if (list [i].get(j)==asal){
                    ++totalIn;
                }
            }

            //outDegree
            for (k =0; k<list[asal].size();k++){
                list[asal].get(k);
            }
            totalOut = k;
        }    
        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari gedung " + (char) ('A' + asal) + ": " + (totalIn+totalOut));
       // System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + ": " + list[asal].size());
        
    }

    public void removeEdge(int asal, int tujuan)throws Exception{
        for(int i = 0; i<vertex;i++){
            if (i == tujuan){
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAll(){
        for(int i = 0; i<vertex;i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for(int i = 0; i<vertex;i++){
            if (list[i].size() > 0){
                System.out.println("");
                System.out.println("Gedung " + (char)('A' + i) + " terhubung dengan");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.println((char)('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean bertetangga(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }
}