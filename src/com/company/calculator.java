package com.company;

class calculator {

    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.sub(100, 12));
        System.out.println(obj.mult(6, 8));
        System.out.println(obj.div(512, 16));
    }

    int add(int value1, int value2) {
        return value1 + value2;
    }

    int sub(int value1, int value2) {
        return value1 - value2;
    }

    int mult(int value1, int value2) {
        return value1 * value2;
    }

    int div(int value1, int value2) {
        return value1 / value2;
    }

}
