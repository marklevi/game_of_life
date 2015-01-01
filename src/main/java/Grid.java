public class Grid {

    private final int[][] grid;

    public Grid(int rows, int columns) {
        this.grid = new int[rows][columns];
    }

    public int[][] returnState() {
        return grid;
    }
}
