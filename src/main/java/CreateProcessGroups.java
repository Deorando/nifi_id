import process_groups.Component;
import process_groups.Position;
import process_groups.ProcessGroups;

/**
 * Created by Thomas on 01.12.2017.
 */
public class CreateProcessGroups {
    Position p;
    Component com;
    ProcessGroups pg;

    public ProcessGroups CreateProcessGroups(double x,double y,String name){
        p=new Position(x,y);
        com= new Component(name,p);
        pg= new ProcessGroups(com,p);
        return pg;
    }
}
