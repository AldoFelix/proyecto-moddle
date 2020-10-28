
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
public class ListaCursos {
    String Nombre;
    ArrayList lista;

    public ListaCursos(String Nombre) {
        this.Nombre = Nombre;
        lista= new ArrayList();
    }
    
    public void AgregarCurso(Curso c){
        lista.add(c);
    }
    
}
