public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigKilos = 5 * bigCount;
        if ((bigKilos + smallCount) < goal) {
            return false;
        }
        return goal % 5 == 0 || goal % 5 <= smallCount;
    }
}