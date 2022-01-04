package design_pattern.decoretor;

public class JavaCollage {
    private String name;
    private JavaStudent javaStudent;

    public JavaCollage(String name, JavaStudent javaStudent) {
        this.name = name;
        this.javaStudent = javaStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JavaStudent getJavaStudent() {
        return javaStudent;
    }

    public void setJavaStudent(JavaStudent javaStudent) {
        this.javaStudent = javaStudent;
    }

    public void showDetail(){
        System.out.printf("Student name:%s learning java version %d in collage %s",
                javaStudent.getStudent().getName(),javaStudent.getJavaVersion(),getName());
    }
}
