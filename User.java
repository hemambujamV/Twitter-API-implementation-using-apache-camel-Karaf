package api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

@SerializedName("previous_cursor")
@Expose
private Integer previousCursor;
@SerializedName("ids")
@Expose
private List<Integer> ids = null;
@SerializedName("previous_cursor_str")
@Expose
private String previousCursorStr;
@SerializedName("next_cursor")
@Expose
private Integer nextCursor;
@SerializedName("next_cursor_str")
@Expose
private String nextCursorStr;

public Integer getPreviousCursor() {
return previousCursor;
}

public void setPreviousCursor(Integer previousCursor) {
this.previousCursor = previousCursor;
}

public User withPreviousCursor(Integer previousCursor) {
this.previousCursor = previousCursor;
return this;
}

public List<Integer> getIds() {
return ids;
}

public void setIds(List<Integer> ids) {
this.ids = ids;
}

public User withIds(List<Integer> ids) {
this.ids = ids;
return this;
}

public String getPreviousCursorStr() {
return previousCursorStr;
}

public void setPreviousCursorStr(String previousCursorStr) {
this.previousCursorStr = previousCursorStr;
}

public User withPreviousCursorStr(String previousCursorStr) {
this.previousCursorStr = previousCursorStr;
return this;
}

public Integer getNextCursor() {
return nextCursor;
}

public void setNextCursor(Integer nextCursor) {
this.nextCursor = nextCursor;
}

public User withNextCursor(Integer nextCursor) {
this.nextCursor = nextCursor;
return this;
}

public String getNextCursorStr() {
return nextCursorStr;
}

public void setNextCursorStr(String nextCursorStr) {
this.nextCursorStr = nextCursorStr;
}

public User withNextCursorStr(String nextCursorStr) {
this.nextCursorStr = nextCursorStr;
return this;
}

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("id_str")
@Expose
private String idStr;
@SerializedName("name")
@Expose
private String name;
@SerializedName("screen_name")
@Expose
private String screenName;
@SerializedName("location")
@Expose
private String location;
@SerializedName("profile_location")
@Expose
private Object profileLocation;
@SerializedName("url")
@Expose
private Object url;
@SerializedName("description")
@Expose
private String description;
@SerializedName("protected")
@Expose
private Boolean _protected;
@SerializedName("followers_count")
@Expose
private Integer followersCount;
@SerializedName("friends_count")
@Expose
private Integer friendsCount;
@SerializedName("listed_count")
@Expose
private Integer listedCount;
@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("favourites_count")
@Expose
private Integer favouritesCount;
@SerializedName("utc_offset")
@Expose
private Integer utcOffset;
@SerializedName("time_zone")
@Expose
private String timeZone;
@SerializedName("geo_enabled")
@Expose
private Boolean geoEnabled;
@SerializedName("verified")
@Expose
private Boolean verified;
@SerializedName("statuses_count")
@Expose
private Integer statusesCount;
@SerializedName("lang")
@Expose
private String lang;
@SerializedName("contributors_enabled")
@Expose
private Boolean contributorsEnabled;
@SerializedName("is_translator")
@Expose
private Boolean isTranslator;
@SerializedName("is_translation_enabled")
@Expose
private Boolean isTranslationEnabled;
@SerializedName("profile_background_color")
@Expose
private String profileBackgroundColor;
@SerializedName("profile_background_image_url")
@Expose
private String profileBackgroundImageUrl;
@SerializedName("profile_background_image_url_https")
@Expose
private String profileBackgroundImageUrlHttps;
@SerializedName("profile_background_tile")
@Expose
private Boolean profileBackgroundTile;
@SerializedName("profile_image_url")
@Expose
private String profileImageUrl;
@SerializedName("profile_image_url_https")
@Expose
private String profileImageUrlHttps;
@SerializedName("profile_link_color")
@Expose
private String profileLinkColor;
@SerializedName("profile_sidebar_border_color")
@Expose
private String profileSidebarBorderColor;
@SerializedName("profile_sidebar_fill_color")
@Expose
private String profileSidebarFillColor;
@SerializedName("profile_text_color")
@Expose
private String profileTextColor;
@SerializedName("profile_use_background_image")
@Expose
private Boolean profileUseBackgroundImage;
@SerializedName("default_profile")
@Expose
private Boolean defaultProfile;
@SerializedName("default_profile_image")
@Expose
private Boolean defaultProfileImage;
@SerializedName("following")
@Expose
private Boolean following;
@SerializedName("follow_request_sent")
@Expose
private Boolean followRequestSent;
@SerializedName("notifications")
@Expose
private Boolean notifications;
@SerializedName("muting")
@Expose
private Boolean muting;
@SerializedName("profile_banner_url")
@Expose
private String profileBannerUrl;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public User withId(Integer id) {
this.id = id;
return this;
}

