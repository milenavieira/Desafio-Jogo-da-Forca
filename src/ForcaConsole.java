import java.util.Scanner;

public class ForcaConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Forca forca = new Forca(sc.nextLine(), sc.nextLine());

        System.out.println("Dica: " + forca.dica);
        forca.buscarEstado();

        do {char letraChutada = sc.next().charAt(0);
        forca.chutarLetra(letraChutada);
        } while (forca.vidasRestantes > 1);

    }
}
