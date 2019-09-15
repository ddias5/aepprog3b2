package Builder;

public class FooClass {

    private String attributeA;
    private String attributeB;
    private String attributeC;

    @Override
    public String toString() {
        return new StringBuilder()
                .append(" Attribute A: " + attributeA )
                .append(" Attribute B: " + attributeB )
                .append(" Attribute C: " + attributeC )
                .toString();
    }

    public String getAttributeA() {
        return attributeA;
    }
    public void setAttributeA(String attributeA) {
        this.attributeA = attributeA;
    }
    public String getAttributeB() {
        return attributeB;
    }
    public void setAttributeB(String attributeB) {
        this.attributeB = attributeB;
    }
    public String getAttributeC() {
        return attributeC;
    }
    public void setAttributeC(String attributeC) {
        this.attributeC = attributeC;
    }

    public static FooBuilder builder() {
        return new FooBuilder();
    }

    public static class FooBuilder {
        private String attributeA;
        private String attributeB;
        private String attributeC;

        public FooBuilder withAttributeA(String attribute) {
            this.attributeA = attribute;
            return this;
        }

        public FooBuilder withAttributeB(String attribute) {
            this.attributeB = attribute;
            return this;
        }

        public FooBuilder withAttributeC(String attribute) {
            this.attributeC = attribute;
            return this;
        }

        public FooClass build() {

            FooClass foo = new FooClass();

            if (this.attributeA != null) {
                foo.setAttributeA(this.attributeA);
            }

            if (this.attributeB != null) {
                foo.setAttributeB(this.attributeB);
            }

            if (this.attributeC != null) {
                foo.setAttributeC(this.attributeC);
            }

            return foo;
        }
    }


}
