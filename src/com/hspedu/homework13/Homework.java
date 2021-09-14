package com.hspedu.homework13;

public class Homework {
    public static void main(String[] args) {
        Student student = new Student("小明",'男',18,123);
        student.printInfo();
        Teacher teacher = new Teacher("张三",'男',35,12);
        teacher.printInfo();
        Person[] persons = new Person[4];
        persons[0] = new Student("mary",'女',23,12);
        persons[1] = new Student("tom",'男',21,11);
        persons[2] = new Teacher("jack",'女',33,112);
        persons[3] = new Teacher( "simith",'女',43,1222);
        Homework homework = new Homework();
        homework.bubbleSort(persons);
        for(int i = 0; i< persons.length; i++){
            System.out.println(persons[i]);
        }
        for(int i = 0; i< persons.length; i++){
            homework.test(persons[i]);
        }


    }
    public void test(Person p){
        if(p instanceof Student){
            ((Student)p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else{
            System.out.println("do nothing");
        }
    }
    public void bubbleSort(Person[] persons){
        Person temp = null;
        for(int i = 0; i< persons.length-1; i++){
            for(int j = 0; j< persons.length-1-i; j++){
                if(persons[j].getAge()<persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j]=persons[j+1];
                    persons[j+1]=temp;
                }
            }
        }

    }

}
