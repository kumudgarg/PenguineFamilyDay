public class PenguineOutfitChargesImp implements PenguineOutfitCharges{

    public StitchesChargesAccordingToSeason stitchesChargesAccordingToSeason;

    public PenguineOutfitChargesImp(StitchesChargesAccordingToSeason stitchesChargesAccordingToSeason) {
        this.stitchesChargesAccordingToSeason = stitchesChargesAccordingToSeason;
    }

    public PenguineOutfitChargesImp() {

    }

    @Override
    public double totalChargesWithFestiveStichingCharges(int malePenguine, int femalePenguine, int babyPenguine) {
        double totalChargeOnOutfitsOfMalePenguine = StitchesChargesAccordingToSeason.MALEPENGUIN.StitchCharesWithFestiveHikes() * malePenguine;
        double totalChargeOnOutfitsOfFemalePenguine = StitchesChargesAccordingToSeason.FEMALEPENGUINE.StitchCharesWithFestiveHikes() * femalePenguine;
        double totalChargeOnOutfitsOfBabyPenguine = StitchesChargesAccordingToSeason.BABYPENGUINE.StitchCharesWithFestiveHikes() * babyPenguine;
        double totalChargeForAllOutfits = totalChargeOnOutfitsOfMalePenguine + totalChargeOnOutfitsOfFemalePenguine + totalChargeOnOutfitsOfBabyPenguine;
        if(totalChargeForAllOutfits > 1000) {
            double discount = (totalChargeForAllOutfits * 10) / 100;
            totalChargeForAllOutfits = totalChargeForAllOutfits - discount;
            return totalChargeForAllOutfits;
        }
        else if ( totalChargeForAllOutfits > 2000 ){
            double discount = (totalChargeForAllOutfits * 25) / 100;
            totalChargeForAllOutfits = totalChargeForAllOutfits - discount;
            return totalChargeForAllOutfits;
        }
        return totalChargeForAllOutfits;
    }

    @Override
    public double totalChargesWithNormalStichingCharges(int malePenguine, int femalePenguine, int babyPenguine) {
        double totalChargeOnOutfitsOfMalePenguine = StitchesChargesAccordingToSeason.MALEPENGUIN.StitchChargesWithNormalHikes() * malePenguine;
        double totalChargeOnOutfitsOfFemalePenguine = StitchesChargesAccordingToSeason.FEMALEPENGUINE.StitchChargesWithNormalHikes() * femalePenguine;
        double totalChargeOnOutfitsOfBabyPenguine = StitchesChargesAccordingToSeason.BABYPENGUINE.StitchChargesWithNormalHikes() * babyPenguine;
        double totalChargeForAllOutfits = totalChargeOnOutfitsOfMalePenguine + totalChargeOnOutfitsOfFemalePenguine + totalChargeOnOutfitsOfBabyPenguine;
        if(totalChargeForAllOutfits > 1000) {
            double discount = (totalChargeForAllOutfits * 10) / 100;
            totalChargeForAllOutfits = totalChargeForAllOutfits - discount;
            return totalChargeForAllOutfits;
        }
        else if ( totalChargeForAllOutfits > 2000 ){
            double discount = (totalChargeForAllOutfits * 25) / 100;
            totalChargeForAllOutfits = totalChargeForAllOutfits - discount;
            return totalChargeForAllOutfits;
        }

        return totalChargeForAllOutfits;
    }



}
