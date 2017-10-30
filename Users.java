
package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Users {

@SerializedName("relationship")
@Expose
private Relationship relationship;

public Relationship getRelationship() {
return relationship;
}

public void setRelationship(Relationship relationship) {
this.relationship = relationship;
}

public Users withRelationship(Relationship relationship) {
this.relationship = relationship;
return this;
}

}