package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import cr.ulacit.dao.EmployeeDao;
import cr.ulacit.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends GenericDaoHibernate<Employee,Integer> implements EmployeeDao {

	public EmployeeDaoImpl() {
		super(Employee.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByIdEmployee(Integer id) {
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("id_employee",id)).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByName(String name) {
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("name",name)).list();
	}
}
