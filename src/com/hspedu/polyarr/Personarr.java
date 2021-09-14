package com.hspedu.polyarr;

public class Personarr {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("mary",18);
        persons[1] = new Student("lisi",19,98.5);
        persons[2] = new Student("zhangsan",18,100);
        persons[3] = new Teacher("mary1",18,10000);
        persons[4] = new Teacher("mary2",18,20000);
        for(int i = 0; i< persons.length; i++){
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){
               Student student= (Student)persons[i];
               student.learn();
           }else if(persons[i] instanceof Teacher){
               System.out.println(((Teacher)persons[i]).teach());
           }else if(persons[i] instanceof Person){

            }
            else{
               System.out.println("类型有误");
           }
        }

    }
}
