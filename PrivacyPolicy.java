package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrivacyPolicy {

@SerializedName("privacy")
@Expose
private String privacy;

public String getPrivacy() {
return privacy;
}

public void setPrivacy(String privacy) {
this.privacy = privacy;
}

public PrivacyPolicy withPrivacy(String privacy) {
this.privacy = privacy;
return this;
}

}