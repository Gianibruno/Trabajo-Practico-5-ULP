/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giani
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayEnteros[]={1,2,3,4};
        int matrixIrregular[][]={{1,2,3,4,5},{1,2,3},{5,7,9,8,6,9,71}};
        String s1="Hola, mi nombre es Gianfranco Bruno.";
        String s2="Esto es un string de prueba.";
        Arreglo.sumarLista(arrayEnteros);
        System.out.println("El mayor numero dentro de la matriz es: "+Arreglo.buscarMayor(matrixIrregular));
        System.out.println("La cantidad de vocales dentro del primer String es: "+Arreglo.cuentaVocales(s1));
        System.out.println("La cantidad de vocales dentro del segundo String es: "+Arreglo.cuentaVocales(s2));
        System.out.println("La cantidad de caracteres 'r' dentro del primer arreglo es: "+ Arreglo.cuentaCaracter(s1,'r'));
        System.out.println("La cantidad de caracteres t dentro del segundo arreglo es: "+Arreglo.cuentaCaracter(s2,'t'));
        
    }
    
}
