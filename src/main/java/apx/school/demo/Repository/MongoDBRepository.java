package apx.school.demo.Repository;
import apx.school.demo.Messages.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDBRepository extends MongoRepository<Message, String> {
}
