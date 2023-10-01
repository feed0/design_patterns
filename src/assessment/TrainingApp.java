import java.util.ArrayList;
import java.util.List;

public class TrainingApp {

    // Only the class itself has permissions to its own attributes 
    private static TrainingApp instance;

    private List<String> trainingSessions;
    private List<String> trainers;
    private List<String> trainees;

    // Private constructor
    private TrainingApp() {
        trainingSessions    =   new ArrayList<>();
        trainers            =   new ArrayList<>();
        trainees            =   new ArrayList<>();
    }

    /** THe only method to instantiate from other classes
     * Synch keyword prevents potential multithreaded environments to 
     * create instances concurrently.
     */
    public static synchronized TrainingApp getInstance() {
        if (instance == null)
            instance = new TrainingApp();
        return instance;
    }

    /** The main feature of the App: Training Sessions
     * Creates a new session, which consists of the Trainer name
     * Trainee name, the exercise and the session length. 
     */
    public void createTrainingSession(String trainer, String trainee, String exercise, int duration) {
        String session = "Trainer: " + trainer + ", Trainee: " + trainee +
         ", Exercise: " + exercise + ", Duration: " + duration + " mins";
        trainingSessions.add(session);
    }

    // Manipulation
    public void addTrainer(String trainer) {
        trainers.add(trainer);
    }

    public void addTrainee(String trainee) {
        trainees.add(trainee);
    }

    // Getters
    public List<String> getTrainingSessions() {
        return trainingSessions;
    }

    public List<String> getTrainers() {
        return trainers;
    }

    public List<String> getTrainees() {
        return trainees;
    }

}