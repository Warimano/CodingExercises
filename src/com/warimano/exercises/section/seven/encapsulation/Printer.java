package com.warimano.exercises.section.seven.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 1 || tonerAmount > 100) return -1;
        if (this.tonerLevel + tonerAmount > 100) return -1;
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) pagesToPrint = (int) Math.ceil(pagesToPrint / 2f);
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
