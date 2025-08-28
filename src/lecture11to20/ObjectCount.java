package lecture11to20;

public class ObjectCount {
    static int objectCount=0;

    public ObjectCount(){
        objectCount++;
    }

    public static void main(String[] args) {
      ObjectCount obj1 = new ObjectCount();
      ObjectCount obj2 = new ObjectCount();
      ObjectCount obj3 = new ObjectCount();
      System.out.println("Number of objects: "+objectCount);
    }
}
