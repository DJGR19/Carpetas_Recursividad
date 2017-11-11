/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dulce
 */
public class Buscar_Carpeta {
//HACER UN REPORTE CON RECURSIVIDAD DONDE SE MUESTRE DADO EL NOMBRE DE UNA CARPETA DETERMINAR LA CANTIDAD DE LOS ELEMENTOS CONTENIDOS
Scanner x= new Scanner(System.in);
String folder;
String archivos;
    ArrayList<String> d = new ArrayList();
    ArrayList<String> a = new ArrayList();
 private ArrayList<ArrayList<Carpeta>> folder2;
 

    
    public  void Crear(){
                System.out.println("Ingrese el nombre de su carpeta que desea crear: ");
                folder= x.nextLine();
    d.add(folder);
  
      
           
       }
       public void CrearA(){
           System.out.println("Ingrese el nombre del archivo que desea crear");
        archivos= x.nextLine();
       a.add(archivos);
       
   }
       public void Buscador1(){
       for(int folder=0; folder<d.size();folder++){
           System.out.println("Carpetas "+ d.get(folder));
        
       }
       }
       public void Buscador2(){
      
       for(int archivos=0; archivos<d.size();archivos++){
           System.out.println("Archivos "+ a.get(archivos));    
       }
       }
}  

