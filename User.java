class User {
    String name;
    String address;
    int age;
    String mailid;

    User(String name, String address, int age, String mailid) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mailid = mailid;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Email: " + mailid);
    }
}