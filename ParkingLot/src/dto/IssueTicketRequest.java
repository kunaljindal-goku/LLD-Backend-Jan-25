package dto;

import models.VehicleType;

public class IssueTicketRequest {

    private int gateId;
    private String numberPlate;
    private VehicleType vehicleType;
    private String ownerName;
    private int parkingLotId;

    public IssueTicketRequest(int gateId,
                              String numberPlate,
                              VehicleType vehicleType,
                              String ownerName,
                              int parkingLotId) {
        this.gateId = gateId;
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.parkingLotId = parkingLotId;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
