package meyerspil;

public class Bæger {

    private Terning t1 = new Terning();
    private Terning t2 = new Terning();

    public Terning getT1() {
        return t1;
    }

    public Terning getT2() {
        return t2;
    }

    public void rystBæger() {
        t1.kast();
        t2.kast();

    }

    public int getVærdi() {
        if (t1.getAntalØjne() >= t2.getAntalØjne()) {
            return t1.getAntalØjne() * 10 + t2.getAntalØjne();
        } else {
            return t2.getAntalØjne() * 10 + t1.getAntalØjne();
        }

    }

    public String toString() {
        if (getVærdi() == 21) {
            return "Meyer";
        } else if (getVærdi() == 31) {
            return "Lille Meyer";
        } else if (t1.getAntalØjne() == t2.getAntalØjne()) {
            return "Par" + t1.getAntalØjne();
        }
        else return "Du slog: " + getVærdi(); 
    }

    
}
