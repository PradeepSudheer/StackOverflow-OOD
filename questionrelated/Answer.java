package questionrelated;
import users.Member;
import util2.Photo;

import java.util.Date;
import java.util.List;

public class Answer {
	  private String answerText;
	  private boolean accepted;
	  private int voteCount;
	  private int flagCount;
	  private Date creationTime;

	  private Member creatingMember;
	  private List<Photo> photos;

	  public boolean incrementVoteCount() { return false; }
}
