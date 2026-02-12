package com.narxoz.rpg;

public class ArcherFactory extends CharacterFactory {
    public Character createCharacter(String name) {
        return new Archer(name);}}
