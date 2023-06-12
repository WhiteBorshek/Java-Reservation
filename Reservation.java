package JavaTable;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private static int nextId = 1;

    private int id;
    private Date date;
    private String name;
    private int tableNo;

    public Reservation(Date date, String name, int tableNo) {
        this.id = nextId++;
        this.date = date;
        this.name = name;
        this.tableNo = tableNo;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    @Override
    public String toString() {
        return "Зарезеврирован{" +
                "Номер=" + id +
                ", дата=" + date +
                ", ФИО='" + name + '\'' +
                ", Номер столика=" + tableNo +
                '}';
    }
}
