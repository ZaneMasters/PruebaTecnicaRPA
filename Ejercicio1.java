package globaltek;

public class Ejercicio1 {

	 public static int calcularTermino(int numero, int repeticiones) {
	        int termino = 0;
	        for (int i = 0; i < repeticiones; i++) {
	            termino = termino * 10 + numero;
	        }
	        return termino;
	    }

	    public static int sumaSerie(int repeticiones, int numero) {
	        int suma = 0;
	        for (int i = 1; i <= repeticiones; i++) {
	            suma += calcularTermino(numero, i);
	        }
	        return suma;
	    }

	    public static void main(String[] args) {
	        int n = 3; // Número de términos a sumar en la serie
	        int numero = 5;
	        int resultado = sumaSerie(n, numero);
	        System.out.println("La suma de la serie es: " + resultado);
	    }

}
