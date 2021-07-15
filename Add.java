import java.util.*;
class Add
{
public static void main(String args[])
{
ArrayList<Integer>a1= new ArrayList<Integer>();
a1.add(10);
a1.add(20);
a1.add(40);
a1.add(60);
System.out.println("list a"+ a1);
ArrayList<Integer>a2= new ArrayList<Integer>();
a2.add(600);
a2.add(700);
a2.add(800);
a2.add(900);
System.out.println("list a"+ a2);
ArrayList<Integer>a= new ArrayList<Integer>();
a.addAll(a1);
a.addAll(a2);
System.out.println("list a"+ a);
}}