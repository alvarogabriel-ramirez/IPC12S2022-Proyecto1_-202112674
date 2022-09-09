/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cuenta {
    
    public int idCuenta;
    public String dpiCliente;
    public double saldo;

    public Cuenta(int idCuenta, String dpiCliente, double saldo) {
        this.idCuenta = idCuenta;
        this.dpiCliente = dpiCliente;
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(String dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   

  public void ImprimirCuenta() {
        System.out.println("ID: " + idCuenta + ", DPI CLIENTE: " + dpiCliente + ", SALDO: " + saldo);
    }
    
    
}
