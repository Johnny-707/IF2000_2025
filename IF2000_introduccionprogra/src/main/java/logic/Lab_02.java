
package logic;

import java.util.Scanner;

public class Lab_02 {

    Scanner sc = new Scanner(System.in);

    // =========================================================
    // 13) Suma de números pares entre 2 y 1000
    // =========================================================
    public void ejercicio13() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los numeros pares entre 2 y 1000 es: " + suma);
    }

    // =========================================================
    // 14) Celsius a Fahrenheit
    // =========================================================
    public void ejercicio14() {
        System.out.print("Digite la temperatura en Celsius: ");
        double c = sc.nextDouble();
        double f = (9.0 / 5.0) * c + 32;
        System.out.println("Temperatura en Fahrenheit: " + f);
    }

    // =========================================================
    // 15) Potencia X^n
    // =========================================================
    public void ejercicio15() {
        System.out.print("Digite la base X: ");
        int x = sc.nextInt();
        System.out.print("Digite el exponente N: ");
        int n = sc.nextInt();
        long resultado = (long) Math.pow(x, n);
        System.out.println(x + "^" + n + " = " + resultado);
    }

    // =========================================================
    // 16) Número a mes del año
    // =========================================================
    public void ejercicio16() {
        System.out.print("Digite un numero (1-12): ");
        int mes = sc.nextInt();
        String nombreMes;
        switch (mes) {
            case 1 -> nombreMes = "Enero";
            case 2 -> nombreMes = "Febrero";
            case 3 -> nombreMes = "Marzo";
            case 4 -> nombreMes = "Abril";
            case 5 -> nombreMes = "Mayo";
            case 6 -> nombreMes = "Junio";
            case 7 -> nombreMes = "Julio";
            case 8 -> nombreMes = "Agosto";
            case 9 -> nombreMes = "Septiembre";
            case 10 -> nombreMes = "Octubre";
            case 11 -> nombreMes = "Noviembre";
            case 12 -> nombreMes = "Diciembre";
            default -> nombreMes = "Numero inválido";
        }
        System.out.println("El mes es: " + nombreMes);
    }

    // =========================================================
    // 17) Función F(x)
    // =========================================================
    public void ejercicio17() {
        System.out.print("Digite un numero X: ");
        int x = sc.nextInt();
        int f;
        if (x > 0) f = x + 5;
        else if (x < 0) f = x * x;
        else f = 1;
        System.out.println("F(x) = " + f);
    }

    // =========================================================
    // 18) Área triángulo con lados (fórmula de Herón)
    // =========================================================
    public void ejercicio18() {
        System.out.print("Digite lado a: ");
        double a = sc.nextDouble();
        System.out.print("Digite lado b: ");
        double b = sc.nextDouble();
        System.out.print("Digite lado c: ");
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("El area del triangulo es: " + area);
    }

    // =========================================================
    // 19) Intercambiar valores A y B
    // =========================================================
    public void ejercicio19() {
        System.out.print("Digite valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite valor de B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Ahora A = " + a + ", B = " + b);
    }

    // =========================================================
    // 20) Ecuación de la recta
    // =========================================================
    public void ejercicio20() {
        System.out.print("Digite X0: ");
        double x0 = sc.nextDouble();
        System.out.print("Digite Y0: ");
        double y0 = sc.nextDouble();
        System.out.print("Digite X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite Y1: ");
        double y1 = sc.nextDouble();

        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - m * x0;

        System.out.println("Ecuacion de la recta: y = " + m + "x + " + b);
    }

    // =========================================================
    // 21) Suma de números menores a K
    // =========================================================
    public void ejercicio21() {
        System.out.print("Digite un numero K: ");
        int k = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < k; i++) {
            suma += i;
        }
        System.out.println("La suma de numeros menores que " + k + " es: " + suma);
    }

    // =========================================================
    // 22) Promedio de números positivos
    // =========================================================
    public void ejercicio22() {
        int contador = 0;
        double suma = 0, num;
        do {
            System.out.print("Digite un numero positivo (negativo para terminar): ");
            num = sc.nextDouble();
            if (num >= 0) {
                suma += num;
                contador++;
            }
        } while (num >= 0);

        if (contador > 0)
            System.out.println("El promedio es: " + (suma / contador));
        else
            System.out.println("No se ingresaron numeros positivos.");
    }

    // =========================================================
    // 23) 10 números: pares, impares, sumas
    // =========================================================
    public void ejercicio23() {
        int sumaTotal = 0, sumaPares = 0, sumaImpares = 0;
        int contPares = 0, contImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite numero " + i + ": ");
            int num = sc.nextInt();
            sumaTotal += num;
            if (num % 2 == 0) {
                sumaPares += num;
                contPares++;
            } else {
                sumaImpares += num;
                contImpares++;
            }
        }

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Cantidad pares: " + contPares + ", suma pares: " + sumaPares);
        System.out.println("Cantidad impares: " + contImpares + ", suma impares: " + sumaImpares);
    }

    // =========================================================
    // 24) Suma de pares e impares entre 1 y 200
    // =========================================================
    public void ejercicio24() {
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumaPares += i;
            else sumaImpares += i;
        }
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }

    // =========================================================
    // 25) Suma de cuadrados de 1 a 100
    // =========================================================
    public void ejercicio25() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados de 1 a 100 es: " + suma);
    }

    // =========================================================
    // 26) Factorial de un número
    // =========================================================
    public void ejercicio26() {
        System.out.print("Digite un numero N: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
    }

    // =========================================================
    // 27) Máximo de 10 números
    // =========================================================
    public void ejercicio27() {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite numero " + i + ": ");
            int num = sc.nextInt();
            if (num > max) max = num;
        }
        System.out.println("El valor maximo es: " + max);
    }
}

