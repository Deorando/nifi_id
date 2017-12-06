
package model_consumer_create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Bundle {

    @SerializedName("artifact")
    private String mArtifact;
    @SerializedName("group")
    private String mGroup;
    @SerializedName("version")
    private String mVersion;

    public String getArtifact() {
        return mArtifact;
    }

    public void setArtifact(String artifact) {
        mArtifact = artifact;
    }

    public String getGroup() {
        return mGroup;
    }

    public void setGroup(String group) {
        mGroup = group;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

}
