import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe sua idade: ");
        var idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("você é menor de idade"); }
        else {
            System.out.println("você é maior de idade.");

        }
    }
}