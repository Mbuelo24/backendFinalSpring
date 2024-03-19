package net.java.backendFinalSpring.controller;

import lombok.AllArgsConstructor;
import net.java.backendFinalSpring.dto.DriverDto;
import net.java.backendFinalSpring.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/drivers")
public class DriverController {


    private DriverService driverService;
    //Nuild Add Employee REST API
      @PostMapping
    public ResponseEntity<DriverDto> createDriver(@RequestBody DriverDto driverDto){
   DriverDto savedDriver = driverService.createDriver(driverDto);
   return new ResponseEntity<>(savedDriver, HttpStatus.CREATED);
    }
    //Get Driver REST API
    @GetMapping("{id}")
    public ResponseEntity<DriverDto> getDriverById(@PathVariable("id") Long driverId){
      DriverDto driverDto = driverService.getDriverById(driverId);
      return ResponseEntity.ok(driverDto);
    }
    //Build Get All drivers REST API
    @GetMapping
    public ResponseEntity<List<DriverDto>> getAllDrivers(){
      List<DriverDto> drivers = driverService.getAllDrivers();
      return ResponseEntity.ok(drivers);
    }
    //Updated Driver
    @PutMapping("{id}")
    public ResponseEntity<DriverDto> updateDriver(@PathVariable("id") Long driverId,
                                                  @RequestBody DriverDto updatedDriver){
         DriverDto driverDto = driverService.updateDriver(driverId, updatedDriver);
         return ResponseEntity.ok(driverDto);
    }
//Build delete Employee Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDriver(@PathVariable("id") Long driverId){
          driverService.deleteDriver(driverId);
          return ResponseEntity.ok("Driver deleted Succesfully!");
    }

}
