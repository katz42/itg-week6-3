public class Main {
    enum DayOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

    public static void main(String[] args) {
        DayOfWeek i = DayOfWeek.Thursday;
        switch (i) {
            case Monday, Tuesday, Wednesday, Thursday, Friday -> System.out.println("Сегодня будний день");
            case Saturday, Sunday -> System.out.println("Сегодня суббота, это выходной день");
        }
    }
}