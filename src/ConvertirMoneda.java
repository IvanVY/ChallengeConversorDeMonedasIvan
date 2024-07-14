import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaActual, String monedaConvertir, ConsultarMonedas consulta, Scanner teclado){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.consultarMonedas(monedaActual, monedaConvertir);
        System.out.println("La tasa de conversino de hoy \n1 " + monedaActual + " = " + monedas.conversion_rate() + " " + monedaConvertir);
        System.out.println("Ingrese la cantidad de " + monedaActual);
        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaActual + " = " + cantidadConvertida + " " + monedas.target_code());
    }
}
