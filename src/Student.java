public class Student {
    String name;
    int max_credit;
    Lecture lectures[];
    int totalCredit;
    int remainingCredit;
    private int size;

    public Student(String name) {
        this.name = name;
        max_credit = 33;
        totalCredit = 0;
        remainingCredit = max_credit;
        lectures = new Lecture[10];
        size =0;
    }

    public Student(String name, int max_credit) {
        this.name = name;
        this.max_credit = max_credit;
        totalCredit = 0;
        remainingCredit = max_credit;
        lectures = new Lecture[10];
        size = 0;
    }
    public void addLecture(String lectureName,int credit){
        Lecture l = new Lecture(lectureName,credit);
        totalCredit += credit;
        remainingCredit -= credit;
        lectures[size++] = l;
    }
    public void listLectures(){
        for(int i=0;i<size;i++){
            System.out.println(i+1+" "+lectures[i]);
        }
        System.out.println("Total credit: "+totalCredit +
                "\nRemaining credit:"+remainingCredit);
    }
}
