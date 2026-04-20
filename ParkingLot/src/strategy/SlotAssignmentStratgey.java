package strategy;

import models.ParkingLot;
import models.ParkingSlot;
import models.VehicleType;

public interface SlotAssignmentStratgey {

    ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
