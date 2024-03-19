package net.java.backendFinalSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;
    private String identityNumber;
    private String licenseCode;
    private String streetNumber;
    private String houseNumber;
    private String cityOrTown;
    private String province;
    private String postalCode;
}

