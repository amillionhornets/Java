public class Investigate {
    public static void main(String [] args) {
        Minimax model = new Minimax (3);
        System.out.println(DFS(model.root, 1));
        System.out.println(DFS(model.root, 0));
        System.out.println(DFS(model.root, -1));
    }
    public static int DFS(Vertex root, int turn){
        if(root.children.size() <= 0){
            return root.utility == turn ? 1 : 0;
        }
        int returnNum = 0;
        for(Vertex child : root.children){
            returnNum += DFS(child, turn);
        }
        return returnNum;
    }
}