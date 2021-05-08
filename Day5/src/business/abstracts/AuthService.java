package business.abstracts;

import entities.concretes.User;

public interface AuthService {
 boolean login(User user);
 void register(User user);
}
