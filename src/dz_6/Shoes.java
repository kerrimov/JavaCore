package dz_6;

public class Shoes {
    int size;

    public Shoes(int size) {
        this.size = size;
    }

    public Shoes() {
        System.out.println("Пора больше кушать, слишком маленький размер");
    }

    public String keep(int summer){
        if (summer == 1) {
            System.out.println("Защита слабая");
        }
        else if (summer == 0){
            System.out.println("Защита высокая");
        }
        else System.out.println("Введите 0 или 1");

        return " ";
    }

    public void keep(){
        System.out.println("Обувь защищает");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
