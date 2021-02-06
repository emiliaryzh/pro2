package com.company;

public class Main {

    public static void main(String[] args) {
        Rigid surly = new Rigid();
        Hardtail cannondale = new Hardtail();
        Fullsuspension specialized = new Fullsuspension(12, "Specialized");

        specialized.print("Green");
        specialized.printToo("Specialized");
        specialized.printTooToo(93);
        specialized.displayColor();
        System.out.println();
    }
}
