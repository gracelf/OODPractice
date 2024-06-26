

package parkingLot;

import java.util.List;

/**
 *
 */
public abstract class Vehicle {
    //basic fields
    int id;
    String plateNum;
    VehicleType type;
    int spotNeeded;
    //components
    Level level;    
    List<ParkingSpot> ps; // use list, because 1 vehicle may take more than 1 spot

}
