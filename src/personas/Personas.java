
package personas;

/**
 *
 * @author danyx25
 */
public class Personas {
    
    private String NOMBRE, APELLIDOS;
    private int ID;

    public Personas(String NOMBRE, String APELLIDOS, int ID) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.ID = ID;
    }

    Personas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Personas{" + "NOMBRE=" + NOMBRE + ", APELLIDOS=" + APELLIDOS + ", ID=" + ID + '}';
    }
    
    
    
}
