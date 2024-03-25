package youtube;

import java.util.List;
import youtube.Contant;

public class YoutubeChannel {
	private String channelId;
	private String channelName;
	private List<Subscriber> subscribers;
	private List<Contant> contants;//can be videos or Shots
	
	
	
	public YoutubeChannel() {
		super();
	}
	public YoutubeChannel(String channelId, String channelName, List<Subscriber> subscribers, List<Contant> contants) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.subscribers = subscribers;
		this.contants = contants;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public List<Subscriber> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}
	public List<Contant> getContants() {
		return contants;
	}
	public void setContants(List<Contant> contants) {
		this.contants = contants;
	}
	
	
	
	//Add contant to YoutubeChannel
	public void addContantsToYoutubeChannel(List<Contant> contantss) {
		contantss.stream().forEach(i->AllContantAndNotifyToAllSubscribedUsers(i));
	}
	public void AllContantAndNotifyToAllSubscribedUsers(Contant c) {
		contants.add(c);
		subscribers.stream().forEach(i->i.getNotificationWhenContantIsUploaded(this, c));
	}
	
	//Add subsribers in biDirectional Way
	public void addSubscribers(Subscriber user) {
		subscribers.add(user);
	}
	public void removeSubscribers(Subscriber user) {
		subscribers.remove(user);
	}

}
