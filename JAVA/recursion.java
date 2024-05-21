public class recursion {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
    }
    public static int sum(int start, int end) {
        if (start<end) {
            return start + sum(start+1, end);
        } else {
            return end;
        }
    }
}
