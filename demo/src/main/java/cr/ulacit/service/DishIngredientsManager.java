package cr.ulacit.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import cr.ulacit.model.DishIngredients;
/*Interfaz del DishIngredients tiene como función ser un webservice con el fin de implementar el CRUD 
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: DishIngredientsImpl
 */
@WebService
@Path("/dishIngredients")
public interface DishIngredientsManager extends GenericManager<DishIngredients,Integer> {
	//URL  localhost:8080/services/api/dishIngredients

	@GET
	@Path("{id_dishingredients}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })	
	public void getDishIngredients(@PathParam("id_dishingredients")Integer id_dishingredients); 
		
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishIngredients> getDishIngredients();

}
