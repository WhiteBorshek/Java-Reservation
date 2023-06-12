package JavaTable;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;

public class TableModel {
    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table(1));
            tables.add(new Table(2));
            tables.add(new Table(3));
            tables.add(new Table(4));
            tables.add(new Table(5));
        }
        return tables;
    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name, tableNo);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    public int changeReservationTable(int reservationId, int newTableNo) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationId) {
                    reservation.setTableNo(newTableNo);
                    return reservationId;
                }
            }
        }
        return -1;
    }

    public Reservation getReservationById(int reservationId) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationId) {
                    return reservation;
                }
            }
        }
        return null;
    }
}