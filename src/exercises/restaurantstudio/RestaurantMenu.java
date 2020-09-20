package exercises.restaurantstudio;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantMenu {
    private ArrayList<RestaurantMenuItem> listOfDishes;
    private Date lastUpdated;




    public RestaurantMenu() {
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date();

    }
    //A way to add/remove menu items from the menu
    public void add(RestaurantMenuItem n) {
    if(!listOfDishes.contains(n)) {


        listOfDishes.add(n);
        //Updates the lastUpdated field to reflect when the menu/items were last updated
        this.lastUpdated = new Date();

    }
    }
    public void remove(RestaurantMenuItem n) {
        listOfDishes.remove(n);
        //Updates the lastUpdated field to reflect when the menu/items were last updated
        this.lastUpdated = new Date();

    }
    //A way to tell when the menu was last updated
    public Date getLastUpdated() {
        return lastUpdated;
    }


    @Override
    public String toString() {
        return "RestaurantMenu{" +
                "listOfDishes=" + listOfDishes +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
