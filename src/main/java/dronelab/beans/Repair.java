package dronelab.beans;

import lombok.*;

import java.sql.Date;
import java.util.Calendar;

@Data               //getters , setters, toString, equal , hashCode
@AllArgsConstructor //All args c'tor
@NoArgsConstructor  //Defualt c'tor
@Builder
public class Repair {
    //fields
    private Date readyOn; //estimated time that the drone will be ready
    private Date entred; //when the drone was entered to the lab
    private String memo; //some data about the drone
    private String sn; //Serial Number of the drone
    private boolean isImportent; //VIP person, tal edri
    private boolean poped; //show message when the drone is ready.
    private String repairPerson;
    private boolean isReady;

    @SneakyThrows
    public void checkTal(){
        throw new Exception("Tal is in the house");
    }
}
