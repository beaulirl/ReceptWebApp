package dao;

import model.Dish;

/**
 * Created by Admin on 13.12.2016.
 */
public class DishDaoImpl extends   GenericDaoImpl<Dish, Integer> implements DishDao{

    public boolean removeDish(Dish   dish) {
        currentSession().delete(dish);
        return true;
    }
}
