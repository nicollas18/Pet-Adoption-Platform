import java.util.Locale;
import java.util.Scanner;

public class Funcionalidade8 {
    
    public void executar(Abrigo abrigo) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor que deseja doar");
            double valor;

            scan.useLocale(Locale.US); // Aceita ""."" na entrada. Exemplo: 150.20

            valor = scan.nextDouble();

            abrigo.receberDoacao(valor);
            //System.out.println(abrigoEscolhido.getDoacoes());    
    }
}
