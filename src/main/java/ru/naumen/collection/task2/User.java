package ru.naumen.collection.task2;

import java.util.Objects;

/**
 * Пользователь
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class User {
    private String username;
    private String email;
    private byte[] passwordHash;

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == User.class)
        {
            User user = (User) obj;
            return Objects.equals(this.email, user.email) && this.passwordHash == user.passwordHash && Objects.equals(user.username, this.username);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
