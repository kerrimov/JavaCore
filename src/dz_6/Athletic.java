package dz_6;

public class Athletic extends Shoes {
    int thorns;

    public Athletic(int size, int thorns) {
        super(size);
        this.thorns = thorns;
    }

    public Athletic() {
        this(40, 2);
    }

    public int SPEED (int speed, int thorns){
        speed++;
        return speed;
    }

    public void SPEED (){
        System.out.println("Вы не можете ускориться");
    }

    public int getThorns() {
        return thorns;
    }

    public void setThorns(int thorns) {
        this.thorns = thorns;
    }
}
