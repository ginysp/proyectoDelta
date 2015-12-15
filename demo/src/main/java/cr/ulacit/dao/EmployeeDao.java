package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import cr.ulacit.model.Employee;
/*Interfaz del Employee tiene como función realizar el CRUD en la base de datos
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: EmployeeDaoImpl
 */
public interface EmployeeDao extends GenericDao<Employee,Integer>{
	public List<Employee> findByIdEmployee(Integer id);
	public List<Employee> findByName(String name);
	
	public void getEmployee(String name);
	public void createEmployee(String name, String password);
	public void updateEmployee(String name, String password);
	public void deleteEmployee(Integer id);
	
	

}
