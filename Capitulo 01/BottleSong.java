public class BottleSong {
    public static void xmain(String[] args) {
        
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum < 0) {

            if (bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + "green" + word + ", hanging on the wall");
            System.out.println(bottlesNum + "green" + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidantally fall,");

            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0) {
                System.out.println("There'll be" + bottlesNum + "green" + word + ", hanging on the will");
            } else {
                System.out.println("There'll be no green botlles, hanging on the wall");
            }
        }
    }
}
