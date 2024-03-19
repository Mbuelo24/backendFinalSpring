package net.java.backendFinalSpring.service;

import net.java.backendFinalSpring.dto.DriverDto;

import java.util.List;

public interface DriverService {
    DriverDto createDriver(DriverDto driverDto);

    DriverDto getDriverById(Long DriverId);
    List<DriverDto> getAllDrivers();

    DriverDto updateDriver(Long driverId, DriverDto updatedDriver);


    void deleteDriver(Long driverId);

}
