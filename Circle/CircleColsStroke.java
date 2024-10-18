package Circle;
/**
 * The CircleColsStroke class is responsible for a circle with a stroke.
 * Inherits the CircleColsBase class and fills the buffer with characters only at the edges of the circle.
 */
public class CircleColsStroke extends CircleColsBase {

    public CircleColsStroke(int diameter) {
        super(diameter);
    }

    @Override
    public void fillBuffer(byte[] buffer, byte symbol) {
        buffer[_col0] = symbol;
        buffer[_col1] = symbol;
    }
}
