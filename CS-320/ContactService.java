package ContactService;

import java.util.List;
import java.util.ArrayList;

public class ContactService {
    private List<Contact> contacts;
    
    public ContactService() {
        this.contacts = new ArrayList<>();
    }
    
    public void addContact(Contact contact) {
        if (contact != null && contact.isValidContact()) {
            contacts.add(contact);
        }
    }
    
    public void deleteContact(String contactID) {
        contacts.removeIf(contact -> contact.getContactID().equals(contactID));
    }
    
    public void updateContactFirstName(String contactID, String newFirstName) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                contact.setFirstName(newFirstName);
                break;
            }
        }
    }
    
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }
}
