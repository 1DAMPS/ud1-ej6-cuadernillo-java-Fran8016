public class EJ16{
    public static void main(String[] args){
        short max = 30000;
        short max1= max *10;
        System.out.println(max1);
        //Es incompativle porque java hace la operacion en int y despues lo pasa a short pero desborda memoria
    }
}