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
import static edd.practica1_201404218.EDDPractica1_201404218.listaPosiciones;
import static edd.practica1_201404218.EDDPractica1_201404218.listaPalabras;

/**
 *
 * @author David Tórtola
 */
public class LeerXML {

    ListaSimple listaDiccionario = new ListaSimple();

    //Método que provee el file chooser para el xml y llama al analizador
    public void leerXML() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Documentos XML", "xml");
        chooser.setFileFilter(filtro);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            cargarXML(chooser.getSelectedFile().getPath());

        }
    }

    //Analiza y obtiene la información desde el XML
    public void cargarXML(String ruta) {

        SAXBuilder builder = new SAXBuilder();
        File archivo = new File(ruta);
        try {

            Document documento = (Document) builder.build(archivo);
            Element raiz = documento.getRootElement();

            for (int index = 0; index < raiz.getChildren("dimension").size(); index++) {
                Element campo = raiz.getChildren("dimension").get(index);
                String dimension = campo.getTextTrim();
                System.out.println(dimension);
            }

            for (int index = 0; index < raiz.getChildren("dobles").size(); index++) {
                Element doble = (Element) raiz.getChildren("dobles").get(index);

                for (int index2 = 0; index2 < doble.getChildren().size(); index2++) {
                    Element casilla = (Element) doble.getChildren("casilla").get(index2);

                    Posicion pos = new Posicion();
                    pos.setTipo("doble");
                    pos.setX(Integer.parseInt(casilla.getChildren("x").get(0).getTextTrim()));
                    pos.setY(Integer.parseInt(casilla.getChildren("y").get(0).getTextTrim()));

                    listaPosiciones.add(pos);

                }
            }

            for (int index = 0; index < raiz.getChildren("triples").size(); index++) {
                Element triple = (Element) raiz.getChildren("triples").get(index);

                for (int index2 = 0; index2 < triple.getChildren().size(); index2++) {
                    Element casilla = (Element) triple.getChildren("casilla").get(index2);

                    Posicion pos = new Posicion();
                    pos.setTipo("triple");
                    pos.setX(Integer.parseInt(casilla.getChildren("x").get(0).getTextTrim()));
                    pos.setY(Integer.parseInt(casilla.getChildren("y").get(0).getTextTrim()));

                    listaPosiciones.add(pos);

                }
            }

            for (int index = 0; index < raiz.getChildren("diccionario").size(); index++) {
                Element diccionario = (Element) raiz.getChildren("diccionario").get(index);

                for (int index2 = 0; index2 < diccionario.getChildren().size(); index2++) {
                    Element palabra = (Element) diccionario.getChildren("palabra").get(index2);

                    String valor = palabra.getTextTrim();
                    listaPalabras.add(valor);
                }
           }

            

        } catch (Exception e) {

        }

    }

}
