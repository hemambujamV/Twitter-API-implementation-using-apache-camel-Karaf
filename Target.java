package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Target {

@SerializedName("id_str")
@Expose
private String idStr;
@SerializedName("id")
@Expose
private Integer id;
@SerializedName("screen_name")
@Expose
private String screenName;
@SerializedName("following")
@Expose
private Boolean following;
@SerializedName("followed_by")
@Expose
private Boolean followedBy;

public String getIdStr() {
return idStr;
}

public void setIdStr(String idStr) {
this.idStr = idStr;
}

public Target withIdStr(String idStr) {
this.idStr = idStr;
return this;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Target withId(Integer id) {
this.id = id;
return this;
}

public String getScreenName() {
return screenName;
}

public void setScreenName(String screenName) {
this.screenName = screenName;
}

public Target withScreenName(String screenName) {
this.screenName = screenName;
return this;
}

public Boolean getFollowing() {
return following;
}

public void setFollowing(Boolean following) {
this.following = following;
}

public Target withFollowing(Boolean following) {
this.following = following;
return this;
}

public Boolean getFollowedBy() {
return followedBy;
}

public void setFollowedBy(Boolean followedBy) {
this.followedBy = followedBy;
}

public Target withFollowedBy(Boolean followedBy) {
this.followedBy = followedBy;
return this;
}

}