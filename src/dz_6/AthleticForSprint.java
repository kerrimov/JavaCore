package dz_6;

public class AthleticForSprint extends Athletic {
    int thorns_length;

    public AthleticForSprint(int size, int thorns, int thorns_length) {
        super(size, thorns);
        thorns_length = thorns_length;
    }

    public AthleticForSprint() {
        System.out.println("Пора купить обувь для бега");
    }

    public int SPEED (int speed, int thorns,int thorns_length){
        speed = speed+2;
        return speed;
    }

    @Override
    public void SPEED (){
        System.out.println("Вы не можете ускориться");
    }

    public int getThorns_length() {
        return thorns_length;
    }

    public void setThorns_length(int thorns_length) {
        thorns_length = thorns_length;
    }
}
