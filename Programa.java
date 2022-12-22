import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        Scanner sc = new Scanner(System.in);
        boolean runProgram = true;
        while (runProgram) {
            spausdintiGalimusPasirinkimus();
            String input = sc.nextLine();
            switch (input) {
                case "1" -> {
                    ivestiPajamas(sc, biudzetas);
                }
                case "2" -> {
                    ivestiIslaidas(sc, biudzetas);
                }
                case "+" -> biudzetas.gautiPajamuIsrasa();
                case "-" -> biudzetas.gautiIslaiduIsrasa();
                case "x" -> runProgram = false;
                default -> System.out.println("Nežinoma komanda");
            }
        }
        System.out.println("Programa baigė darbą");
        sc.close();
    }

    private static void spausdintiGalimusPasirinkimus() {
        System.out.println("""
                Pasirinkite:
                [1] - Įvesti pajamas;
                [2] - Įvesti išlaidas;
                [+] - Rodyti visas gautas pajamas;
                [-] - Rodyti visas išlaidas;
                [x] - Baigti;
                """);
    }

    private static void ivestiPajamas(Scanner scanner, Biudzetas biudzetas) {
        System.out.println("Įveskite pajamų kiekį: ");
        int suma = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite pajamų gavimo datą, formatu (yyyy-MM-dd): ");
        String dataIput = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataIput, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Įveskite kategorija: ");
        String kategorija = String.format(scanner.nextLine());

        System.out.println("Įveskite kur gavote pajamas:  i banka pavedimu, ar ne ");
        String pozymisArIBanka = String.format(scanner.nextLine());

        System.out.println("Įveskite papildoma info: ");
        String papildomaInfo = String.format(scanner.nextLine());

        biudzetas.pridetiPajamuIsrasa(new PajamuIrasas(suma, data, kategorija, pozymisArIBanka, papildomaInfo));
    }

    private static void ivestiIslaidas(Scanner scanner, Biudzetas biudzetas) {
        System.out.println("Įveskite išlaidų kiekį: ");
        Integer suma = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite išlaidų gavimo datą ir laiką, formatu (yyyy-MM-dd  HH:mm): ");
        String dataInput = scanner.nextLine();
        DateTimeFormatter DateTimeFormatter = null;
        LocalDate dataSuLaiku = LocalDate.parse(dataInput, DateTimeFormatter);

        System.out.println("Įveskite kategorija: ");
        String kategorija = String.format(scanner.nextLine());

        System.out.println("Įveskite koks buvo atsiskaitymo budas:  Kortele, ar grynaisiais");
        String atsiskaitymoBudas = String.format(scanner.nextLine());

        System.out.println("Įveskite papildoma info: ");
        String papildomaInfo = String.format(scanner.nextLine());

        biudzetas.pridetiIslaiduIsrasa(new IslaiduIrasas(suma, dataSuLaiku, kategorija, atsiskaitymoBudas, papildomaInfo));
    }
}
