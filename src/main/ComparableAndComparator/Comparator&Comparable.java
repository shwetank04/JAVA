package JavaPractice;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(35);
        unsortedList.add(24);
        unsortedList.add(84);
        unsortedList.add(13);
        unsortedList.add(95);
        
        List<String> stringList = new ArrayList<>();
        
        // Adding elements to the list
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("grapee");
        stringList.add("cherryyyy");
        
 
        List<Student> students = new ArrayList<>();

        // Adding some student objects to the list
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 23));
        
        Comparator<Student> comp1 = (Student i,Student j) ->
        {
        		if(i.getAge() > j.getAge()) {
        			return 1;
        		}
        		return -1;
        };

        
        Comparator<Integer> com = new Comparator<>() {
        	public int compare(Integer i, Integer j) {
        		if(i%10 > j%10) {
        			return 1;
        		}
        		return -1;
        	}
        };
        
        Comparator<String> comp2 = new Comparator<>() {
        	public int compare(String i, String j) {
        		if(i.length() > j.length()) {
        			return 1;
        		}
        		return -1;
        	}
        };
        
//        System.out.println("Before sorting");
//        unsortedList.forEach(val ->System.out.println(val));
//		
//        Collections.sort(unsortedList);
//        
//        System.out.println("After sorting");
//        unsortedList.forEach(val ->System.out.println(val));
        
        System.out.println("Sorting based on last digit");
        Collections.sort(unsortedList, com);
        unsortedList.forEach(val ->System.out.println(val));
	
	    System.out.println("Sorting based on String Length");
	    Collections.sort(stringList, comp2);
	    stringList.forEach(val ->System.out.println(val));
	    
	    System.out.println("Sorting based on Student Age");
	    Collections.sort(students);
//	    Collections.sort(students, comp1);
	    students.forEach(val ->System.out.println(val));
	}

}

class Student implements Comparable<Student> {
    // Fields for name and age
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods (optional but useful for accessing the fields)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method to represent the Student object as a string
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

	@Override
	public int compareTo(Student o) {
		if(this.age > o.age) {
			return 1;
		}
		return -1;
	}
}
