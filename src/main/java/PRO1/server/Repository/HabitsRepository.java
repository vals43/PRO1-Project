package PRO1.server.Repository;

import PRO1.server.Model.Habit;
import PRO1.server.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitsRepository extends JpaRepository<Habit, Long> {

    List<Habit> findByUser(Users user);

}