public class PracticeProblem {

	//1. Create a function called _find_(int[] array, int number) that searches an int array for the given number. return the index of the first occurrence of the integer. return -1 if the number cannot be found.
	public static int find (int [] array, int number){
		for (int i = 0; i < array.length; i++){
			if (array[i] == number){
				return i;
			}
		}
		return -1;
	}

	//2. Create a function called _findLast_(String[] array, String string) that searches an String array for the given String. return the index of the last occurrence of the string. return -1 if the String cannot be found.
	 public static int findLast (String [] array, String string){
		for (int i = array.length - 1; i >=0; i--){
			if (array [i] == string){
				return i;
			}
		}
		return -1; 
	}

	 //3. Create a function called _findSecond_(char[] array, char character) that searches an char array for the given char. return the index of the second occurrence of the char.  If there is only one occurrence, return that index of the char.  return -1 if the char cannot be found.  _Hint: Use a counter_
	 public static int findSecond (char[] array, char character){
		int counter = 0;
		for (int i = 0; i < array.length; i++){
			if (array [i] == character){
				counter++;
				if (counter == 2){
					return i;
				}
				
			}	
		}
			if (counter == 1){
				for (int i = 0; i < array.length; i++){
				if (array [i] == character){
					return i;
				}
			}
		}
			return -1;
	}
			
}

