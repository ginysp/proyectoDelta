package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import cr.ulacit.model.MenuDish;
/*Interfaz del MenuDish tiene como función ser un webservice con el fin de implementar el CRUD 
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: MenuDishManagerImpl
 */
@WebService
@Path("/menuDish")
public interface MenuDishManager extends  GenericManager<MenuDish,Integer> {
	//URL  localhost:8080/services/api/menuDish
	@GET
	@Path("{id_menudish}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<MenuDish> getMenuDish();
	
}
