package pl.komorowski.currenda.model.api.formatted;

import java.util.List;

public class FormattedArtists {

    private String name;

    public FormattedArtists(String name) {
        this.name = name;
    }

    public FormattedArtists() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FormattedArtists{" +
                "name='" + name + '\'' +
                '}';
    }
}
