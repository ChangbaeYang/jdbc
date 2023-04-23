package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection; // jdbc가 제공하는 표준 인터페이스 커넥션
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;

@Slf4j
public class DBConnectionUtil {

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get connection={}, class={}", connection, connection.getClass());
            // 객체 정보와 클래스 정보를 가져오기
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
