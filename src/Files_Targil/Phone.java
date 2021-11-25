package Files_Targil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Phone {
    public final int SUM = -1;

    private String phone;
    private String owner;
    private int sum = SUM;

    public Phone(String phone, String owner, int sum) {
        this.phone = phone;
        this.owner = owner;
        this.sum = sum;
    }

    public Phone(String phone, String owner) {
        this.phone = phone;
        this.owner = owner;
    }

    public Phone(Scanner input) {
        setData(input);
    }

    public Phone(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        setData(input);
        input.close();
    }

    private void setData(Scanner input) {
        //<0524213990><zeev><100>
        String data = input.nextLine();
        //0524213990><zeev><100
        data = data.substring(1, data.length() - 1);

        //[{0524213990},{zeev},{100}]
        //5,6,7,8 -> split(",") -> [5,6,7,8]
        this.phone = data.split("><")[0];
        this.owner = data.split("><")[1];
        this.sum = Integer.parseInt(data.split("><")[2]);
    }

    public int getSUM() {
        return SUM;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "SUM=" + SUM +
                ", phone='" + phone + '\'' +
                ", owner='" + owner + '\'' +
                ", sum=" + sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone1 = (Phone) o;
        return SUM == phone1.SUM && sum == phone1.sum && Objects.equals(phone, phone1.phone) && Objects.equals(owner, phone1.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SUM, phone, owner, sum);
    }

    public void save(PrintWriter pw) {
        StringBuilder sb = new StringBuilder();
        sb.append("<" + this.phone + ">");
        sb.append("<" + this.owner + ">");
        sb.append("<" + this.sum + ">");
        pw.println(sb);
    }

    public void save(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        save(pw);
        pw.close();
    }
}
