package com.hspedu.polyparameter;

public class TestShow {
    public static void main(String[] args) {
        Manager manager = new Manager("李四",10000,30000);
        Works works = new Works("张三",5000);
        TestShow testShow = new TestShow();
        testShow.showAnnal(manager);
        testShow.showAnnal(works);
        testShow.testWork(manager);
        testShow.testWork(works);
        "abc".equals("abc");

    }
    public void showAnnal(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Works){
            System.out.println(((Works) e).work());
        }else if(e instanceof Manager){
            System.out.println(((Manager) e).manage());
        }else{
            System.out.println("没有匹配到相关职位");
        }
    }
}
