public class MoveRobot {
    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection connection = null;
        int attempts = 0;
        while (attempts < 3) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                attempts = 3;
            } catch (RobotConnectionException e) {
                attempts++;
                if (attempts == 3) {
                    throw new RobotConnectionException("Failed to connect after 3 attempts", e);
                }

            } finally {
                try {
                    connection.close();
                } catch (Exception e) {

                }
            }

        }

    }
}

