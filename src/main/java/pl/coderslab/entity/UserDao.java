package pl.coderslab.entity;

import org.mindrot.jbcrypt.BCrypt;

public class UserDao {
    //region Queries
    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String READ_USER_QUERY =
            "SELECT * FROM users user WHERE user.id = ?;";
    private static final String UPDATE_USER_QUERY =
            "UPDATE users SET username = ?, email = ?, password = ? WHERE id = ?;";
    private static final String DELETE_USER_QUERY =
            "DELETE FROM users WHERE user.id = ?;";
    //endregion

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

}
