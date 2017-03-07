package GestionEtakemon;

/**
 * Created by Dani on 06/03/2017.
 */
public class usuarios {
    private int id;
    public String nombre;
    public String pass;
    public String correo;

    public usuarios(String nombre, String pass, String correo){
        this.nombre=nombre;
        this.pass=pass;
        this.correo=correo;
            }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
