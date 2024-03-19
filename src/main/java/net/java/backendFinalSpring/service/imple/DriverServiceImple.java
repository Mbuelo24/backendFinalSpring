package net.java.backendFinalSpring.service.imple;

import lombok.AllArgsConstructor;
import net.java.backendFinalSpring.dto.DriverDto;
import net.java.backendFinalSpring.entity.Driver;
import net.java.backendFinalSpring.exception.ResourceNotFoundException;
import net.java.backendFinalSpring.mapper.DriverMapper;
import net.java.backendFinalSpring.repository.DriverRepository;
import net.java.backendFinalSpring.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DriverServiceImple implements DriverService {

    private DriverRepository driverRepository;

    @Override
    public DriverDto createDriver(DriverDto driverDto) {

        Driver driver = DriverMapper.mapToDriver(driverDto);
        Driver savedDriver = driverRepository.save(driver);
        return DriverMapper.mapToDriverDto(savedDriver);
    }

    @Override
    public DriverDto getDriverById(Long driverId) {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Driver does not exist with the given id : " + driverId));

        return DriverMapper.mapToDriverDto(driver);
    }

    @Override
    public List<DriverDto> getAllDrivers() {
       List<Driver> drivers = driverRepository.findAll();
        return drivers.stream().map((driver) -> DriverMapper.mapToDriverDto(driver))
                .collect(Collectors.toList());
    }

    @Override
    public DriverDto updateDriver(Long driverId, DriverDto updatedDriver) {

       Driver driver =  driverRepository.findById(driverId).orElseThrow(
                () -> new ResourceNotFoundException("Driver does not exist with given id: " + driverId)
        );
       driver.setFirstName(updatedDriver.getFirstName());
       driver.setLastName(updatedDriver.getLastName());
       driver.setContactNumber(updatedDriver.getContactNumber());
       driver.setEmail(updatedDriver.getEmail());
       driver.setIdentityNumber(updatedDriver.getIdentityNumber());
       driver.setLicenseCode(updatedDriver.getLicenseCode());
       driver.setStreetNumber(updatedDriver.getStreetNumber());
       driver.setHouseNumber(updatedDriver.getHouseNumber());
       driver.setCityOrTown(updatedDriver.getCityOrTown());
       driver.setProvince(updatedDriver.getProvince());
       driver.setPostalCode(updatedDriver.getPostalCode());

       Driver updatedDriverObj = driverRepository.save(driver);


        return DriverMapper.mapToDriverDto(updatedDriverObj);
    }

    @Override
    public void deleteDriver(Long driverId) {

        Driver driver =  driverRepository.findById(driverId).orElseThrow(
                () -> new ResourceNotFoundException("Driver does not exist with given id: " + driverId)
        );
        driverRepository.deleteById(driverId);
    }
}
