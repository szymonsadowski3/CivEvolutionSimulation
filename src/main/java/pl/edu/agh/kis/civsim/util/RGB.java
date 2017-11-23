package pl.edu.agh.kis.civsim.util;

public class RGB {
    private float red;
    private float green;
    private float blue;

    public RGB(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public RGB(int pixel) {
        this.red = (pixel >> 16) & 0xff;
        this.blue = (pixel >> 8) & 0xff;
        this.green = (pixel) & 0xff;
    }

    public float getRed() {
        return red;
    }

    public void setRed(float red) {
        this.red = red;
    }

    public float getGreen() {
        return green;
    }

    public void setGreen(float green) {
        this.green = green;
    }

    public float getBlue() {
        return blue;
    }

    public void setBlue(float blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "RGB{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
