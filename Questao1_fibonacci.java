import java.util.Scanner;

public class Questao1_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite seu numero: ");
            int number = scanner.nextInt();
            
            if(number == -1){
                break;
            }
            else if (isFibonacci(number)) {
                System.out.println(number + " faz parte da sequencia finocacci.");
            } else {
                System.out.println(number + " NÃO faz parte da sequencia finocacci.");
            }
            System.out.println("Digite -1 para sair"); 
        }
        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int first = 0;
        int second = 1;

        while (second < number) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second == number;
    }
}