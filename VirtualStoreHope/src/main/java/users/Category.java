package users;

public class Category {


    private int idCategory;
    private String categoryName;
    private String state;

    public Category(){

    }

    public Category(int idCategory, String categoryName, String state) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.state = state;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
