package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

@SerializedName("can_dm")
@Expose
private Boolean canDm;
@SerializedName("blocking")
@Expose
private Object blocking;
@SerializedName("muting")
@Expose
private Object muting;
@SerializedName("id_str")
@Expose
private String idStr;
@SerializedName("all_replies")
@Expose
private Object allReplies;
@SerializedName("want_retweets")
@Expose
private Object wantRetweets;
@SerializedName("id")
@Expose
private Integer id;
@SerializedName("marked_spam")
@Expose
private Object markedSpam;
@SerializedName("screen_name")
@Expose
private String screenName;
@SerializedName("following")
@Expose
private Boolean following;
@SerializedName("followed_by")
@Expose
private Boolean followedBy;
@SerializedName("notifications_enabled")
@Expose
private Object notificationsEnabled;

public Boolean getCanDm() {
return canDm;
}

public void setCanDm(Boolean canDm) {
this.canDm = canDm;
}

public Source withCanDm(Boolean canDm) {
this.canDm = canDm;
return this;
}

public Object getBlocking() {
return blocking;
}

public void setBlocking(Object blocking) {
this.blocking = blocking;
}

public Source withBlocking(Object blocking) {
this.blocking = blocking;
return this;
}

public Object getMuting() {
return muting;
}

public void setMuting(Object muting) {
this.muting = muting;
}

public Source withMuting(Object muting) {
this.muting = muting;
return this;
}

public String getIdStr() {
return idStr;
}

public void setIdStr(String idStr) {
this.idStr = idStr;
}

public Source withIdStr(String idStr) {
this.idStr = idStr;
return this;
}

public Object getAllReplies() {
return allReplies;
}

public void setAllReplies(Object allReplies) {
this.allReplies = allReplies;
}

public Source withAllReplies(Object allReplies) {
this.allReplies = allReplies;
return this;
}

public Object getWantRetweets() {
return wantRetweets;
}

public void setWantRetweets(Object wantRetweets) {
this.wantRetweets = wantRetweets;
}

public Source withWantRetweets(Object wantRetweets) {
this.wantRetweets = wantRetweets;
return this;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Source withId(Integer id) {
this.id = id;
return this;
}

public Object getMarkedSpam() {
return markedSpam;
}

public void setMarkedSpam(Object markedSpam) {
this.markedSpam = markedSpam;
}

public Source withMarkedSpam(Object markedSpam) {
this.markedSpam = markedSpam;
return this;
}

public String getScreenName() {
return screenName;
}

public void setScreenName(String screenName) {
this.screenName = screenName;
}

public Source withScreenName(String screenName) {
this.screenName = screenName;
return this;
}

public Boolean getFollowing() {
return following;
}

public void setFollowing(Boolean following) {
this.following = following;
}

public Source withFollowing(Boolean following) {
this.following = following;
return this;
}

public Boolean getFollowedBy() {
return followedBy;
}

public void setFollowedBy(Boolean followedBy) {
this.followedBy = followedBy;
}

public Source withFollowedBy(Boolean followedBy) {
this.followedBy = followedBy;
return this;
}

public Object getNotificationsEnabled() {
return notificationsEnabled;
}

public void setNotificationsEnabled(Object notificationsEnabled) {
this.notificationsEnabled = notificationsEnabled;
}

public Source withNotificationsEnabled(Object notificationsEnabled) {
this.notificationsEnabled = notificationsEnabled;
return this;
}

}