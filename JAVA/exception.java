public class exception {
    public static void main(String[] args) {
        try{int[] myArr = {5,6,7,8,9};
        System.out.println(myArr[7]);}
        catch(Exception e){
            System.out.println("something went wrong");}
        finally{
            System.out.println("try catch is finished");
        }

    }
}
