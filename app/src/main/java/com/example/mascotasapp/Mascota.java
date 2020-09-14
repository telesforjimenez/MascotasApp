package com.example.mascotasapp;

public class Mascota {
    private int foto;
    private String nombre;
    private String raiting;

    public Mascota(int foto, String nombre, String raiting){
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }
}
