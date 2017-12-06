
package model_consumer_create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Revision {

    @SerializedName("version")
    private Long mVersion;

    public Long getVersion() {
        return mVersion;
    }

    public void setVersion(Long version) {
        mVersion = version;
    }

    public Revision(){
        this.mVersion=0l;
    }

}
