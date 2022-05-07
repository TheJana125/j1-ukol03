package cz.czechitas.ukol3;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Procesor;
import cz.czechitas.ukol3.model.Pocitac;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

            Pocitac janyPocitac;
            janyPocitac = new Pocitac();
            System.out.println(janyPocitac);
            
           // janyPocitac.zapniSe();

            Procesor janyProcesor = new Procesor();
            janyProcesor.setVyrobce("Intel");
            janyProcesor.setRychlost(1000_22000_613_0L);

            Pamet janyPamet = new Pamet();
            janyPamet.setKapacita(8_589_934_592L);

            Disk janyDisk = new Disk();
            janyDisk.setKapacita(511_101_108_224L);
            janyDisk.setVyuziteMisto(251_255_586_816L);

            janyPocitac.setCpu(janyProcesor);
            janyPocitac.setRam(janyPamet);
            janyPocitac.setPevnyDisk(janyDisk);


            janyPocitac.zapniSe();
            janyPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
            System.out.println(janyPocitac.toString());
            janyPocitac.vypniSe();

            janyPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
            janyPocitac.vypniSe();      // protoze pocitac je uz vypnuty
        }


    }

