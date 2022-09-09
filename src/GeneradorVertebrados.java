public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("gallo", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("perro", "Mamifero");
        miVertebrados[2] = new Vertebrado("gato", "Pez"); 
        
        return miVertebrados;
    }
}
