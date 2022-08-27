import java.util.Scanner;

public class questao8 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] perguntas = new String[5];
        int resposta;
        int acertos = 0;
        int erros = 0;
        int intervalo[] = {0 , 1};
        String nome;
        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Responda com 0 para falso ou 1 para verdadeiro as afirmações a seguir: ");

        for (int i = 0; i <= 100;) {
            perguntas[0] = "A empresa tem 15 anos de funcionamento";
            System.out.println(perguntas[0]);
            resposta = scanner.nextInt();
            if (resposta == intervalo[1]) {
                System.out.println("você acertou! vamos para a próxima pergunta");
                acertos++;
                break;
            } else if (resposta == intervalo[0]) {
                System.out.println("você errou, vamos para a próxima pergunta");
                erros++;
                break;
            } else {
                System.out.println("numero invalido, tente novamente");
                i++;
            }
        }
        for (int i = 0; i <= 100;) {
            perguntas[1] = "A empresa trabalha com remédios alem de materiais de limpeza";
            System.out.println(perguntas[1]);
            resposta = scanner.nextInt();
            if (resposta == intervalo[0]) {
                System.out.println("você acertou! vamos para a próxima pergunta");
                acertos++;
                break;
            } else if (resposta == intervalo[1]) {
                System.out.println("você errou, vamos para a próxima pergunta");
                erros++;
                break;
            } else {
                System.out.println("numero invalido, tente novamente");
                i++;
            }
        }
        for (int i = 0; i <= 100;) {
            perguntas[2] = "A empresa oferece estágio para a área de tecnologia";
            System.out.println(perguntas[2]);
            resposta = scanner.nextInt();
            if (resposta == intervalo[0]) {
                System.out.println("você acertou! vamos para a próxima pergunta");
                acertos++;
                break;
            } else if (resposta == intervalo[1]) {
                System.out.println("você errou, vamos para a próxima pergunta");
                erros++;
                break;
            } else {
                System.out.println("numero invalido, tente novamente");
                i++;
            }
        }
        for (int i = 0; i <= 100;) {
            perguntas[3] = "A empresa oferece desconto para pagamento em dinheiro";
            System.out.println(perguntas[3]);
            resposta = scanner.nextInt();
            if (resposta == intervalo[1]) {
                System.out.println("você acertou! vamos para a próxima pergunta");
                acertos++;
                break;
            } else if (resposta == intervalo[0]) {
                System.out.println("você errou, vamos para a próxima pergunta");
                erros++;
                break;
            } else {
                System.out.println("numero invalido, tente novamente");
                i++;
            }
        }
        for (int i = 0; i <= 100;) {
            perguntas[4] = "A empresa trabalha com materiais recicláveis";
            System.out.println(perguntas[4]);
            resposta = scanner.nextInt();
            if (resposta == intervalo[1]) {
                System.out.println("você acertou! vamos contabilizar os acertos e erros.");
                acertos++;
                break;
            } else if (resposta == intervalo[0]) {
                System.out.println("você errou, vamos contabilizar os acertos e erros.");
                erros++;
                break;
            } else {
                System.out.println("numero invalido, tente novamente");
                i++;
            }
        }
        System.out.println("jogador: " + nome);
        System.out.println("acertos: " + acertos );
        System.out.println("erros: " + erros);

    }
}