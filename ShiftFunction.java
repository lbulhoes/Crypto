ublic class ShiftFunction{
	
	// Método para fazer o shift
	public static StringBuffer shift(String text, int s){
	
		// Cria o objeto result da classe StringBuffer
		StringBuffer result = new StringBuffer();
		
		// Início do laço para varrer os caracteres da String recebida
		for(int i = 0; i < text.length(); i++){

			//Caso o caractere for maiúsculo
			if(Character.isUpperCase(text.charAt(i))){
				char ch = (char)(((int)text.charAt(i) + s - 65)%26 + 65);
				result.append(ch);
			}
			//Caso o caractere for minúsculo
			else{
				//ch recebe o valor do character encriptado
				char ch = (char)(((int)text.charAt(i) + s - 97)%26 + 97);
				//A StringBuffer result é atualizada concatenando o valor de ch
				result.append(ch);
		}
		//retorna a mensagem criptografada
		return result;

}