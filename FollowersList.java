package api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FollowersList {

@SerializedName("users")
@Expose
private List<User> users = null;
@SerializedName("next_cursor")
@Expose
private Integer nextCursor;
@SerializedName("next_cursor_str")
@Expose
private String nextCursorStr;
@SerializedName("previous_cursor")
@Expose
private Integer previousCursor;
@SerializedName("previous_cursor_str")
@Expose
private String previousCursorStr;

public List<User> getUsers() {
return users;
}

public void setUsers(List<User> users) {
this.users = users;
}

public FollowersList withUsers(List<User> users) {
this.users = users;
return this;
}

public Integer getNextCursor() {
return nextCursor;
}

public void setNextCursor(Integer nextCursor) {
this.nextCursor = nextCursor;
}

public FollowersList withNextCursor(Integer nextCursor) {
this.nextCursor = nextCursor;
return this;
}

public String getNextCursorStr() {
return nextCursorStr;
}

public void setNextCursorStr(String nextCursorStr) {
this.nextCursorStr = nextCursorStr;
}

public FollowersList withNextCursorStr(String nextCursorStr) {
this.nextCursorStr = nextCursorStr;
return this;
}

public Integer getPreviousCursor() {
return previousCursor;
}

public void setPreviousCursor(Integer previousCursor) {
this.previousCursor = previousCursor;
}

public FollowersList withPreviousCursor(Integer previousCursor) {
this.previousCursor = previousCursor;
return this;
}

public String getPreviousCursorStr() {
return previousCursorStr;
}

public void setPreviousCursorStr(String previousCursorStr) {
this.previousCursorStr = previousCursorStr;
}

public FollowersList withPreviousCursorStr(String previousCursorStr) {
this.previousCursorStr = previousCursorStr;
return this;
}

}