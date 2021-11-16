package class4_0411;

public class MyStringBufferTester {
    public static void main(String[] args) {
        String myStory = "";
        myStory += "My name is zeev\n";
        myStory += "I live in qiryat yam";
        myStory += "I work in JohnBryce/Dronix/Amm Security";

        //test
        StringBuffer sb = new StringBuffer();
        sb.append("My name is zeev\n");
        sb.append("I live in qiryat yam\n");
        sb.append("I work in JohnBryce/Dronix/Amm Security\n");

        System.out.println(sb);
    }
}
