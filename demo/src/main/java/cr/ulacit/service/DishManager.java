package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	@Path("/name/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> findByName(@QueryParam("name") String name);
	//URL: /services/api/dish/Matt


	@GET
	@Path("/getDish/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	void getDishbyID(@PathParam("id_dish") Integer id_dish);
	//URL  localhost:8080/services/api/dish/getDish/1
	
	@POST
	@Path("/newDish/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	void createDish(@QueryParam("name") String name,@QueryParam("size") String size,@QueryParam("description") String description);
	
	@POST
	@Path("/updateDish/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	void updateDish(@QueryParam("idDish") Integer dish_id,@QueryParam("name") String name,@QueryParam("size") String size,@QueryParam("description") String description);
	
	@POST
	@Path("/updateDish/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	void deleteDish(@QueryParam("idDish") Integer dish_id);
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishDTO> getDish();
	
}
