package JavaTable;

import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();

        Collection<Table> tables = tableModel.loadTables();
        System.out.println("Список всех столиков:");
        for (Table table : tables) {
            System.out.println(table);
        }

        // Бронирование столов для всех клиентов
        Date reservationDate1 = new Date();
        int tableNo1 = 1;
        String name1 = "Семенов Д.О";
        int reservationId1 = tableModel.reservationTable(reservationDate1, tableNo1, name1);
        System.out.println("Столик успешно забронирован. Номер столика: " + reservationId1);


        Date reservationDate2 = new Date();
        int tableNo2 = 2;
        String name2 = "Петрова Я.Н.";
        int reservationId2 = tableModel.reservationTable(reservationDate2, tableNo2, name2);
        System.out.println("Столик успешно забронирован. Номер столика: " + reservationId2);

        Date reservationDate3 = new Date();
        int tableNo3 = 3;
        String name3 = "Леонидова А.П.";
        int reservationId3 = tableModel.reservationTable(reservationDate3, tableNo3, name3);
        System.out.println("Столик успешно забронирован. Номер столика: " + reservationId3);

        // Перебронирование столов для всех клиентов
        int newTableNo1 = 4;
        tableModel.changeReservationTable(reservationId1, newTableNo1);
        Reservation reservation1 = tableModel.getReservationById(reservationId1);
        System.out.println("Изначальный столик: " + tableNo1);
        System.out.println("Бронь столика " + reservationId1 + " изменена. Новый столик: " + newTableNo1);
        System.out.println("Дата: " + reservation1.getDate());
        System.out.println("Имя клиента: " + reservation1.getName());

        int newTableNo2 = 5;
        tableModel.changeReservationTable(reservationId2, newTableNo2);
        Reservation reservation2 = tableModel.getReservationById(reservationId2);
        System.out.println("Изначальный столик: " + tableNo2);
        System.out.println("Бронь столика " + reservationId2 + " изменена. Новый столик: " + newTableNo2);
        System.out.println("Дата: " + reservation2.getDate());
        System.out.println("Имя клиента: " + reservation2.getName());


        int newTableNo3 = 6;
        tableModel.changeReservationTable(reservationId3, newTableNo3);
        Reservation reservation3 = tableModel.getReservationById(reservationId3);
        System.out.println("Изначальный столик: " + tableNo3);
        System.out.println("Бронь столика " + reservationId3 + " изменена. Новый столик: " + newTableNo3);
        System.out.println("Дата: " + reservation3.getDate());
        System.out.println("Имя клиента: " + reservation3.getName());

    }
}