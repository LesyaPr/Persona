
package persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Este clase se centra en mostrar y determinar el año de nacimiento de una persona 
 * a partir de su edad y el año actual y muestra todos los datos de la persona por pantalla
 * @author Lesya
 * @version V 1.0 (13-01-2019)
 * @see <a href = "http://www.iescamp.es">- IES Camp de Morvedre - Entornos de desarrollo </a>
 */
public class Quincena6 {
    
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        /**
         * Instancia la variable entrada como un objeto de la clase BufferedReader
         */
        BufferedReader entrada;
        entrada=new BufferedReader(new InputStreamReader(System.in));
        
        /**
         * Crea variables para determinar año de nacimiento y el actual
         */
        int anyoActual, anyoNac1, anyoNac2, anyoNac3;
        
        /**
         * Se crea un objeto de la clase Persona (persona1) con los parametros indicados
         * @param nombre, apellido, dni, edad
         */
        Persona persona1;
        persona1 = new Persona("Pepa", "García Navarro", "44879652L", 21);
        
        /**
         * Se crea un objeto de la clase Persona (persona2) con constructor vacio añadiéndole los parametros posteriormente
         */
        Persona persona2;
        persona2 = new Persona();
        persona2.setNombre("Lunilda María");
        persona2.setApellidos("Pérez Giménez");
        persona2.setDni("21979552W"); 
        persona2.setEdad(41); 
        
        /**
         * Se instancia al objeto trabajador1 con los valores correctos mediante los metodos setters
         */
        Trabajador trabajador1 =new Trabajador();
        trabajador1.setNombre("Pepito");
        trabajador1.setApellidos("Romerales");
        trabajador1.setDni("12345243F");
        trabajador1.setEdad(25);
        trabajador1.setSegSocial("123455fder");
        
        
      
        
         /**
         * Pedir al usuario el año actual
         */
        System.out.print("Introduce el año actual: ");
        anyoActual = Integer.parseInt(entrada.readLine());
        
        /**
         * Cancular el año de nacimiento de cada persona a partir del año actual
         */
        anyoNac1 = persona1.dameAnyoNacimiento(anyoActual);
        persona1.mostrar(anyoNac1);
        
        anyoNac2 = persona2.dameAnyoNacimiento(anyoActual);
        persona2.mostrar(anyoNac2);
        
        anyoNac3 = trabajador1.dameAnyoNacimiento(anyoActual);
        trabajador1.mostrar(anyoNac3);
        
    }
}
