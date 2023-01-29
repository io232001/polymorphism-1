package it.develhope.polymorphism;

public class Start
{
    public static void main(String args[])
    {
        Animal animal=new Animal("Lion");
        animal.animalSound();
        animal.animalSound("high");
        animal.animalSound("low");
    }
    //non capisco perchè nonstate metta high o low non funzioni
}
