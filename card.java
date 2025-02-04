public class card {

    private String id = "";
    private int[][] layout = new int[5][5];
    private boolean[][] marked = new boolean[5][5];

    public card(String id, int[][] layout, boolean[][] marked) {
        this.id = id;
        this.layout = layout; 
        this.marked = marked;
    }

    public String getId() {
        return id;
    }

    public int[][] getLayout() {
        return layout;
    }

    public boolean[][] getMarked() {
        return marked;
    }

    public void mark(int x, int y) {
        marked[x][y] = true;
    }
    
}
