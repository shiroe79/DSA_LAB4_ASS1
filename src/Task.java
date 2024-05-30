public class Task {
    private final String title;
    private final String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void markCompleted(){
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task: " +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed ;
    }
}
