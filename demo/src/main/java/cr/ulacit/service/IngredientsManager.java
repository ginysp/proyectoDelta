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

import cr.ulacit.dto.IngredientsDTO;
import cr.ulacit.model.Ingredients;
@WebService
@Path("/ingredients")
public interface IngredientsManager extends  GenericManager<Ingredients,Integer> {
	@GET
	@Path("{id_ingredient}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientsDTO> findByID(@PathParam("id_ingredient")Integer id_ingredient);
	
	@GET
	@Path("{id_ingredient}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientsDTO> findByName(@QueryParam("name")String name);

}
