package dz_6;

public class FishingShoes extends Shoes {
    String material;

    public FishingShoes() {
        this("rubber");
    }

    public FishingShoes(String material) {
        this.material = material;
        if (material == "rubber") {
            System.out.println("Твои ноги сухие");
        } else System.out.println("Твои ноги промолки!");
    }

    public FishingShoes(int size, String material) {
        super(size);
        this.material = material;
    }

    @Override
    public void keep() {
        super.keep();
        System.out.println("Можешь рыбачить");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
