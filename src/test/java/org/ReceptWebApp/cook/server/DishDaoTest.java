/**
 * Created by Admin on 20.12.2016.
 */
import org.junit.Test;
import model.Dish;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import service.DishService;
import service.DishServiceImpl;


@ContextConfiguration(locations = "/persistence-beans.xml")
public class DishDaoTest {

    private DishService dishService;

    public void setDishService(DishService dishService){
        this.dishService = dishService;
    }

    @Test
    public void testGetDish(){
        Dish dish = new Dish();
        dish.setName("Soup");
        System.out.println(dish.toString());
/*        setDishService(new DishServiceImpl());
        dishService.add(dish);*/
    }
}

