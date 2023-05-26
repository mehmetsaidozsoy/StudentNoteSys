public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    int sozluNote;
    double sozluNoteOran;

    Course(String name, String code, String prefix, double sozluNoteOran) {
        this.prefix=prefix;
        this.name = name;
        this.code = code;
        this.note = 0;
        this.sozluNote=0;
        this.sozluNoteOran=sozluNoteOran;
        

    }

    void addTeacher(Teacher teacher) {
        System.out.print(this.prefix);
        if (teacher.branch.equals(this.prefix)) {
            
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.!");
        }

    }

    void printTeacher() {
        this.teacher.print();

    }

}
