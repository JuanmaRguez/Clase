
public class Test {
    
        public static void main(String[] args) {

            Agenda agenda = new Agenda(2);
            Persona persona1 = new Persona("Juanma","956987456");
            Persona persona2 = new Persona("Nazareth","956123689");
            agenda.añadir(persona1);
            agenda.añadir(persona2);
            System.out.println("Hola");
            String buscado = "Juanma";
            System.out.printf("El telefono de %s es: %s\n",buscado,agenda.getTelefono(buscado));
            String buscado1 = "Nazareth";
            System.out.printf("La posicion en el array de %s es: %s\n",buscado1,agenda.buscar(buscado1));
            int pers1 = 2;
            System.out.printf("La persona posicionada en el %d es: %s\n",pers1,agenda.getPersona(pers1));
            String personita = "Juanma";
            System.out.printf("La persona de la copia es %s es: %s con el telefono %s\n",personita,agenda.getPersona(personita).getNombre(),
                    agenda.getPersona(personita).getTelefono());
            String nom_pers = "Juanma";
            String telf_nuevo = "123456789";
            agenda.modificarTelefono(nom_pers, telf_nuevo);
            System.out.printf("El nuevo telefono de %s es: %s\n",nom_pers,agenda.getPersona(nom_pers).getTelefono());            
    }
    
}
