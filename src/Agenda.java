
public class Agenda {

    Persona[] contactos;
    int siguiente;
    private Persona Persona;

    public Agenda(int tamano) {
        contactos = new Persona[tamano];
        
    }

    public boolean añadir(Persona contact) {
        if (siguiente >= contactos.length) {
            return false;
        }
        contactos[siguiente++] = contact;
        return true;
    }

    public String getTelefono(String busca_nom) {
        for (int i = 0; i < siguiente; i++) {
            Persona contact = contactos[i];
            String nombre = contact.getNombre();
            if (nombre.equals(busca_nom)) {
                return contact.getTelefono();
            }
        }
        return null;
    }

    public int buscar(String buscador) {
        for (int i = 0; i < siguiente; i++) {
            Persona contact = contactos[i];
            String nombre = contact.getNombre();
            if (nombre.equals(buscador)) {
                return i;
            }
        }
        return -1;
    }

    public String getPersona(int pos1) {
        for (int i = 0; i < siguiente; i++) {
            Persona contact = contactos[i];
            if (i != pos1) {
            } else {
                return contact.getNombre();
            }
        }
        return null;
    }

    public Persona getPersona(String personita) {
        for (int i = 0; i < siguiente; i++) {
            Persona contact = contactos[i];
            String nombre = contact.getNombre();
            if (nombre.equals(personita)) {
                Persona personita1 = new Persona(contact.getNombre(), contact.getTelefono());
                return personita1;
            }
        }
        return null;
    }

    public void modificarTelefono(String nom_pers, String telf_nuevo) {
          int num_agen = buscar(nom_pers);  
          if (num_agen== -1){
              System.out.println("No existe contacto");}
          else{
              contactos[num_agen].setTelefono(telf_nuevo);}     
    }
}
