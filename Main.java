public class Main {
    public static void main(String [] args){
        
        ContactsManager myContactsManager = ne	w ContactsManager();

	// Create a new Contact
        // Contact object for friend1
        Contact contact1 = new Contact();
        contact1.name = "friend1";
        contact1.phoneNum = "0123-111-111-111";
        myContactsManager.addContact(contact1);

        // friend2
        Contact contact2 = new Contact();
        contact2.name = "friend2";
        contact2.phoneNum = "0123-222-222-222";
        myContactsManager.addContact(contact2);

        // friend3
        Contact contact3 = new Contact();
        contact3.name = "friend3";
        contact3.phoneNum = "0123-333-333-333";
        myContactsManager.addContact(contact3);

        // friend4
        Contact contact4 = new Contact();
        contact4.name = "friend4";
        contact4.phoneNum = "0123-444-444-444";
        myContactsManager.addContact(contact4);
        
        // Search for contact
        Contact result = myContactsManager.searchContact("friend3");
        System.out.println(result.name + ": " + result.phoneNum);
    }
}