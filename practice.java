
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.*;



public class practice{

   
  public static int fact(int a){
   
    int fact = 1;
    for(int i=1; i<=a;i++){
      fact *= i;
    }
    
    return fact;
  }
 
  public static void decToBinary(int n){
    int pow=0;
    long binNum = 0;
   while(n>0){
    int rem = n%2;
    binNum+=(rem*(int)Math.pow(10,pow));
    pow++;
    n = n/2;
   }
   System.out.println(binNum);
  }
   
     public static int nCr(int n, int r){
   
    int nCr= fact(n)/(fact(r)*fact(n-r));
    System.out.println(nCr);
    return nCr;
  }
  public static int reverse(int n){
    int reverseNum=0;
   
   
    
    while (n>0) {
      int dgt= n%10;
      
      reverseNum = reverseNum *10 + dgt;
     
      n /= 10;
    }
    return reverseNum;
    }
 public static boolean isPalindrome(int n){
  if (n == reverse(n)){
    return true;
  }else{
    return false;
  }
 }
 public static void butterfly(int n){
  for(int i= 1; i<=n;i++){
    for(int j= 1; j<=i;j++){
      System.out.print("* ");
    }
    for(int j = 1; j<= 2*(n-i);j++){
      System.out.print("  ");
    }
     for(int j= 1; j<=i;j++){
      System.out.print("* ");
    }
    System.out.println();
  }
   for(int i= n; i>=1;i--){
    for(int j= 1; j<=i;j++){
      System.out.print("* ");
    }
    for(int j = 1; j<= 2*(n-i);j++){
      System.out.print("  ");
    }
     for(int j= 1; j<=i;j++){
      System.out.print("* ");
    }
    System.out.println();
  }
  
 }
public static int maxSumOfsubarr (int arr[]){
  int maxSum = Integer.MIN_VALUE;
 
  for (int i= 0; i < arr.length ; i++){
    int start = i;
    for(int j=i; j<arr.length; j++){
      int end =j;
      int curSum =0;
      for(int k = start; k<=end; k++ ){
        
        curSum += arr[k]; 
      }
     
      if(maxSum < curSum){
        maxSum = curSum;
      }
        }
  }
  return maxSum;
}
public static int reverseArr(int arr[]){
  int start = 0;
  int end = arr.length-1;
  while(start< end){
    int temp = arr[start];
   arr[start]   = arr[end] ;
    arr[end]  = temp;
    start++;
    end--;

  }
  return 0 ;
}
public static void printArr(int arr[]){
  System.out.print("{");
  for(int i=0; i<arr.length;i++){
    System.out.print(+arr[i]+",");
  }
  System.out.println("}");
}
public static void makePair(int arr[]){
for(int i=0; i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
    if(j+1<arr.length)
    System.out.print("("+arr[i]+","+arr[j]+")");

  }
  System.out.println();
}
}
public static void trapedWater(int arr[]){
 int maxRightBoundry[]=new int[arr.length];
 int maxLeftBoundry[]= new int[arr.length];
 int totalWater=0;
 for(int i=1; i<arr.length;i++){
  for(int j= 0 ; j<i;j++){
   
    maxLeftBoundry[i]= Math.max(arr[j],maxLeftBoundry[i]);
    
  }
  for(int j= i+1 ; j<arr.length;j++){
   
    maxRightBoundry[i]= Math.max(arr[j],maxRightBoundry[i]);
    
  }
    int waterLevel= Math.min(maxLeftBoundry[i],maxRightBoundry[i]);
    
    int  level=  waterLevel-arr[i];
    if(level >0)
    totalWater+= level;
 }

   System.out.println();
   System.out.println(totalWater);
}
  public static boolean isValueRepeated(int arr[]){
    
    for(int i=1; i<arr.length;i++){
     for(int j=i+1; j<arr.length;j++){
      if(arr[i]==arr[j]  ){
        return true;
      }
     }

    }
    return false;
  }
  public static int  indexOftarget(int arr[],int target){
    

      int start =0;
    int end = arr.length-1;
   int min = 0;
     for(;start<=end;) {
      int mid = (start+end)/2;
      if (arr[mid]<arr[mid-1]) {
        min = mid;
        break;
      }else if(arr[mid]>arr[mid-1]&& arr[mid]>arr[arr.length-1]){
        start= mid+1;
      }
       else {
        end=mid-1;
      }
    }
    if(target>arr[arr.length-1]){
      start=0;
      end = min-1;
    }else if(target==arr[arr.length-1]){
     return arr.length-1;
    }else{
      start= min;
      end = arr.length-1;
    }
    for(;start<=end;) {

      int mid = (start+end)/2;
      if (arr[mid]==target) {
        return mid;
        
      }else if(arr[mid]<target){
        start = mid+1;
      }
       else {
        end =mid-1;
      }
    }
   
      return -1;
  }
  public static int maxProfit(int arr[]){
    int currProfit = 0;
    int maxProfit =Integer.MIN_VALUE;
    int currMinPrice= arr[0];
    for(int i =1; i<=arr.length-1;i++){
      currProfit= arr[i]-currMinPrice;
      maxProfit= Math.max(maxProfit, currProfit);
      currMinPrice= Math.min(currMinPrice, arr[i]);
        }
        if(maxProfit>0){
          return maxProfit;
        }else{
          return 0;
        }

  }
  public static void threeSum(int arr[]){
    for(int i=0; i<=arr.length-1;i++){
      for(int j= i+1 ; j<arr.length; j++){
        for(int k=j+1;k<arr.length;k++){
          if (arr[i]+arr[j]+arr[k]==0) {
            
            System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
            
          }
        }

      }

    }
  }
  public static void selectionSorting(int arr[]){
    for(int i=0;i<=arr.length-2;i++){
       int indxOfmin=i;
    for(int j=i+1; j<=arr.length-1;j++){
     
      if(arr[indxOfmin]>arr[j]){
       indxOfmin=j;
       
      }
     
    }
    
  //swap
    int temp =arr[indxOfmin];
    arr[indxOfmin]= arr[i];
    arr[i]= temp;

  }
    printArr(arr);
  }
  public static void insertSorting(int arr[]){
    for(int i=1; i<arr.length;i++){
     
      int prev = i-1;
      while(prev>=0 && arr[prev]>arr[prev +1] ){
        int temp = arr[prev];
        arr[prev]=arr[prev+1];
        arr[prev+1]=temp;
        
        prev--;
      }
     
    }
    printArr(arr);
  }
