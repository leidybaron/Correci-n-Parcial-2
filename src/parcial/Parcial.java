/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        Calculador miCalculador=new Calculador();
        Scanner miEscaner=new Scanner(System.in);
        
        System.out.println("X1");
        int X1=miEscaner.nextInt();
        miCalculador.punto1.setX(X1);
        
        
        System.out.println("Y1");
        int Y1=miEscaner.nextInt();
        miCalculador.punto1.setY(Y1);
        
        
        System.out.println("X2");
        int X2=miEscaner.nextInt();
        miCalculador.punto2.setX(X2);
        
        
        System.out.println("Y2");
        int Y2=miEscaner.nextInt();
        miCalculador.punto2.setX(Y2);
        
        
        System.out.println("la distancia entre los puntos es:");
        System.out.println((miCalculador.calcularDistancia()));
        System.out.println("El area bajo el segmento de recta es:");
        System.out.println((miCalculador.calcularArea()));
        System.out.println("La pendiente del segmenton de recta es:");
        System.out.println((miCalculador.calcularPendiente()));
        
        
    }
    
}
