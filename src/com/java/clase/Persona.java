package com.java.clase;

import javax.swing.*;
public class Persona {
    String nombre, mensaje;
    float peso,imc;
    int altura;


    public Persona() {
    }

    public Persona(String nombre, String mensaje, float peso, int altura) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.peso = peso;
        this.altura = altura;
        imc=peso/(altura*altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = "Su imc es de : ";
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        if (imc< 30) {
            return "Hola " + getNombre() + "su imc es de : " + peso / (altura * altura) + " estas en el promedio";
        } else {
            return "Hola " + getNombre() + "su imc es de : " + peso / (altura * altura) + " Y TIENES SOBREPESO";

        }
    }
        }




