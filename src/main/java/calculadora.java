import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        calculadora2 calculator = new calculadora2();
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.print("##--- menu calculadora ---##\n\n");
            System.out.print("|--------------------------|\n");
            System.out.print("| Opção 1 - soma           |\n");
            System.out.print("| Opção 2 - subtração      |\n");
            System.out.print("| Opção 3 - multiplicação  |\n");
            System.out.print("| Opção 4 - divisão        |\n");
            System.out.print("| Opção 5 - raiz           |\n");
            System.out.print("| Opção 6 - bhaskara       |\n");
            System.out.print("| Opção 7 - potencia       |\n");
            System.out.print("|--------------------------|\n");
            System.out.print("Digite uma opção:");

            String opcao = new String();
            opcao=menu.nextLine();

            switch (opcao) {

                case "1":
                    System.out.print("primeiro nº:");
                    int a = menu.nextInt();
                    System.out.print("segundo nº:");
                    int b = menu.nextInt();
                    calculator.soma(a,b);
                    break;
                case "2":
                    System.out.print("primeiro nº:");
                    a = menu.nextInt();
                    System.out.print("segundo nº:");
                    b = menu.nextInt();
                    calculator.subtracao(a,b);
                    break;
                case "3":
                    System.out.print("primeiro nº:");
                    a = menu.nextInt();
                    System.out.print("segundo nº:");
                    b = menu.nextInt();
                    calculator.multiplicacao(a,b);
                    break;
                case "4":
                    System.out.print("primeiro nº:");
                    a = menu.nextInt();
                    System.out.print("segundo nº:");
                    b = menu.nextInt();
                    calculator.divisao(a,b);
                    break;
                case "5":
                    System.out.print("primeiro nº:");
                    a = menu.nextInt();
                    System.out.print("segundo nº:");
                    b = menu.nextInt();
                    calculator.raiz(a,b);
                    break;
                case "6":
                    System.out.print("primeiro nº:");
                    a = menu.nextInt();
                    System.out.print("segundo nº:");
                    b = menu.nextInt();
                    System.out.print("terceiro nº:");
                    int c = menu.nextInt();
                    calculator.bhaskara(a,b,c);
                    break;
                case "7":
                    System.out.print("primeiro nº:");
                    a = menu.nextInt();
                    System.out.print("segundo nº:");
                    b = menu.nextInt();
                    calculator.potencia(a,b);
                    break;
            }
            menu.nextLine();
        }
    }
}