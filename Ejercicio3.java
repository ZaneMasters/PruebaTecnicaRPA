package globaltek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio3 {

    public static List<List<Integer>> agruparElementos(List<Integer> lista) {
        Map<Integer, List<Integer>> mapa = new HashMap<>();

        for (int numero : lista) {
            mapa.putIfAbsent(numero, new ArrayList<>());
            mapa.get(numero).add(numero);
        }

        return new ArrayList<>(mapa.values());
    }

    public static void main(String[] args) {
        List<Integer> entrada = List.of(12, 25, 1, 1, 7, 25);
        List<List<Integer>> salida = agruparElementos(entrada);
        System.out.println(salida); 

    }

}
