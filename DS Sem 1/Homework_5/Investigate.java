public class Investigate {
    public static void main(String [] args) {
        Minimax model = new Minimax (3);
        System.out.println(model.root);
        for(Vertex child : model.root.children){
            System.out.println(child);
        }
    }
}