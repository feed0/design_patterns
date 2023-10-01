public class SingletonImpl {
    
    public static void main(String[] args) {
        
        // Make sure the TrainingApp is set by using its getInstance() method  
        TrainingApp app1 = TrainingApp.getInstance();

        // A new training session
        app1.addTrainer("Trainer 1");
        app1.addTrainee("Trainee 1");
        app1.createTrainingSession("Trainer 1", "Student 1", "Push-up", 30);

        // A segunda instância será a mesma que a primeira
        TrainingApp app2 = TrainingApp.getInstance(); 
        System.out.println(app2.listTrainingSessions());
    }

}
