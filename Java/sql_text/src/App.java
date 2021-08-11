import java.sql.SQLException;

public class App {
    public static crud db_crud = new crud();

    public static void main(String[] args) throws SQLException {

        // insert three new rows
        db_crud.insert("Aryan", 30000);
        db_crud.insert("Robert", 40000);
        db_crud.insert("Jerry", 50000);
        String sql = "INSERT INTO employees(name, capacity) VALUES(%s,%d)";
        String sql_sentence = String.format(sql, "Juan", 110200);
        System.out.printf(sql_sentence);
        System.out.println();
        db_crud.selectAll();
        db_crud.conn.close();
    }
}