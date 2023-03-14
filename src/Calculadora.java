import java.util.Scanner;

public class Calculadora {

    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("||    BEM VINDO A CALCULADORA:    ||");
        System.out.println("|| Selecione a operação desejada: ||");
        System.out.println("||    Somar       -> 1            ||");
        System.out.println("||    Subtrair    -> 2            ||");
        System.out.println("||    Multiplicar -> 3            ||");
        System.out.println("||    Dividir     -> 4            ||");
        System.out.println("||    Sair        -> 0            ||");
        System.out.println("====================================");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Opção SOMA: ");
                System.out.println("Insira os numeros: ");
                double soma1 = scanner.nextDouble();
                double soma2 = scanner.nextDouble();
                System.out.println(Calculadora.Somar(soma1,soma2));
                break;
            case 2:
                System.out.println("Opção SUBTRAÇÃO: ");
                System.out.println("Insira os numeros: ");
                double subtracao1 = scanner.nextDouble();
                double subtracao2 = scanner.nextDouble();
                System.out.println(Calculadora.Subtrair(subtracao1,subtracao2));
                break;
            case 3:
                System.out.println("Opção MULTIPLICAR: ");
                System.out.println("Insira os numeros: ");
                double multiplica1 = scanner.nextDouble();
                double multiplica2 = scanner.nextDouble();
                System.out.println(Calculadora.Multiplicar(multiplica1,multiplica2));
                break;
            case 4:
                System.out.println("Opção DIVIDIR: ");
                System.out.println("Insira os numeros: ");
                double divide1 = scanner.nextDouble();
                double divide2 = scanner.nextDouble();
                System.out.println(Calculadora.Dividir(divide1,divide2));
                break;
            case 0:
                System.out.println("Obrigado por utilizar a calculadora. Até a próxima o/");
                break;
            default:
                System.out.println("Opção Inválida! Tente novamente!");
                Menu();
        }

    }


    public static double Somar(double n1, double n2){
        return n1 + n2;
    }
    public static double Subtrair(double n1, double n2){
        return n1 - n2;
    }
    public static double Multiplicar(double n1, double n2){
        return n1 * n2;
    }
    public static double Dividir(double n1, double n2){
        return n1 / n2;
    }



}
