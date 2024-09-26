package Fundamentos; 

public class VariaveisConstantes
{
    public static void main(String[] args)
    {
        double raio = 3.4; //variável
        final double pi = 3.14159; //constante 

        double area = pi * raio * raio; 

        System.out.println(area);

        raio = 10; 
        area = pi * raio * raio;

        System.out.println("Area = " + area + "m2.");
    }
}