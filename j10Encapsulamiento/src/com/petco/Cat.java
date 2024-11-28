package com.petco;


public class Cat {
    // Atributos privados
    private String nombre;
    private String colorPelaje;
    private int edad;
    private static final String MENSAJE = "Ahora tendrá una identificación con su información proporcionada";

    //Constructores
    Cat()
    {
    	
    }
    
   Cat(String nombre,String colorPelaje,int edad)
   {
	   this.nombre=nombre;
	   this.colorPelaje=colorPelaje;
	   this.edad=edad;
   }

    // Método para imprimir información del gato
    public String imprimirInfo()
    {
        return "Tu gato se llama " + getNombre() + ", tiene " + getEdad() + " años y su pelaje es de color " + getColorPelaje();
    }

    // Método estático para imprimir un mensaje
    public static String imprimirMensaje()
    {
        return MENSAJE;
    }

    // Método no estático 'toString'
    public String toString()
    {
        return "Nombre " + nombre + "\nEdad: " + edad + "\nColor pelaje: " + colorPelaje;
    }

    // Getters y Setters
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getColorPelaje()
    {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje)
    {
        this.colorPelaje = colorPelaje;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if (edad >= 0) // Validación básica para la edad
        { 
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}