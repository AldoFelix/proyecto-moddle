/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java. util. Date;
/**
 *
 * @author alpha
 */
public class Actividad {
    String nombre;
    Date fecha;
    boolean entregado;
    String descripcion;
    String status;

    public Actividad(String nombre, Date fecha, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.entregado=false;
        java.util.Date f= new Date();
        if(fecha.before(f)){
           this.status="No entregado";
        }else{
           this.status="Pendiente";
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getStatus() {
        return status;
    }
    
    public void ImprimirInfo(){
        System.out.println(this.getNombre());
        System.out.println(this.getFecha());
        System.out.println(this.getDescripcion());
        System.out.println(this.getStatus());
        System.out.println(this.isEntregado());
    }
       @Override
  public String toString() {
    return this.getNombre()+"  "+this.getFecha()+"   "+this.getDescripcion()   +this.getStatus();
  }
}


