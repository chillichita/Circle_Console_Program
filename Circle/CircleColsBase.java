package Circle;
/**
 * The abstract class CircleColsBase implements the basic calculations for circle coordinates.
 * This class contains the logic for calculating the bounds of a circle row.
 */
public abstract class CircleColsBase implements CircleCols {
    private double _radiusIndex;
    private double _radiusIndex2;
    protected int _col0, _col1;

    public CircleColsBase(int diameter) {
        _radiusIndex = (diameter - 1d) / 2d;
        _radiusIndex2 = _radiusIndex * _radiusIndex;
    }

    @Override
    public void calculate(int row) {
        double y = row - _radiusIndex;
        double x = Math.sqrt(_radiusIndex2 - y * y);
        _col0 = (int) (_radiusIndex - x);
        _col1 = (int) (_radiusIndex + x);
    }

    @Override
    public abstract void fillBuffer(byte[] buffer, byte symbol);
}