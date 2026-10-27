
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

    public static boolean checkMonotic(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 2; i++) {
            if ((list.get(i) > list.get(i + 1) && list.get(i + 1) < list.get(i + 2)) || (list.get(i) < list.get(i + 1) && list.get(i + 1) > list.get(i + 2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            if (list.get(rp) + list.get(lp) == target) {
                return true;

            }
            if (list.get(rp) + list.get(lp) < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                lp = i + 1;
                rp = i;
                break;
            }
        }

        while (lp != rp) {
            if (list.get(rp) + list.get(lp) == target) {
                return true;

            }
            if (list.get(rp) + list.get(lp) < target) {
                lp = (lp + 1) % list.size();
            } else {

                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
        return list;
    }

    public static ArrayList<Integer> lonelyNums(ArrayList<Integer> list) {
        ArrayList<Integer> nums = new ArrayList<>();
        // int maxNum = Integer.MIN_VALUE;
        // 
        //  // for (int i=0; i<list.size();i++){
        //     maxNum = Math.max(maxNum, list.get(i));
        // }

        // int[] count = new int[maxNum + 1];
        // for(int i=0;i<list.size();i++){
        //     if(count[list.get(i)] > 1)
        //  }
        for (int i = 0; i < list.size(); i++) {
            boolean iL = true;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (((list.get(j)) == (list.get(i))) || list.get(j) == list.get(i) - 1 || list.get(j) == list.get(i) + 1) {
                    iL = false;
                    break;

                }

            }
            if (iL) {
                nums.add(list.get(i));
            }
        }
        return nums;
    }

    public static void main(String arg[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(5);
        height.add(2);
        height.add(4);
        height.add(7);
        height.add(6);
        height.add(8);
        height.add(13);
        height.add(17);
        height.add(0, 23);//--It adds new value to list and move others
        height.set(0, 22);//--It first deletes the val at the index then add new value there
        // Collections.sort(height);
        // Collections.sort(height, Collections.reverseOrder());
        // System.out.println((height));

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l2.add(21);
        l2.add(22);
        l2.add(23);
        l3.add(31);
        l3.add(32);
        l3.add(33);
        matrix.add(l1);
        matrix.add(l2);
        matrix.add(l3);
        System.out.println(matrix);
        // int maxArea =0;
        // for(int i=0; i<height.size();i++){
        //      for(int j=i+1; j<height.size();j++){

        //     int ht=Math.min(height.get(i),height.get(j));
        //     int wth= j-i;
        //     int area = ht*wth;
        //     maxArea= Math.max(maxArea,area);
        // }            
        // }
//         int lp=0;
//         int rp=height.size()-1;
//         while(lp<rp){
//             int ht =Math.min(height.get(lp),height.get(rp));
//             int wth = rp-lp;
//             int currWater  = ht * wth;
//             maxWater =    Math.max(maxWater,currWater) ;
// }
        // System.out.println(findLonely(height));
    }
}
