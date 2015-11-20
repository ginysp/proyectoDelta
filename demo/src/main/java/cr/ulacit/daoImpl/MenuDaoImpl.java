package cr.ulacit.daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import cr.ulacit.dao.MenuDao;
import cr.ulacit.model.Menu;
@Repository("menuDao")
public class MenuDaoImpl extends GenericDaoHibernate<Menu,Integer> implements MenuDao{

	public MenuDaoImpl() {
		super(Menu.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Menu> findByIdMenu(Integer id) {
		return getSession().createCriteria(Menu.class).add(Restrictions.eq("id_menu",id)).list();
	}

}
