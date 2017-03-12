package GestionEtakemon;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Modelo miModelo = new Modelo();
        Scanner datos= new Scanner(System.in);

        int menu=78;

        while (menu!=0){
            System.out.println("1- Añadir Etakemon");
            System.out.println("2- Borrar Etakemon");
            System.out.println("3- Listar Etakemon");
            System.out.println("4- Buscar Etakemon por nombre");
            System.out.println("Elige la opción:");
            menu = Integer.parseInt(datos.nextLine());

            switch (menu){

                case 1:
                    Etakemon add = new Etakemon();
                    System.out.println("Añadir nombre Etakemon");
                    add.nombre= datos.nextLine();
                    System.out.println("Añadir nivel Etakemon");
                    add.nivel= Integer.parseInt(datos.nextLine());
                    miModelo.add(add);
                    break;
                case 2:
                    System.out.println("Selecionar id del Etakemon a borrar");
                    int delId= Integer.parseInt(datos.nextLine());
                    boolean eliminado = miModelo.del(delId);

                    if(eliminado){
                        System.out.println("Etakemon eliminado");
                    }
                    else{
                        System.out.println("No se ha eliminado el Etakemon");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Eetakemon");
                    List<Etakemon> mostrar = Collections.list(miModelo.getLista());
                    for (int i=0;i<mostrar.size();i++){
                        System.out.println("Nombre: " +mostrar.get(i).nombre+ " | Nivel: "
                                +mostrar.get(i).nivel+ " | Identificador: " +mostrar.get(i).getId());
                    }
                    break;
                case 4:
                    System.out.println("Escribe el nombre del Etakemon que quieres buscar");
                    String name= datos.nextLine();
                    Etakemon encontrado = miModelo.buscarNombre(name);
                    System.out.println("Resultado: " +encontrado.nombre);
                    System.out.println("Resultado: " +miModelo.buscarNombre(name).nombre);
                    break;
                case 0:
                    System.out.println("Ha salido de la aplicación. ");

                    break;
            }
        }
    }
}
