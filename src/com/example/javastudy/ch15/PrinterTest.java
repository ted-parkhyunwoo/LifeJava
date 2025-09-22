package com.example.javastudy.ch15;

interface Printer {
    abstract void print();
}


class DotPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("dot printer로 출력");
    }
}


class LaserPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("laser printer로 출력");
    }
}


class PrinterClient {
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public Printer getPrinter() {
        return this.printer;
    }

    public void usePrinter() {
        printer.print();
    }
}


public class PrinterTest {

    public static void main(String[] args) {
        PrinterClient client = new PrinterClient();
        client.setPrinter(new DotPrinter());
        client.usePrinter();
        // TODO: PrinterClient가 LaserPrinter를 사용하도록 변경해보세요.
        // END:
    }

}
