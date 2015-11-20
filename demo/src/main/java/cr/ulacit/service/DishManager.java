package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import cr.ulacit.dto.DishDTO;
import cr.ulacit.model.Dish;

@WebService
@Path("/dish")
public interface DishManager extends GenericManager<Dish,Integer> {
	
	@GET
	@Path("{id_dish}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> findByID(@PathParam("id_dish") Integer id_dish);
	//URL /services/api/dish/1
	
	@GET
	@Path("/name/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> findByName(@QueryParam("name") String name);
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> getDish();
}
