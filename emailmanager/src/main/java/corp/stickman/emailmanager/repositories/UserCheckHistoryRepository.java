package corp.stickman.emailmanager.repositories;

import corp.stickman.emailmanager.models.UserCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCheckHistoryRepository extends JpaRepository<UserCheckHistory, Integer> {
}
