

public class SubstitutionCipherClass {

    public static void main(String[] args) {
        char plainText[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char cipherText[] = {'k', 'x', 'a', 'e', 'u', 'l', 'b', 'c', 'm', 'f', 'i', 'd', 'w', 'g', 't', 's', 'h', 'j', 'o', 'q', 'n', 'v', 'y', 'r', 'p', 'z'};

        String pt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%nabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ%n");
        for (int a = 0; a < pt.length(); a++) {
            for (int i = 0; i < plainText.length; i++) {
               
                if(Character.isUpperCase(pt.charAt(a))){

                    if((int)plainText[i] == ((int)pt.charAt(a) + 32)){

                        System.out.print((char)((int)cipherText[i] - 32));
                    
                    }
            
                }
                else{

                    if(plainText[i] == (pt.charAt(a))){

                        System.out.print(cipherText[i]);
                    }
                    
                }
            
            }   
        }

        System.out.printf("%n%n");
    }
}