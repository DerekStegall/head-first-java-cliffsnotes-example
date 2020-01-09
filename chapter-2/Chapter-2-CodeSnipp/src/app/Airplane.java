package app;

// The inherting Subclass
class Airplane extends Vehicle {

    // Overriding an inherited method
    public void honkhorn() {
        System.out.println(horn);
    }

    public static void main(String[] args) {
        Vehicle test = new Vehicle();
        test.type = "Airplane";
        test.year = "2009";
        test.horn = "This function is not available, while in the air";

        test.honkhorn();

    }

}