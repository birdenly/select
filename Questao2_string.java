import java.util.Scanner;

public class Questao2_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite uma string: ");
            String str = scanner.nextLine();
            int count = 0;
            if(str.equals("-1")){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.toLowerCase(c) == 'a') {
                    count++;
                }
            }
    
            System.out.println("A letra 'a' aparece " + count + " vezes na palavra digitada"); 
            System.out.println("Digite -1 para sair");   
        }
        scanner.close();
    }
}
