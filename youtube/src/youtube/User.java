package youtube;

public class User {
	private String userId;
	private String userName;
	private String password;
	private YoutubeChannel youtubeChannel;
	
	public User() {
		super();
	}
	
	
	public User(String userId, String userName, String password, YoutubeChannel youtubeChannel) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.youtubeChannel = youtubeChannel;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public YoutubeChannel getYoutubeChannel() {
		return youtubeChannel;
	}
	public void setYoutubeChannel(YoutubeChannel youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
