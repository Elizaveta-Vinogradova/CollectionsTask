package ru.naumen.collection.task2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Дано:
 * <pre>
 * public class User {
 *     private String username;
 *     private String email;
 *     private byte[] passwordHash;
 *     …
 * }
 * </pre>
 * Нужно реализовать метод
 * <pre>
 * public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB);
 * </pre>
 * <p>который возвращает дубликаты пользователей, которые есть в обеих коллекциях.</p>
 * <p>Одинаковыми считаем пользователей, у которых совпадают все 3 поля: username,
 * email, passwordHash. Дубликаты внутри коллекций collA, collB можно не учитывать.</p>
 * <p>Метод должен быть оптимален по производительности.</p>
 * <p>Пользоваться можно только стандартными классами Java SE.
 * Коллекции collA, collB изменять запрещено.</p>
 *
 * См. {@link User}
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Task2
{

    /**
     * Возвращает дубликаты пользователей, которые есть в обеих коллекциях
     */
    public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB) {
        HashMap<User, Integer> duplicatesCollA = new HashMap<>();
        Set<User> users = new HashSet<>(collB);
        Set<User> result = new HashSet<>();
        for(User user : collA){
            duplicatesCollA.computeIfAbsent(user, k -> 0);
            duplicatesCollA.computeIfPresent(user, (k,v) -> v + 1);
            if (duplicatesCollA.get(user) > 1 && users.contains(user))
                result.add(user);
        }
        return result.stream().toList();
    }
}
