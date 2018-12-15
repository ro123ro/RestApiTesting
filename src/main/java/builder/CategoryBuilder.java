package builder;

import model.Pet.Category;

public class CategoryBuilder {

    private Category category;

    public CategoryBuilder(){
        this.category = new Category();
    }

    public CategoryBuilder setId(Integer id) {
        this.category.setId(id);
        return this;
    }

    public CategoryBuilder setName(String name) {
        this.category.setName(name);
        return this;
    }

    public Category build(){
        return this.category;
    }




}
