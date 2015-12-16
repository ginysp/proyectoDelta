package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;
import cr.ulacit.dao.EmployeeDao;
import cr.ulacit.dto.EmployeeDTO;
import cr.ulacit.mapper.EmployeeMapper;
import cr.ulacit.model.Employee;
import cr.ulacit.service.EmployeeManager;
/*Implementación de la interfaz del EmployeeManager
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Transactional
@Service("employeeManager")
@WebService(serviceName="EmployeeService",endpointInterface ="cr.ulacit.service.EmployeeManager")
public class EmployeeManagerImpl extends GenericManagerImpl<Employee,Integer> implements EmployeeManager{
	EmployeeDao EmployeeDao;
	public EmployeeManagerImpl(){
	}
	public EmployeeManagerImpl(EmployeeDao employeeDao){
		super(employeeDao);
		this.EmployeeDao=employeeDao;
	}
	/*Este método tiene como función encontrar un empleado mediante su identificador único
	 *@Param: Integer id, identifcador del empleado
	 *@Return: List<EmployeeDTO>
	 */
	@Override
	public List<EmployeeDTO> findByIdEmployee(Integer id) {
		List<EmployeeDTO> employeeDTOs=null;
		List<Employee> employeeList= EmployeeDao.findByIdEmployee(id);
		employeeDTOs=EmployeeMapper.INSTANCE.employeeToEmpDTO(employeeList);
		return employeeDTOs;
	}
	/*Este método tiene como función encontrar un empleado mediante su nombre
	 *@Param: String name, nombre del empleado
	 *@Return: List<EmployeeDTO>
	 */
	@Override
	public List<EmployeeDTO> findByName(String name) {
		List<EmployeeDTO> employeeDTOs=null;
		List<Employee> employeeList= EmployeeDao.findByName(name);
		employeeDTOs=EmployeeMapper.INSTANCE.employeeToEmpDTO(employeeList);
		return employeeDTOs;
	}
	@Override
	public List<EmployeeDTO> getEmployee() {
		List<EmployeeDTO> empDTOs=null;
		List<Employee> empList= EmployeeDao.getAll();
		empDTOs=EmployeeMapper.INSTANCE.employeeToEmpDTO(empList);
		return empDTOs;
	}
	@Override
	public void createEmployee(String name, String password) {
		EmployeeDao.createEmployee(name, password);
		
	}
	@Override
	public void updateEmployee(Integer id, String name, String password) {
		EmployeeDao.updateEmployee(name, password);
	}
	@Override
	public void deleteEmployee(Integer id) {
		EmployeeDao.deleteEmployee(id);
	}
	
	
}
