Given an array A of size N, print the reverse of it.

Example:

Input:
1
4
1 2 3 4
Output:
4 3 2 1
  

 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int n = args.length;
        String[] b = new String[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = args[i];
            j = j - 1;
        }
  
        // printing the reversed array
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
	}
}
