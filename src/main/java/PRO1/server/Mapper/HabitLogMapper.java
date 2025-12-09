package PRO1.server.Mapper;

import PRO1.server.DTO.HabitLogRequest;
import PRO1.server.DTO.HabitLogResponse;
import PRO1.server.Model.Habit;
import PRO1.server.Model.HabitLog;

public class HabitLogMapper {

    // Convertit le DTO de requête en entité
    public static HabitLog toEntity(HabitLogRequest req, Habit habit) {
        HabitLog log = new HabitLog();
        log.setHabit(habit);
        return log;
    }

    // Convertit l'entité en DTO de réponse
    public static HabitLogResponse toDTO(HabitLog log) {
        return new HabitLogResponse(
                log.getLogId(),               // log_id
                (long) log.getHabit().getHabitId(),  // habit_id
                log.isCompleted(),            // completed
                log.getLogDate()              // log_date
        );
    }
}
