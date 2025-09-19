package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; //참조값이 Null임. 즉 주소가 없음.
        data.value = 10; //NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
