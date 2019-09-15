package Factory;

public abstract class Foo {

    public static FactoryInterface createType (Type type) {
      if (type == Type.TypeA) {
          return new TypeA();
      }

      if (type == Type.TypeB) {
          return new TypeB();
      }

      return null;
    };
}
