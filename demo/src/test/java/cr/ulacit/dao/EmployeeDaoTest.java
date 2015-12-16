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
	 public void testGetEmployee() throws Exception{
		 System.out.println("testing get Employee...");
		 empDao.getEmployee("gsalazar");
	 }
	 @Test
	 public void testUpdateEmployee() throws Exception{
		 System.out.println("testing update Employee...");
		 empDao.updateEmployee("lsotomayor", "lsotomayorc");
	 }
	 @Test
	 public void testCreateEmployee() throws Exception{
		 System.out.println("testing create Employee...");
		 empDao.createEmployee("jlopez", "jlopez");
	 }
	 @Test
	 public void testDeleteEmployee() throws Exception{
		 System.out.println("testing delete Employee...");
		 empDao.deleteEmployee(1);
	 }
	
}
