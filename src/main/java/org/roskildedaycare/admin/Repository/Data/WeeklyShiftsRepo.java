package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.Shift;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class WeeklyShiftsRepo {

    static Statement statement = Connector.connectRDAS();
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    static DateTimeFormatter weekdayFormatter = DateTimeFormatter.ofPattern("e");

    private static ArrayList<Shift> shiftsList;

    public static ArrayList<Shift> fetchAllShifts() {

//        checkInactive(); //shuffles in case someone is unavailable

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


    //REASSIGNS SHIFTS IN CASE SOMEONE IS INACTIVE
    public static void shuffleShift(int employee_id) {

        int new_id;

        // teacher 1-3 & 2-4 look after the same classes (groups)

        switch (employee_id) {
            case 1:
                new_id = 3;
                break;
            case 2:
                new_id = 4;
                break;
            case 3:
                new_id = 1;
                break;
            case 4:
                new_id = 2;
                break;
            default:
                new_id = 0;
        }

        String sql = "UPDATE weekly_shifts SET employee_id = '" + new_id + "' WHERE employee_id = '" + employee_id + "'";

        try {
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // RETURNS THE NAME OF A TEACHER WITH THE ARGUMENT ID
    public static String fetchTeacherName(int employee_id) {

        String sql = "SELECT * FROM staff WHERE employee_id = '" + employee_id + "'";

        try {

            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                return res.getString("name");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // RETURNS THE NAME OF THE TEACHER ASSIGNED TO THE ARGUMENT SHIFT
    public static String fetchAssignee(String shift_id) {

        String sql = "SELECT * FROM weekly_shifts WHERE shift_id = '" + shift_id + "'";

        try {

            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                return fetchTeacherName(res.getInt("employee_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
/*

  The original idea was to have an option in the settings that would allow the administrator to set a teacher as "inactive",
  whenever a teacher had to be away for any reason. As of now, a teacher is set as inactive when deleted, so that the schedule can be
  reshuffled with the available teachers.

  The weekly shift relies on the teachers who are currently in the database (on their IDs) and when someone is removed, it assigns
  the deleted teacher's shifts to another teacher who is watching after the same class.

  There is room for future improvement!

*/

//    public static void checkInactive() {
//
//        //fetchInactive() = if a TEACHER is inactive, returns their employee_id
//
//        if (EmployeesRepo.fetchInactive() != 0) {
//            String sql = "SELECT * FROM weekly_shifts WHERE employee_id ='"+EmployeesRepo.fetchInactive()+"'";
//            try {
//                ResultSet res = statement.executeQuery(sql);
//                while (res.next()) {
//                    shuffleShift(res.getInt("employee_id"));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
