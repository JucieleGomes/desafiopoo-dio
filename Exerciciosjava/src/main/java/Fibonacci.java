import java.util.Objects;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        boolean missPassword = true;

        int passwordAttempts = 3;
        int userAttempts = 0;

        while (missPassword) {

            Scanner leitor = new Scanner(System.in);
            String N = leitor.next();

            if(Objects.equals(N, "Frodinho123")) {
                missPassword = false;
            }

            if(userAttempts >= passwordAttempts) {
                System.out.print("Sua senha foi bloqueada");
                missPassword = false;
            }
            else if(!missPassword){
                userAttempts = 0;
                System.out.print("Senha correta!");
            }else {
                System.out.print("Senha inválida, tente novamente");
                userAttempts++;
            }

        }


    }
}
