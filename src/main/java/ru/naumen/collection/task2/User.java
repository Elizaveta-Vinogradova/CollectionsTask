package ru.naumen.collection.task2;

import ru.naumen.collection.task1.Ticket;

import java.util.Arrays;
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
        if (this == obj) {
            return true;
        }
        else if (obj instanceof User user){
            return user.username.equals(this.username) && user.email.equals(this.email) && Arrays.equals(user.passwordHash, this.passwordHash);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.email, Arrays.hashCode(this.passwordHash));
    }
}
