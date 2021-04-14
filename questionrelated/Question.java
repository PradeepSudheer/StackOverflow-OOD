package questionrelated;
import enums.QuestionStatus;
import enums.QuestionClosingRemark;
import util2.*;
import users.Member;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Search {
	  private String title;
	  private String description;
	  private int viewCount;
	  private int voteCount;
	  private Date creationTime;
	  private Date updateTime;
	  private QuestionStatus status;
	  private QuestionClosingRemark closingRemark;

	  private Member askingMember;
	  private Bounty bounty;
	  private List<Photo> photos;
	  private List<Comment> comments;
	  private List<Answer> answers;

	  public boolean close() { return false; }
	  public boolean undelete() { return false; }
	  public boolean addComment(Comment comment) { return false; }
	  public boolean addBounty(Bounty bounty) { return false; }

	  public static List<Question> search(String query) {
	    return new ArrayList<>();
	  }	
}
