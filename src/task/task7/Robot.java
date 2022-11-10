package task.task7;

/**
 * Класс создания робота
 */
public class Robot implements NewRobot {

    private String nameRobot;
    private HeadRobot nameHead;
    private BodyRobot nameBody;

    private RobotHeadManufacturingPlant createHead = new RobotHeadManufacturingPlant();
    private RobotBodyManufacturingPlant createBody = new RobotBodyManufacturingPlant();

    /**
     * Метод создания робота
     */
    @Override
    public void newRobot() {
        String[] nameRobot = {"Valli", "Mask", "Terminator", "Frendly", "Spaik",
                "Smoke", "Robocop", "F-88", "Tesla" };
        Robot[] robotCreate = new Robot[9];
        for (int i = 0; i < robotCreate.length; i++) {
            robotCreate[i] = new Robot(nameRobot[i], createHead.creatingHead(),
                    createBody.creatingBody());
            System.out.println(robotCreate[i]);
        }
    }

    public Robot() {

    }

    public Robot(String nameRobot, HeadRobot nameHead, BodyRobot nameBody) {
        this.nameRobot = nameRobot;
        this.nameHead = nameHead;
        this.nameBody = nameBody;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "Имя робота='" + nameRobot + '\'' +
                ", форма головы=" + nameHead +
                ", форма тела=" + nameBody +
                '}';
    }
}
