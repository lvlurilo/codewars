package codewarsJr;

public class CamelCaseClass {

	public static String toCamelCase(String s) {

		/*
		 * Complete the method/function so that it converts dash/underscore delimited
		 * words into camel casing. The first word within the output should be
		 * capitalized only if the original word was capitalized (known as Upper Camel
		 * Case, also often referred to as Pascal case).
		 * 
		 * Examples "the-Stealth-Warrior" gets converted to "theStealthWarrior"
		 * "The_Stealth_Warrior" gets converted to "theStealthWarrior"
		 */

		String[] stringSplit = null;
		StringBuilder text = new StringBuilder();
		String textString;

		if (s == "") {
			textString = "";
		} else {

			if (s.contains("_")) {
				stringSplit = s.split("_");
			} else if (s.contains("-")) {
				stringSplit = s.split("-");
			}

			for (int i = 0; i < stringSplit.length; i++) {
				if (i == 0) {
					text.append(stringSplit[i]);
				} else {
					text.append(
							stringSplit[i].substring(0, 1).toUpperCase() + stringSplit[i].substring(1).toLowerCase());
				}
			}

			textString = String.valueOf(text);

		}
		
		return textString;
	}

}
