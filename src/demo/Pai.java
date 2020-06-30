package demo;

public class Pai implements Comparable<Pai> {
    private int c;//花色
    private int n;//数字

    public Pai() {
    }

    public Pai(int c, int n) {
        this.c = c;
        this.n = n;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Pai{" + "c=" + c + ", n=" + n + '}';
    }

    @Override
    public int compareTo(Pai pai) {
        return this.getN() - pai.getN();
    }
}
