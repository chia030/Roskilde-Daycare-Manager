package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.Shift;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class WeeklyShiftsRepo {

    static Statement statement = Connector.connectRDAS();
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    static DateTimeFormatter weekdayFormatter = DateTimeFormatter.ofPattern("e");

    private List<Shift> shiftsList;

    public List fetchAllShifts() {

        String sql = "SELECT * FROM weekly_shifts";
        shiftsList = new ArrayList<>();

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {

                shiftsList.add(
                        new Shift(
                                res.getString("shift_id"),
                                res.getInt("class_id"),
                                LocalTime.parse(res.getString("start_time"), timeFormatter),
                                LocalTime.parse(res.getString("end_time"), timeFormatter),
                                LocalDate.parse(res.getString("day_of_week"), weekdayFormatter),
                                res.getInt("employee_id")
                        )
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return shiftsList;

    }

}
