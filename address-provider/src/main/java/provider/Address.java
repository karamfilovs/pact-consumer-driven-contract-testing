package provider;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data @NoArgsConstructor
public class Address {

    private UUID id;
    private String addressType1; //TODO: Remove 1 to fix the problem also fix the setter in the Address service
    private String street;
    private int number;
    private String city;
    private int zipCode;
    private String state;
    private String country;
    private String breakTest;
}
