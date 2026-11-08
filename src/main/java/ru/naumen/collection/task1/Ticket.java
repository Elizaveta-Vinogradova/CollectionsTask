package ru.naumen.collection.task1;


import java.util.Objects;

/**
 * Билет
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Ticket {
    private long id;
    private String client;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj instanceof Ticket ticket){
            return ticket.id == this.id && Objects.equals(this.client, ticket.client);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.client);
    }
}
