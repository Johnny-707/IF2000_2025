
package logic;

import java.util.Scanner;

public class Lab_01 {
    Scanner sc = new Scanner(System.in);

    // 1) Determinar si un número es par o impar
    public void ejercicio1() {
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("El numero es PAR");
        else
            System.out.println("El numero es IMPAR");
    }

    // 2) Valor absoluto de un número
    public void ejercicio2() {
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("El valor absoluto es: " + Math.abs(n));
    }

    // 3) Serie 3,6,9,...,99 y suma
    public void ejercicio3() {
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nLa suma es: " + suma);
    }

    // 4) Ordenar tres números ascendente
    public void ejercicio4() {
        System.out.print("Ingrese tres numeros: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] arr = {a, b, c};
        java.util.Arrays.sort(arr);
        System.out.println("Orden ascendente: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }

    // 5) Leer 2 números y operar según condición
    public void ejercicio5() {
        System.out.print("Ingrese dos numeros: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int resultado;
        if (a == b) {
            resultado = a * b;
        } else if (a > b) {
            resultado = a - b;
        } else {
            resultado = a + b;
        }
        System.out.println("Resultado: " + resultado);
    }

    // 6) Leer notas y determinar si hubo un 10
    public void ejercicio6() {
        boolean hay10 = false;
        int nota;
        do {
            System.out.print("Ingrese una nota (-1 para terminar): ");
            nota = sc.nextInt();
            if (nota == 10) hay10 = true;
        } while (nota != -1);
        if (hay10)
            System.out.println("Si hubo al menos una nota de 10");
        else
            System.out.println("No hubo ninguna nota de 10");
    }

    // 7) Calcular pulsaciones
    public void ejercicio7() {
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        int pulsaciones;
        if (sexo == 'F')
            pulsaciones = (220 - edad) / 10;
        else
            pulsaciones = (210 - edad) / 10;
        System.out.println("Numero de pulsaciones: " + pulsaciones);
    }

    // 8) Calcular utilidad según antigüedad
    public void ejercicio8() {
        System.out.print("Ingrese salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese anios de antiguedad: ");
        int años = sc.nextInt();
        double porcentaje;
        if (años < 1) porcentaje = 0.05;
        else if (años < 2) porcentaje = 0.07;
        else if (años < 5) porcentaje = 0.10;
        else if (años < 10) porcentaje = 0.15;
        else porcentaje = 0.20;
        System.out.println("La utilidad es: " + (salario * porcentaje));
    }

    // 9) Determinar si un número es primo
    public void ejercicio9() {
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();
        boolean primo = true;
        if (n <= 1) primo = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo)
            System.out.println(n + " es primo");
        else
            System.out.println(n + " no es primo");
    }

    // 10) Descuento según número de computadoras
    public void ejercicio10() {
        System.out.print("Ingrese cantidad de computadoras: ");
        int cant = sc.nextInt();
        double precioUnit = 11000, total = cant * precioUnit, descuento;
        if (cant < 5) descuento = 0.10;
        else if (cant < 10) descuento = 0.20;
        else descuento = 0.40;
        double montoDesc = total * descuento;
        double totalPagar = total - montoDesc;
        System.out.println("Cantidad: " + cant);
        System.out.println("Precio sin descuento: " + total);
        System.out.println("Descuento aplicado: " + montoDesc);
        System.out.println("Total a pagar: " + totalPagar);
    }

    // 11) Lista de números primos entre 2 y N
    public void ejercicio11() {
        System.out.print("Ingrese un numero N: ");
        int N = sc.nextInt();
        System.out.println("Numeros primos entre 2 y " + N + ":");
        for (int i = 2; i <= N; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) System.out.print(i + " ");
        }
        System.out.println();
    }

    // 12) Área de un triángulo
    public void ejercicio12() {
        System.out.print("Ingrese base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Area del triangulo: " + area);
    }
}

