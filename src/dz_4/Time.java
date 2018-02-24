package dz_4;

public class Time {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j=0; j<=59;j++){
                if (i/10%10==j%10&i%10==j/10%10) {
                    count=count+1;
                }

            }

        }
        System.out.println(count);
    }
}
