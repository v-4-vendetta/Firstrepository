public class PlanetClass {
    public static void main(String[] args) {
        //Güneş sistemindeki tüm gezegenleri listeleyen bir Gezegen sınıfı tasarlayın. Her gezegen, Güneş'e olan sıralama numarasını, uzaklığı, yarıçapı, dönme süresini içeren bilgileri içermelidir (kesin veriler gerekli değil).

        for (int i=0; i< Planets.values().length; i++)
        {
            System.out.println("Gezegen adı : " + Planets.values()[i].name());
            System.out.println("--------------------------------");
            System.out.println("Güneşe olan sıra numarası : " + Planets.values()[i].planetorderNo);
            System.out.println("Güneşe olan uzaklığı (km): " + Planets.values()[i].distances);
            System.out.println("Yarıçapı (km) : " + Planets.values()[i].radius);
            System.out.println("Dönme Süresi (yıl) : " + Planets.values()[i].rotation);
            System.out.println();
        }
    }

    public enum Planets {
        MERCURY(1, 57000000,2440,0.2),
        VENUS(2,110000000, 6052, 0.6),
        EARTH(3,148000000,6371, 1),
        MARS(4,230000000,3390, 1.8),
        JUPITER(5, 780000000,69911, 11.6),
        SATURN(6, 1438000000,58232, 29.5),
        URANUS(7, Long.parseLong("2970000000"),25362,84.1),
        NEPTUNE(8, Long.parseLong("4568000000"),24622, 164.8);
        private int planetorderNo;
        private long distances;
        private int radius;
        private double rotation;
        Planets(int orderNo, long distance, int planetRadius, double rotationPeriod) {
            this.planetorderNo = orderNo;
            this.distances = distance;
            this.radius = planetRadius;
            this.rotation = rotationPeriod;
        }

    }
}
