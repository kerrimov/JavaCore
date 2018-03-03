package dz_6;

public class Slippers extends Shoes {
    int color;

    public Slippers(int size, int color) {
        super(size);
        this.color = color;
    }

    public Slippers(int color) {
        if (color == 1)
            System.out.println("Зеленые тапочки");
        else
            System.out.println("Прозрачные тапочки");
    }

    public Slippers() {
        this(1);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
