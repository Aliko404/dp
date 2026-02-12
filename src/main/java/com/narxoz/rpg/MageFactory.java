package com.narxoz.rpg;

public class MageFactory extends CharacterFactory {
    public Character createCharacter(String name) {
        return new Mage(name);}}
