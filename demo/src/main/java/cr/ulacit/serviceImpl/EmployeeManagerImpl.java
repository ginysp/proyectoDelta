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
	
	@Override
	public List<EmployeeDTO> findByIdEmployee(Integer id) {
		List<EmployeeDTO> employeeDTOs=null;
		List<Employee> employeeList= EmployeeDao.findByIdEmployee(id);
		employeeDTOs=EmployeeMapper.INSTANCE.employeeToEmpDTO(employeeList);
		return employeeDTOs;
	}

	@Override
	public List<EmployeeDTO> findByName(String name) {
		List<EmployeeDTO> employeeDTOs=null;
		List<Employee> employeeList= EmployeeDao.findByName(name);
		employeeDTOs=EmployeeMapper.INSTANCE.employeeToEmpDTO(employeeList);
		return employeeDTOs;
	}
	
	@Override
	public boolean createemployee(Integer idEmployee, String name, String password){
		return false;
	}
	
	@Override
	public boolean deleteemployee(Integer idEmployee){
		return false;
	}
}
