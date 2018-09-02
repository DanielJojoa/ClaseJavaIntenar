/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    
    /*
        Enunciado: 
            Se necesita un programa que permita ingresar la información de varios estudiantes,
            el numero de estudiantes lo determina el usuario,
            el nombre del alumno, 3 notas y calcular el promedio
            el prorama debe listar a los estudiantes y mostrar su calificación y  su promedio
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        System.out.print("Listado y calificaciones");

        String listado  = "";//listado -> variable de tipo cadena que almacenará el listado de los 
        //estudiantes ingresados en el programa
        String nombre = "";//nombre ->  Guardará el nombre del estudiante ingresado al programa
        Scanner entrada = new Scanner(System.in);//entrada-> variable tipo Scanner que permite
        //el ingreso de datos por teclado
        float nota1, nota2, nota3,promedio = 0;// --> variables tipo float que perminten guardar numeros decimales
        int numEstudiantes=0; // variable que determina cuantos estudiantes se van a registrar
        System.out.println("Ingrese el número de estudiantes a resgistrar");// mensaje que  indica al usuario que debe ingresar un número
        numEstudiantes = entrada.nextInt();// nextInt() Permite el ingreso de numeros enteros, en este caso determina el número de estudiantes
        //que se registrarán 
        for(int i = 0;i < numEstudiantes;i++)//En esta condición, la variable de control es i, la cual se inicia dentro de la condición
        //y es la que valida si se sigen ejecutando las instrucciones dentro del ciclo, en este caso i < numEtudiantes ->(i menor que numEstudiantes)
        {
            entrada = new Scanner(System.in);//resetea el Scanner para poder ingresar el valor de la variable nombre.
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();//nextLine perimte el ingreso de cadenas de caracteres.
            System.out.print("Ingrese calificación 1: ");
            nota1 = entrada.nextFloat();//nexFloat permite el ingreso de números decimales por teclado
            System.out.print("Ingrese calificación 2: ");
            nota2 = entrada.nextFloat();
            System.out.print("Ingrese calificación 3: ");
            nota3 = entrada.nextFloat();
            promedio = (nota1 + nota2 + nota3) / 3;//calcular el promedio de las notas y las guarda en la variale promedio
            listado += nombre + " nota1: " + nota1 + " nota2: "+nota2 + " nota3: " + nota3 + " promedio: " + promedio + "\n";//  se arma la 
            //cadena que se muestra como resultado, la expresión '\n'-> agrega un salto de linea, lo que facilita ver la información de 
            //salida como un listado
          
            
                     

        }
       System.out.print(listado);//Después de salir del ciclo, se imprime el listado de estudiantes con sus notas y el promedio
    }
    
}
