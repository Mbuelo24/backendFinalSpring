package net.java.backendFinalSpring.entity;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "drivers_details")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "email_id", nullable = false,unique = true)
    private String email;
    @Column(name = "identity_number")
    private String identityNumber;
    @Column(name = "license_code")
    private String licenseCode;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "city/town/suburb")
    private String cityOrTown;
    @Column(name = "province")
    private String province;
    @Column(name = "postal_code")
    private String postalCode;
}



