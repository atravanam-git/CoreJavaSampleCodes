/*This Demo code explains the following methods:
 * stream()
 * filter()
 * map()
 * count()
 * sorted()
 * min()
 * max()
*/
package com.Java8.Features;
import java.util.stream.*;
import java.util.*;
public class StreamsDemo {
public static void main(String[] args) {
		
//		Declare an integer ArrayList
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(55);
		marks.add(25);
		marks.add(30);
		marks.add(45);
		marks.add(35);
		marks.add(75);
		marks.add(65);
		
//		filter(Predicate<T>) - predefined functional interfacce
		List<Integer> passedList = marks.stream().filter(i -> i >=40).collect(Collectors.toList());
		
//		map(Function<T,R>) - predefined functional interface
		List<Integer> graceMarkList = marks.stream().map(i-> i+5).collect(Collectors.toList());
		
//		count() gives the count that meets filter condition
		long nooffailedList = marks.stream().filter(i-> i<=40).count();

//		Default natural sorting order
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
		
//		Customized sorting order with logic of Comparator (obj1, obj2)
		List<Integer> mysortedMarks = marks.stream().sorted((i1,i2) -> (i1<i2) ? 1: (i1>2)? -1: 0).collect(Collectors.toList());
		
//		Minimum value of the ArrayList
		Integer minMarks =marks.stream().min((i1, i2)-> i1.compareTo(i2)).get();
		
//		Maximum value of the ArrayList
		Integer maxMarks =marks.stream().max((i1, i2)-> i1.compareTo(i2)).get();
		
		System.out.println("Passed List Students are: "+ passedList); 
		System.out.println("Grace Mark List of Students are: "+ graceMarkList);
		System.out.println("No.of Failed List Students are: "+ nooffailedList);
		System.out.println("Default sorted Marks for Students are: "+ sortedMarks);
		System.out.println("Customized sorting order for Students marks are: "+ mysortedMarks);
		System.out.println("Minimum Marks of Students are: "+ minMarks);
		System.out.println("Maximum Marks of Students are: "+ maxMarks);
	}


}
