package New.code.core.infrastructure;

import New.code.core.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private List<Contact> contacts;

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public boolean add(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact.clone());
            return true;
        }
        return false;
    }

    public boolean remove(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact.clone());
            return true;
        }
        return false;
    }

    public boolean contains(Contact contact) {
        return contacts.contains(contact);
    }

    public List<Contact> getAllContacts() {
        ArrayList<Contact> cont = new ArrayList<>();
        for (Contact contact : contacts) {
            cont.add(contact.clone());
        }
        return cont;
    }

    public Contact getContactByIndex(int index) {
        return contacts.get(index);
    }

    public int size() {
        return contacts.size();
    }

    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

}