public String getIdStr() {
return idStr;
}

public void setIdStr(String idStr) {
this.idStr = idStr;
}

public User withIdStr(String idStr) {
this.idStr = idStr;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public User withName(String name) {
this.name = name;
return this;
}

public String getScreenName() {
return screenName;
}

public void setScreenName(String screenName) {
this.screenName = screenName;
}

public User withScreenName(String screenName) {
this.screenName = screenName;
return this;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

public User withLocation(String location) {
this.location = location;
return this;
}

public Object getProfileLocation() {
return profileLocation;
}

public void setProfileLocation(Object profileLocation) {
this.profileLocation = profileLocation;
}

public User withProfileLocation(Object profileLocation) {
this.profileLocation = profileLocation;
return this;
}

public Object getUrl() {
return url;
}

public void setUrl(Object url) {
this.url = url;
}

public User withUrl(Object url) {
this.url = url;
return this;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public User withDescription(String description) {
this.description = description;
return this;
}

public Integer getFollowersCount() {
return followersCount;
}

public void setFollowersCount(Integer followersCount) {
this.followersCount = followersCount;
}

public User withFollowersCount(Integer followersCount) {
this.followersCount = followersCount;
return this;
}

public Integer getFriendsCount() {
return friendsCount;
}

public void setFriendsCount(Integer friendsCount) {
this.friendsCount = friendsCount;
}

public User withFriendsCount(Integer friendsCount) {
this.friendsCount = friendsCount;
return this;
}

public Integer getListedCount() {
return listedCount;
}

public void setListedCount(Integer listedCount) {
this.listedCount = listedCount;
}

public User withListedCount(Integer listedCount) {
this.listedCount = listedCount;
return this;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public User withCreatedAt(String createdAt) {
this.createdAt = createdAt;
return this;
}

public Integer getFavouritesCount() {
return favouritesCount;
}

public void setFavouritesCount(Integer favouritesCount) {
this.favouritesCount = favouritesCount;
}

public User withFavouritesCount(Integer favouritesCount) {
this.favouritesCount = favouritesCount;
return this;
}

public Integer getUtcOffset() {
return utcOffset;
}

public void setUtcOffset(Integer utcOffset) {
this.utcOffset = utcOffset;
}

public User withUtcOffset(Integer utcOffset) {
this.utcOffset = utcOffset;
return this;
}

public String getTimeZone() {
return timeZone;
}

public void setTimeZone(String timeZone) {
this.timeZone = timeZone;
}

public User withTimeZone(String timeZone) {
this.timeZone = timeZone;
return this;
}

public Boolean getGeoEnabled() {
return geoEnabled;
}

public void setGeoEnabled(Boolean geoEnabled) {
this.geoEnabled = geoEnabled;
}

public User withGeoEnabled(Boolean geoEnabled) {
this.geoEnabled = geoEnabled;
return this;
}

public Boolean getVerified() {
return verified;
}

public void setVerified(Boolean verified) {
this.verified = verified;
}

public User withVerified(Boolean verified) {
this.verified = verified;
return this;
}

public Integer getStatusesCount() {
return statusesCount;
}

public void setStatusesCount(Integer statusesCount) {
this.statusesCount = statusesCount;
}

public User withStatusesCount(Integer statusesCount) {
this.statusesCount = statusesCount;
return this;
}

public String getLang() {
return lang;
}

public void setLang(String lang) {
this.lang = lang;
}

public User withLang(String lang) {
this.lang = lang;
return this;
}

public Boolean getFollowing() {
return following;
}

public void setFollowing(Boolean following) {
this.following = following;
}

public User withFollowing(Boolean following) {
this.following = following;
return this;
}

public Boolean getFollowRequestSent() {
return followRequestSent;
}

public void setFollowRequestSent(Boolean followRequestSent) {
this.followRequestSent = followRequestSent;
}

public User withFollowRequestSent(Boolean followRequestSent) {
this.followRequestSent = followRequestSent;
return this;
}


public String getProfileBannerUrl() {
return profileBannerUrl;
}

public void setProfileBannerUrl(String profileBannerUrl) {
this.profileBannerUrl = profileBannerUrl;
}

public User withProfileBannerUrl(String profileBannerUrl) {
this.profileBannerUrl = profileBannerUrl;
return this;
}


}
