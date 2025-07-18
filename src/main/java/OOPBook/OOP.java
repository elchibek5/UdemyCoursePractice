package OOPBook;

public class OOP {
    public class Entry {
        private String name;
        private String number;

        public void setName(String person) {
            name = person;
        }
        public String getName() {
            return(name);
        }
        public void setNumber(String phone) {
            number = phone;
        }
        public String getNumber() {
            return(number);
        }
    }

    public class Contact {
        private String name;
        private String number;

        public Contact(String person, String phone) {
            name = person;
            phone = number;
        }

        Contact newContact = new Contact("Eric", "+123456789");
    }
}
