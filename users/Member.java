package users;
import questionrelated.Question;
import util1.Badge;
import util1.Tag;

import java.util.List;

public class Member {
	  private Account account;
	  private List<Badge> badges;

	  public int getReputation() {
		  return 0;
	  }
	  public String getEmail() {
		return "BoJack@horseman.com";  
	  }
	  public boolean createQuestion(Question question) {
		return false;  
	  }
	  public boolean createTag(Tag tag) {
		  return false;
	  }
}
