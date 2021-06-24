

// Classe Principal Substitution Cipher Algorithm
public class SubstitutionCipherClass {

    public static void main(String[] args) {

        // Cria Array contendo as letras do alfabeto de maneira ordenada
        char plainText[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        // Cria Array contendo as letras do alfabeto de maneira permutada
        char cipherText[] = {'k', 'x', 'a', 'e', 'u', 'l', 'b', 'c', 'm', 'f', 'i', 'd', 'w', 'g', 't', 's', 'h', 'j', 'o', 'q', 'n', 'v', 'y', 'r', 'p', 'z'};

        // Cria a string de teste para realizar o SubstitutionCipher
        String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%nabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ%n");

        // Inicia laço para varrer os caracteres da string de teste
        for (int a = 0; a < text.length(); a++) {
            
            // Inicia laço para varrer o array plainText
            for (int i = 0; i < plainText.length; i++) {
               
                // Verifica se o a-ésimo caractere da string teste é maiúsculo
                if(Character.isUpperCase(text.charAt(a))){

                    /* 
                        Verifica se o i-ésimo caractere do array plainText
                        é igual ao a-ésimo caractere da string teste através
                        da numeração ASCII correspondente
                    */
                    if((int)plainText[i] == ((int)text.charAt(a) + 32)){

                        System.out.print((char)((int)cipherText[i] - 32));
                    
                    }
            
                }
                else{

                    if(plainText[i] == (text.charAt(a))){

                        System.out.print(cipherText[i]);
                    }
                    
                }
            
            }   
        }

        System.out.printf("%n%n");
    }
}