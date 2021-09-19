import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInterfaceView {

    private Controller controller = new Controller();

    public void runInterface() throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите имя города на русском: "
                    + "\n" + "Для выхода введите 0:");
            String city = scanner.nextLine();

            if (city.equals("0")) {
                break;
            }

            while (true) {

                System.out.println("\n"
                        +"Введите 1 для получения погоды на сегодня;" + "\n"
                        + "Введите 5 для прогноза на 5 дней;" + "\n"
                        + "Введите 2 для получения данных из базы данных;"
                        + "\n" + "Для выхода введите 0:");

                String command = scanner.nextLine();

                if (command.equals("1") || command.equals("5")) {
                    try {
                        controller.getWeather(command, city);
                    } catch (IOException | SQLException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                if (command.equals("2")) {
                    try {
                        controller.getWeather(command, city);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                }
                if (command.equals("0")) {
                    break;
                } else {
                    System.out.println("Погоду можно узнать только на 1 или 5 дней!");
                }
            }
            break;
        }
    }
}
