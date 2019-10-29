
package pl.komorowski.currenda.model.api.track;

import java.util.List;

public class Tracks {

    private Tracks tracks;
    private String href;
    private List<Item> items = null;
    private Integer limit;
    private String next;
    private Integer offset;
    private Object previous;
    private Integer total;

    public Tracks() {
    }

    public Tracks(String href, List<Item> items, Integer limit, String next, Integer offset, Object previous, Integer total, Tracks tracks) {
        super();
        this.tracks = tracks;
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
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

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "tracks=" + tracks +
                ", href='" + href + '\'' +
                ", items=" + items +
                ", limit=" + limit +
                ", next='" + next + '\'' +
                ", offset=" + offset +
                ", previous=" + previous +
                ", total=" + total +
                '}';
    }
}
