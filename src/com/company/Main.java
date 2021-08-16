package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // System.out.println(esPrimo());
        // System.out.println(mayor());
        System.out.println(comparacioStrings());

    }

    Scanner scanner = new Scanner(System.in);

    public static boolean esPrimo(){
        System.out.println("ingrese numero a verificar.");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int contador = 2;
        boolean primo= true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static int mayor() {
        System.out.println("ingrese numeros a comparar.");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int mayor = 0;

        if (numero < numero2) {
            mayor = numero2;
        }else{
            mayor = numero;
        }
        if(mayor < numero3){
            mayor = numero3;
        }
        return mayor;

    }

    public static boolean comparacioStrings(){
        System.out.println("ingrese textos a comparar.");
        Scanner scanner = new Scanner(System.in);

        String textoA = scanner.nextLine();
        String textoB = scanner.nextLine();

        boolean comparacion = textoA.equals(textoB);

        return comparacion;
    }


}
