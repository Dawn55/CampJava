package core.adapters;

import entities.concretes.User;

public class GoogleAuthManager {
 public boolean login(User user) {
	 System.out.println("google ile giriþ yapýldý");
	 return true;
 }
 public void register(User user) {
	 System.out.println("google ile kayýt olundu");
 }
}