public static void bubbleSort(int[] arr){
  for(int i=0; i<arr.length-1;i++){
    
    for(int j=i+1;j<arr.length;j++){
    
      if (arr[i]<arr[j]){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
      }
    }
  }
  printArr(arr);
}
public static void countingSort(int[] arr){
  int maximumNum=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++){
    maximumNum= Math.max(maximumNum, arr[i]);
  }
  int[] count= new int[maximumNum+1];
  for(int i= 0; i<arr.length;i++){
    count[arr[i]]++;
  }
  int j=0;
  for(int i=0; i<count.length;i++){

    while(count[i]>0){
      arr[j]=i;
      j++;
      count[i]--;
    }
  }
  printArr(arr);
}
public static void print2dArray(int[][]arr){
 
  for(int i=0; i<arr.length;i++){
    System.out.print("{");
    for(int j=0; j<arr[i].length;j++){
      System.out.print(arr[i][j]+",");
    }
    System.out.println("}");
  }
 
} 
public static void spiralMatrix(int[][]arr){
  for(int i=0; i<arr.length/2;i++){
      for(int j=i;j<arr[i].length-i;j++){
      System.out.println(arr[i][j]);
      }
      for(int j=i+1;j<arr.length-1;j++){
        
        System.out.println(arr[j][arr[j].length-1-i]);
      }
      for(int j=arr[arr.length-1-i].length-1-i;j>=i;j--){
        System.out.println(arr[arr.length-1-i][j]);
      }

      for(int j=arr.length-2-i;j>=i+1;j--){
      System.out.println(arr[j][i]);
        
       
      }
      
  }
}
public static void diognalSum(int[][]arr){
  int sum=0;
  
  for(int i=0;i<arr.length;i++){
   sum+=arr[i][i];
   if(i!=(arr.length-1-i))
   sum += arr[i][arr.length-1-i];
  }
  System.out.println(sum);
}
public static int searchMatrix(int[][]arr,int target){
  int row=0;
  int col=arr.length-1;
  while(row<arr.length ){
  if(arr[row][col]==target){
    System.out.println("("+row+","+col+")");
   return 0;
  
  }else if(arr[row][col]<target){
    row++;
   
  }
  else{
    col--;
  }
  
}
System.out.println("target not found");
  return 0;
}
public static boolean isStringPalindrome(String str){
  for(int i = 0 ;i<str.length()/2;i++){
    if(str.charAt(i) != str.charAt(str.length()-1-i)){
      return false;
    }
  }
  return true;
}
public static void shortDis(String str){
int x=0;
int y=0;

for(int i= 0; i<str.length();i++){

 
  if( str.charAt(i) == 'E'){
    x++;
  }else if( str.charAt(i) == 'W'){
    x--;
  }
  else if(str.charAt(i) == 'N'){
    y++;
  }else{
    y--;
  }
 
}
System.out.println(Math.sqrt((x*x)+(y*y))); 
}
public static void toUpperCase(String str){
   StringBuilder str2 = new StringBuilder("");
  str2.append(Character.toUpperCase(str.charAt(0))); 

    for(int i= 1;i<str.length();i++){
      
     if(str.charAt( i-1)==' '){
      str2.append(Character.toUpperCase(str.charAt(i)));
       }else{  str2.append(str.charAt(i)) ;
      }
      

    }
 System.out.println(str2);
}
public static int vowelCount(String str){
  int  count =0;
  for(int i=0; i<str.length();i++){
    if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' 
    || str.charAt(i)== 'o'||str.charAt(i)== 'u' ){
      count++;
    }
  }
  return count;
}
public static int maxSum(int[]arr){
  int maxSum=Integer.MIN_VALUE;
  int currSum= 0;
  for(int i=0; i<arr.length;i++){
    currSum += arr[i];
    if(currSum>0){
      maxSum = Math.max(maxSum, currSum);
    }else{
      currSum=0;
    }

  }
  return maxSum;
}
public static boolean isAnagrams(String str, String str1){
  str = str.toLowerCase();
  str1 = str1.toLowerCase();
  char[] strArr= str.toCharArray();
  char[] str1Arr= str1.toCharArray();
  Arrays.sort(strArr);
  Arrays.sort(str1Arr);
return (Arrays.equals(strArr,str1Arr));
      

}
public static void Strings(){                         
 
 String str= "sumitBhaiya";
 String str1 = new String("sumitBhaiya");
  StringBuilder str2 = new StringBuilder("Hii my name is sumitraj singh tomar"); 
 System.out.println(str.equals(str1) );
 System.out.println(str==str1);
  }
