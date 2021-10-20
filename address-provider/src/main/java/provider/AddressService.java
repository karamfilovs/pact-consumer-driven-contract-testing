package provider;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AddressService {

    public Address getAddress(String addressId) {

        Address address = new Address();

        address.setId(UUID.fromString(addressId));
        address.setAddressType1("billing"); //TODO: Renaming breaks all services because they all use it
        address.setStreet("Main Street");
        address.setNumber(123);
        address.setCity("Nothingville");
        address.setZipCode(54321);
        address.setState("Tennessee");
        address.setCountry("United States");
        address.setBreakTest("Alex"); //TODO: Additional field does not break anything because nobody is using it
        return address;
    }

    public void deleteAddress(String addressId) {

    }
}
