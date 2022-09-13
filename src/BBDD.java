import java.util.ArrayList;
import java.util.List;

public class BBDD {
    List<Coche> arrayCoches = new ArrayList<>();

    public void getArrayCoches (){
        for (int i = 0; i < arrayCoches.size(); i++) {
            System.out.println( i + ". " + arrayCoches.get(i).marca );
        }
    }

}

