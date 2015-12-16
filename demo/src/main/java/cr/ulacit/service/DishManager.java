package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import cr.ulacit.dto.DishDTO;
import cr.ulacit.model.Dish;
/*Interfaz del Dish tiene como función ser un webservice con el fin de implementar el CRUD 
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: DishManagerImpl
 */
@WebService
@Path("/dish")
public interface DishManager extends GenericManager<Dish,Integer> {
	//URL  localhost:8080/services/api/dish
	@GET
	@Path("{id_dish}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> findByID(@PathParam("id_dish") Integer id_dish);
	//URL /services/api/dish/1

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> getDish();
	
	@POST
	@Path("/create")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void createDish( @QueryParam("name")String name, @QueryParam("size")String size, @QueryParam("description")String description);
	
	@POST
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void updateDish(@QueryParam("id_dish") Integer id, @QueryParam("name")String name, @QueryParam("size")String size, @QueryParam("description")String description);
	
	@POST
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteDish(@QueryParam("id_dish") Integer id_dish);
	
	
	
}
