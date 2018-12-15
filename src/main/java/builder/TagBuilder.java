package builder;

import model.Pet.Tag;

public class TagBuilder {

    private Tag tag;

    public TagBuilder(){
        this.tag = new Tag();
    }

    public TagBuilder setId(Integer id) {
        this.tag.setId(id);
        return this;
    }

    public TagBuilder setName(String name) {
        this.tag.setName(name);
        return this;
    }

    public Tag build(){
        return this.tag;
    }




}
