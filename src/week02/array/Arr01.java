package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        boolean[] booArray = new boolean[3];
        String[] stringArray = new String[3];

        int[] intArray2;

        intArray2 = new int[3];

        //순회 : 배열의 값을 하나씩 뽑아서 조회한다.
        System.out.println(intArray[1]);

        for (int i=0; i<intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}
