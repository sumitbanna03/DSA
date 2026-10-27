public class dnc {
        public static void mergeSort(int left, int right, int arr[]){
        if(left<right){
            int mid = (left+right)/2;
             mergeSort(left, mid, arr);
             mergeSort(mid+1, right, arr);
             merge(left,mid,right,arr);
        }
    }
    public static void merge(int left, int mid, int right,int arr[]){
        int temp[] = new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i <= mid && j <= right){
            if(arr[i]>arr[j]){
                temp[k] = arr[j];
                j++;
            }else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        while(j<=right){
            temp[k++]= arr[j++]; 
        }
        while(i<=mid){
            temp[k++]= arr[i++];
        }
        i=  left;
        for(k=0;k<temp.length;k++){
            arr[i++] = temp[k];
        }
    }
        public static void printArr(int[]arr){
    System.out.print("{");
    for(int i=0; i< arr.length;i++){

      System.out.print(arr[i]+ ",");
    }
    System.out.println("}");
  }
  public static void printStringArr(String arr[]){
        System.out.print("{");
    for(int i=0; i< arr.length;i++){

      System.out.print(arr[i]+ ",");
    }
    System.out.println("}");
  }
  
    public static void quickSort(int arr[], int left, int right){
        if(left < right){
        int pi = partition(arr, left, right);
        quickSort(arr, left, pi-1);
        quickSort(arr, pi+1, right);
        }
    }
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int partition(int arr[], int left, int right){
        int i=left;
        for(int j=left;j<right;j++){
            if(arr[j]<arr[right]){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, right, i);
        return i;
    }
    public static int modifiedBS(int arr[],int left, int right, int target){
        if(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]< arr[right]){
                if(target <= arr[right] && target > arr[mid]){
                    return modifiedBS(arr, mid+1, right, target);
                }else{
                    return modifiedBS(arr, left, mid-1, target);
                }  
            }else{
                if(target > arr[left] && target < arr[mid]){
                    return modifiedBS(arr, left, mid-1, target);
                }else{
                    return modifiedBS(arr, mid+1, right, target);
                }
            }
            
    }
    return -1;
    }
    public static void mergeSortForString(int left, int right, String arr[]){
        if(left<right){
            int mid = (left+right)/2;
             mergeSortForString(left, mid, arr);
             mergeSortForString(mid+1, right, arr);
             mergeString(left,mid,right,arr);
        }
    }
    public static void mergeString(int left, int mid, int right,String arr[]){
        String temp[] = new String[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i <= mid && j <= right){
            if(arr[i].compareTo(arr[j]) > 0){
                temp[k] = arr[j];
                j++;
            }else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        while(j<=right){
            temp[k++]= arr[j++]; 
        }
        while(i<=mid){
            temp[k++]= arr[i++];
        }
        i=  left;
        for(k=0;k<temp.length;k++){
            arr[i++] = temp[k];
        }
    }
    public static int majElement(int arr[]){
          int res=arr[0];
          int majority=1;
          for(int i=1;i<arr.length;i++){
            if(majority == 0){
                res = arr[i];
            }
            if(arr[i] ==  res){
                majority++;
            }else{
                majority--;
            }
          }
          return res;
            }
        
    public static int inversionCount(int arr[]){
         int ic=0;
         for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    ic++;
                }
            }
         }
         return ic;
    }

       public static void main(String arg[]){
        int arr[] ={12,33,43,5,76,8,19,29,32,11,50,};
        int arr1[] = {12,23,4,5,12};
        String strs[] = {"sumit","aman","rahul","ram","sahil","riya"};
        // quickSort(arr, 0, arr.length-1);

        // printStringArr(strs); 
        // mergeSortForString(0,strs.length-1,strs);
        // printStringArr(strs);
        System.out.println(inversionCount(arr)); 
        
    }
}
