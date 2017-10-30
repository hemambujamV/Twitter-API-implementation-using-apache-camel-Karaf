package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Relationship {

@SerializedName("target")
@Expose
private Target target;
@SerializedName("source")
@Expose
private Source source;

public Target getTarget() {
return target;
}

public void setTarget(Target target) {
this.target = target;
}

public Relationship withTarget(Target target) {
this.target = target;
return this;
}

public Source getSource() {
return source;
}

public void setSource(Source source) {
this.source = source;
}

public Relationship withSource(Source source) {
this.source = source;
return this;
}

}


