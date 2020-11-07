package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("eventID")
    @Expose
    private Integer eventID;
    @SerializedName("person")
    @Expose
    private List<String> person = null;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("location")
    @Expose
    private List<String> location = null;
    @SerializedName("_rawData")
    @Expose
    private String rawData;

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setPerson(List<String> person) {
        this.person = person;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public String toString(){
        return String.format(this.getEventID() + ": " + this.getPerson() + "; " + this.getTime() + "; " + getLocation() + "\n\t" + this.getRawData());
    }

}