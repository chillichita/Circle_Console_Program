package Circle;
/**
 * The CircleCols interface defines methods for calculating the coordinates of a circle row
 * and filling a buffer with characters to display the circle.
 */
public interface CircleCols {

    /**
     * The calculate method calculates values for a specific row of the circle.
     * @param row The row number to calculate.
     */
    void calculate(int row);

    /**
     * The fillBuffer method fills the buffer with the circle characters.
     * @param buffer A buffer to store the characters of the row.
     * @param symbol A character to fill the row with.
     */
    void fillBuffer(byte[] buffer, byte symbol);

}