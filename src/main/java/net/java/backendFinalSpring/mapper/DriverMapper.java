package net.java.backendFinalSpring.mapper;

import net.java.backendFinalSpring.dto.DriverDto;
import net.java.backendFinalSpring.entity.Driver;

public class DriverMapper {
    public static DriverDto mapToDriverDto(Driver driver){
        return new DriverDto(
                driver.getId(),
                driver.getFirstName(),
                driver.getLastName(),
                driver.getContactNumber(),
                driver.getEmail(),
                driver.getIdentityNumber(),
                driver.getLicenseCode(),
                driver.getStreetNumber(),
                driver.getHouseNumber(),
                driver.getCityOrTown(),
                driver.getProvince(),
                driver.getPostalCode()
        );
    }
    public static Driver mapToDriver(DriverDto driverDto){
        return new Driver(
                driverDto.getId(),
                driverDto.getFirstName(),
                driverDto.getLastName(),
                driverDto.getContactNumber(),
                driverDto.getEmail(),
                driverDto.getIdentityNumber(),
                driverDto.getLicenseCode(),
                driverDto.getStreetNumber(),
                driverDto.getHouseNumber(),
                driverDto.getCityOrTown(),
                driverDto.getProvince(),
                driverDto.getPostalCode()
        );

    }
}
