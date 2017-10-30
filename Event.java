package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

@SerializedName("id")
@Expose
private String id;
@SerializedName("created_timestamp")
@Expose
private String createdTimestamp;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public Event withId(String id) {
this.id = id;
return this;
}

public String getCreatedTimestamp() {
return createdTimestamp;
}

public void setCreatedTimestamp(String createdTimestamp) {
this.createdTimestamp = createdTimestamp;
}

public Event withCreatedTimestamp(String createdTimestamp) {
this.createdTimestamp = createdTimestamp;
return this;
}

}