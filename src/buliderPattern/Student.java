package buliderPattern;

/**
 *
 */
public class Student {

    //getters only, no setter
    private final String name;
    private final String pwd;
    private final int id;
    private final String email;
    private final String address;
    private final String phone;

    private Student(StudentBuilder sb) {
        this.name = sb.getName();
        this.pwd = sb.getPwd();
        this.id = sb.getId();
        this.email = sb.getEmail();
        this.address = sb.getAddress();
        this.phone = sb.getPhone();
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", pwd=" + pwd + ", id=" + id + ", email=" + email + ", address=" + address + ", phone=" + phone + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    //inner clase, have access to private student constructor 
    public static class StudentBuilder {

        private String name;
        private String pwd;
        private int id;
        private String email;
        private String address;
        private String phone;

        @Override
        public String toString() {
            return "StudentBuilder{" + "name=" + name + ", pwd=" + pwd + ", id=" + id + ", email=" + email + ", address=" + address + ", phone=" + phone + '}';
        }

        //mandatory fields
        public StudentBuilder(String name, String pwd) {
            this.name = name;
            this.pwd = pwd;
        }

        public Student build() {
            return new Student(this);
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * @return the pwd
         */
        public String getPwd() {
            return pwd;
        }

        /**
         * @param pwd the pwd to set
         */
        public StudentBuilder setPwd(String pwd) {
            this.pwd = pwd;
            return this;
        }

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        /**
         * @return the email
         */
        public String getEmail() {
            return email;
        }

        /**
         * @param email the email to set
         */
        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * @return the address
         */
        public String getAddress() {
            return address;
        }

        /**
         * @param address the address to set
         */
        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        /**
         * @return the phone
         */
        public String getPhone() {
            return phone;
        }

        /**
         * @param phone the phone to set
         */
        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

    }
}
