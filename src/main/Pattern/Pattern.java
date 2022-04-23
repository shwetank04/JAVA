public class Pattern {

	/*
	 ******
	 *****
	 *****
	 *****
	 */
	public void solidRectangle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	/*
	*****
	*   *
	*   *
	*****
	*/
	public void hollowRectangle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 0 || i == 3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/*
	*
	**
	***
	****
	 */
	public void halfPyramid() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	****
//	***
//	**
//	*
	public void invertedHalfPyramid() {
		for (int i = 4; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	  *
//	  **
//	 ***
//	****
	
	public void invertedHalfPyramid180() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i + j >= 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
	public void num() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5-i+1); j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
	public void floydsTriangle() {
		int number = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
	
//	1 
//	0 1 
//	1 0 1 
//	0 1 0 1 
//	1 0 1 0 1 

	public void traingle01() {
		int start;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					start = 0;
				} else {
					start = 1;
				}
				if(j==2 || j==4) {
					start = 1-start;
				}
				System.out.print(start + " ");
			}
			System.out.println();
		}
	}

}
