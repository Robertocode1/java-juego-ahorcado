import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "programacion";
        int maxIntentos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        

        while (!palabraAdivinada && intentos < maxIntentos) {
            System.out.println("palabra a adivinar: " + String.valueOf(letrasAdivinadas) + palabraSecreta.length() + " letras");

            System.out.println("ingresa un letra para adivanar la palabra");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("No has adivinado te quedan " + (maxIntentos-intentos) + " intentos.");
                
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;

                System.out.println("Vaya! lo has conseguido, adivinaste: " + String.valueOf(letrasAdivinadas));     
                
            }
            
        }
        if(!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos");

        }



    }
}
