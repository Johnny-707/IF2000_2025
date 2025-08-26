package logic;

public class Quiz_3 {

    public void tablero_quiz() {
        int filas = 9;
        int columnas = 11;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                // Primera y última fila: todos los asteriscos con espacio
                if (i == 0 || i == filas - 1) {
                    System.out.print("*");
                } 
                // Bordes verticales
                else if (j == 0 || j == columnas - 1) {
                    System.out.print("*");
                } 
                // Fila central con asterisco centrado
                else if (i == filas / 2 && j == columnas / 2) {
                    System.out.print("*");
                } 
                // Espacios internos
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}

    

