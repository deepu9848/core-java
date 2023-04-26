package Daraaz;

public class ShoppingApplication {
    public static void main(String[] args) {
        Menu womenFashion = new Menu();
        womenFashion.menuId = 1;
        womenFashion.menuName = "Women's Fashion";
        womenFashion.parentMenuId = 0;
        womenFashion.isLeaf = false;
        womenFashion.slug = "women-fashion";

        Menu clothing = new Menu();
        clothing.menuId = 2;
        clothing.menuName = "Clothing";
        clothing.parentMenuId = 1;
        clothing.isLeaf = fase;
        clothing.slug = "women-clothimg";

        Menu topsAndTshirts = new Menu;
        topsAndTshirts.menuId =3;
        topsAndTshirts.menuName = "Tops & T-Shirts";
        topsAndTshirts.parentMenuId =2;
        topsAndTshirts.isLeaf = true;
        topsAndTshirts.slug = "women-top-tshirts";


    }

}
