public class DecoratorImpl {

    public static void main(String[] args) {

        // Make sure there's a TrainingApp instance
        TrainingApp app = TrainingApp.getInstance();
        
        // Create trainers
        app.addTrainer("Trainer 1");

        // Create trainees (with decorators)
        Trainee hypertrophyTrainee = new HypertrophyTrainee("Hypertrophy Trainee");
        Trainee aerobicsTrainee = new AerobicsTrainee("Aerobics Trainee");

        app.addTrainee(hypertrophyTrainee);
        app.addTrainee(aerobicsTrainee);

        // Create training sessions
        app.createTrainingSession("Trainer 1", hypertrophyTrainee, "Weightlifting", 45);
        app.createTrainingSession("Trainer 1", aerobicsTrainee, "Running", 30);

        // List out both training sessions
        System.out.println("Training Sessions:");

        List<String> sessions = app.listTrainingSessions();
        for (String session : sessions) {
            System.out.println(session);
        }

    }

}