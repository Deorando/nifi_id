
package process_groups;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Position {

    @SerializedName("x")
    private double mX;
    @SerializedName("y")
    private double mY;

    public double getX() {
        return mX;
    }

    public void setX(Long x) {
        mX = x;
    }

    public double getY() {
        return mY;
    }

    public void setY(Long y) {
        mY = y;
    }

    public Position(double x,double y){
        this.mX=x;
        this.mY=y;
    }

}
