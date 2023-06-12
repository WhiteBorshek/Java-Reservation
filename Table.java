package JavaTable;

import java.util.Collection;
import java.util.Date;
import java.util.ArrayList;

public class Table {
    private int no;
    private Collection<Reservation> reservations;

    public Table(int no) {
        this.no = no;
        this.reservations = new ArrayList<>();
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return "Столик{" +
                "Номер=" + no +
                ", Зарезервирован=" + reservations +
                '}';
    }
}