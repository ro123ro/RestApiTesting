package builder;

import data.PetData;
import model.Pet.Pet;

public class PetCreatorRQ {

    private PetData petData;

    public PetCreatorRQ(PetData petData) {
        this.petData = petData;
    }

    public Pet createPet() {
        return new PetBuilder()
                .setId(petData.idPet)
                .setCategory(
                        new CategoryBuilder()
                                .setId(petData.category.getId())
                                .setName(petData.category.getName())
                                .build()
                )
                .setName(petData.namePet)
                .setPhotoUrls(petData.photoUrls)
                .setTags(petData.tags)
                .setStatus(petData.status)
                .build();
    }
}
