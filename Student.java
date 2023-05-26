public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String StuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String StuNo, String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.StuNo=StuNo;
        this.classes=classes;
        this.c1=c1;
        
        this.c2=c2;
        
        this.c3=c3;
        
        this.average=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int sozluNote1, int sozluNote2, int sozluNote3){
        if(note1>=0&&note1<=100 && sozluNote1>=0&&sozluNote1<=100&&c1.sozluNoteOran>=0&&c1.sozluNoteOran<=1){
            this.c1.note=note1*(1-c1.sozluNoteOran)+sozluNote1*c1.sozluNoteOran;
        }
        if(note2>=0&&note2<=100&& sozluNote2>=0&&sozluNote2<=100&&c2.sozluNoteOran>=0&&c2.sozluNoteOran<=1){
            this.c2.note=note2*(1-c2.sozluNoteOran)+sozluNote2*c2.sozluNoteOran;;
        }
        if(note3>=0&&note3<=100&& sozluNote3>=0&&sozluNote3<=100&&c3.sozluNoteOran>=0&&c3.sozluNoteOran<=1){
            this.c3.note=note3*(1-c3.sozluNoteOran)+sozluNote3*c3.sozluNoteOran;;
        }
        
    }

    void isPAss(){
        this.average=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.average>=55){
            System.out.println("Hababam sınıfı uyanıyor.");
            isPass=true;
        }else
        System.out.println("Sınıfta kaldınız.");

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name +"Notu :"+ this.c1.note);
        System.out.println(this.c2.name +"Notu :"+ this.c2.note);
        System.out.println(this.c3.name +"Notu :"+ this.c3.note);
        System.out.println("Ortalamanız :"+this.average);
        
    }


    
}
