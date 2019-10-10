package id.ac.polinema.idealbodyweight.util;

public class BmiIndex {
    private float mass;
    private float height;
    private float index;

    public BmiIndex(int mass, int height) {
        this.mass = mass;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return mass / ((height * height) / 10000);
    }
}
