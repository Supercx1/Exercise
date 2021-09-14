package com.hspedu.writeequals;

public class Test {
    public static void main(String[] args) {
        Docter docter1 = new Docter("marry",18,"eyedocter",'男');
        Docter docter2 = new Docter("marry",18,"eyedocter",'男');
        System.out.println(docter1.equals(docter2));
    }
}
