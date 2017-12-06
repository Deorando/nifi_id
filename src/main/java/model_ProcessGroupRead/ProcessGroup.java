
package model_ProcessGroupRead;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProcessGroup {

    @SerializedName("activeRemotePortCount")
    private Long mActiveRemotePortCount;
    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private Component mComponent;
    @SerializedName("disabledCount")
    private Long mDisabledCount;
    @SerializedName("id")
    private String mId;
    @SerializedName("inactiveRemotePortCount")
    private Long mInactiveRemotePortCount;
    @SerializedName("inputPortCount")
    private Long mInputPortCount;
    @SerializedName("invalidCount")
    private Long mInvalidCount;
    @SerializedName("outputPortCount")
    private Long mOutputPortCount;
    @SerializedName("permissions")
    private Permissions mPermissions;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("revision")
    private Revision mRevision;
    @SerializedName("runningCount")
    private Long mRunningCount;
    @SerializedName("status")
    private Status mStatus;
    @SerializedName("stoppedCount")
    private Long mStoppedCount;
    @SerializedName("uri")
    private String mUri;

    public Long getActiveRemotePortCount() {
        return mActiveRemotePortCount;
    }

    public void setActiveRemotePortCount(Long activeRemotePortCount) {
        mActiveRemotePortCount = activeRemotePortCount;
    }

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public Component getComponent() {
        return mComponent;
    }

    public void setComponent(Component component) {
        mComponent = component;
    }

    public Long getDisabledCount() {
        return mDisabledCount;
    }

    public void setDisabledCount(Long disabledCount) {
        mDisabledCount = disabledCount;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
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

    public Long getOutputPortCount() {
        return mOutputPortCount;
    }

    public void setOutputPortCount(Long outputPortCount) {
        mOutputPortCount = outputPortCount;
    }

    public Permissions getPermissions() {
        return mPermissions;
    }

    public void setPermissions(Permissions permissions) {
        mPermissions = permissions;
    }

    public Position getPosition() {
        return mPosition;
    }

    public void setPosition(Position position) {
        mPosition = position;
    }

    public Revision getRevision() {
        return mRevision;
    }

    public void setRevision(Revision revision) {
        mRevision = revision;
    }

    public Long getRunningCount() {
        return mRunningCount;
    }

    public void setRunningCount(Long runningCount) {
        mRunningCount = runningCount;
    }

    public Status getStatus() {
        return mStatus;
    }

    public void setStatus(Status status) {
        mStatus = status;
    }

    public Long getStoppedCount() {
        return mStoppedCount;
    }

    public void setStoppedCount(Long stoppedCount) {
        mStoppedCount = stoppedCount;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

}
