package com;

public class Student {
    int id;
    String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
@Override
    public boolean equals(Object obj){
        if (this==obj) return  true;
        if (this==null && getClass() !=obj.getClass()) return  false;
        Student student= (Student) obj;
        return  this.name.equals(student.name);


    }

    public static void main(String[] args) {
        Student stu = new Student("chandan",1);
        Student adhir = new Student("chandan", 1);
        System.out.println(stu==adhir);
        System.out.println(stu.equals(adhir));




    }
}
