package dronelab.beans;

import lombok.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

@Data               //getters , setters, toString, equal , hashCode
@AllArgsConstructor //All args c'tor
@NoArgsConstructor  //Defualt c'tor
@Builder            //using builder
public class Repair {
    //fields
    private LocalDate readyOn; //estimated time that the drone will be ready
    private LocalDate entred; //when the drone was entered to the lab
    private String memo; //some data about the drone
    private String sn; //Serial Number of the drone
    private boolean isImportent; //VIP person, tal edri
    private boolean poped; //show message when the drone is ready.
    private boolean isReady;

    @SneakyThrows
    public void checkTal(){
        throw new Exception("Tal is in the house");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repair repair = (Repair) o;
        return isImportent == repair.isImportent && poped == repair.poped && isReady == repair.isReady && Objects.equals(readyOn, repair.readyOn) && Objects.equals(entred, repair.entred) && Objects.equals(memo, repair.memo) && Objects.equals(sn, repair.sn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readyOn, entred, memo, sn, isImportent, poped, isReady);
    }
}
