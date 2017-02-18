/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201404218;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import ListaSimple.ListaSimple;

/**
 *
 * @author David Tórtola
 */
public class LeerXML {

    ListaSimple listaDiccionario = new ListaSimple();

    
    //Método que provee el file chooser para el xml y llama al analizador
    public void leerXML(){
        
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Documentos XML","xml");
        chooser.setFileFilter(filtro);
        
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            
            cargarXML(chooser.getSelectedFile().getPath());
            
        }
    }
    
    
    public void cargarXML(String ruta) {

        SAXBuilder builder = new SAXBuilder();
        File archivo = new File(ruta);
        try {

            Document documento = (Document) builder.build(archivo);
            Element raiz = documento.getRootElement();

            for (int index = 0; index < raiz.getChildren("dimension").size(); index++) {
                Element campo = raiz.getChildren("dimension").get(index);
                String dimension = campo.getTextTrim();
            }

        } catch (Exception e) {

        }

    }

}
