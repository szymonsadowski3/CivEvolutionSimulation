package pl.edu.agh.kis.civsim.helpers;

public class SquareRepresentation {
    private int x;
    private int y;
    private int length;

    public SquareRepresentation(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "SquareRepresentation{" +
                "x=" + x +
                ", y=" + y +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SquareRepresentation that = (SquareRepresentation) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return length == that.length;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + length;
        return result;
    }
}
