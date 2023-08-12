package Try_code;

public class Test_05 {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2[] = new int[arr1.length];

        for (int i = 0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.print("Array 1 : ");
        for (int i=0; i<arr1.length;i++){

            System.out.print( arr1[i]+" ");
        }
        System.out.println();

        System.out.print("Array 2 : ");
        for (int i=0; i<arr2.length;i++){

            System.out.print(arr2[i]+" ");

        }

    }
}
