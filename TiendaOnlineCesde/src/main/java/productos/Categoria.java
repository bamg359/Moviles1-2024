package productos;

import java.util.Scanner;

public class Categoria {

    Scanner sc = new Scanner(System.in);

   //1. Crear Los atributos
    private int idCategoria;
    private String nombreCategoria;


    //2. Crear el constructor

    public Categoria(){


    }

    public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    //3. Getters and Setters


    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    //4. Metodos Propios





    public void seleccionarCategoria(){
        System.out.println("Id Categoria" + idCategoria);
        System.out.println("Nombre Categoria" + nombreCategoria);
    }
}
