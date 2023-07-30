public class methodOverloading {
    static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    static float max(float x, float y) {
        return (x > y) ? x : y;
    }

    static int max(int x, int y, int z) {
        return (x>y && x>z) ? x : (y>z ? y : z);
    }

    public static void main(String[] args) {
        System.out.println(max(10, 15));
        System.out.println(max(15.78F, 15.20F));
        System.out.println(max(10F, 8F));
        System.out.println(max(48, 54, 32));
    }
}