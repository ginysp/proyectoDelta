package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.DishDao;
import cr.ulacit.dto.DishDTO;
import cr.ulacit.mapper.DishMapper;
import cr.ulacit.model.Dish;
import cr.ulacit.service.DishManager;

@Transactional
@Service("dishManager")
@WebService(serviceName="DishService",  endpointInterface ="cr.ulacit.service.DishManager")
public class DishManagerImpl extends GenericManagerImpl<Dish,Integer> implements DishManager {
	DishDao dishDao;
	
	public DishManagerImpl(){
	}
	@Autowired
	public DishManagerImpl(DishDao dishDao) {
		super(dishDao);
		this.dishDao=dishDao;
	}


	@Override
	public List<DishDTO> findByID(Integer id_dish) {
		List<DishDTO> dishDTOs=null;
		List<Dish> dishList= dishDao.findByIdDish(id_dish);
		dishDTOs=DishMapper.INSTANCE.dishsToDishsDTOS(dishList);
		return dishDTOs;
	}

	@Override
	public List<DishDTO> findByName(String name) {
		List<DishDTO> dishDTOs=null;
		List<Dish> dishList= dishDao.findByName(name);
		dishDTOs=DishMapper.INSTANCE.dishsToDishsDTOS(dishList);
		return dishDTOs;
	}


	@Override
	public List<DishDTO> getDish() {
		List<DishDTO> dishDTOs=null;
		List<Dish> dishList= dishDao.getAll();
		dishDTOs=DishMapper.INSTANCE.dishsToDishsDTOS(dishList);
		return dishDTOs;
	}

}
