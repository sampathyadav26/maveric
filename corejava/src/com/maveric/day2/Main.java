package com.maveric.day2;

public class Main {

    Student[] stuarray = new Student[3];
    int size = 0;

    void addStudent(Student stu) {
        stuarray[size] = stu;
        size++;
    }

    void display() {
        for (Student s : stuarray) {
            Student s1 = s;
            System.out.println(s1);
        }
    }

    void findbyid(int id) {
        for (int i = 0; i < stuarray.length; i++) {
            if (stuarray[i].id == id) {
                System.out.println(id);
            }
        }

    }

    void changeName(int id, String name) {
        for (int i = 0; i < stuarray.length; i++) {
            if (stuarray[i].id == id) {
                stuarray[i].name = name;
                System.out.println(id + " " + stuarray[i].name);
            }
        }
    }

    public static void main(String[] args) {
        Student obj = new Student(1, "sampath", 1008811);
        Student obj1 = new Student(2, "karthik", 10088);
        Student obj2 = new Student(3, "santhosh", 10088);
        Main main = new Main();
        main.addStudent(obj);
        main.addStudent(obj1);
        main.addStudent(obj2);
        main.findbyid(3);
        main.display();
        main.changeName(3, "amresh");
    }
}
