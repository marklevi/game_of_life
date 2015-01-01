import org.junit.Assert;
import org.junit.Test;

public class GridTest {

    @Test
    public void generateTwoByTwoBoard() throws Exception {
        final Grid grid = new Grid(2, 2);
        int[][] expectedState = {{0, 0}, {0, 0}};
        final int[][] actualState = grid.returnState();
        Assert.assertArrayEquals(expectedState, actualState);
    }

}