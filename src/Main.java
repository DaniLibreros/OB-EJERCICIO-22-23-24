public class Main {
    public static void main(String[] args) {
        CocheDB cochebd = new CocheDB();

        Toyota toyota = new Toyota("Toyota", "gasolina"," gris", 4, true);
        cochebd.addCoche( toyota );

        Kia kia = new Kia("kia", "electrico", "verde", 3);
        cochebd.addCoche( kia );

        cochebd.getArrayCoches();
        getPrices(cochebd);
        hadKitRoadCoches(cochebd);
    }

    public static void getPrices (CocheDB coches) {
        for (int i = 0; i < coches.arrayCoches.size(); i++) {
            System.out.println("Precio: " + coches.arrayCoches.get(i).getPrecioCoche() );
        }
    }

    public static void hadKitRoadCoches (CocheDB coches) {
        for (int i = 0; i < coches.arrayCoches.size(); i++) {
            System.out.println("Tiene Kit: " +  coches.arrayCoches.get(i).hadKitRoad() );
        }
    }
}