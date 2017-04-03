
public class Loooooops {
	public static void main(String[] args) {
		//Complete the exercises.
		
//		  1. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 1 (inclusive).
		for(int i = 5; i >= 1; i--)
			System.out.println(i);
        
//        2. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 1 to 10 (inclusive).
		int x = 1;
		while(x <= 10){
			System.out.println(x);
			x++;
		}
        
//        3. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 15 (inclusive).
		for(int j = 5; j <= 15; j++){
			System.out.println(j);
		}
        
//        4. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 10 to 100 by 10’s (inclusive).
		int y = 10;
		while(y <= 100) {
			System.out.println(y);
			y+=10;
		}
        
//        5. The following code should print the values from 1 to 10 (inclusive) but has errors. 
//           Fix the errors so that the code works as intended. 
        int a = 1;
        while (a <= 10)
        {
            System.out.println(a);
            a++;
        }
        
//        6. The following code should print the values from 10 to 5, but it has errors. Fix the errors so that the code works as intended.
        for (int b = 10; b >= 5; b--)
        {
           System.out.println(b);
        }
        
//        7. The following code should print the values from 10 to 1, but it has errors. Fix the errors so that the code works as intended.
        int c = 10;
        while (c > 0)
        {
           System.out.println(c);
           c--;
        }
        
        //8. Write code to print a countdown from 100 to 0 by 10’s.
        for(int d = 100; d >= 0; d-=10) {
        	System.out.println(d);
        }
        
        //9. Finish the wordIterate method so that it prints the String parameter minus 
        //   the last character each time through the loop until there are no more characters in the string.
        //   example: wordIterate("bacon");
        //   bacon
        //   baco
        //   bac
        //   ba
        //   b
        
        //10. Finish the xevenxodd method so that it prints all numbers from x to 0 and also prints 'even' or 'odd' next to the appropriate numner
        //    example: xevenxodd(5);
        //    5 odd
        //    4 even
        //    3 odd
        //    2 even
        //    1 odd
        //    0
        //    assume x > 0 and 0 is neither even or odd
        
        //11. Finish the xTimes10 method so that it prints x * 10 from 0 to x.
        //    example: xTimes10(4);
        //    0
        //    10
        //    20
        //    30
        //    40
        //    assume x > 0
        
        //12. Finish the removeXs method so that it removes all x's from strings.
        //    example: String s = removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX");
        //    System.out.println(s);
        //    stuff
        
        //13. Finish the superDecrement method so that it prints x to zero x number of times.
        //    example: superDecrement(6);
        //    666666 55555 4444 333 22 1
        
        //14. Finish the starBox method so it prints a box of *'s the size of the specified dimensions
        //    example: starBox(3, 5);
        //    ***
        //    ***
        //    ***
        //    ***
        //    ***
        
        //15. Finish the count vowels method so it returns the number of vowels in a String
        //    example: int v = countVowels("Climbing Mount Everest");
        //    System.out.println(v);
        //    7
        
        wordIterate("bacon");
        
        xevenxodd(5);
        
        xTimes10(4);
        
        String s = removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX");
        System.out.println(s);
        
        superDecrement(6);
        
        starBox(3, 5);
        
        int v = countVowels("Climbing Mount Everest");
        System.out.println(v);
	}
	
	
	public static void wordIterate(String word){
		int size = word.length();
		for(int e = size; e >= 0; e--) {
			for(int f = 0; f < e; f++) {
				System.out.print(word.charAt(f));
			}
			System.out.println();
		}
	}
	
	public static void xevenxodd(int x){
		for(int g = x; g >= 0; g--) {
			System.out.print(g + " ");
			if(g == 0)
				break;
			if(g % 2 == 0)
				System.out.println("even");
			else if(g % 2 == 1)
				System.out.println("odd");
			
		}
	}
	
	public static void xTimes10(int x){
		for(int h = 0; h <= x; h++)
			System.out.println(h*10);
	}
	
	public static String removeXs(String wrd){
		String hidden = "";
		for(int k = 0; k < wrd.length(); k++)
			if(wrd.charAt(k) != 'x' && wrd.charAt(k) != 'X')
				hidden+=wrd.charAt(k);
		return hidden;
	}
	
	public static void superDecrement(int x){
		for(int l = x; l >= 1; l--) {
			for(int m = l; m >= 1; m--) {
				System.out.print(l);
			}
			System.out.print(" ");
			System.out.println();
		}
	}
	
	public static void starBox(int w, int h){
		for(int R = 1; R <= h; R++) {
			for(int C = 1; C <= w; C++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int countVowels(String phrase) {
		int vowels = 0;
		for(int z = 0; z < phrase.length(); z++) {
			if(phrase.charAt(z) == 'a' || phrase.charAt(z) == 'e' || phrase.charAt(z) == 'i' || phrase.charAt(z) == 'o' || phrase.charAt(z) == 'u' || phrase.charAt(z) == 'A' || phrase.charAt(z) == 'E' || phrase.charAt(z) == 'I' || phrase.charAt(z) == 'O' || phrase.charAt(z) == 'U')
				vowels++;
		}
		return vowels;
	}
}
