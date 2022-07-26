import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("tim max trong mang!");
        Scanner scanner= new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("size should not exceed 20");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("enter alemen " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println("the largest property value in the list is " + max+" ,at position " + index);
    }

}