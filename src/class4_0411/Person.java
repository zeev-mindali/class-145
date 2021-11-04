package class4_0411;

public class Person {
    private String name;
    private int age;
    private String address;
    private String cellPhone;
    private boolean isMarried;
    private char gender;
    private boolean hasCar;
    private boolean houseOwner;
    private boolean isEmployed;
    private double salary;
    private String comments;
    private String eyeColor;
    private int height;
    private String languages;
    private boolean isCriminal;
    private boolean hasGlasses;
    private long childrens;

    //for fast creating getters and setters
    //windows user (poor=true) -> alt+insert
    //Mac user (Putin) -> cmd+N


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(boolean houseOwner) {
        this.houseOwner = houseOwner;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public boolean isCriminal() {
        return isCriminal;
    }

    public void setCriminal(boolean criminal) {
        isCriminal = criminal;
    }

    public boolean isHasGlasses() {
        return hasGlasses;
    }

    public void setHasGlasses(boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }

    public long getChildrens() {
        return childrens;
    }

    public void setChildrens(long childrens) {
        this.childrens = childrens;
    }
}
