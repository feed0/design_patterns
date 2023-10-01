class AerobicsTrainee implements Trainee {
    
    private String name;

    public AerobicsTrainee(String name) {
        this.name = name + " (Aerobics)";
    } 

    @Override
    public String getName() {
        return name;
    }
    
}