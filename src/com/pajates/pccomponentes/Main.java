package com.pajates.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("****PCComponentes****");

        //Procesador
        Procesador intel = new Procesador();
        intel.setId(1);
        intel.setMarca("Pentium i7");
        intel.setFabricante("Intel");

        System.out.println(intel.getId());
        System.out.println(intel.getMarca());
        System.out.println(intel.getFabricante());

        //PlacaBase
        PlacaBase gigabyte = new PlacaBase();
        gigabyte.setId(1);
        gigabyte.setMarca("B450");
        gigabyte.setModelo("V2");

        System.out.println(gigabyte.getId());
        System.out.println(gigabyte.getModelo());
        System.out.println(gigabyte.getMarca());


        //MemoriaRam
        MemoriaRam corsair = new MemoriaRam();
        corsair.setId(1);
        corsair.setMarca("MP2000");
        corsair.setModelo("540");
        corsair.setVelocidad("3200 MHZ");

        System.out.println(corsair.getId());
        System.out.println(corsair.getModelo());
        System.out.println(corsair.getMarca());

        //DiscoDuro
        DiscoDuro kingston = new DiscoDuro();
        kingston.setId(1);
        kingston.setMarca("T500");
        kingston.setTipo("2B");
        kingston.setCapacidad("1 TB");

        System.out.println(kingston.getId());
        System.out.println(kingston.getTipo());
        System.out.println(kingston.getMarca());
        System.out.println(kingston.getCapacidad());

    }
}