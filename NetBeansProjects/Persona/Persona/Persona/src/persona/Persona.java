
package persona;

/**
 * Esta clase se centra en determinar los metodos necesarios para obtener los datos personales de una persona
 * así como sabes cúal es su año de nacimiento y mostrar toda esta información por pantalla
 * @author Lesya
 * @version V 1.0 (13-01-2019)
 * @see <a href = "http://www.iescamp.es">- IES Camp de Morvedre - Entornos de desarrollo </a>
 */
public class Persona {

    /**
     * ATRIBUTOS: Nombre, apellido y dni de la persona
     */
    private String nombre, apellidos, dni;
    /**
     * ATRIBUTO: Edad de la persona
     */
    private int edad;
    
    
    /**
    * Constructor de la clase Persona
    * @param nombre
    * @param apellidos
    * @param dni
    * @param edad 
    */
    public Persona (String nombre, String apellidos, String dni, int edad){
       this.nombre = nombre;
       this.apellidos=apellidos;
       this.dni=dni;
       this.edad=edad;
   }
    /**
    * Constructor vacio de la clase Persona
    */
   public Persona (){

   }
    
    /**
     * Método de la clase Persona que dándonos el año actual y sabiendo la edad de la persona, el método nos devuelve el año de nacimiento
     * @param anyoActual
     * @return nos devuelve el año de nacimiento de la persona
     */
    public int dameAnyoNacimiento(int anyoActual) {
        int anyoNac;
        anyoNac = anyoActual - this.edad;
        return anyoNac;
    }
     /**
     * El método muestra la frase que contiene la infromación personal y el año de nacimiento
     * @param anyoNac 
     */
    public void mostrar (int anyoNac){
        System.out.println("La persona " +this.apellidos+ ", " +this.nombre+ " con dni " +this.dni+ " ha nacido en el año "+anyoNac);
    }   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellido to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
   
}
