package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTesting {

    /*ROOM CLASS*/

    @Test
    public void ifIsOccupiedEqualsFalse_AndIfIsDirtyEqualsFalse_ThenIsAvailable_ReturnTrue(){
        // Arrange
        Room room = new Room();
        room.setOccupied(false);
        room.setDirty(false);

        // Act
        boolean result = room.isAvailable();

        // Assert
        //result if setIsOccupied = false and setIsDirty = false, return isAvailable = true
        assertTrue(result);
    }

    @Test
    public void ifIsOccupiedEqualsTrue_AndIfIsDirtyEqualsTrue_ThenIsAvailable_ReturnFalse(){
        // Arrange
        Room room = new Room();
        room.setOccupied(true);
        room.setDirty(true);

        // Act
        boolean result = room.isAvailable();

        // Assert
        //result if setIsOccupied = true and setIsDirty = true, return isAvailable = false
        assertFalse(result);
    }

    /*RESERVATION CLASS*/

    @Test
    public void ifIsWeekendEqualsTrue_GetReservationTotalPlus10Percent() {
        // Arrange
        Reservation reservation = new Reservation();
        reservation.setRoomType("king");
        reservation.setNumberOfNights(3);
        reservation.setWeekend(true);

        // Act
        double result = reservation.getTotal();

        // Assert
        // result = (Price * Number of Nights) * 1.10 (10% extra for weekend)
        assertEquals(363.0, result);
    }


    /*EMPLOYEE CLASS*/

    @Test
    public void payRate_TimesGetRegularHours_PlusGetOvertimeHours_EqualsGetTotalPay() {
        // Arrange
        // Ex: 45 hours worked
        Employee employee = new Employee(123, "Bob", "Service Associate", 20.0, 45);

        // Act
        double result = employee.getTotalPay();

        // Assert
        // result total pay after calculating regular and overtime pay
        assertEquals(950.0, result);
    }

    @Test
    public void ifHoursWorkedAbove40_ReturnGetRegularHours() {
        // Arrange
        // Ex: 45 hours worked
        Employee employee = new Employee(123, "Bob", "Service Associate", 20.0, 45);

        // Act
        int hoursWorked = employee.getRegularHours();

        // Assert
        // result if regular hours for the employee > 40 return 40
        assertEquals(40, regularHours);
    }

    @Test
    public void ifGetRegularHoursGreaterThan40_Substract40_ReturnReminder() {
        // Arrange
        // Ex: 45 hours worked
        Employee employee = new Employee(123, "Bob", "Service Associate", 20.0, 45);

        // Act
        double overtimeHours = employee.getOvertimeHours();

        // Assert
        // result if regular hours > 40, subtract 40 and return reminder
        assertEquals(5.0, overtimeHours);
    }


}


