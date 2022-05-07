package cz.czechitas.ukol3.model;

public class Pocitac {

    public boolean jeZapnuty;

    private Disk pevnyDisk;
    private Pamet ram;
    private Procesor cpu;

    public void zapniSe() {
        if (cpu == null ) {
            System.err.println("Pocitac nema zadané parametry procesoru"); }
        if (ram == null ) {
            System.err.println("Pocitac nema zadane parametry pameti"); }
        if (pevnyDisk == null ) {
            System.err.println("Pocitac nema zadane parametry disku"); }
         else if (jeZapnuty()) {
            System.err.println("Pocitac je jiz zapnuty");
        } else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul");
        }
    }

    private boolean jeZapnuty() {
        return false;
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul");
        }
    }




    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk (Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
        }


    public Pamet getRam(){
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
        }


    public Procesor getCpu() {
        return cpu;

    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }
}



