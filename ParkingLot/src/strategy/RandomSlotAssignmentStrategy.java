package strategy;

import models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStratgey{
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor floor: parkingLot.getFloors()) {
            for(ParkingSlot slot: floor.getParkingSlots()) {
                if(slot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)
                && slot.getAllowedVehicleTypes().contains(vehicleType)) {
                    return slot;
                }
            }
        }

        return null;
    }
}
