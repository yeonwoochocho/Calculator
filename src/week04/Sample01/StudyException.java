package week04.Sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        try {
            //일단 실행
            ourClass.thisMethodIsDangerous();
        } catch(OurBadException e){
            System.out.println(e.getMessage());
        } finally {
            //무조건 여기는 거침
            System.out.println("우리는 방금 예외를 handling했습니다. 정상적이든 오류예외상황이든 여기를 거쳐요");
        }
    }
}
