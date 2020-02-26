public enum StitchesChargesAccordingToSeason {

    MALEPENGUIN(120.00){
        @Override
        public double StitchCharesWithFestiveHikes() {
            double stitchChargesHike = (normalStichesCharges * 5) / 100;
            double totalStitchChargesHike = stitchChargesHike + normalStichesCharges;
            return totalStitchChargesHike;
        }

        @Override
        public double StitchChargesWithNormalHikes() {
            return normalStichesCharges;
        }
    }, FEMALEPENGUINE(145.00) {
        @Override
        public double StitchCharesWithFestiveHikes() {
            double stitchChargesHike = (normalStichesCharges * 7) / 100;
            double totalStitchChargesHike = stitchChargesHike + normalStichesCharges;
            return totalStitchChargesHike;
        }

        @Override
        public double StitchChargesWithNormalHikes() {
            return normalStichesCharges;
        }
    }, BABYPENGUINE(70.00) {
        @Override
        public double StitchCharesWithFestiveHikes() {
            double stitchChargesHike = (normalStichesCharges * 3) / 100;
            double totalStitchChargesHike = stitchChargesHike + normalStichesCharges;
            return totalStitchChargesHike;
        }

        @Override
        public double StitchChargesWithNormalHikes() {
            return normalStichesCharges;
        }
    };

    public double normalStichesCharges;

    StitchesChargesAccordingToSeason(double v) {
        this.normalStichesCharges = v;
    }

    StitchesChargesAccordingToSeason() {
    }

    public abstract  double StitchCharesWithFestiveHikes();

    public abstract double StitchChargesWithNormalHikes();
}