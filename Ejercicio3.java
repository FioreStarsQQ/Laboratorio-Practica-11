
/*
    - Laboratorio Nro 11 - Ejercicio 1: Rectángulos
    Cree un programa que solicite el ingreso de dos coordenadas (x1, y1) (x2, y2) y pueda determinar el tipo de rectángulo que 
    se forma:
    • Rectángulo bajo: cuando la base es mayor que la altura
    • Rectángulo alto: cuanto la altura es mayor que la base
    • Rectángulo cuadrado: cuando la base es igual a la altura
    Una vez encontrado el tipo de rectángulo deberá calcular el área del círculo que se forma dentro de dicho rectángulo
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double lado1, lado2, areaCircle; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print(
                "Bienvenido(a), ingrese el punto x de la coordenada 1: ");
        x1 = scan.nextInt();
        System.out.print("Ingrese el punto y de la coordenada 1: ");
        y1 = scan.nextInt();
        System.out.print("Ingrese el punto x de la coordenada 2: ");
        x2 = scan.nextInt();
        System.out.print("Ingrese el punto y de la coordenada 2: ");
        y2 = scan.nextInt();
        lado1 = Math.sqrt(Math.pow(x1 - x2, 2));
        lado2 = Math.sqrt(Math.pow(y1 - y2, 2));
        System.out.println("Lado 1: " + lado1 + " Lado 2: " + lado2);
        // Condicional, determina el tipo de cuadrado y el valor del círculo inscrito
        if (lado1 == lado2) {
            areaCircle = (double) Math.round((Math.PI * Math.pow((lado1 / 2), 2)) * 100) / 100;
            System.out.println("Rectángulo [(" + x1 + "," + y1 + "), (" + x2 + "," + y2
                    + ")]\nEs un rectángulo cuadrado.\nEl área del circulo inscrito es: " + areaCircle);

        } else {
            if (lado1 > lado2) {
                areaCircle = (double) Math.round(Math.PI * Math.pow((lado2 / 2), 2) * 100) / 100;
                System.out.println("Rectángulo [(" + x1 + "," + y1 + "), (" + x2 + "," + y2
                        + ")]\nEs un rectángulo bajo.\nEl área del circulo inscrito es: " + areaCircle);
            } else {
                areaCircle = (double) Math.round(Math.PI * Math.pow((lado1 / 2), 2) * 100) / 100;
                System.out.println("Rectángulo [(" + x1 + "," + y1 + "), (" + x2 + "," + y2
                        + ")]\nEs un rectángulo alto.\nEl área del circulo inscrito es: " + areaCircle);
            }
        }
        scan.close();
    }
}