package Feb2;

class CPU {
    double price;

    // nested class
    class Processor {

        // members of nested class
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM {

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.price = 12000;
        CPU.Processor processor = cpu.new Processor();
        processor.cores = 8d;
        processor.manufacturer = "Intel";
        System.out.println("Processer Manufacturer:: " + processor.manufacturer);
        System.out.println("Number of cores:: " + processor.cores);
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("CPU Price:: " + cpu.price);
        System.out.println("******************************************");
        CPU.RAM ram = cpu.new RAM();
        ram.manufacturer = "Courser";
        ram.memory = 6d;
        System.out.println("Ram Manufactuer:: " + ram.manufacturer);
        System.out.println("Ram Memory (GB):: " + ram.memory);
        System.out.println("Ram Clock Speed = " + ram.getClockSpeed());
    }
}
