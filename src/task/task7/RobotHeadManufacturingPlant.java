package task.task7;

import java.util.Random;

/**
 * Завод создания головы робота
 */
public class RobotHeadManufacturingPlant {

    public HeadRobot creatingHead() {
        Random random = new Random();
        HeadRobot[] headRobots = HeadRobot.values();
        return headRobots[random.nextInt(headRobots.length)];
    }
}

