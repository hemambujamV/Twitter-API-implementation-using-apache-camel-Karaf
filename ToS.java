
package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToS {

@SerializedName("tos")
@Expose
private String tos;

public String getTos() {
return tos;
}

public void setTos(String tos) {
this.tos = tos;
}

public ToS withTos(String tos) {
this.tos = tos;
return this;
}

}