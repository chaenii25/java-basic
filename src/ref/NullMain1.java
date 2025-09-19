package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;  //아직 가리ㅣ키는 대상이 없을 때
        System.out.println("1. data = " + data); //null 이라고 출력됨
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data); //null 이라고 출력됨
    }
}
