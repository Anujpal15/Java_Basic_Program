package DSA;

public class Search {

//    Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array.
    static void findAllIndices(int [] a, int n , int target, int idx)
    {
        if (idx >= n){
            return;
        }
        if (a[idx]== target){
            System.out.println(idx);
        }
        findAllIndices(a,n,target, idx+1);
    }

    //   Given an array of n integer and a target value x. Print whether x exists in the array or not.
    static int searchIndex(int [] a , int n , int target, int idx) {
        if (idx >= n)return -1;
        if (a[idx] == target)return idx;

        return  searchIndex(a, n, target, idx + 1);
    }

//   Given an array of n integer and a target value x. Print whether x exists in the array or not.

    static boolean search(int [] a , int n , int target, int idx){
        if (idx >= n){
            return false;
        }
        if (a[idx] == target)
            return true;
            if (search(a,n,target,idx+1)){
                return true;
            }
            else {
               return false;
            }
        }


    public static void main(String[] args) {
//        int [] a = {1,2,4,6};
//        int target = 4;
//        if (search(a, target,a.length, 0)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

       int [] a = {2,3,4,4,4,5,6};
       int n = a.length;
       int target = 4;
       findAllIndices(a,n,target,0);
    }
}
