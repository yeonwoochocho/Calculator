package week02.operator;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//        while(number < 3) {
//            number++;
//            System.out.println(number + "출력");
//        }

//        int number = 4;
//        do {
//            System.out.println(number + "출력");
//        } while (number < 3);

//        int number = 0;
//        while (number < 3) {
//            number++;
//            if(number ==2){
//                break;
//            }
//            System.out.println(number+"출력");
//        }

//        for (int i=0; i<10 ; i++){
//            System.out.println("i : "+i);
//            if (i==2){
//                break;
//            }
//            for(int j=0; j<10; j++) {
//                System.out.println("j : "+j);
//                if(j==2){
//                    break;
//                }
//            }
//        }
        int number =0;
        while (number < 3){
            number++;
            if (number ==2){
                continue;
            }
            System.out.println(number +"출력");
        }
    }
}
