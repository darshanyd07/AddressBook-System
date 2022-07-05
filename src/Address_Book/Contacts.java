package Address_Book;
import java.util.*;
class contacts
{
    String firstname;
    String lastname;
    String city;
    String phoneNumber;
    public contacts(String firstname,String lastname,String city,String phoneNumber)
    {
        System.out.println("The Contact Details are as follows");
        this.firstname=firstname;
        this.lastname=lastname;
        this.city=city;
        this.phoneNumber=phoneNumber;

        System.out.println("Name of the contact is : "+this.firstname+" "+this.lastname);
        System.out.println("City is "+this.city);
        System.out.println("Phone number= "+this.phoneNumber);

    }
}