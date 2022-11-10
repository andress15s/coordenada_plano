package modelo;

import java.util.Set;

public class Coordenada
{
    private double x;
    private double y;

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public String mostrarCoordenada()
    {
        return "Coordenada: ( " + x + " , " + y + " )" ;
    }

    public String CompararCoordenada(Coordenada p2)
    {
        String cadena;

        if(this.x==p2.getX())
        {
            if(this.y==p2.getY())
            {  
            cadena="\nLas coordenadas son iguales";
            }
            else
            {
                cadena="\nLas coordenadas NO son iguales";
            }
        }
        else
        {
            cadena="\nLas coordenadas NO son iguales";
        }
    
        return cadena;
    }

    public String calcularDistancia(Coordenada P2)
    {
        double Distancia;
        Distancia= Math.sqrt(Math.pow((P2.getX()-this.x), 2) + Math.pow((P2.getY()-this.y), 2));
        

        return "la distancia de los dos puntos es de : " + Distancia;
    }








}