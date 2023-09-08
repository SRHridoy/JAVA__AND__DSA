public class Switch_Case {
    public static void main(String[] args) {
        //ControlFLowSwitch.Switch e case must dia lagbe...
        //Case Cant't be duplicate..
        //Case value must be constant...
        //Break dia must...

        int x = 10;
        switch(x)
        {
            case 10:
                System.out.println("Yes x = 10");
                break;
            // case 10:
            //     System.out.println("Dulicate");

            case 9:
                System.out.println("Yes x = 90");
                break;

            default:
                System.out.println("This is default");
        }
    }
}
