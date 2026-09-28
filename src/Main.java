import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //arrayi artan azalan sira ile yazmaq
        int[] arr = {1, 6, 3, 9, 11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // İki indeksdəki elementlərin yerini dəyişilməsi(Swap)

      Scanner input = new Scanner(System.in);
      int[] array={22,10,2,4,9,33};
        System.out.print("enter a index: ");
        int index=input.nextInt();
        System.out.print("enter another index: ");
        int index2=input.nextInt();


        int temp=array[index];
        array[index]=array[index2];
        array[index2]=temp;



      for(int i=0;i<array.length;i++){
          System.out.print(array[i] + " ");
      }




        // Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.
        int[] arr1={2,10,3,5,77,88};
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                System.out.print(arr1[i]+" ");
            }
        }

        // Array-də təkrarlanan elementləri tapmaq

        int[] arr2 = {2, 33, 2, 4, 2, 77, 2, 77};
        int[] newArr2 = new int[arr2.length];
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            boolean present = false;

            for (int j = 0; j < newArr2.length; j++) {
                if (arr2[i] == newArr2[j]) {
                    present = true;
                    break;
                }

            }
            if (!present) {
                newArr2[count] = arr2[i];
                count++;
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.print(newArr2[i] + " ");
        }
        // arrayin ikinci en boyuk ve en kicik elementi
        int[] arr3 = {5, 2, 9, 1, 7};

        int max = arr3[0];
        int secondMax = arr3[0];

        int min = arr3[0];
        int secondMin = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr3[i] > max) {
                secondMax = max;
                max = arr3[i];
            }
            else if (arr3[i] > secondMax && arr[i] != max) {
                secondMax = arr3[i];
            }

            if (arr3[i] < min) {
                secondMin = min;
                min = arr3[i];
            }
            else if (arr3[i] < secondMin && arr3[i] != min) {
                secondMin = arr3[i];
            }
        }

        System.out.println( secondMax);
        System.out.println(secondMin);




    }
}