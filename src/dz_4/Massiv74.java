package dz_4;

public class Massiv74 {
    public static void main(String[] args) {
        int mas[][] = new int[7][4];
        int arr[] = new int[mas.length];
        int max=0,max_index=0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 11) - 5;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
                if (j == 0)
                    arr[i] = mas[i][j];

                else
                    arr[i] *= mas[i][j];
            }
            System.out.println(" ");
        }

        for(int i=0;i<arr.length;i++){
            if(Math.abs(arr[i])>max){
                max=arr[i];
                max_index=i;
            }
        }

        System.out.println("Строка: "+max+" Индекс: "+max_index);

    }
}
