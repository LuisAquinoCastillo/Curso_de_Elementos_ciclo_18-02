/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org.elementos;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Luis Abraham Aquino
 */
@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
       /*gregacion de layout vertical y dentro
        *de las componentes que quedaran en orden decendente
        */
       VerticalLayout layout=new VerticalLayout();
       Label e1=new Label("Luis Abraham Aquino Castillo");
       e1.addStyleName(ValoTheme.LABEL_H1);
       
       Button b1=new Button("Guardar");
       b1.addStyleName(ValoTheme.BUTTON_FRIENDLY);
       
       //Se programa el evento del boton de b1 utilizando programacion funcional
       b1.addClickListener(algo->{
           e1.setValue("Mi primera programacion funcional");
       });
       //Agregamos las componentes al layout
       layout.addComponent(e1);
       layout.addComponent(b1);
       
       /* Esto solo se realiza una vez
        * Agregar un layout a la pagina index
       */
        setContent(layout);
    }
    
    
}
