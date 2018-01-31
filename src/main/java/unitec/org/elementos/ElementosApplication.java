package unitec.org.elementos;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner{
    
    //Inyeccion de dependencias
    @Autowired RepositorioMensajitos repoMensa;
    

	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        //primer insert
        //Mensajitos m=new Mensajitos("Tercero","Pepito pestañas");
        //repoMensa.save(m);
        
        //Probamos el de buscar todos
        /*
        ArrayList<Mensajitos> mensajitos=(ArrayList<Mensajitos>)repoMensa.findAll();
        for(Mensajitos m: mensajitos){
            System.out.println(m.getTitulo());
        }
        */
        //Buscar por ID
        //Mensajitos men=repoMensa.findOne(1);
        //System.out.println(men.getTitulo());
        
        //Update 
        //repoMensa.save(new Mensajitos(1,"hola","mundo"));
        
        //borrar
        repoMensa.delete(4);
    }
}
