import java.util.Arrays;

class check_two_arrays_eql {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 1, 2, 3 };
        Arrays.sort(a, 0, a.length);
        Arrays.sort(b, 0, b.length);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i], "%d", b[i]);
        }

        if (Arrays.equals(a, b)) {
            System.out.println("Same.");
        } else {
            System.out.println("Not same.");
        }

    }

}
