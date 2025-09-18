package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = new int[]{15,16};
        int[] studentGrades = new int[]{90,80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] +
                    " 성적: " + studentGrades[i]);
        }

        //한 학생의 데이터가 세개 배열로 나눠져있음 => 수정어렵고 한 학생만 수정해도 3번 수정필요
        //실수 위험 높음
    }
}
