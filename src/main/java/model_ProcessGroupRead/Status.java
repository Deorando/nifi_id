
package model_ProcessGroupRead;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Status {

    @SerializedName("aggregateSnapshot")
    private AggregateSnapshot mAggregateSnapshot;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("statsLastRefreshed")
    private String mStatsLastRefreshed;

    public AggregateSnapshot getAggregateSnapshot() {
        return mAggregateSnapshot;
    }

    public void setAggregateSnapshot(AggregateSnapshot aggregateSnapshot) {
        mAggregateSnapshot = aggregateSnapshot;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getStatsLastRefreshed() {
        return mStatsLastRefreshed;
    }

    public void setStatsLastRefreshed(String statsLastRefreshed) {
        mStatsLastRefreshed = statsLastRefreshed;
    }

}
