package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.value = 100;
        valueData.add();
        valueData.add();
        valueData.add();

        System.out.println(valueData.value);
    }

}
