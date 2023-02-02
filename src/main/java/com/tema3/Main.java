package com.tema3;

public class Main {
    public static void main(String[] args) {
        int a=10, b=11, c=5;

        System.out.println("La suma de los numeros " + a + " - " +  b + " - " + c + " es: " + sumaNumeros(a,b,c));

        Coche miCoche = new Coche();

        System.out.println("Numero de puertas : " + miCoche.incPuerta(2));

    }

    public static int sumaNumeros(int a, int b, int c){
        return a + b + c;
    }
}