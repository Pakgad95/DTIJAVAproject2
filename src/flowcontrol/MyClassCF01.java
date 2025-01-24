package flowcontrol;

public class MyClassCF01 {
    //Control Flow/Control Statement
    //กลุ่มที่ 1 Selection / Condition (if, if-else, if-else-if, switch-case)
    public static void main(String[] args) {
        //พิสูจน์ครั้งเดียว จริงทำ เท็จไม่ทำ : if
        int a = 50;
        if (a > 35) {
            System.out.println("Hello....");
        }
        System.out.println("-----------------------");
        //พิสูจน์ครั้งเดียว จริงทำ เท็จก็ทำ : if-else
        String b = "xyz";
        if (b.equals("SAU")) {
            System.out.println("Southese Asia University");
        }else {
            System.out.println("No no no....");

        }
    }
}
