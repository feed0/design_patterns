public class StrategyImpl {

    public static void main(String[] args) {
        
        // Define training strategies
        TrainingStrategy hypertrophyStrategy = new HypertrophyTrainingStrategy();
        TrainingStrategy aerobicsStrategy = new AerobicsTrainingStrategy();

        // Create trainees with their respective strategies
        Trainee hypertrophyTrainee = new HypertrophyTrainee("Hypertrophy Trainee", hypertrophyStrategy);
        Trainee aerobicsTrainee = new AerobicsTrainee("Aerobics Trainee", aerobicsStrategy);

        // Train trainees
        hypertrophyTrainee.train("Weightlifting", 45);
        aerobicsTrainee.train("Running", 30);
        
    }

}

// Define the TrainingStrategy interface
interface TrainingStrategy {
    void train(Trainee trainee, String exercise, int duration);
}

// Concrete implementations of HypertrophyTrainingStrategy and AerobicsTrainingStrategy
// Now, instead of defining the Hypertrophy session's length the attribute is weight in kg.
class HypertrophyTrainingStrategy implements TrainingStrategy {
    @Override
    public void train(Trainee trainee, String exercise, int weight) {
        System.out.println("Hypertrophy training for " + trainee.getName() + ": " + exercise + " for " + weight + " kgs");
    }
}

class AerobicsTrainingStrategy implements TrainingStrategy {
    @Override
    public void train(Trainee trainee, String exercise, int duration) {
        System.out.println("Aerobics training for " + trainee.getName() + ": " + exercise + " for " + duration + " mins");
    }
}