package cr.ulacit.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import cr.ulacit.dto.EmployeeDTO;
import cr.ulacit.model.Employee;

@Mapper
public interface EmployeeMapper {
	EmployeeMapper INSTANCE=Mappers.getMapper(EmployeeMapper.class);
	List<EmployeeDTO> employeeToEmpDTO(List<Employee> employees);
	@Mappings({
		@Mapping(source="id_employee",target="id_employee"),
		@Mapping(source="name",target="name"),
		@Mapping(source="password",target="password"),
		@Mapping(source="menu",target="menu")
	})
	EmployeeDTO employeeToEmpDTO(Employee employee);
}
