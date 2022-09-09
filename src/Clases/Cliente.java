/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cliente {
    public String cui;
    public String nombre;
    public String apellido;
    public Cuenta[] cuentasAsociadas;

    public Cliente(String cui, String nombre, String apellido) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
         this.cuentasAsociadas = new Cuenta[5];
    }
   
    public String getCui() {
        return cui;
    }
    public void setCui(String cui) {
        this.cui = cui;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta[] getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public void setCuentasAsociadas(Cuenta[] cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }
      public void Imprimir() {
        System.out.println("CUI: " + this.cui + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido);
    }

}
