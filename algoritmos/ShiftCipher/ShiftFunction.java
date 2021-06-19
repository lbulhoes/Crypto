public class ShiftFunction{
	
		public static StringBuffer shift(String text, int s){

			StringBuffer result = new StringBuffer();

			for(int i = 0; i < text.length(); i++){

				if(Character.isUpperCase(text.charAt(i))){
					char ch = (char)(((int)text.charAt(i) + s - 65)%26 + 65);
					result.append(ch);
				}
				else{
					char ch = (char)(((int)text.charAt(i) + s - 97)%26 + 97);
					result.append(ch);
				}

			}

			return result;

		}
}