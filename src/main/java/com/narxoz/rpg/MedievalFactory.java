package com.narxoz.rpg;

public class MedievalFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new MedievalWeapon();
    }

    public Armor createArmor() {
        return new MedievalArmor();
    }
}
