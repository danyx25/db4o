
package personas;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import personas.Personas;
/**
 *
 * @author danyx25
 */
public class Conexion {
    
    private ObjectContainer oc;
    
    private void open(){
        //creamos la conexion y el archivo almacenara los datos
        this.oc=Db4o.openFile("database.yap");
    }
    
    @SuppressWarnings("empty-statement")
    public boolean Insertar(Personas objeto){
    try{
        //buscamos si existe el objeto, si no insertamos el obejto recibido.
        this.open();
        oc.set(objeto);
        this.oc.close();
        return true;
    }catch(DatabaseClosedException | DatabaseReadOnlyException e){
        System.out.println("bdoo.Controlador.InsertarPersona() : "+e);
        return false;
    }
    }
    
    public Personas buscarPersona(Personas objeto){
    this.open();
    Personas encontrado =null;
    ObjectSet resultados = this.oc.get(objeto);
    
    if(resultados.hasNext()){
        encontrado=(Personas) resultados.next();
    
    }
    this.oc.close();
    return encontrado;
    }
    
    public Personas editarPersona(Personas objeto){
    this.open();
    Personas encontrado =null;
    ObjectSet resultados = this.oc.get(objeto);
    
    if(resultados.hasNext()){
        encontrado=(Personas) resultados.next();
        encontrado.setNOMBRE("Diego");
        encontrado.setAPELLIDOS("García");
        encontrado.setID(2);
    }
    this.oc.close();
    return encontrado;
    }
    
    public Personas eliminarPersona(Personas objeto){
    this.open();
    Personas encontrado =null;
    
    ObjectSet resultados = this.oc.get(objeto);
    
    if(resultados.hasNext()){
        System.out.println(resultados.next());
    }
    
    this.oc.close();
    return encontrado;
    }
    }
