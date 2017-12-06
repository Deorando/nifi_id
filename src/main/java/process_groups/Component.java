
package process_groups;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Component {

    @SerializedName("activeRemotePortCount")
    private Long mActiveRemotePortCount;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("disabledCount")
    private Long mDisabledCount;
    @SerializedName("inactiveRemotePortCount")
    private Long mInactiveRemotePortCount;
    @SerializedName("inputPortCount")
    private Long mInputPortCount;
    @SerializedName("invalidCount")
    private Long mInvalidCount;
    @SerializedName("name")
    private String mName;
    @SerializedName("outputPortCount")
    private Long mOutputPortCount;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("runningCount")
    private Long mRunningCount;
    @SerializedName("stoppedCount")
    private Long mStoppedCount;

    public Long getActiveRemotePortCount() {
        return mActiveRemotePortCount;
    }

    public void setActiveRemotePortCount(Long activeRemotePortCount) {
        mActiveRemotePortCount = activeRemotePortCount;
    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
    }

    public Long getDisabledCount() {
        return mDisabledCount;
    }

    public void setDisabledCount(Long disabledCount) {
        mDisabledCount = disabledCount;
    }

    public Long getInactiveRemotePortCount() {
        return mInactiveRemotePortCount;
    }

    public void setInactiveRemotePortCount(Long inactiveRemotePortCount) {
        mInactiveRemotePortCount = inactiveRemotePortCount;
    }

    public Long getInputPortCount() {
        return mInputPortCount;
    }

    public void setInputPortCount(Long inputPortCount) {
        mInputPortCount = inputPortCount;
    }

    public Long getInvalidCount() {
        return mInvalidCount;
    }

    public void setInvalidCount(Long invalidCount) {
        mInvalidCount = invalidCount;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getOutputPortCount() {
        return mOutputPortCount;
    }

    public void setOutputPortCount(Long outputPortCount) {
        mOutputPortCount = outputPortCount;
    }

    public Position getPosition() {
        return mPosition;
    }

    public void setPosition(Position position) {
        mPosition = position;
    }

    public Long getRunningCount() {
        return mRunningCount;
    }

    public void setRunningCount(Long runningCount) {
        mRunningCount = runningCount;
    }

    public Long getStoppedCount() {
        return mStoppedCount;
    }

    public void setStoppedCount(Long stoppedCount) {
        mStoppedCount = stoppedCount;
    }

    public Component(String name,Position p){
        this.mName=name;
        mPosition=p;

    }

}
