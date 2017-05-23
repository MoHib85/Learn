package learn;


/**
 * Created by mohibmanva on 23/05/17.
 */

public class ClassDefNotFound {
    public static void main(String[] args) {

        try {
            Temporary object = new Temporary();
        } catch (Throwable e) {

        }
        Temporary object1 = new Temporary();
    }
}

class Temporary{
    private static int someAttribute = 1/0;
}
