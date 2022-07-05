package Address_Book;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook
{
    static Scanner sc = new Scanner(System.in);
    public void addContacts()
    {
        Contacts contact = new Contacts();
        System.out.println("enter the first name");
        String firstName=sc.next();
        contact.setFirstName(firstName);
        System.out.println("enter the last name");
        String lastName=sc.next();
        contact.setLastName(lastName);
        System.out.println("enter the email");
        String email=sc.next();
        contact.setEmail(email);
        System.out.println("enter the phone number");
        String phoneNumber=sc.next();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("enter the zip code");
        String zip=sc.next();
        contact.setZip(zip);
        System.out.println("enter the city name");
        String city=sc.next();
        contact.setCity(city);
        System.out.println("enter the name of the state");
        String state=sc.next();
        contact.setState(state);
        System.out.println("enter the address");
        String address=sc.next();
        contact.setAddress(address);
        System.out.println(contact.toString());
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book");
        AddressBook addressbook=new AddressBook();
        addressbook.addContacts();
        System.out.println("If You Want Add Contact Enter Yes Or No");
        String status =sc.next();
        if((status.equals("yes")))
        {
            addressbook.addContacts();
        }
        else
        {
            System.out.println("Bye......");
        }

    }
}
