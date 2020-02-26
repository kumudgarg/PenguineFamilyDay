import java.util.Scanner;

public class PenguineOutfitChargesController {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalCharge;
        PenguineOutfitCharges penguineOutfitCharges = new PenguineOutfitChargesImp();
        int choice = 1;
        System.out.println("what CategoryType penguine outfits Charges u want : \n "  + " 1. Normal \n " + " 2. Festive ");
        choice = sc.nextInt();
        System.out.println("Insert no. of male penguine");
        int malePenguine = sc.nextInt();
        System.out.println("Insert no. of female penguine");
        int femalePenguine = sc.nextInt();
        System.out.println("Insert no. of bay penguine");
        int babyPenguine = sc.nextInt();
        switch (choice) {
            case 1:
                totalCharge =  penguineOutfitCharges.totalChargesWithNormalStichingCharges(malePenguine, femalePenguine, babyPenguine);
                System.out.println("total Charge on outfits are : " +  totalCharge);
                break;
            case 2:
                totalCharge = penguineOutfitCharges.totalChargesWithFestiveStichingCharges(malePenguine, femalePenguine, babyPenguine);
                System.out.println("total Charge on outfits are : " +  totalCharge);
                break;
        }
    }


}
