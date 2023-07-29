package MCQ;

public abstract class Quest {
    private String name;
    int correct = 0;
    public int getScore(){
        int score = correct *100/10;
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
