package design_pattern.decoretor;

public class JavaStudent {
    private Student student;
    private int javaVersion;

    public JavaStudent(Student student, int javaVersion) {
        this.student = student;
        this.javaVersion = javaVersion;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(int javaVersion) {
        this.javaVersion = javaVersion;
    }
}
