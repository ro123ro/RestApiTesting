package data;

import model.Pet.Category;
import model.Pet.Tag;

import java.util.ArrayList;
import java.util.List;

public class PetData {

    public Integer idPet = 5;
    public Category category;
    public String namePet = "Cat123";
    public List<String> photoUrls;
    public List<Tag> tags;
    public String status = "available";
    public String photoUrlDefault = "string";

    public PetData() {
        fillCategoryWithDefaultData();
        fillPhotoURLWithDefaultData();
        fillTagsWithDefaultData();
    }

    private void fillCategoryWithDefaultData() {
        this.category = new Category();
        CategoryData categoryData = new CategoryData();
        this.category.setId(categoryData.idCategory);
        this.category.setName(categoryData.nameCategory);
    }

    private void fillPhotoURLWithDefaultData() {
        this.photoUrls = new ArrayList<>();
        this.photoUrls.add(photoUrlDefault);
    }

    private void fillTagsWithDefaultData() {
        this.tags = new ArrayList<>();
        Tag tag = new Tag();
        TagData tagData = new TagData();
        tag.setId(tagData.idTag);
        tag.setName(tagData.nameTag);
        this.tags.add(tag);
    }

    @Override
    public String toString() {
        return "PetData{" +
                "idPet=" + idPet +
                ", category=" + category +
                ", namePet='" + namePet + '\'' +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                ", photoUrlDefault='" + photoUrlDefault + '\'' +
                '}';
    }
}
