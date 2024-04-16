public class Main {
    public static void main(String[] args) {

        int[][] a= {{1,6,5},{7,3,0},{1,5,7}};//Assumed Properties
        long stime = System.currentTimeMillis();
        for (int i = 0; i < 3; i++) {
            a[i][1]=0;//Assuming the attributes in the first column are undone
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);//Outputting the strategy after undoing
            }
        }
        long etime = System.currentTimeMillis();
        System.out.printf("execution time：%d ms.", (etime - stime));

    }
}