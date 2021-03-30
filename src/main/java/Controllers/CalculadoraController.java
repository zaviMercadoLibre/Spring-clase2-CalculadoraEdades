package Controllers;

import Services.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;

@RestController
public class CalculadoraController {

    @GetMapping("/calculadora/{dia}/{mes}/{año}")
    public String getEdad(@PathVariable int dia,@PathVariable int mes, @PathVariable int año){
        Period años = CalculadoraService.calcular(dia, mes, año);
        String cadena = "años: "+ años.getYears() +", meses: "+ años.getMonths() + ", dias: "+ años.getDays();
        return cadena;
    }
}
