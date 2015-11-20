package cr.ulacit.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mappings;
import cr.ulacit.dto.MenuDTO;
import cr.ulacit.model.Menu;

@Mapper
public interface MenuMapper {
	MenuMapper INSTANCE =Mappers.getMapper(MenuMapper.class);
	List<MenuDTO> MenusDTOs(List<Menu>menus);
	@Mappings({
		@Mapping(source="id_menu",target="id_menu"),
		@Mapping(source="menuDish",target="menuDish")
	})
	MenuDTO menutoDTO(Menu menu);
}
