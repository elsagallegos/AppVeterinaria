/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author fl1pc06
 */
public abstract class Animal {
protected String nombre;
protected LocalDate fechaVacuna;
protected LocalDate fechaProximaVacuna;
protected String sexo;
protected String raza;
protected double peso;
protected int edad;

    public Animal(String nombre, LocalDate fechaVacuna, LocalDate fechaPorximaVacuna, String sexo, String rara, double peso, int edad) {
        this.nombre = nombre;
        this.fechaVacuna = fechaVacuna;
        this.fechaProximaVacuna = fechaPorximaVacuna;
        this.sexo = sexo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }
public abstract LocalDate getProximaVacuna();

   public void mostraInformacionVacuna(){
       DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-NM-yyyy");
       System.out.println("nombre: "+nombre);
       System.out.println("primera vacuna: "+fechaVacuna.format(formato));
       System.out.println("proxima vacuna: "+fechaProximaVacuna.format(formato));
       System.out.println("sexo de la mascota: "+sexo);
       System.out.println("raza: "+raza);
       System.out.println("peso: "+peso);
       System.out.println("edad: "+edad);
   }

    public void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
