package ejecutable;

import modelo.Coordenada;

public class Test
{
    public static void main(String[] args) 
    {
        Coordenada c1 = new Coordenada(0, 0);
        c1.setX(0);
        c1.setY(0);

        Coordenada c2 = new Coordenada(1.3, 5.3);
        c2.setX(1.3);
        c2.setY(5.3);

        Coordenada c3 = c1;
        Coordenada c4 = c2;

    System.out.println(c1.mostrarCoordenada());
    System.out.println(c2.mostrarCoordenada());
    System.out.println(c3.mostrarCoordenada());
    System.out.println(c4.mostrarCoordenada());
    System.out.println(c2.CompararCoordenada(c3));
    System.out.println(c1.calcularDistancia(c2));


        


    }

}