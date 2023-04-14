class missing_ap {
    public static void main(String[] args) {
        int[] ap = { 2, 4, 8, 10, 12, 14 };
        int d = Math.min(ap[1] - ap[0], ap[2] - ap[1]);
        for (int i = 0; i < ap.length - 1; i++) {
            if ((ap[i] + d) != ap[i + 1]) {

                System.out.print(ap[i] + d);
            }

        }
    }
}
/* Advanced Solutin is Using Binary Search */
