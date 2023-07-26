package globaltek;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static List<Integer> filtrarNumeros(List<Integer> listaEntrada) {
        List<Integer> listaSalida = new ArrayList<>();

        for (int numero : listaEntrada) {
            if (numero % 5 == 0 && numero <= 600) {
                listaSalida.add(numero);
            }

            if (numero > 1000) {
                break;
            }
        }

        return listaSalida;
    }

    public static void main(String[] args) {
        List<Integer> entrada = List.of(24, 150, 300, 660, 295, 1050, 50);
        List<Integer> salida = filtrarNumeros(entrada);
        System.out.println(salida); 
    }

}
