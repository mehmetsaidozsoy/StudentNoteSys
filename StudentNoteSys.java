
public class StudentNoteSys {
    
public static void main(String[] args) {

    Teacher t1=new Teacher("Mahmut", "555", "TRH");
    Teacher t2=new Teacher("Graham Bell", "0000", "FZK");
    Teacher t3=new Teacher("Mehmet", "111", "BIY");
    
    Course tarih=new Course("Tarih", "101", "TRH",0.40);
    Course fizik=new Course("Fizik", "102", "FZK",0.20);
    Course biyoloji=new Course("Biyoloji", "103", "BIY",0.30);

    tarih.addTeacher(t3);
    fizik.addTeacher(t2);
    biyoloji.addTeacher(t3);
    
    Student s1=new Student("Said", "083", "4", fizik, tarih, biyoloji);
    s1.addBulkExamNote(60, 78, 50,90,60,75);
    s1.isPAss();
    
    Student s2=new Student("Necmi", "012", "5", tarih, fizik, biyoloji);
    s2.addBulkExamNote(50  , 30, 70,60,40,100);
    s2.isPAss();

    
}
}