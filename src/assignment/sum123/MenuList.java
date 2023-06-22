package assignment.sum123;

import daraaz.Menu;

import java.util.ArrayList;

public class MenuList {
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
        clothing.isLeaf = false;
        clothing.slug = "women-clothimg";
    }

    ArrayList<MenuList> MenuList = new ArrayList<>();



}

