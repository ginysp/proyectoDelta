package cr.ulacit.mapper;

import cr.ulacit.dto.EmployeeDTO;
import cr.ulacit.model.Employee;
import cr.ulacit.model.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-11-19T22:17:10-0600",
    comments = "version: 1.0.0.CR1, compiler: javac, environment: Java 1.8.0_05 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public List<EmployeeDTO> employeeToEmpDTO(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
        for ( Employee employee : employees ) {
            list.add( employeeToEmpDTO( employee ) );
        }

        return list;
    }

    @Override
    public EmployeeDTO employeeToEmpDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO_ = new EmployeeDTO();

        employeeDTO_.setPassword( employee.getPassword() );
        employeeDTO_.setId_employee( employee.getId_employee() );
        employeeDTO_.setName( employee.getName() );
        employeeDTO_.setMenu( menuSetToMenuArray( employee.getMenu() ) );
        employeeDTO_.setLastname( employee.getLastname() );
        employeeDTO_.setUsername( employee.getUsername() );

        return employeeDTO_;
    }

    protected Menu[] menuSetToMenuArray(Set<Menu> set) {
        if ( set == null ) {
            return null;
        }

        Menu[] menuTmp = new Menu[set.size()];
        int i = 0;
        for ( Menu menu : set ) {
            menuTmp[i] = menu;
            i++;
        }

        return menuTmp;
    }

}
