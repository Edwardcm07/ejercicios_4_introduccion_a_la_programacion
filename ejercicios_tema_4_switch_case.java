public class ejercicios_tema_4_switch_case {
    // Por último, para el Switch, deberás crear la variable estacion, y distintos
    // case para las cuatro estaciones del año. Dependiendo del valor de la variable
    // estacion se deberá mandar un mensaje por consola informando de la estación en
    // la que está. También habrá que poner un default para cuando el valor de la
    // variable no sea una estación.
    public static void main(String[] args) {
        String estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación del año");

        }
    }
}