public static int getIthBit(int n,int i){
  int bitMask = 1<<i;
  if((n & bitMask)==0){
    return 0;
  }else{
    return 1;
  }

}
public static int setIthBit(int n, int i){
  int bitMask = 1<<i;
  return n|bitMask;
}
public static int clearIthBit(int n, int i){
  int biMask = ~(1<<i);
  return n & biMask;

}
public static int updateIthBit(int n, int i, int nb){
  if(nb == 0){
    return clearIthBit(n, i);
  }else{
    return setIthBit(n,i);
  }
}
public static int clearLastIthBits(int n, int i){
  int bitMask = (~0)<<i+1;

  return n&bitMask;
}
public static int clearBits(int n, int i, int j){
  int a = (~0)<<j+1;
  int b = (1<<i)-1;
  int bitMask = a|b;
  return n & bitMask;
}
public static boolean isPowerOfTwo(int n){
  if((n & n-1)!=0 || n==1){
    return false;
  }else{
    return true;
  }
}
public static int countSetBits(int n){
    int count =0;
    for(int i=0;Math.pow(2,i)<= n;i++){
        if((n & (int)Math.pow(2, i)) != 0){
            count++;
            
        }
    }
    return count;
}
public static int fastExpo(int a, int n){
  int ans=1;
  while(n>0){
    if(( n & 1) != 0){
      ans *= a;
    }
     a = a*a;
     n = n>>1;
  }
  return ans;
  
}
public static void rotate(int[] arr, int k) {
        int n = arr.length;
        int p = k%n;
        if(p>0){
            int temp = arr[n-1];
            for(int i=(n*p)-1;i>=p;i-=p){
                System.out.println(i);
                arr[i%n]= arr[(i-p)%n];
            }
            arr[p-1]= temp;
        }
    }
    public static boolean isBobWins(String str){
      int sum1=0;
      int sum2=0;
      int bob1 = 0;
      int bob2 = 0;
      int alice1 =0;
      int alice2 =0;
      int p=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='?'){
          if(i<str.length()/2 ){
            if(p%2 == 0){
              alice1++;
            }else{
              bob1++;
            }
            p++;
          }else{
            if(p%2==0){
              alice2++;
            }else{
              bob2++;
            }
            p++;
          }
        }else{
          if(i<str.length()/2 ){
            sum1 += str.charAt(i)-48;
          }else{
            sum2 += str.charAt(i)-48;
          }

        }
      }
      int diff = Math.abs(sum1-sum2);
      System.out.println(diff);
      p=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='?'){
          if(p%2==0){
            if(i<str.length()/2){
              if(sum1>=sum2){
                sum1 +=9;
              }
            }else{
              if(sum2>=sum1){
                sum2 +=9;
              }
            }
          }else{
            if(i<str.length()/2){
              if(sum1<sum2){
                sum1 += 9;
              }
            }else{
              if(sum2<sum1){
                sum2 += 9;
              }
            }
          }
          p++;
        }
      
      }
      diff = Math.abs(sum1 - sum2);
      System.out.println(diff);
      return true;
    }
// Hii my name is Sumitraj Singh Tomar and I wrote this code 
//and I want you to explain my code very easily to other students 
   public static void main(String args[]){
    
    //    int[] arr = {11,9,10,7,6,5};
    // rotate(arr,4);
    // printArr(arr);
  // System.out.println( isValueRepeated( arr )); ;
    isBobWins("98?00?26??");
}
} 

