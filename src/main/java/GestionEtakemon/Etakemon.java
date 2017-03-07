package GestionEtakemon;

/**
 * Created by Dani on 21/02/2017.
 */
public class Etakemon {

    public String nombre;
    private int id;
    public int nivel;

    public Etakemon(){}

    public Etakemon(String nombre, int nivel)
    {
        this.nombre=nombre;
        this.nivel=nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
