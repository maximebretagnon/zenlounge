package Data;
import java.util.List;

public interface DBInterface {

	public List<Object> selectRequest(String select, String from, String where);
}