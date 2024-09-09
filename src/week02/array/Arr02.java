package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {

        String[] stringArray = {"a","b","c","d"};

//        for(int i=0; i<intArr.length; i++){
//            intArr[i] = i;
//        }
//        for(int i=0; i<intArr.length; i++){
//            System.out.println(intArr[i]);
//        }
        int[] intArr = {10,20,30,40,50};

//        for (int item: intArr){
//            System.out.println(item);
//        }

        Arrays.fill(intArr, 1);
        for (int item: intArr){
            System.out.println(item);
      }
    }
}
