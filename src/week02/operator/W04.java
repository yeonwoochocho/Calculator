package week02.operator;

public class W04 {
    public static void main(String[] args){
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println("---------");

        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);
        System.out.println("---------");

        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);
        System.out.println("---------");

        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));
        System.out.println("---------");

        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));
        System.out.println("---------");

        System.out.println(!flag1);
        System.out.println(!flag3);
        System.out.println(!(5==3));
    }
}
