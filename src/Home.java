public class Home {
    private String name;
    private int Age;
    private boolean atHome;

    public Home(String name, int Age) {
        this.name=name;
        this.Age=Age;
        atHome=true;
    }
    public void leaveHome() {
        System.out.println(name + " has left their home.");
        atHome = false;
    }

    public boolean isAtHome() {
        return atHome;
    }

    public void returnHome() {
        if (atHome = false) {
            System.out.println(name + " is now back at home.");
        } else {
            System.out.println(name +" is already at home.");
        }
    }
}
