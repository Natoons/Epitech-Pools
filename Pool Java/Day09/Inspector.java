import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Inspector<T> {
    Class<T> inspectedClass;

    public Inspector(Class<T> t) {
        inspectedClass = t;
    }

    public void displayInformations() {
        System.out.println("Information of the \"" + inspectedClass.getName() + "\" class:");
        System.out.println("Superclass: " + inspectedClass.getSuperclass().getName());
        System.out.println(inspectedClass.getDeclaredMethods().length + " methods:");
        for (int i = 0; i < inspectedClass.getDeclaredMethods().length; i++) {
            System.out.println("- " + inspectedClass.getDeclaredMethods()[i].getName());
        }
        System.out.println(inspectedClass.getDeclaredFields().length + " fields:");
        for (int i = 0; i < inspectedClass.getDeclaredFields().length; i++) {
            System.out.println("- " + inspectedClass.getDeclaredFields()[i].getName());
        }
    }

    public T createInstance() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor<T> ctor = inspectedClass.getConstructor();
        T object = ctor.newInstance();
        return object;
    }
}