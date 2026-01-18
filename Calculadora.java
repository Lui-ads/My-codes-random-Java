import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("As operações aceitas são: mais, menos, mult, div, poten e raizQ");
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")){

            System.out.println("Qual seu 1º número");
            double numero1 = leitura.nextDouble();

            leitura.nextLine(); // limpa tudo para não dar problema na leitura da operação

            System.out.println("Qual sua operação");
            String operacao = leitura.nextLine();

            double resultado = 0;

            if (operacao.equals("raizQ")) {
                resultado = Math.sqrt(numero1);
            } else {
                System.out.println("Qual seu 2º número");
                double numero2 = leitura.nextDouble();

                leitura.nextLine(); // limpa tudo para não dar problema na leitura da operação

                switch (operacao) {
                    case "mais":
                        resultado = numero1 + numero2;
                        break;

                    case "menos":
                        resultado = numero1 - numero2;
                        break;

                    case "mult":
                        resultado = numero1 * numero2;
                        break;

                    case "div":
                        if (numero2 == 0) {
                            System.out.println("Divisão inválida");
                            continue;
                        }
                        resultado = numero1 / numero2;
                        break;

                    case "poten":
                        resultado = Math.pow(numero1, numero2);
                        break;

                    default:
                        System.out.println("Operação inválida");
                        continue;
                }
            }

            System.out.println("O resultado da sua conta é: " + resultado);
            System.out.println("Quer fazer outra conta? (S/N)");
            resposta = leitura.nextLine();
        }

        leitura.close();
        System.out.println("Fim");
    }
}
