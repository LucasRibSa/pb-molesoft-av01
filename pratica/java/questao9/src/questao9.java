import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;

public class questao9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dados = new String[2];

        System.out.println("login: ");
        dados[0] = "admin";
        String tentativalogin = scanner.nextLine();
        System.out.println("senha: ");
        dados[1] = "admin123";
        String tentativasenha = scanner.nextLine();
        int localTime = LocalTime.now() . getHour();
        boolean condicao = Objects.equals(tentativalogin, dados[0]) && Objects.equals(tentativasenha, dados[1]);
        if(condicao){
            if (localTime >6 && localTime < 12) {
                System.out.println("“Bom dia, você se logou ao nosso \n" +
                        "sistema.");
            }
        }if(condicao){
            if (localTime >11 && localTime < 18) {
                System.out.println("“Boa tarde, você se logou ao nosso \n" +
                        "sistema.");
            }
        }if(condicao){
            if (localTime >17) {
                System.out.println("“Boa noite, você se logou ao nosso \n" +
                        "sistema.");
            }
        }if(condicao){
            if (localTime < 7) {
                System.out.println("“Boa madrugada, você se logou ao nosso \n" +
                        "sistema.");
            }
        } else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}