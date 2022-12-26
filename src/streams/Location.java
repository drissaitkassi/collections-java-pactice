package streams;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private int locationId;
    private String description;
    private Map<String ,Integer> exits;

    public Location(int locationId, String description,Map<String ,Integer> exe) {
        this.locationId = locationId;
        this.description = description;
        this.exits=new HashMap<>(exe);
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return ""+this.locationId +"--->"+this.description + "--->"+this.exits;
    }

    public Map<String, Integer> getExits() {

        return exits;
    }

    public void setExits(Map<String, Integer> exits) {
        this.exits = exits;
    }

}
