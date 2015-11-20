package cr.ulacit.mapper;

import cr.ulacit.dto.DishDTO;
import cr.ulacit.model.Dish;
import cr.ulacit.model.DishIngredients;
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
public class DishMapperImpl implements DishMapper {

    @Override
    public List<DishDTO> dishsToDishsDTOS(List<Dish> dishs) {
        if ( dishs == null ) {
            return null;
        }

        List<DishDTO> list = new ArrayList<DishDTO>();
        for ( Dish dish : dishs ) {
            list.add( dishToDishDTO( dish ) );
        }

        return list;
    }

    @Override
    public DishDTO dishToDishDTO(Dish dish) {
        if ( dish == null ) {
            return null;
        }

        DishDTO dishDTO_ = new DishDTO();

        dishDTO_.setDishIngredients( dishIngredientsSetToDishIngredientsArray( dish.getDishIngredients() ) );
        dishDTO_.setId_dish( dish.getId_dish() );
        dishDTO_.setMenuDish( menuDishSetToMenuDishArray( dish.getMenuDish() ) );
        dishDTO_.setSize( dish.getSize() );
        dishDTO_.setName( dish.getName() );
        dishDTO_.setCount( dish.getCount() );
        dishDTO_.setDescription( dish.getDescription() );
        dishDTO_.setTotalcalories( dish.getTotalcalories() );

        return dishDTO_;
    }

    protected DishIngredients[] dishIngredientsSetToDishIngredientsArray(Set<DishIngredients> set) {
        if ( set == null ) {
            return null;
        }

        DishIngredients[] dishIngredientsTmp = new DishIngredients[set.size()];
        int i = 0;
        for ( DishIngredients dishIngredients : set ) {
            dishIngredientsTmp[i] = dishIngredients;
            i++;
        }

        return dishIngredientsTmp;
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
