public class ejercicios_tema_4_if {
    // Usando un if, crear una condición que compare si la variable numeroIf es
    // positivo, negativo, o 0.
    // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    public static void main(String[] args) {
        int numeroIf = -3;

        if (numeroIf > 0) {
            System.out.println("el número " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("el número " + numeroIf + " es igual a cero");
        } else {
            System.out.println("el número " + numeroIf + " es negativo");
        }

    }
}
