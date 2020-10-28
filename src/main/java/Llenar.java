
import javax.swing.JComboBox;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpha
 */
public class Llenar {
    public static void llenarCurso(JComboBox b, ListaCursos c){
        b.removeAllItems();
        
        for(int i=0; i < c.lista.size(); i++){
            
            b.addItem(c.lista.get(i));            
        }
    }
    
        public static void llenarActividades(JList l, Curso c){
        
        for(int i=0; i < c.tira.size(); i++){
            //l.(c.tira.get(i));            
            }
        }    
        
    
}
    

