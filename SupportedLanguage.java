package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SupportedLanguage {

@SerializedName("code")
@Expose
private String code;
@SerializedName("status")
@Expose
private String status;
@SerializedName("name")
@Expose
private String name;

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public SupportedLanguage withCode(String code) {
this.code = code;
return this;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public SupportedLanguage withStatus(String status) {
this.status = status;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public SupportedLanguage withName(String name) {
this.name = name;
return this;
}

}