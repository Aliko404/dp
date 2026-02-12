package com.narxoz.rpg;

public class RangerFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new RangerWeapon();
    }

    public Armor createArmor() {
        return new RangerArmor();
    }
}
