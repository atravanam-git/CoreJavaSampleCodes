/* This code shows how to use Predefined Interface
 * Predicate<R> - Conditional Checking - R is a boolean 
 * Function<T, R> - Input value -> Operation -> returns any type 
 * Consumer <T> - Input value -> does some operation -> No return type 
 */

package com.Java8.Features;
import java.util.function.*;

public class PredefinedDemo {
	
	public static void main(String[] args) {
	
//		Predefined Interface - Function has both Input and return arg
//		apply() is the method available in Function Interface
//		Syntax Function(T, R) f = Lambda Expression
		Function<Student,String> f = s-> {
			int marks = s.marks;
			String Grade="";
//			Classify Students Grades 
			if(marks>=80) Grade="Distinction";
			else if (marks>=60) Grade="First Class";
			else if(marks>=50) Grade="Second Division";
			else if(marks>=40) Grade="Third Division";
			else Grade="Fail";
			return Grade;		
		};
		
//		Predicate<Integer> p = m-> m >= 60;
//		IntPredicate(I) is best suited for primitive data types than normal Predicate(I)
//		test() is the method available in this Interface
		IntPredicate p = m -> m >= 60;
		IntPredicate p1 = m -> m >= 80;
		
//		Predefined Interface - Consumer
//		Consumer has Input arg but DONOT have any return arg
//		Consumer has accept() method
//		Syntax: Consumer<T> c = Lambda Expression
		Consumer<Student> c = s -> {
			System.out.println("Student Name is :"+s.name);
			System.out.println("Marks :"+s.marks);
		};
		
//		Declare Students Array
		Student[] s ={
		new Student("Satish", 65),
		new Student("Praveen", 35),
		new Student("Udbhav", 85),
		new Student("Pranav", 95),
		new Student("Vydehi", 45)
		};
		
//		Print Student Array;
		for(Student s1:s) {
//			joining two conditions to filter only distinction grades
			if(p.and(p1).test(s1.marks))
			{
				c.accept(s1);
				System.out.println("Grade :"+f.apply(s1)); 
			}
		}
	}
}