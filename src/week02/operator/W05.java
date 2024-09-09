package week02.operator;

public class W05 {
    public static void main(String[] args){
        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);
        number = number * 2;
        System.out.println(number);
        number = number / 2;
        System.out.println(number);
        number = number % 2;
        System.out.println(number);
        System.out.println("----------");
        number = 10;

        number += 2;
        System.out.println(number);

        number -= 2;
        System.out.println(number);

        number *= 2;
        System.out.println(number);
        number /= 2;
        System.out.println(number);
        number %= 2;
        System.out.println(number);
        System.out.println("----------");

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);
    }
}
