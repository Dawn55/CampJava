package core.adapters;

import entities.concretes.User;

public class GoogleAuthManager {
 public boolean login(User user) {
	 System.out.println("google ile giri� yap�ld�");
	 return true;
 }
 public void register(User user) {
	 System.out.println("google ile kay�t olundu");
 }
}
