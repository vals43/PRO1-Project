package PRO1.server.DTO;

import PRO1.server.Enum.Frequency;
import java.time.LocalDateTime;

public record HabitResponse(
        int habitId,
        String name,
        Frequency frequency,
        LocalDateTime createdAt,
        int userId
) {}
