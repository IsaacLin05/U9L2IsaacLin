public class Play extends Home {
    private String name;
    private int Age;
    private int Friends;
    private int timePlayed = 0;

    public Play(String name, int age, int Friends) {
        super(name, age);
        this.name=name;
        this.Age=age;
        this.Friends = Friends;
    }

    public void play() {
        System.out.println( name + " has played for an hour");
        timePlayed++;
        System.out.println("In total " + name + " has played for " + getTimePlayed() + " hours.");
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void getFriends() {
        if (Friends == 0) {
            System.out.println(name + " needs to get some friends.");
        } else {
            System.out.println( name + " has " + Friends + " friends.");
        }
    }


}
