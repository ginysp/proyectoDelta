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
import cr.ulacit.dto.IngredientsDTO;
import cr.ulacit.model.Ingredients;
/*Interfaz del Ingredients tiene como función ser un webservice con el fin de implementar el CRUD 
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: IngredientsManagerImpl
 */
@WebService
@Path("/ingredients")
public interface IngredientsManager extends  GenericManager<Ingredients,Integer> {
	//URL  localhost:8080/services/api/ingredients
	@GET
	@Path("{id_ingredient}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientsDTO> findByID(@PathParam("id_ingredient")Integer id_ingredient);
	
	@GET
	@Path("/name")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientsDTO> findByName(@QueryParam("name")String name);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientsDTO> getIngredients();
	
	@POST
	@Path("/create")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void createIngredients(@QueryParam("name")String name, @QueryParam("calories")Integer calories);
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void updateIngredients(@QueryParam("name")String name, @QueryParam("calories")Integer calories);
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteIngredients(@QueryParam("idIngredient") Integer id_ingredient);
}
