package cz.czechitas.ukol3.model;

public class Pocitac {


    private boolean jeZapnuty;
    private Disk pevnyDisk;
    private Pamet ram;
    private Procesor cpu;

    public boolean jeZapnuty()  {
        return jeZapnuty;  }

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

    public void vypniSe() {
        if  (jeZapnuty())
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul");
    }

    @Override
    public String toString() {
        return "Pocitac" + "je zapnuty, pokud jsou nastaveny paramtery" + "pevny Disk +" + "ram +" + "cpu.";
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

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty()) {
            if (velikost > (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto())) {
                System.err.println("Nedostatek mista na disku");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Soubor pridan na disk, aktualni vyuzita kapacita je: " + pevnyDisk.getVyuziteMisto());
            }
        }
    }

    public void vymazSouborOVelikosti(long velikost) {
        if (jeZapnuty()) {
            if (velikost > pevnyDisk.getVyuziteMisto()) {
                System.err.println("Velikost souboru neodpovida");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Soubor z disku smazan, aktualni vyuzita kapacita je: " + pevnyDisk.getVyuziteMisto());
            }
        }
    }

}



