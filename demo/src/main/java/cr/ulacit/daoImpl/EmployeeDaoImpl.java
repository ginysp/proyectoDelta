package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import cr.ulacit.dao.EmployeeDao;
import cr.ulacit.model.Employee;
/*Implementación de la interfaz del EmployeeDao
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Repository("employeeDao")
public class EmployeeDaoImpl extends GenericDaoHibernate<Employee,Integer> implements EmployeeDao {

	public EmployeeDaoImpl() {
		super(Employee.class);
	}
	/*@Param: Integer id
	 *@Return: List<Employee>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByIdEmployee(Integer id) {
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("id_employee",id)).list();
	}
	/*@Param: String name
	 *@Return: List<Employee>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByName(String name) {
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("name",name)).list();
	}
	@Override
	public void getEmployee(String name) {
		Employee emp =new Employee();
		if(emp.getName()!= name){
			//System.out.println();
		}
		System.out.println("Employee Info:" +emp.getName()+emp.getPassword());
		
	}
	@Override
	public void createEmployee(String name, String password) {
		Employee emp =new Employee();
		Integer id=0;
		id=emp.getId_employee()+1;
		if(id!=emp.getId_employee()){
			emp.setId_employee(id);
			emp.setName(name);
			emp.setPassword(password);
			this.save(emp);
			System.out.println("New Employee"+emp.getId_employee()+emp.getName()+emp.getPassword());
		}
		
		
	}
	@Override
	public void updateEmployee(String name, String password) {
		Employee emp =new Employee();
		if(emp.getName()!=name){
			
		}
		emp.setName(name);
		emp.setPassword(password);
		this.save(emp);
		System.out.println("Employee Update:"+emp.getName()+", pass"+emp.getPassword());
		
	}
	@Override
	public void deleteEmployee(Integer id) {
		Employee emp =new Employee();
		if(emp.getId_employee()!=id){
			
		}
		this.remove(id);
	}
	



}
