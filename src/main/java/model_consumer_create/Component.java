
package model_consumer_create;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Component {

    @SerializedName("bundle")
    private Bundle mBundle;
    @SerializedName("config")
    private Config mConfig;
    @SerializedName("deprecated")
    private Boolean mDeprecated;
    @SerializedName("extensionMissing")
    private Boolean mExtensionMissing;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("multipleVersionsAvailable")
    private Boolean mMultipleVersionsAvailable;
    @SerializedName("name")
    private String mName;
    @SerializedName("persistsState")
    private Boolean mPersistsState;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("relationships")
    private List<Relationship> mRelationships;
    @SerializedName("restricted")
    private Boolean mRestricted;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private Style mStyle;
    @SerializedName("supportsBatching")
    private Boolean mSupportsBatching;
    @SerializedName("supportsEventDriven")
    private Boolean mSupportsEventDriven;
    @SerializedName("supportsParallelProcessing")
    private Boolean mSupportsParallelProcessing;
    @SerializedName("type")
    private String mType;

    public Bundle getBundle() {
        return mBundle;
    }

    public void setBundle(Bundle bundle) {
        mBundle = bundle;
    }

    public Config getConfig() {
        return mConfig;
    }

    public void setConfig(Config config) {
        mConfig = config;
    }

    public Boolean getDeprecated() {
        return mDeprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        mDeprecated = deprecated;
    }

    public Boolean getExtensionMissing() {
        return mExtensionMissing;
    }

    public void setExtensionMissing(Boolean extensionMissing) {
        mExtensionMissing = extensionMissing;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public Boolean getMultipleVersionsAvailable() {
        return mMultipleVersionsAvailable;
    }

    public void setMultipleVersionsAvailable(Boolean multipleVersionsAvailable) {
        mMultipleVersionsAvailable = multipleVersionsAvailable;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getPersistsState() {
        return mPersistsState;
    }

    public void setPersistsState(Boolean persistsState) {
        mPersistsState = persistsState;
    }

    public Position getPosition() {
        return mPosition;
    }

    public void setPosition(Position position) {
        mPosition = position;
    }

    public List<Relationship> getRelationships() {
        return mRelationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        mRelationships = relationships;
    }

    public Boolean getRestricted() {
        return mRestricted;
    }

    public void setRestricted(Boolean restricted) {
        mRestricted = restricted;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Style getStyle() {
        return mStyle;
    }

    public void setStyle(Style style) {
        mStyle = style;
    }

    public Boolean getSupportsBatching() {
        return mSupportsBatching;
    }

    public void setSupportsBatching(Boolean supportsBatching) {
        mSupportsBatching = supportsBatching;
    }

    public Boolean getSupportsEventDriven() {
        return mSupportsEventDriven;
    }

    public void setSupportsEventDriven(Boolean supportsEventDriven) {
        mSupportsEventDriven = supportsEventDriven;
    }

    public Boolean getSupportsParallelProcessing() {
        return mSupportsParallelProcessing;
    }

    public void setSupportsParallelProcessing(Boolean supportsParallelProcessing) {
        mSupportsParallelProcessing = supportsParallelProcessing;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Component(String name,String queue_name,String virtual_host,Position p){
        this.mType="org.apache.nifi.amqp.processors.ConsumeAMQP";
        this.mState="STOPPED";
        this.mInputRequirement="INPUT_FORBIDDEN";
        this.mName=name;
        mConfig= new Config(queue_name,virtual_host);
        mPosition= p;
    }

}
