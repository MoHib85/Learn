import java.util.ArrayList;

/**
 * Created by mohibmanva on 22/05/17.
 */

public class HashMap<Type,Type1> {
    private final int size = 100005;
    private ArrayList<Type1> value[] = new ArrayList[size];
    private ArrayList<Type>  key[] = new ArrayList[size];

    HashMap(){
        for(int i=0;i<size;i++){
            value[i] = new ArrayList<>();
            key[i] = new ArrayList<>();
        }
    }

    private int getHash(Type obj){
        int hash = obj.hashCode();
        if(hash<0){
            hash *= -1;
        }
        hash %= size;
        return hash;
    }

    public void put(Type Key,Type1 Value){
        int hash = getHash(Key);
        key[hash].add(Key);
        value[hash].add(Value);
    }

    public Type1 get(Type x){
        int hash = getHash(x);
        for(int i=0;i<key[hash].size();i++){
            if(key[hash].get(i).equals(x)){
                return value[hash].get(i);
            }
        }
        return null;
    }

    public void change(){
        System.out.println("Changed!!!! ;)");
    }

    public void secondChange(){
        System.out.println("Changed another!!!!");
    }
}
