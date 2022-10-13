package com.pajates.pccomponentes;

/**
 * Clase procesador
 */
public class Procesador {

    /**
     * Atributos, propiedades, variables
      */
    private Integer id;
    private String marca;
    private String fabricante;

    /**
     * Metodos, funciones, comportamiento
     */
    public Integer getid(){
    return id;
    }

    public void  setid(Integer id){
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
