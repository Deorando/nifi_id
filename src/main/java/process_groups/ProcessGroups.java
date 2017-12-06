
package process_groups;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProcessGroups {

    @SerializedName("activeRemotePortCount")
    private Long mActiveRemotePortCount;
    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private Component mComponent;
    @SerializedName("disabledCount")
    private Long mDisabledCount;
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
    @SerializedName("stoppedCount")
    private Long mStoppedCount;

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

    public Long getStoppedCount() {
        return mStoppedCount;
    }

    public void setStoppedCount(Long stoppedCount) {
        mStoppedCount = stoppedCount;
    }

    public ProcessGroups(Component com,Position p){
        this.mRunningCount=0l;
        mRevision= new Revision();
        mComponent=com;

    }

}
