public class Pizza {
    private final String breadType;
    private final Integer size;
    private final boolean hasKetchup;
    private final boolean extraCheese;
    private final boolean hasMushroom;
    private final boolean hasOlives;
    private final boolean hasChili;

    private Pizza(Builder builder){
        breadType = builder.breadType;
        size = builder.size;
        hasKetchup = builder.hasKetchup;
        extraCheese = builder.extraCheese;
        hasMushroom = builder.hasMushroom;
        hasOlives = builder.hasOlives;
        hasChili = builder.hasChili;
    }

    public String getBreadType() {
        return breadType;
    }

    public Integer getSize() {
        return size;
    }

    public boolean isHasKetchup() {
        return hasKetchup;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isHasMushroom() {
        return hasMushroom;
    }

    public boolean isHasOlives() {
        return hasOlives;
    }

    public boolean isHasChili() {
        return hasChili;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "breadType='" + breadType + '\'' +
                ", size=" + size +
                ", hasKetchup=" + hasKetchup +
                ", extraCheese=" + extraCheese +
                ", hasMushroom=" + hasMushroom +
                ", hasOlives=" + hasOlives +
                ", hasChili=" + hasChili +
                '}';
    }

    public static class Builder{
        private final String breadType;
        private final Integer size;
        private boolean hasKetchup;
        private boolean extraCheese;
        private boolean hasMushroom;
        private boolean hasOlives;
        private boolean hasChili;

        public Builder(String breadType, Integer size){
            this.breadType = breadType;
            this.size = size;
        }
        public Builder addKetchup(boolean hasKetchup){
            this.hasKetchup = hasKetchup;
            return this;
        }

        public Builder addExtraCheese(boolean extraCheese){
            this.extraCheese = extraCheese;
            return this;
        }

        public Builder addMushroom(boolean hasMushroom){
            this.hasMushroom = hasMushroom;
            return this;
        }

        public Builder addOlives(boolean hasOlives){
            this.hasOlives = hasOlives;
            return this;
        }

        public Builder addChili(boolean hasChili){
            this.hasChili = hasChili;
            return this;
        }
        public Pizza makeOrder(){
            Pizza pizza = new Pizza(this);
            return pizza;
        }
    }

}

