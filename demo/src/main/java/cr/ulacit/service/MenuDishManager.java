package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;
import cr.ulacit.model.MenuDish;

@WebService
@Path("/menuDish")
public interface MenuDishManager extends  GenericManager<MenuDish,Integer> {
	@GET
	@Path("/id/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })	
	List<MenuDish> findByIdDish(@PathParam("menuid_ingredient")Integer menu_id);
}
