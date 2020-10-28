
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date date =sdf2.parse("12/06/2021");
        Actividad n1=new Actividad("tarea", date,"Hacer los ejercicios de la pagina 20");
        n1.ImprimirInfo();
        date =sdf2.parse("10/11/2020");
        Actividad n2=new Actividad("proyecto", date,"Hacer el proyecto de calidad");
        n2.ImprimirInfo();
        date =sdf2.parse("10/11/2000");
        Actividad n3=new Actividad("proyecto", date,"Hacer el proyecto de calidad");
        n3.ImprimirInfo();
        
        Curso c1=new Curso("aseguramiento de la calidad de software");
        
        c1.AgregarActividad(n1);
       
        c1.AgregarActividad(n2);
        Visualizacion v =new Visualizacion();
        v.setVisible(true);
   
    }
    
}
