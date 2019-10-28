
package pl.komorowski.currenda.model.api.artist;


public class Followers {

    private Object href;
    private Integer total;

    public Followers() {
    }


    public Followers(Object href, Integer total) {
        super();
        this.href = href;
        this.total = total;
    }

    public Object getHref() {
        return href;
    }

    public void setHref(Object href) {
        this.href = href;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
