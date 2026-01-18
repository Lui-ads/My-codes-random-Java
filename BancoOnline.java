import java.util.Scanner;

public class BancoOnline {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean verdade = true;
        double saldo = 2550.00;
        String nome = "Francisco De Almeida Santos";
        String tipoDaConta = "Conta Corrente";
        System.out.println(String.format("""
************************************************************************************
Dados da conta

Nome:             %s
Tipo da conta:    %s
Saldo:            %.2f

************************************************************************************
                    """, nome, tipoDaConta, saldo));
        while (verdade){
            System.out.println("""
                    
Opções de ações:

1 - Consultar saldo atual
2 - Receber valor
3 - Transfeir um valor
4 - Sair

                    """);
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(String.format("""
Seu saldo atual é de: %.2f

""", saldo));
                    break;
                case 2:
                    System.out.println("Qual o valor que você vai receber?");
                    double valorParaReceber = sc.nextDouble();
                    saldo += valorParaReceber;
                    break;
                case  3:
                    System.out.println("Qual o valor que você vai transferir?");
                    double valorParaTransferir = sc.nextDouble();
                    if (valorParaTransferir > saldo){
                        System.out.println(String.format("""
Esse valor de %.2f é maior que seu saldo, você não pode transferir essa quantia
                                """, valorParaTransferir));
                    } else if (valorParaTransferir < 0){
                        System.out.println("""
Esse valor é menor que 0, você não pode transferir algo negativo
                                """);
                    } else{
                        saldo -= valorParaTransferir;
                    }
                    break;
                case  4:
                    System.out.println(String.format("""
Até logo %s
                            """, nome));
                    verdade = false;
                    break;
                default:
                    System.out.println("Por favor coloque um número válido");
                    break;
            }
        }
    }
}
