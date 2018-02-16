package com.jodo.intro;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Module");
        Class<Welcome> cls=Welcome.class;
        Module mods=cls.getModule();
        String moduleName=mods.getName();
        System.out.format("Module name %s%n",moduleName);
    }
}
