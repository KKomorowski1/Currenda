
package pl.komorowski.currenda.model.api.artist;

import java.util.List;

public class Artists {

    private Artists artists;
    private String href;
    private List<Items> items;
    private Integer limit;
    private Object next = null;
    private Integer offset;
    private Object previous = null;
    private Integer total;

    public Artists() {

    }

    public Artists(Artists artists, String href, List<Items> items, Integer limit, Object next, Integer offset, Object previous, Integer total) {
        super();
        this.artists = artists;
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }

    public Artists getArtists() {
        return artists;
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "artists=" + artists +
                ", href='" + href + '\'' +
                ", items=" + items +
                ", limit=" + limit +
                ", next=" + next +
                ", offset=" + offset +
                ", previous=" + previous +
                ", total=" + total +
                '}';
    }
}
