package ControlFLowSwitch;

class Switch {
    public static void main(String[] args) {
        int x = 20;
        
        switch(x)
        {
            case 10:
                System.out.println("Yes 10");
                break;
            case 100:
                System.out.println("Yes 100");
                break;
            default:
                System.out.println("Default");
        }
    }
}
