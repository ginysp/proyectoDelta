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

import cr.ulacit.dto.EmployeeDTO;
import cr.ulacit.model.Employee;
/*Interfaz del employee tiene como función ser un webservice con el fin de implementar el CRUD 
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: EmployeeManagerImpl
 */
@WebService
@Path("/employee")
public interface EmployeeManager extends GenericManager<Employee, Integer> {
	//URL  localhost:8080/services/api/employee
	@GET
	@Path("/IDemployee")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })	
	List<EmployeeDTO> findByIdEmployee(@PathParam("id_employee") Integer id);
	
	@GET
	@Path("/Name")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })	
	List<EmployeeDTO> findByName(@QueryParam("name") String name);
	
	@POST
	@Path("/createemployee/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean createemployee(@QueryParam("id_employee") Integer id,@QueryParam("name") String name,@QueryParam("password") String password);
	
	@POST
	@Path("/deleteemployee/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean deleteemployee(@QueryParam("id_employee") Integer id);
}
