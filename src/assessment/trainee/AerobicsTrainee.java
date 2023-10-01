class AerobicsTrainee implements Trainee {
    
    private String name;
    private TrainingStrategy trainingStrategy;

    public AerobicsTrainee(String name, TrainingStrategy trainingStrategy) {
        this.name = name + " (Aerobics)";
        this.trainingStrategy = trainingStrategy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void train(String exercise, int duration) {
        trainingStrategy.train(this, exercise, duration);
    }
    
}