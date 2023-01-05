import java.util.Scanner;

interface zgadywarka {
    void start();
    int Zgadywana();
    void zaDuzo();
    void zaMalo();
    int kroki();
}

class zgadywanka implements zgadywarka {
    private int min;
    private int max;
    private int zgadywana;
    private int kroki;

    @Override
    public void start() {
        min = 0;
        max = 1000;
        kroki = 1;
    }

    @Override
    public int Zgadywana() {
        zgadywana = (min + max) / 2;
        return zgadywana;
    }

    @Override
    public void zaDuzo() {
        max = zgadywana - 1;
        kroki++;
    }

    @Override
    public void zaMalo() {
        min = zgadywana + 1;
        kroki++;
    }

    @Override
    public int kroki() {
        return kroki;
    }
}