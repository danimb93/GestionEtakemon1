package GestionEtakemon;

import java.util.*;

/**
 * Created by Dani on  21/02/2017.
 */
public class Modelo {

    public Hashtable<Integer, Etakemon> dbe;
    public Hashtable<Integer, usuarios> dbu;
    private int idGenerado;
    private int idGeneraoUser;

    public Modelo() {

        dbe = new Hashtable<Integer, Etakemon>();
        dbu = new Hashtable<Integer, usuarios>();

        this.idGenerado = 0;
        this.idGeneraoUser = 0;
    }

    //Añadir
    public void add(Etakemon e) {
        e.setId(this.idGenerado);
        dbe.put(idGenerado, e);
        this.idGenerado++;
    }

    //Borar
    public boolean del(int id) {
        if (dbe.get(id).getId() == id) {
            dbe.remove(id);
            return true;
        } else return false;

    }

    //Mostrar
    public Enumeration<Etakemon> getLista() {
        return dbe.elements();
    }


    //buscar
    public Etakemon buscarNombre(String nombre) {
        List<Etakemon> busqueda = Collections.list(getLista()); //Creo una lista con todos los elementos de HashTable
        Etakemon encontrado = new Etakemon();
        for (int i = 0; i < dbe.size(); i++) {
            if (dbe.get(i).nombre.equals(nombre)) {
                encontrado = dbe.get(i);
                break;
            }
        }
        return encontrado;
    }
}