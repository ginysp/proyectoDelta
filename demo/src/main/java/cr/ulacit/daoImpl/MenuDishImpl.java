package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cr.ulacit.dao.MenuDishDao;
import cr.ulacit.model.MenuDish;

@Repository("menuDishDao")
public class MenuDishImpl extends GenericDaoHibernate<MenuDish,Integer> implements MenuDishDao{

	public MenuDishImpl() {
		super(MenuDish.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MenuDish> findByIdDish(Integer id) {
		return getSession().createCriteria(MenuDish.class).add(Restrictions.eq("menuid_menu",id)).list();
	}

}
