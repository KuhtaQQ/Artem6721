package by.academy.Homework.HW4;

public enum DayOfWeek {
    MONDAY, TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY,SUNDAY;
    public static DayOfWeek fromValue(int val) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.ordinal() == val - 1) {
                return day;
            }
        }
        throw new RuntimeException("Неверное значение" + val);
    }
}
