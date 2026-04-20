package service;

import exceptions.InvalidGateException;
import models.*;
import repository.GateRepository;
import repository.ParkingLotRepo;
import repository.TIcketRepo;
import repository.VehicleRepo;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private ParkingLotRepo parkingLotRepo;
    private VehicleRepo vehicleRepo;
    private TIcketRepo tIcketRepo;

    public TicketService(GateRepository gateRepository,
                         ParkingLotRepo parkingLotRepo,
                         VehicleRepo vehicleRepo,
                         TIcketRepo tIcketRepo) {
        this.gateRepository = gateRepository;
        this.parkingLotRepo = parkingLotRepo;
        this.vehicleRepo = vehicleRepo;
        this.tIcketRepo = tIcketRepo;
    }

    public Ticket issueTicket(int gateId,
                              String numberPlate,
                              VehicleType vehicleType,
                              String ownerName,
                              int parkingLotId) {
        Optional<Gate> gateOptional = gateRepository.findByGateId(gateId);
        if(gateOptional.isEmpty()) {
            throw new InvalidGateException("Invalid gate id: "+gateId);
        }
        Gate gate = gateOptional.get();

        Optional<ParkingLot> parkingLotOptional = parkingLotRepo.findById(parkingLotId);
        if(parkingLotOptional.isEmpty()) {
            // create custom
            throw new RuntimeException("Invalid parking lot id: "+parkingLotId);
        }

        ParkingLot parkingLot = parkingLotOptional.get();

        // verify vehicle
        // get the vehicle
        // register the vehicle
        Optional<Vehicle> vehicleOptional = vehicleRepo.findByNumberPlate(numberPlate);
        Vehicle vehicle = null;
        if(vehicleOptional.isEmpty()) {
            // save the vehicle
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleType(vehicleType);
            newVehicle.setOwnerName(ownerName);
            newVehicle.setNumberPlate(numberPlate);
            vehicleRepo.save(newVehicle);
        }
        else {
            vehicle = vehicleOptional.get();
        }

        ParkingSlot parkingSlot = parkingLot
                .getSlotAssignmentStratgey()
                .assignSlot(parkingLot,vehicleType);

        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getCurrentOperator());
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);

        return tIcketRepo.save(ticket);
    }
}
