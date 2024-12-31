package JavaPractice;

import java.util.*;
import java.util.stream.Stream;

import JavaPractice.OuterClass.InnerClass;

public class Main {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.pirnt();
	}
}

package JavaPractice;


public class OuterClass {
	
	 class InnerClass {
		public void pirnt() {
			System.out.println("Hi From Inner");
		}
	}
}
a
