package it.develhope.polymorphism;
public class Animal
{
    public String animalName;
    public Animal(String animalName)
    {
        this.animalName=animalName;
    }
    public void animalSound()
    {
        System.out.println("Roarr!");
    }
    public void animalSound(String intensity)
    {
        if (intensity.equals("High"))
        {
            System.out.println("Roarrrrrrrr!");
        }
        else if (intensity.equals("Low"))
        {
            System.out.println("Roar");
        }else {
            System.out.println("Cannot reproduce");
        }
    }
}
