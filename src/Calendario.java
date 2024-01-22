import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Calendario {
    private ArrayList<Feriado> feriados;

    public Calendario(){
        feriados = new ArrayList<>();

        Feriado natal = new Feriado("Natal", LocalDate.of(2024, 12, 25));
        Feriado pascoa = new Feriado("Pascoa", LocalDate.of(2024,03, 31));
        Feriado tiradentes = new Feriado("Tiradentes", LocalDate.of(2024, 04, 21));
        Feriado independencia = new Feriado("Independência", LocalDate.of(2024, 9, 07));

        feriados.add(natal);
        feriados.add(pascoa);
        feriados.add(tiradentes);
        feriados.add(independencia);
    }

    public void imprimirFeriados(){
        for(Feriado feriado: feriados){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println(feriado.getData().format(formatter) + " é " + feriado.getNome() + "!");
        }
    }

    public String verificaFeriado(LocalDate dataInserida) {
        for(Feriado feriado: feriados){
            if(feriado.getData().equals(dataInserida)){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return "Dia " + dataInserida.format(formatter) + " é " + feriado.getNome() + "!";
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Dia " + dataInserida.format(formatter) + " não é feriado";
    }

    
    
    
}
