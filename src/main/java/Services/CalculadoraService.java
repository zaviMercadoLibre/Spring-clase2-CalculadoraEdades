package Services;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraService {

    public static Period calcular (int dia, int mes, int año){
        Period edad = Period.between(LocalDate.of(año, mes, dia), LocalDate.now());

        return edad;
    }
}
