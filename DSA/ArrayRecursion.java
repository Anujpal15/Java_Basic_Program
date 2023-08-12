package DSA;

public class ArrayRecursion {
    static void printArray(int [] arr , int idx){
        if (idx == arr.length)return;
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);

    }

    static int maxInArray(int [] arr, int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = maxInArray(arr , idx +1);

        return Math.max(smallAns,arr[idx]);
    }

    public static void main(String[] args) {
        int arr []= {5,6,4,8,4,};
//        printArray(arr,0);
        System.out.println( maxInArray(arr,0));

    }
}
