public class RestaurantMain {
public static void main(String[] args) {

Restaurant menu = new Restaurant();

    menu.tambahMenuMakanan("Pizza", 250000, 2);
    menu.tambahMenuMakanan("Spaghetti", 80000, 20);
    menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
    menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

    menu.tampilMenuMakanan();

    menu.pesanMakanan("Pizza", 2);
    menu.pesanMakanan("Pizza", 1);
    menu.pesanMakanan("Spaghetti", 5);

    menu.tampilMenuMakanan();
    }
}