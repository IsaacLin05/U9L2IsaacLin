public class Responsibility extends Home {

    private String name;
    private int Age;
    private boolean hasCleaned;
    private boolean hasCooked;
    private boolean workDone;
    private boolean isAdult;
    private String job;

    public Responsibility(String name, int Age, String job) {
        super(name, Age);
        this.name=name;
        this.Age=Age;
        if (Age > 18) {
            isAdult = true;
        } else {
            isAdult = false;
        }
        this.job=job;
    }

    public void cleanHome() {
        if (hasCleaned = true) {
            System.out.println(name + " has already cleaned their home.");
        } else {
            System.out.println(name + "'s home has been cleaned.");
            hasCleaned = true;
        }
    }

    public boolean isCleaned() {
        return hasCleaned;
    }

    public void work() {
        if (workDone = false) {
            System.out.println(name + " has finished their work.");
            workDone = true;
        } else {
            System.out.println(name + "'s work is done here.");
        }
    }

    public boolean workDone() {
        return workDone;
    }

    public void isAdult() {
        if (isAdult = true) {
            System.out.println(name + "Are you really sastified with just your current salary?");
        } else {
            System.out.println("Don't waste your youth!");
        }
    }


}
