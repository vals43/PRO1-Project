package PRO1.server.DTO;

public class HabitLogRequest {

    private Long habitId;
    private boolean completed;

    public HabitLogRequest() {}

    public HabitLogRequest(Long habitId, boolean completed) {
        this.habitId = habitId;
        this.completed = completed;
    }

    public Long getHabitId() { return habitId; }
    public boolean isCompleted() { return completed; }

    public void setHabitId(Long habitId) { this.habitId = habitId; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
