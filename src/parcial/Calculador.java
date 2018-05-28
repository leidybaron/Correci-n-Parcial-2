/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements ICalculador {
    
    public Punto punto1=new Punto();
    public Punto punto2=new Punto();

    @Override
    public double calcularArea() {
        
        double dx=((punto2.getX()-punto1.getX())*punto1.getY());
        double calcularArea=((punto2.getX()-punto1.getX()*punto2.getY()-punto1.getY())/2);
        
        return calcularArea+dx;
        
        
        
    }

    @Override
    public double calcularDistancia() {
        
        double dx=Math.pow((punto2.getX()-punto1.getX()),2);
        double dy=Math.pow((punto2.getY()-punto1.getY()),2);
        Math.sqrt(dx+dy);
        
        return Math.sqrt(dx+dy);
        
    
        
    }

    @Override
    public double calcularPendiente() {
        
        double p=((punto2.getY()-punto1.getY())/(punto2.getX()-punto1.getX()));
        return p;
        
        
    }


    
}
