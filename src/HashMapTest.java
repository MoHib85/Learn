import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mohibmanva on 22/05/17.
 */

public class HashMapTest {
    @Test
    public void test1(){
        HashMap<Long,String> hashmap = new HashMap<>();
        hashmap.put(2L,"Mohib");
        hashmap.put(3L,"Deepit");
        assertTrue(hashmap.get(2L).equals("Mohib") && !hashmap.get(3L).equals("deepti"));
    }

}