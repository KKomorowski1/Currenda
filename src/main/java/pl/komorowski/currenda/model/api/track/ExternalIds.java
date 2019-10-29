
package pl.komorowski.currenda.model.api.track;


public class ExternalIds {

    private String isrc;


    public ExternalIds() {
    }


    public ExternalIds(String isrc) {
        super();
        this.isrc = isrc;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

}
