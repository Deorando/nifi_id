
package model_ProcessGroupRead;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProcessGroupRead {

    @SerializedName("processGroups")
    private List<ProcessGroup> mProcessGroups;

    public List<ProcessGroup> getProcessGroups() {
        return mProcessGroups;
    }

    public void setProcessGroups(List<ProcessGroup> processGroups) {
        mProcessGroups = processGroups;
    }

}
