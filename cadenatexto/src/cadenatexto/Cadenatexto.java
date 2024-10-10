package cadenatexto;

import java.util.Scanner;

public class Cadenatexto {
    public static String invertirCadena(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char primerCaracter = str.charAt(str.length() - 1);
        String restoDeCadena = str.substring(0, str.length() - 1);
        return primerCaracter + invertirCadena(restoDeCadena);
    }

public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena para invertir:");
        String entrada = scanner.nextLine();
        String invertida = invertirCadena(entrada);
        System.out.println("Cadena invertida: " + invertida);
    
}   
}