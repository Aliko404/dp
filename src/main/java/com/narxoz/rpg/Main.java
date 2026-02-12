package com.narxoz.rpg;

public class Main {
    public static void main(String[] args) {
        CharacterFactory warFact = new WarriorFactory();
        CharacterFactory mageFact = new MageFactory();
        CharacterFactory archFact = new ArcherFactory();

        Character war = warFact.createCharacter("Conan");
        Character mage = mageFact.createCharacter("Merlin");
        Character arch = archFact.createCharacter("Robin");

        EquipmentFactory medSet = new MedievalFactory();
        EquipmentFactory magSet = new MagicFactory();
        EquipmentFactory ranSet = new RangerFactory();

        war.setEquipment(medSet);
        mage.setEquipment(magSet);
        arch.setEquipment(ranSet);

        war.show();
        mage.show();
        arch.show();
    }
}
