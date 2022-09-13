import java.util.List;

public class CocheDB extends BBDD {
    BBDD bd = new BBDD();
    public void addCoche (Coche coche) {
        arrayCoches.add( coche );
    }

    public void deleteCoche ( Coche coche) {
        int index = arrayCoches.indexOf(coche);
        arrayCoches.remove(index);
    }
}
