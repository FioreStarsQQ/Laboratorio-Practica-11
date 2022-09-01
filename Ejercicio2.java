
/*
    - Laboratorio Nro 11 - Ejercicio 1: Triángulos Versión Avanzada
    Escriba un programa que acepte seis valores no negativos que representan las coordenadas (x, y) de los tres distintos 
    vértices de un triángulo representado en el plano cartesiano. Por ejemplo si el usuario ingresa 
    12.2, 28.3, 0.4, 16.7, 2.9, 42.2 estos datos definen un triángulo con los vértices (12.2, 28.3), (0.4, 16.7) y (2.9, 42.2).
    Puede asumir que todos los datos ingresados son no negativos, y que los datos representan tres vértices distintos. 
    Sin embargo, necesita verificar que los datos representan un triángulo valido (desigualdad triangular).
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, lado1, lado2, lado3; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas con validación para cada una de ellas, segun el enunciado solo se deben ingresar enteros positivos
        System.out.println(
                "Bienvenido(a), a continuación se corroborará si con los datos ingresados se cumple que es un triángulo válido.\n* Recuerde ingresar números positivos.");
        do {
            System.out.print("Primero deberá ingresar los datos de la coordenada 1;\nx1: ");
            x1 = scan.nextDouble();
        } while (x1 < 0);
        do {
            System.out.print("y1: ");
            y1 = scan.nextDouble();
        } while (y1 < 0);
        do {
            System.out.print("Luego, ingrese los valores de la coordenada 2;\nx2: ");
            x2 = scan.nextDouble();
        } while (x2 < 0);
        do {
            System.out.print("y2: ");
            y2 = scan.nextDouble();
        } while (y2 < 0);
        do {
            System.out.print("Por último, ingrese los valores de la coordenada 3;\nx3: ");
            x3 = scan.nextDouble();
        } while (x3 < 0);
        do {
            System.out.print("y3: ");
            y3 = scan.nextDouble();
        } while (y3 < 0);
        // Calculo de las medidas de los lados
        lado1 = (double) Math.round(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)) * 100) / 100;
        lado2 = (double) Math.round(Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)) * 100) / 100;
        lado3 = (double) Math.round(Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)) * 100) / 100;
        System.out.println("Medidas:\nLado 1: " + lado1 + " unidades\tLado 2: " + lado2 + " unidades\tLado 3: " + lado3
                + " unidades");
        // Condicional, comprobar si los datos satisfacen la desigualdad triangular.
        if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2) {
            System.out.print("Efectivamente es un triángulo válido.\nTIPO:\t");
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.print("Equilátero.");
            } else {
                if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                    System.out.print("Escaleno.");
                } else {
                    System.out.print("Isóceles.");
                }
            }
        } else {
            System.out.println("¡ERROR! No es un triángulo válido.");
        }
        scan.close();
    }
}