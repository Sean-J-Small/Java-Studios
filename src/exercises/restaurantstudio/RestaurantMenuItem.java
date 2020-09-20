package exercises.restaurantstudio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class RestaurantMenuItem {
    private Date lastUpdated;
    private float price;
    private String itemName;
    private String foodCategory;
    private boolean newItem;


    public RestaurantMenuItem(String itemName, String foodCategory, Date lastUpdated, float price, boolean newItem) {
        this.itemName = itemName;
        this.price = price;
        this.foodCategory = foodCategory;
        this.newItem = true;
        this.lastUpdated = lastUpdated;
    }
    public boolean newItem() {
        return newItem;
    }

    @Override
    public String toString() {
        return "RestaurantMenuItem{" +
                "lastUpdated=" + lastUpdated +
                ", price=" + price +
                ", itemName='" + itemName + '\'' +
                ", foodCategory='" + foodCategory + '\'' +
                ", newItem=" + newItem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantMenuItem that = (RestaurantMenuItem) o;
        return itemName.equals(that.itemName) &&
                foodCategory.equals(that.foodCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, foodCategory);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public float getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public boolean isNewItem() {
        return newItem;
    }
}



//    private String breakfastItems;
//    private String lunchItems;
//    private String dinnerItems;
//    private String desserts;
//    private String thisWeeksSpecials;

//    private ArrayList<RestaurantMenu> menu = new ArrayList<>();
//    public String toString() {
//    String result = "";
//    for(RestaurantMenu item: menu){
//        result += item.getName() + item.getPrice();
//    }
//    return result;
//}
//    //Create an array list with the name, price, category, old/new items for each
//
//    public static void main(String[] args) {
//        RestaurantMenuItem newRestaurantMenuItem = new RestaurantMenuItem();
//
//        newRestaurantMenuItem.menu.add(new RestaurantMenu("Pizza", 5.99, "breakfast", true, "today"));
//        newRestaurantMenuItem.menu.add(new RestaurantMenu("Mountain Dew", 1.99, "drink", true, "today"));
//
//
//
//
//
//        this.menu.add(pizza);
//        this.menu.add(sodies);





