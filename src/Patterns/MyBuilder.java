package Patterns;

public class MyBuilder {
    private final String lastName;
    private final String firstName;
    private final boolean isFemale;
    private String middleName;
    private String salutation;
    private String suffix;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isEmployed;
    private boolean isHomewOwner;

    public static class PersonBuilder {
        //обязателбные
        private final String lastName;
        private final String firstName;
        private final boolean isFemale;
        //необязательные
        private String middleName;
        private String salutation;
        private String suffix;
        private String streetAddress;
        private String city;
        private String state;
        private boolean isEmployed;
        private boolean isHomewOwner;

        public PersonBuilder(String lastName, String firstName, boolean isFemale) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.isFemale = isFemale;
        }

        public PersonBuilder middleName(String str) {
            middleName = str;
            return this;
        }

        public PersonBuilder salution(String str) {
            salutation = str;
            return this;
        }

        public PersonBuilder suffix(String str) {
            suffix = str;
            return  this;
        }

        public PersonBuilder streerAddress(String str) {
            streetAddress = str;
            return this;
        }

        public PersonBuilder city(String str) {
            city = str;
            return this;
        }

        public PersonBuilder state(String str) {
            state = str;
            return this;
        }

        public PersonBuilder isEmployed(boolean isEmploy) {
            isEmployed = isEmploy;
            return this;
        }

        public PersonBuilder isHomewBuilder(boolean isHomewOwn) {
            isHomewOwner = isHomewOwn;
            return this;
        }

        public MyBuilder buidl() {
            return new MyBuilder(this);
        }
    }

    private MyBuilder(PersonBuilder builder){
        lastName = builder.lastName;
        firstName = builder.firstName;
        isFemale = builder.isFemale;

        middleName = builder.middleName;
        salutation = builder.salutation ;
        suffix = builder.suffix;
        streetAddress = builder.streetAddress;
        city = builder.city;
        state = builder.state;
        isEmployed = builder.isEmployed;
        isHomewOwner = builder.isHomewOwner;
    }
}

