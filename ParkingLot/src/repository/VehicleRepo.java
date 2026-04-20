package repository;

import models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepo {

    private final Map<Integer, Vehicle> vehiclesDb;
    private static int vehicleId = 0;

    public VehicleRepo() {
        this.vehiclesDb = new HashMap<>();
    }

    public Optional<Vehicle> findByNumberPlate(String numberPlate) {
        for(Vehicle vehicle: vehiclesDb.values()) {
            if(vehicle.getNumberPlate().equals(numberPlate)) {
                return Optional.of(vehicle);
            }
        }

        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
        vehiclesDb.put(++vehicleId,vehicle);
        return vehiclesDb.get(vehicleId-1);
    }
}

