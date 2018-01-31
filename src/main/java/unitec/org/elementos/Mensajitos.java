/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org.elementos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 *
 * @author Luis Abraham Aquino
 */
// La etidades las mapearemos con JPA
@Entity
public class Mensajitos {
    @Id
    /*
    Solamente se usa cuando uso nombres de variable que no sean iguales 
    a las tablas de la base de datos
    @Column(name="id")
    */
    @GeneratedValue //se utiliza para cuando se incrementa un id automaticmente
    private Integer id;
    private String titulo;
    private String cuerpo;
    
    public Mensajitos(){
    }

    public Mensajitos(Integer id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajitos(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajitos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
