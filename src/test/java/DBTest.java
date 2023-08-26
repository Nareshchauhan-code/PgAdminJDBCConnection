import java.sql.Connection;

public class DBTest {
    public static void main(String[] args) {
        DbFunctions db=new DbFunctions();
        Connection conn=db.connect_to_db("testdb","postgres","admin");
        db.read_data(conn,"customer");

    }
}
