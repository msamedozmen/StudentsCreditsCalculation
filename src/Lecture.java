public class Lecture {
    String name;
    int credit;

    public Lecture(String name, int credit) {
        this.name = name;
        this.credit = Math.max(0,credit);
    }

    @Override
    public String toString() {
        return name+", "+credit;
    }
}
