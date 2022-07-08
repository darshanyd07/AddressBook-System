package Address_Book;
import Address_Book.Contact;

import java.util.Scanner;
public class AddressBook extends Contact
{
    String address, city, state;
    int zip;
    long phoneNo;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }
}
