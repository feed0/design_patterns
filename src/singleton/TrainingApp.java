import java.util.ArrayList;
import java.util.List;

public class TrainingApp {

    // Only the class itself has permissions to its own attributes 
    private static TrainingApp instance;

    private List<String> trainingSessions;
    private List<String> trainers;
    private List<String> students;

    // Private constructor
    private TrainingApp() {
        trainingSessions    =   new ArrayList<>();
        trainers            =   new ArrayList<>();
        students            =   new ArrayList<>();
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
     * Student name, the exercise and the session length. 
     */
    public void createTrainingSession(String trainer, String student, String exercise, int duration) {
        String session = "Trainer: " + trainer + ", Student: " + student +
         ", Exercise: " + exercise + ", Duration: " + duration + " mins";
        trainingSessions.add(session);
    }

    // Manipulation
    public void addTrainer(String trainer) {
        trainers.add(trainer);
    }

    public void addStudent(String student) {
        students.add(student);
    }

    // Getters
    public List<String> getTrainingSessions() {
        return trainingSessions;
    }

    public List<String> getTrainers() {
        return trainers;
    }

    public List<String> getStudents() {
        return students;
    }

}