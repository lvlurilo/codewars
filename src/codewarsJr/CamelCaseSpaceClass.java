package codewarsJr;

/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
*/

public class CamelCaseSpaceClass {

	public static String camelCase(String input) {

		String inputSplit[] = input.split("");

		int compare = 0;

		StringBuilder stringFinal = new StringBuilder();

		for (int i = 0; i < inputSplit.length; i++) {

			compare = inputSplit[i].compareTo(inputSplit[i].toLowerCase());

			if (compare == 0) {

				stringFinal.append(inputSplit[i]);
			} else {

				if (i == 0) {
					stringFinal.append(inputSplit[i]);
				} else {
					stringFinal.append(" ");
					stringFinal.append(inputSplit[i]);
				}
			}

		}

		String inputFinal = String.valueOf(stringFinal);
		
		return inputFinal;

	}

}

/*
  class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
*/