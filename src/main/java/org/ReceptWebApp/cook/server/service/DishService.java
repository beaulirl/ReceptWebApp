package service;

import model.Dish;

/**
 * Created by Admin on 14.12.2016.
 */
public interface DishService extends GenericService<Dish, Integer> {
    boolean removeDish(Dish dish);
}
