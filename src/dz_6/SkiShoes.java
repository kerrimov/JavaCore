package dz_6;

public class SkiShoes extends Shoes {
    String clasps;

    public SkiShoes(int size, String clasps) {
        super(size);
        this.clasps = clasps;
    }

    public SkiShoes() {
        System.out.println("У вас нет застежек");
    }

    public String getClasps() {
        return clasps;
    }

    public void setClasps(String clasps) {
        this.clasps = clasps;
    }
}
