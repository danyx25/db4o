
package personas;

/**
 *
 * @author danyx25
 */
import personas.Conexion;
public class Main {

    public static void main(String[] args) {
        Personas p=new Personas("Daniel","Iñiguez",1);
        Conexion c=new Conexion();
        
       // boolean v=c.Insertar(p);
       //System.out.println("Se ha guardado el objeto = "+v);
       // Personas resultado=null;
       // resultado=c.buscarPersona(p);
       // System.out.println("la persona se llama : "+resultado.toString());
        
         Personas resultado=null;
         resultado=c.editarPersona(p);
         System.out.println("La persona editada es: "+resultado.toString());
        
    }
    
}
