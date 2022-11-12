package task.task7;

import java.util.Random;

/**
 * Завод создания тела робота
 */
public class RobotBodyManufacturingPlant {

    public BodyRobot creatingBody() {
        Random random = new Random();
        BodyRobot[] bodyRobots = BodyRobot.values();
        return bodyRobots[random.nextInt(bodyRobots.length)];
    }
}


