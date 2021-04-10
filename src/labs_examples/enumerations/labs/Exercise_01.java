package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        CurrentDirection userDirection = new CurrentDirection();
        userDirection.setStatus(Direction.NORTH);
        System.out.println(userDirection.getStatus());
        System.out.println("Is the user going North?");
        System.out.println(userDirection.isNorth());

        System.out.println(userDirection.getStatus().getDescription());
        Direction newDirection = Direction.EAST;
        System.out.println(newDirection.getDescription());
    }
}


class CurrentDirection{
    private Direction status;

    public boolean isNorth() {
        // COMPLETE SO THAT THIS RETURNS TRUE WHEN STATUS IS READY
        if(status == status.NORTH){
            return true;
        }else{
            return false;
        }

    }

    public void setStatus(Direction status){
        this.status = status;
    }

    public Direction getStatus(){
        return this.status;
    }

}

