package cr.ulacit.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import cr.ulacit.model.Employee;

public interface EmployeeDao extends GenericDao<Employee,Integer>{
	public List<Employee> findByIdEmployee(Integer id);
	public List<Employee> findByName(String name);
	public List<Employee> findByLastName(String lastname);

}
