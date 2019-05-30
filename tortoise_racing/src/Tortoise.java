public class Tortoise {
    private static final int HOUR_IN_SECONDS = 3600;

    public static int[] race(int v1, int v2, int g) {
        if(v1 >= v2) {
            return null;
        }

        float x = v1/3600;
        float x2 = v2/3600;

        System.out.println(x);
        System.out.println(x2);

        int speedDifference = v2 - v1;

        int resultInSeconds = g * HOUR_IN_SECONDS / speedDifference;

        return new int[]{
                resultInSeconds / HOUR_IN_SECONDS,
                resultInSeconds % HOUR_IN_SECONDS / 60,
                resultInSeconds % HOUR_IN_SECONDS % 60,
        };
    }
}