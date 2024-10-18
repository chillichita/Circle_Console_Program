package Circle;
/**
 * The CircleColsFill class is responsible for the filled circle.
 * Inherits the CircleColsBase class and fills the buffer with characters for the filled circle.
 */
public class CircleColsFill extends CircleColsBase {

    public CircleColsFill(int diameter) {
        super(diameter);
    }

    @Override
    public void fillBuffer(byte[] buffer, byte symbol) {
        for (int i = _col0; i <= _col1; i++) {
            buffer[i] = symbol;
        }
    }
}
