import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int bucle = 0;
        Scanner teclado = new Scanner(System.in);
        ConsultarMonedas consulta = new ConsultarMonedas();
        while (bucle!=7){
            System.out.print(
                    """
                   *****************************************
                   Bienvenido@s a mi aplicacion de conversión de Monedas.
                   Contamos con estas conversiones:
                   1) Dolar =>> Peso Argentino
                   2) Peso Argentino =>> Dolar
                   3) Dolar =>> Real Brasileño
                   4) Real Brasileño =>> Dolar
                   5) Dolar =>> Peso Colombiano
                   6) Peso Colombiano =>> Dolar
                   7) Salir
                   *****************************************
                   Elija una opcion:
                   """);
            try {
                var opcionConversor = Integer.valueOf(teclado.nextLine());
                switch (opcionConversor) {
                    case 1:
                        ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                        break;
                    case 2:
                        ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                        break;
                    case 3:
                        ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                        break;
                    case 4:
                        ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                        break;
                    case 5:
                        ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                        break;
                    case 6:
                        ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                        break;
                    case 7:
                        bucle = opcionConversor;
                        break;
                    default:
                        System.out.println("Numero Fuera de rango, elija otra opcion");
                }
            }catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero.");
            }
        }
        System.out.println("Fin del programa");
    }

}
