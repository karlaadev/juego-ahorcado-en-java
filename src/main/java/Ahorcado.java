import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] palabras = {"java", "programacion", "computadora", "desarrollo",
                "algoritmo", "variable", "objeto", "clase", "metodo", "herencia"};

        Random random = new Random();
        String palabraSecreta = palabras[random.nextInt(12)];




        int intentosMaximos = 10;
        int intentos =0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';


        }

        while (!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + letrasAdivinadas.length + " letras)");
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(entrada.next().charAt(0));

            boolean letraCorrecta =false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto, te quedan: " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equalsIgnoreCase(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, adivinaste la palabra " + palabraSecreta);
            }
        }

        if (!palabraAdivinada){
            System.out.println("Game over, no la adivinaste");
        }

        entrada.close();





    }
}
