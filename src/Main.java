
public class Main {

    public static int unSet(int number, int index){
        return ((number & (1<<index)) == 0) ? number : (int)(number - Math.pow(2,index));
    }

    public static void main(String[] args) {
        System.out.println(unSet(5,2));
    }
}