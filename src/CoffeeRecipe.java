package machine;

public class CoffeeRecipe {

    public static final int REQUIRED_CUP = 1;

    static public class Espresso {
        public static final int ML_OF_WATER = 250;
        public static final int ML_OF_MILK = 0;
        public static final int G_OF_COFFEE_BEANS = 16;
        public static final int COSTS = 4;
    }

    static public class Latte {
        public static final int ML_OF_WATER = 350;
        public static final int ML_OF_MILK = 75;
        public static final int G_OF_COFFEE_BEANS = 20;
        public static final int COSTS = 7;
    }

    static public class Cappuccino {
        public static final int ML_OF_WATER = 200;
        public static final int ML_OF_MILK = 100;
        public static final int G_OF_COFFEE_BEANS = 12;
        public static final int COSTS = 6;
    }
}
