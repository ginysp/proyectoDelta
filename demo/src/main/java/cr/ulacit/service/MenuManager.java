package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import cr.ulacit.model.Menu;
/*Interfaz del Menu tiene como función ser un webservice con el fin de implementar el CRUD 
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: MenuManagerImpl
 */
@WebService
@Path("/menu")
public interface MenuManager extends GenericManager<Menu,Integer> {
	//URL  localhost:8080/services/api/menu
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<Menu> getMenu();
}
