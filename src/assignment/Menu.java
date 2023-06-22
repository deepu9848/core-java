package assignment;

import java.util.Objects;

public class Menu {
    private int menuId;
    private String menuName;
    private int parentMenuId;
    private boolean isLeaf;
    private String slug;
public Menu(){

}

    public Menu(int menuId, String menuName, int parentMenuId, boolean isLeaf, String slug) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentMenuId = parentMenuId;
        this.isLeaf = isLeaf;
        this.slug = slug;
    }@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;

        return menuId == menu.menuId && parentMenuId == menu.parentMenuId && isLeaf == menu.isLeaf && Objects.equals(menuName, menu.menuName) && Objects.equals(slug, menu.slug);
    } @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", parentMenuId=" + parentMenuId +
                ", isLeaf=" + isLeaf +
                ", slug='" + slug + '\'' ;
}
}




