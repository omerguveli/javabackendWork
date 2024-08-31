package obsSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ayse", "0431031903", "trh");
        Teacher t2 = new Teacher("fahri", "1111","mat");
        Teacher t3 = new Teacher("armağan","980413","kim");
        Course tarih =new Course("tarih","101","trh");
        tarih.addTeacher(t1);
        Course matematik = new Course("matematik","102","mat");
        matematik.addTeacher(t2);
        Course kimya = new Course("kimya","103","kim");
        kimya.addTeacher(t3);
        Student s1 = new Student("tarih", "13", "21", tarih,matematik,kimya);
        s1.addBulkExamNote(100,30,50);
        s1.isPass();
    }
}
