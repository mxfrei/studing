package riliuchik.lab6_inheritance.taskA1;

//Создать иерархию классов, описывающих бытовую технику.
//Создать несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Lab6_taskA1 {
    public static void main(String[] args) {
        KitchenType refrigerator = new KitchenType("Холодильник", "Smeg", true, true);
        KitchenType microwave = new KitchenType("Микроволновка", "Bosch", false, true);
        Home vacuum = new Home("Пылесос", "Karcher", false);
        refrigerator.info();
        microwave.info();
        vacuum.info();
    }
}