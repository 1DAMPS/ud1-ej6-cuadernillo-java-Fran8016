public class EJ13{
    public static void main(String[] args){
        final double IVA = 0.15;
        double sueldoBruto = 2000;
        double resultado = sueldoBruto * IVA;
        double resultadoFinal = sueldoBruto - resultado;
        System.out.println("En bruto cobras 2000 que en neto se te queda en " +resultadoFinal);
    }
}