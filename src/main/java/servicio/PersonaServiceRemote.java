    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import domain.Persona;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Felipe Barrera
 */
@Remote
public interface PersonaServiceRemote {
    public List<Persona> listarPersonas();
    public Persona econtrarPersonaPorId(Persona persona);
    public Persona encontrarPersonaPorEmail(Persona persona);
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);  
    public void eliminarPersona(Persona persona);
}
