import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");

            int age = Integer.parseInt(str[0]);
            String name = str[1];

            people.add(new Person(age, name));
        }

        Collections.sort(people, (a, b) -> {
            return Integer.compare(a.age, b.age);
        });

        for (Person person : people) {
            System.out.println(person.age + " " + person.name);
        }
    }
}

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}