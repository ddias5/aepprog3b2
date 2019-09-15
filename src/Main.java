import Builder.FooClass;
import Factory.FactoryInterface;
import Factory.Foo;
import Factory.Type;
import Observer.FooClassObserver;

public class Main {

    public static void main(String[] args) {

        // Factory
        Foo.createType(Type.TypeA).printType();
        Foo.createType(Type.TypeB).printType();

        // Builder
        System.out.println(FooClass.builder()
                .withAttributeA("A VALUE")
                .withAttributeB("B VALUE")
                .build().toString());

        // Observer
        FooClassObserver fooClassObserver = new FooClassObserver();
        fooClassObserver.getNotifications().add(() -> {System.out.println("Notificou!");});
        fooClassObserver.getNotifications().get(0).notifica();
    }
}
