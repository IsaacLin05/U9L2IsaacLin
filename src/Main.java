public class Main {
    public static void main(String[] args) {
       Home person1 = new Home("John", 14);
       person1.leaveHome();
       person1.returnHome();
       System.out.println("");

       Play person2 = new Play("Timmy", 12, 0);
       person2.leaveHome();
       person2.returnHome();
       person2.getFriends();
       person2.play();
        System.out.println("");

       Responsibility person3 = new Responsibility("Josh", 19, "Teacher");
       person3.leaveHome();
       person3.returnHome();
       person3.cleanHome();
       person3.work();
       person3.isAdult();
        System.out.println("");

    }
}
