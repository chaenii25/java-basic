package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("학생1", 15, 90);
        MemberConstruct m2 = new MemberConstruct("학생2", 16,80);

        MemberConstruct[] ms = new MemberConstruct[2];
        ms[0] = m1;
        ms[1] = m2;

        for (MemberConstruct m : ms) {
            System.out.println(m.name + " " + m.age + " " + m.grade);
        }
    }
}
