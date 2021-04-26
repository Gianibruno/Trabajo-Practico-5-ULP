/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giani
 */
public class Arreglo {

    public static void sumarLista(int[] enteros) {
        float auxSuma = 0;
        for (int i = 0; i < enteros.length; i++) {
            auxSuma += enteros[i];
        }
        System.out.println("La suma de los enteros dentro del array es: " + auxSuma);
        System.out.println("El promedio de los numeros enteros dentro del array es: " + (auxSuma / enteros.length));
    }

    public static int buscarMayor(int[][] enteros) {
        int auxMax;
        auxMax = enteros[0][0];
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                if (enteros[i][j] > auxMax) {
                    auxMax = enteros[i][j];
                }
            }
        }
        return auxMax;
    }

    public static int cuentaVocales(String string) {
        int cVocales = 0;
        char[] auxChar = string.toLowerCase().toCharArray();
        for (int i = 0; i < auxChar.length; i++) {
            if (auxChar[i] == 'a' || auxChar[i] == 'e' || auxChar[i] == 'i' || auxChar[i] == 'o' || auxChar[i] == 'u') {
                cVocales++;
            }
        }
        return cVocales;
    }

    public static int cuentaCaracter(String string, char caracter) {
        int cVeces = 0;
        char[] auxChar = string.toCharArray();
        for (int i = 0; i < auxChar.length; i++) {
            if (auxChar[i]==caracter){
            cVeces++;
            }
        }
        return cVeces;
    }
}
