
package com.mycompany.if2000_introduccionprogra;

import logic.Ejercicios_semana2_PracticaEnClase;
import logic.Quiz_3;   

public class IF2000_introduccionprogra {

    public static void main(String[] args) {
        
        Ejercicios_semana2_PracticaEnClase ejercicios = new Ejercicios_semana2_PracticaEnClase();

       
        Quiz_3 quiz = new Quiz_3();

        // Llamar a los métodos 
        ejercicios.ejercicioA();
        ejercicios.ejercicioB();
        ejercicios.ejercicioC();
        ejercicios.ejercicioD();
        ejercicios.ejercicioE();
        ejercicios.tablero();
        quiz.tablero_quiz();
    }
}


