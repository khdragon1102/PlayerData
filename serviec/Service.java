package serviec;

import java.util.ArrayList;
import java.util.List;

//singleton
public class Service {
    private final List<Integer> list = new ArrayList<>();

    public void insert(int number){
        list.add(number);
    }


    private static Service instance = null;
    public static Service getInstance(){
        if (instance == null){
            instance = new Service();
        }

        return instance;
    }


}
