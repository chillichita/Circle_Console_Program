package Circle;
/**
 * The CircleRowOut class is responsible for printing the circle row to the console.
 */
public class CircleRowOut {
    private byte[] _buffer;

    public CircleRowOut(int diameter) {
        _buffer = new byte[diameter];

        for (int i = 0; i < _buffer.length; i++) {
            _buffer[i] = ' ';
        }
    }

    /**
     * The print method prints the circle row to the console.
     * @param cols The CircleCols object containing the data to fill the row.
     */
    public void print(CircleCols cols) {
        cols.fillBuffer(_buffer, (byte) '*');
        System.out.println(new String(_buffer));
        cols.fillBuffer(_buffer, (byte) ' ');
    }
}
