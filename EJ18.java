/**Fran, 15/10/25,
 * este programa se usa para calcular el sueldo neto
 */
public class EJ18{
    public static void main(String[] args){
        final double IVA = 0.15;
        // Declaramos la constante del IVA
       /* hacemos los calculos
       necesarios*/
        double sueldoBruto = 2000;
        double resultado = sueldoBruto * IVA;
        double resultadoFinal = sueldoBruto - resultado;

        System.out.println("En bruto cobras 2000 que en neto se te queda en " +resultadoFinal);
    }
}