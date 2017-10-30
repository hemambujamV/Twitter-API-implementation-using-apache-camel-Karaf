package api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListEvents {

@SerializedName("next_cursor")
@Expose
private String nextCursor;
@SerializedName("events")
@Expose
private List<Event> events = null;

public String getNextCursor() {
return nextCursor;
}

public void setNextCursor(String nextCursor) {
this.nextCursor = nextCursor;
}

public ListEvents withNextCursor(String nextCursor) {
this.nextCursor = nextCursor;
return this;
}

public List<Event> getEvents() {
return events;
}

public void setEvents(List<Event> events) {
this.events = events;
}

public ListEvents withEvents(List<Event> events) {
this.events = events;
return this;
}

}