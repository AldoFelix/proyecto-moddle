
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpha
 */
public class Curso {
    String materia;
    ArrayList tira;

    public Curso(String materia) {
        this.materia=materia;
        tira=new ArrayList();
    }
    
    public void AgregarActividad(Actividad n){
        this.tira.add(n);
    }

    public String getMateria() {
        return materia;
    }

    public ArrayList getTira() {
        return tira;
    }
    
    @Override
  public String toString() {
    return this.getMateria();
  }
}

