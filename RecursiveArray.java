public class RecursiveArray{

    //recursion is method that calls itself
    //base case is program thats smaller
    public static void main(String[] args){
        int[] a = {22,33,44};
        System.out.println("Arrays forwards. . .");
        printArray(a,0);
        
        System.out.println("\nArray backwards. . .");
        printArrayBackwards(a, a.length - 1);
        
    }
    public static void printArray(int[] a, int n){
        if (n== a.length-1) //Base case
            System.out.println(a[n]);
        else{ //general case , recursive case
            System.out.print(a[n] + " ");
            printArray(a, n+1);
        }
    }
    public static void printArrayBackwards(int[] a, int n){
        if (n==0)
            System.out.println(a[n]);
        else{
            System.out.print(a[n] + " ");
            printArrayBackwards(a, n-1);
        }
    }
}