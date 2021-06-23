import java.util.Scanner;

class ShiftCipher{
	
	public static void main(String[] args){
	
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);

		System.out.printf("Entre com o valor do shift:");
		int s = in1.nextInt();

		System.out.printf("Entre com a mensagem):");

		String text = in2.nextLine();

		System.out.printf("%nA mensagem codificada eh:");
		System.out.println(ShiftFunction.shift(text, s));

    }

}

