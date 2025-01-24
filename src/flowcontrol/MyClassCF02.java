package flowcontrol;

public class MyClassCF02 {
    public static void main(String[] args) {
        //พิสูจน์หลายครั้ง : if-else-if ใช้ได้ทุกกรณี
        int score = 75;

        if (score > 80){
            System.out.println("Grade A");
        }else if(score > 70){
            System.out.println("Grade B");
        }else if(score > 60){
            System.out.println("Grade C");
        }else if(score > 50){
            System.out.println("Grade D");
        }else{ //ไม่จำเป็นต้องมี if แต่มีก็ได้เผื่อมีอันที่ต้องพิสูจน์
            System.out.println("Grade F");
        }
        System.out.println("----------------------------------");
        //switch-case ใช้ได้เฉพาะพิสูจน์เท่ากันหรือไม่เท่านั้น และใช้ไม่ได้กับทศนิยม
        int basNumber = 84;
        switch (basNumber) {
            case 80 :
                System.out.println("Go to PATA");
                 break;
            case 81 :
                System.out.println("Go to Siriraj");
                break;
            case 84 :
                System.out.println("Go to Wat rai Khing");
                break;
            case 123 :
                System.out.println("Go to Central Pinklao");
                break;
            default:
                System.out.println("Do not have data TT");
        }
    }

}
