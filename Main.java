package geekbrains;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //№1
        String[] animals = {"Cat", "Dog", "Bird", "Parrot "};

        System.out.println(Arrays.toString(animals));
        swap(animals, 0, 3);
        System.out.println(Arrays.toString(animals));


        //№2
        System.out.println("**********");

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();

        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());


        for (int i = 0; i < 5; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес первой коробки с апельсинами: " + orange1Weigth);
        System.out.println("Вес второй коробки с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес первой коробки с апельсинами и вес коробки с яблоками: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес второй коробки с апельсинами и вес коробки с яблоками: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
