
package carpeta;
import java.util.Scanner;

public class Carpeta {
    Scanner x = new Scanner(System.in);
 private String nombre;
 private double tamanio;
 
 /*private ArrayList<Carpeta> carpeta;
 private ArrayList<String> archivos;
/*
 
 */

    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
      Buscar_Carpeta dd= new Buscar_Carpeta();
      int num;
      
        System.out.println("-----------------MENU------------------------");
        System.out.println("Seleccione una de las opciones: \n 1.Buscar Carpeta \n 2.Ingresar/Crear Carpetas(PARA ELLO PRIMERO SE TIENE QUE BUSCAR LA CARPETA PARA LUEGO CREAR UNA "
                + "\n 3. Ingresar/Crear Archivos");
        
        int opciones= x.nextInt();
        while(opciones!=4){
        switch(opciones){
            case 1:
                System.out.println("Qué desea encontrar: 1. Archivos \n 2. Carpetas");
                num=x.nextInt();
                if(num==1){
                    dd.Buscador1();   
                }
                   if(num==2){
                       dd.Buscador2();
                   }
                   if (num!=1 && num!=2){
                      break; 
                   }
                
                
            case 2: 
            dd.Crear();
            break;
            case 3:
             dd.CrearA();
            case 4:
          
                
                
                System.exit(0);
             
        }
        
        
        
    }

    
    }
    
  
}
