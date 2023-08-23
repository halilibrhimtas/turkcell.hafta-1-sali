package org.example;

public class DataTypes {
    public static void main(String[] args){
        //1. Primitive Data Types

        // byte: 8 bit
        byte myByte = 127;

        // short: 16 bit
        short myShort = 32000;

        // int: 32 bit
        int myInt = 2000000;

        // long: 64 bit
        long myLong = 1234567890123L;

        // float: 32 bit
        float myFloat = 3.14f;

        // double: 64 bit
        double myDouble = 2.71828;

        // char: 16 bit (Unicode)
        char myChar = 'A';

        // boolean: true or false
        boolean myBoolean = true;

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        // 2. Reference Data Types
        int[] ages = { 12, 14, 15, 18, 21 };

        // String: Bir metin
        String message = "Hello, world!";
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // enum: Renklerin temsil edildiği bir enum
        enum Color {
            RED, GREEN, BLUE
        }

        // null: Bir değişkenin atanmamış değeri
        String emptyString = null;
        Person person = null;

        Person john = new Person("John", 15);
        System.out.println("Person's name: " + john.name);
        System.out.println("Person's age: " + john.age);

        Shape circle = new Shape() {
            double radius = 5;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }
        };
        System.out.println("Circle area: " + circle.getArea());

        System.out.println("Ages array: " + ages[0] + ", " + ages[1] + ", ...");
        System.out.println("Message: " + message);

        System.out.println("Color enum: " + Color.RED);

        System.out.println("Empty string: " + emptyString);
        System.out.println("Null person: " + person);

    }
}

    // class: Bir nesne sınıfının örneği
    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // interface: Metot bildirimlerinin tanımlandığı bir arayüz
    interface Shape {
        double getArea();
    }

