package PRO1.server.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "habit_log")
public class HabitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habit_id", nullable = false)
    private Habit habit;

    @Column(name = "completed", nullable = false)
    private boolean completed;

    @Column(name = "log_date", nullable = false)
    private LocalDate logDate = LocalDate.now();

    public HabitLog() {}

    public HabitLog(Habit habit, boolean completed) {
        this.habit = habit;
        this.completed = completed;
        this.logDate = LocalDate.now();
    }

    public Long getLogId() { return logId; }
    public Habit getHabit() { return habit; }
    public boolean isCompleted() { return completed; }
    public LocalDate getLogDate() { return logDate; }

    public void setCompleted(boolean completed) { this.completed = completed; }

    public void setHabit(Habit habit) {
        this.habit = habit;
    }
}
