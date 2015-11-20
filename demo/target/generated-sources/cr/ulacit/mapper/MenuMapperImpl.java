package cr.ulacit.mapper;

import cr.ulacit.dto.MenuDTO;
import cr.ulacit.model.Menu;
import cr.ulacit.model.MenuDish;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-11-19T22:17:10-0600",
    comments = "version: 1.0.0.CR1, compiler: javac, environment: Java 1.8.0_05 (Oracle Corporation)"
)
public class MenuMapperImpl implements MenuMapper {

    @Override
    public List<MenuDTO> MenusDTOs(List<Menu> menus) {
        if ( menus == null ) {
            return null;
        }

        List<MenuDTO> list = new ArrayList<MenuDTO>();
        for ( Menu menu : menus ) {
            list.add( menutoDTO( menu ) );
        }

        return list;
    }

    @Override
    public MenuDTO menutoDTO(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuDTO menuDTO_ = new MenuDTO();

        menuDTO_.setMenuDish( menuDishSetToMenuDishArray( menu.getMenuDish() ) );
        menuDTO_.setId_menu( menu.getId_menu() );

        return menuDTO_;
    }

    protected MenuDish[] menuDishSetToMenuDishArray(Set<MenuDish> set) {
        if ( set == null ) {
            return null;
        }

        MenuDish[] menuDishTmp = new MenuDish[set.size()];
        int i = 0;
        for ( MenuDish menuDish : set ) {
            menuDishTmp[i] = menuDish;
            i++;
        }

        return menuDishTmp;
    }

}
