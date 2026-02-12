package com.narxoz.rpg;

public class MagicFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new MagicWeapon();
    }

    public Armor createArmor() {
        return new MagicArmor();
    }
}
