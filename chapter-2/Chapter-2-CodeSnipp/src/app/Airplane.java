package app;

// The inherting Subclass
class Airplane extends Vehicle {

    public static void main(String[] args) {
        Vehicle test = new Vehicle();
        test.type = "Airplane";
        test.year = "2009";
        test.horn = "This function is not available, while in the air";

        // Overridng the method honkhorn()
        test.honkhorn();

    }

}