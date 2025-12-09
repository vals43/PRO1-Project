package PRO1.server.DTO;

import java.time.LocalDate;

public class HabitLogResponse {

    private Long logId;
    private Long habitId;
    private boolean completed;
    private LocalDate logDate;

    public HabitLogResponse() {}

    public HabitLogResponse(Long logId, Long habitId, boolean completed, LocalDate logDate) {
        this.logId = logId;
        this.habitId = habitId;
        this.completed = completed;
        this.logDate = logDate;
    }

    public Long getLogId() { return logId; }
    public Long getHabitId() { return habitId; }
    public boolean isCompleted() { return completed; }
    public LocalDate getLogDate() { return logDate; }

    public void setLogId(Long logId) { this.logId = logId; }
    public void setHabitId(Long habitId) { this.habitId = habitId; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public void setLogDate(LocalDate logDate) { this.logDate = logDate; }
}
