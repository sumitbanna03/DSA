import java.util.*;

 public class recursion{
    public static int nthFIbonacciNO(int n){
        if( n==0){
            return 0;
        }
        if( n==1){
            return 1;
        }
        int fn = nthFIbonacciNO(n-2)+nthFIbonacciNO(n-1);
        return fn;
        }
    public static boolean isSorted(int arr[], int n){
        if(n-1 == 0){
            return true;
        }
        return ( arr[n-1]>= arr[n-2])&&(isSorted(arr,n-1));
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length) return -1;
        if(arr[i]==key) return i;
       return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){

        if(i == -1) return -1;
        if(arr[i]==key) return i;
       return lastOccurence(arr, key, i-1);
    }
    public static int xKiPowerN(int x, int n){
        if(x==0)return 0;
        if(n==0)return 1;
        int halfPower = xKiPowerN(x, n/2);
        if(n % 2 == 0){
            return(halfPower*halfPower);
        }else{
            return(x* halfPower*halfPower );
        }
    }
    public static int tilling(int n){
        if(n==1 || n==0){
            return 1;
        }
        int verticalTiles = tilling(n-1);
        int horizontalTiles = tilling(n-2);

        int totalWays = verticalTiles+horizontalTiles;
        return totalWays;
    }

    public static void dupRemover(String str, int i, String newStr ){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        for(int j=0;j<newStr.length();j++){
            if(newStr.charAt(j)==str.charAt(i)){
                dupRemover(str, i+1, newStr);
                return;
            }
                    }
        newStr += str.charAt(i);
        dupRemover(str, i+1, newStr);
    }
    public static void binString(int n, int pre, String str ){
        if(n==0){
            System.out.println(str);
            return;
        }
        binString(n-1, 0, str + "0");
        if(pre == 0){
            binString(n-1, 1, str + "1");
        }


    }
    //---Assignment----
    public static void allOccurence(int arr[], int key, int i){
        if(i == arr.length) return;
        if(arr[i]==key) System.out.print(i+" ");
        allOccurence(arr, key, i+1);
    }
    public static String digitToStr(int n){
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "none";
        }
    }
    public static String numTOString(int n, String str){
        if(n==0){
            return str;
        }
        int digit = n%10;
        str = " "+ digitToStr(digit)+str;
        return numTOString(n/10, str);
    }
    public static int len(String str, int i){
        if(i==str.length()){
            return 0;
        }
        return 1+len(str, i+1);
    }
    public static void firstToLast(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, int n){
        if(n==1){
            C.addLast(A.getLast());
            A.removeLast();
            return;
        }
        firstToLast(A,C,B,n-1);
        C.addLast(A.getLast());
        A.removeLast();
        firstToLast(B,A,C,n-1);
    } 

    public static void printArr(int[]arr){
    System.out.print("{");
    for(int i=0; i< arr.length;i++){

      System.out.print(arr[i]+ ",");
    }
    System.out.print("}");
  }
        public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,8,9,10,8,15,43,65,15,8};
        String str = "cristianaldo";       
        ArrayList <Integer> A = new ArrayList<>();
        A.addLast(12);
        A.addLast(10);
        A.addLast(8);
        A.addLast(5);
        ArrayList <Integer> B = new ArrayList<>();
        ArrayList <Integer> C = new ArrayList<>();
       
        
    }
}        