
package operaciones;

/**
 *
 * @ANA RHENALS
 */
public class OperacionesCal {
    
    public double resultado;

public double calSuma(double n1, double n2){
    resultado= n1 +n2;
    return resultado;
}
public double calResta(double n1, double n2){
    return n1 - n2;
   
}
public double multiplicacion(double multiplicando, double multiplicador)
 {
   double suma = 0;
   for (int i = 0; i < multiplicador; i++)
     {
       suma =(calSuma(suma, multiplicando));
     }
   return suma;
 }
public double division(double dividendo, double divisor)
 {
   double residuo = dividendo;
   int cociente = 0;
   while (residuo >= divisor)
     {
      residuo = calResta(residuo, divisor);
      cociente++;
     }
  return cociente; }
      

}
