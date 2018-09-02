/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
      /*
        Enunciado: 
            Se necesita un programa que permita ingresar la información de varios estudiantes,
            el nombre del alumno, 3 notas y calcular el promedio
            el prorama debe listar a los estudiantes y mostrar su calificación y  su promedio
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Listado y calificaciones");

        String listado  = "";//listado -> variable de tipo cadena que almacenará el listado de los 
        //estudiantes ingresados en el programa
        String nombre = "";//nombre ->  Guardará el nombre del estudiante ingresado al programa
        Scanner entrada = new Scanner(System.in);//entrada-> variable tipo Scanner que permite
        //el ingreso de datos por teclado
        float nota1, nota2, nota3,promedio = 0;// --> variables tipo float que perminten guardar numeros decimales
        String salir = "s"; //varialbe de control para el ciclo while
        while (salir.equals("s") ) 
        {// compara el valor guardado en la varialbe salir on el caracter "s"
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
            System.out.println("Desea  ingresar otro alumno ? s /n ");
            entrada = new Scanner(System.in);//resetea el Scanner para poder ingresar el valor de la variable salir el, cual determina si
            // se sigue ejecutando las ordenes dentro del ciclo, en este caso, agregar estudiants y sus notas
            salir = entrada.nextLine();           

        }
       System.out.print(listado);//Después de salir del ciclo, se imprime el listado de estudiantes con sus notas y el promedio

    }
}
