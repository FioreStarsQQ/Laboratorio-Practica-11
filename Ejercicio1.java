
/*
    - Laboratorio Nro 11 - Ejercicio 1: Triángulos
    • Equilátero: tres lados iguales 
    • Isósceles: 2 lados iguales 
    • Escaleno: 3 lados distintos.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        double lado1, lado2, lado3; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print(
                "Bienvenido(a), a continuación se corroborará si con los lados ingresados se cumple que es un triángulo válido.\nPrimero, ingrese un lado del triángulo: ");
        lado1 = scan.nextDouble();
        System.out.print("Ingrese el segundo lado: ");
        lado2 = scan.nextDouble();
        System.out.print("Ingrese el tercer lado: ");
        lado3 = scan.nextDouble();
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
