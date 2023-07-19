/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class NOTAS {

    
    public static void main (String [] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("MATERIAS");
        System.out.println("a. Matemaicas");
        System.out.println("b. Español");
        System.out.println("c. ingles");
        
        double n1, n2, n3, Mat=0, Esp=0, Ing=0, Prom;
        int estud, cont2=1, cont3=1;
        char menu = entrada.next () .charAt (0); 
        
        switch(menu){
            case 'a' -> {
                System.out.println("MATEMATICAS: ");
                System.out.println("Ingresa numero total de Estudiantes de esta Materia: ");
                estud = entrada.nextInt();
                
                for (int cont = 1; cont < estud; cont++) {
                    System.out.println("Ingresa nota de estudiante " + cont +":");
                    n1 = entrada.nextDouble();
                    Mat= Mat + n1;
                }
                
                Prom = Mat/estud;
                System.out.println("El promedio del grupo de Matematicas es: " + Prom);
            }
            
            case 'b' -> {
                System.out.println("ESPAÑOL: ");
                System.out.println("Ingresa numero total de Estudiantes de esta Materia: ");
                estud = entrada.nextInt();
                
                while (cont2<=estud){
                    System.out.println("Ingresa nota de estudiante: " + cont2 );
                    n2 = entrada.nextDouble();
                    Esp = Esp + n2;
                    cont2++;                                             
                }
                
                Prom = Esp/estud;
                System.out.println("El promedio del grupo de Español es: " + Prom);
            }
            
            case 'c' -> {
                System.out.println("INGLES: ");
                System.out.println("Ingresa numero total de Estudiantes de esta Materia: ");
                estud = entrada.nextInt();
                
                do {
                    System.out.println("Ingresa numero total de Estudiantes de esta Materia: ");
                    n3 = entrada.nextDouble();
                    Ing = Ing + n3;
                    cont3++;
                } 
                
                while (cont3<=estud);
                
                Prom = Ing/estud;
                System.out.println("El promedio del grupoo de ingles es: " + Prom);
            }
        }     
    }
}