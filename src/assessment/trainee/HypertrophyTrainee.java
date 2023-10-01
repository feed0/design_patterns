class HypertrophyTrainee implements Trainee {
    
    private String name;
    private TrainingStrategy trainingStrategy;

    public HypertrophyTrainee(String name, TrainingStrategy trainingStrategy) {
        this.name = name + " (Hypertrophy)";
        this.trainingStrategy = trainingStrategy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void train(String exercise, int weight) {
        trainingStrategy.train(this, exercise, weight);
    }
    
}