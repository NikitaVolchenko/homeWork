package com.company;

class human {

    String surname;
    String name;
    String patronymic;
    int age;

    human() {
        surname = null;
        name = null;
        patronymic = null;
        age = 0;
    }

    human(String surname, String name, String patronymic, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    public static void main(String[] args) {
        human man1 = new human();
        human man2 = new human("Ivanov", "Ivan", "Ivanovich", 20);
        System.out.println(man1);
        System.out.println(man2);
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getPatronymic() {
        return patronymic;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "human{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }

}
