package ContactService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	    @Test
	    void testContact() {
	        Contact contact = new Contact("1", "Cayman", "Casteel", "7277777777", "123 Candy Lane");
	        Assertions.assertEquals("1", contact.getContactID());
	        Assertions.assertEquals("Cayman", contact.getFirstName());
	        Assertions.assertEquals("Casteel", contact.getLastName());
	        Assertions.assertEquals("7277777777", contact.getPhone());
	        Assertions.assertEquals("123 Candy Lane", contact.getAddress());
	    }

	    @Test
	    void testContactInvalidID() {
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("01234567890", "Cayman", "Casteel", "7277777777", "123 Candy Lane");
	        });
	    }

	    @Test
	    void testContactInvalidFirstName() {
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("0", "CaymanCasteel", "Casteel", "7277777777", "123 Candy Lane");
	        });
	    }

	    @Test
	    void testContactInvalidLastNamer() {
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("0", "Cayman", "CaymanCasteel", "7277777777", "123 Candy Lane");
	        });
	    }

	    @Test
	    void testContactInvalidPhone() {
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("0", "Cayman", "Casteel", "72777777770", "123 Candy Lane");
	        });
	    }

	    @Test
	    void testContactInvalidAddress() {
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("0", "Cayman", "Casteel", "7277777777", "123 Candy Lane United States of America");
	        });
	    }
	}