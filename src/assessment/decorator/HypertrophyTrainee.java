class HypertrophyTrainee implements Trainee {
    
    private String name;

    public HypertrophyTrainee(String name) {
        this.name = name + " (Hypertrophy)";
    }

    @Override
    public String getName() {
        return name;
    }
    
}