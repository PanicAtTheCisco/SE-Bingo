public class ball {

    private int x;
    private int y;

    public ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getPosition() {
        return new int[] {x, y};
    }

}