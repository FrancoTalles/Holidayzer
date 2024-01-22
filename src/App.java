import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main (String[] args) {
        Calendario calendario = new Calendario();

        calendario.imprimirFeriados();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("25/12/2024", formatter);
        System.out.println(calendario.verificaFeriado(data));
    }
}
