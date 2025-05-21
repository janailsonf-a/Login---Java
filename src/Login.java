import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";

        int tentativasMaximas = 3;
        int tentativasAtuais = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Login! 🚀");
        System.out.println("----------------------------------");

        while (tentativasAtuais < tentativasMaximas) {
            System.out.println("\nTentativa " + (tentativasAtuais + 1) + " de " + tentativasMaximas + ":");

            System.out.print("👤 Digite o nome de usuário: ");
            String usuarioDigitado = scanner.nextLine();

            System.out.print("🔑 Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("\n✅ Login bem-sucedido! Bem-vindo, " + usuarioCorreto + "! 🎉");
                break;
            } else {
                System.out.println("\n❌ Nome de usuário ou senha incorretos.");
                tentativasAtuais++;

                if (tentativasAtuais < tentativasMaximas) {
                    int tentativasRestantes = tentativasMaximas - tentativasAtuais;
                    System.out.println("Você tem mais " + tentativasRestantes + " tentativa(s). Tente novamente.");
                } else {
                    System.out.println("\n🚫 Você excedeu o número máximo de tentativas. Acesso bloqueado. 🔒");
                }
            }
        }

        scanner.close();

        System.out.println("\n----------------------------------");
        System.out.println("Obrigado por usar o sistema! 👋");
    }
}