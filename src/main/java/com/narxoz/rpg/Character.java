package com.narxoz.rpg;

public abstract class Character{
    protected String name;
    protected int hp;
    protected int power;
    protected Weapon weapon;
    protected Armor armor;

    public Character(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;}

    public void setEquipment(EquipmentFactory factory) {
        weapon = factory.createWeapon();
        armor = factory.createArmor();}

    public void show() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Power: " + power);
        if (weapon != null) {
            System.out.println("Weapon: " + weapon.getName()); }
        if (armor != null) {
            System.out.println("Armor: " + armor.getName()); }
        System.out.println("---------------------");}}