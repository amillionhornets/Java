public class Graph {
    public static void main(String[] args) {
        // Vertex s = new Vertex();
        double[][] w = weights("dijkstra2.txt");
        Vertex[] q = initialiseSingleSource(w, 0);
        dijkstra(q, w, 0);
        System.out.println("Dijkstra's ->");
        for(Vertex v : q){
            System.out.println(v.toString());;
        }
        System.out.println("");
        System.out.println("Bellman ford's ->");
        w = weights("bellmanford1.txt");
        q = initialiseSingleSource(w, 0);
        bellmanFord(q, w, 0);
        for(Vertex v : q){
            System.out.println(v.toString());;
        }
    }
    public static Vertex[] initialiseSingleSource(double[][] w, int source){
        Vertex[] Q = new Vertex[w.length];
        for (int i = 0; i < w.length; i++) {
            Q[i] = new Vertex(i);
        }
        Q[source].d = 0;
        return Q;
    }
    public static void relax(Vertex u, Vertex v, double[][] w){
        if(w[u.i][v.i] != 0 && v.d > u.d + w[u.i][v.i]){
            v.d = u.d + w[u.i][v.i];
            v.pi = Character.toString((char)(97 + u.i));
        }
    }
    
    public static Vertex dequeue(Vertex[] Q){
        Vertex ret = null;
        for(Vertex v : Q)
            ret = !v.visited && (ret == null || ret.d > v.d) ? v : ret;
        if(ret != null)
            ret.visited = true;   
        return ret;
    }
    
    public static Vertex[] bellmanFord(Vertex[] q, double[][] w, int source){
        for (int i = 0; i < q.length - 1; i++) {
            for (int j = 0; j < q.length - 1; j++) {
                for (int k = 0; k < q.length; k++) {
                   relax(q[j], q[k], w); 
                }
            }
        }
        for (int i = 0; i < q.length - 1; i++) {
            for (int j = 0; j < q.length; j++) {
                if(w[j][i] != 0 && q[j].d > q[i].d + w[j][i]){
                    return null;
                }
            }
        }
        return q;
    }

    public static void dijkstra(Vertex[] q, double[][] w, int source){
        Vertex u = null;
        while((u = dequeue(q)) != null){
            for(Vertex v : q) {
                relax(u, v, w);
            }
        }
    }
    public static double[][] weights(String path){
        String contents = Frequency.read(path);
        String[] rows = contents.split("\n");
        double[][] w = new double[rows.length][rows.length];
        String[] cols = null;
        for(int i = 0; i < rows.length; i++) {
            cols = rows[i].split(",");
            for (int j = 0; j < cols.length; j++) {
                w[i][j] = Double.parseDouble(cols[j]);
            }
        }
        return w;
    }
}

class Vertex{
    boolean visited = false;
    double d = Double.POSITIVE_INFINITY;
    String pi =  Character.toString(this.label());
    int i = -1;
    
    public Vertex(int i){
        this.i = i;
        this.pi = "pi";
    }
    public String toString(){
        return String.format("%C: %.0f via %s",this.label(), this.d, this.pi);
    }
    public char label(){
        return (char)(this.i + 'a');
    }
    
}