package builder;

import model.Pet.Category;
import model.Pet.Pet;
import model.Pet.Tag;

import java.util.List;

public class PetBuilder {

    private Pet pet;

    public PetBuilder() {
        this.pet = new Pet();
    }

    public PetBuilder setId(Integer id) {
        this.pet.setId(id);
        return this;
    }

    public PetBuilder setCategory(Category category) {
        this.pet.setCategory(category);
        return this;
    }

    public PetBuilder setName(String name) {
        this.pet.setName(name);
        return this;
    }

    public PetBuilder setPhotoUrls(List<String> photoUrls) {
        this.pet.setPhotoUrls(photoUrls);
        return this;
    }

    public PetBuilder setTags(List<Tag> tags) {
        this.pet.setTags(tags);
        return this;
    }

    public PetBuilder setStatus(String status) {
        this.pet.setStatus(status);
        return this;
    }

    public Pet build() {
        return this.pet;
    }
}
