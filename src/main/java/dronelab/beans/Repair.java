package dronelab.beans;

import lombok.*;

import java.util.Calendar;

@Data               //getters , setters, toString, equal , hashCode
@AllArgsConstructor //All args c'tor
@NoArgsConstructor  //Defualt c'tor
@Builder
public class Repair {
    //fields
    private Calendar readyOn; //estimated time that the drone will be ready
    private Calendar entred; //when the drone was entered to the lab
    private String memo; //some data about the drone
    private String sn; //Serial Number of the drone
    private boolean isImportent; //VIP person, tal edri
    private boolean poped; //show message when the drone is ready.
    private String repairPerson;
    private boolean isReady;

    private void setEntred(Calendar entred) {
        this.entred = entred;
    }

    @SneakyThrows
    public void checkTal(){
        throw new Exception("Tal is in the house");
    }
}
