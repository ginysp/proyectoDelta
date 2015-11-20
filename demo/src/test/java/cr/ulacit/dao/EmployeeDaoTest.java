package cr.ulacit.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cr.ulacit.model.Employee;

public class EmployeeDaoTest extends BaseDaoTestCase {
	 @Autowired
	 private EmployeeDao empDao;
	 
	 @Test
	 public void testFindById() throws Exception{
		 log.debug("testing find employee by id...");
		 List<Employee> empList= empDao.findByIdEmployee(2);
		 assertNotNull(empList.size());
	 }
	 @Test
	 public void testFindByName() throws Exception{
		 log.debug("testing find employee by name...");
		 List<Employee> empList= empDao.findByName("Juan");
		 assertNotNull(empList.size());
	 }
	 @Test
	 public void testFindByLastName() throws Exception{
		 log.debug("testing find employee by lastname...");
		 List<Employee> empList= empDao.findByLastName("Montoya Rocha");
		 assertNotNull(empList.size());
	 }
}
