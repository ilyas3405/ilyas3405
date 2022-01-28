import java.lang.String;

public class Topics extends Object {


	
	public Topics(int topicid, String topicname, String topicwriter) {
		super();
		this.topicid = topicid;
		this.topicname = topicname;
		this.topicwriter = topicwriter;
	}
	
	public Topics() {
		// TODO Auto-generated constructor stub
	}
	
	int topicid;
	String topicname;
	String topicwriter;
	
	
	
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	public String getTopicwriter() {
		return topicwriter;
	}
	public void setTopicwriter(String topicwriter) {
		this.topicwriter = topicwriter;
	}
	
	
	
}
