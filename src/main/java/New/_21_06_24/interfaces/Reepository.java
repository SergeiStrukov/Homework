package New._21_06_24.interfaces;

import New._21_06_24.Contact;

import java.util.List;

public interface Reepository {
    List<Contact> readContact ();
    List<Contact> addContact();
}
