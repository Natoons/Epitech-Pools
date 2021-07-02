import java.lang.reflect.*;

public class TestRunner<T> {
    
    @Test(name = "test1", enabled = true)
    public void runTests(Class<T> t){
        try {
            Method m[] = t.getDeclaredMethods();
            for(int i=0; i< m.length; i++){
                Test annotation = m[i].getAnnotation(Test.class);
                if(annotation!=null && annotation.enabled()){
                    System.out.println(annotation.name());
                    Constructor<T> ct = t.getConstructor();
                    T obj = ct.newInstance();
                    m[i].invoke(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}