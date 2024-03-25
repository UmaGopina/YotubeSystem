package youtube;

import java.util.ArrayList;
import java.util.List;

public class Subscriber extends User{
	List<YoutubeChannel> subscribedChannels;

	public Subscriber() {
		super();
		this.subscribedChannels=new ArrayList<YoutubeChannel>();
	}
	public Subscriber(String userId, String userName, String password, YoutubeChannel youtubeChannel) {
		super(userId,userName,password,youtubeChannel);
		this.subscribedChannels=new ArrayList<YoutubeChannel>();
	}
	
	public void SubscribeToAChannel(List<YoutubeChannel> listOfChannels) {
		listOfChannels.stream().forEach(i->{subscribedChannels.add(i);System.out.println("subscribed Succesfully to Channel-->"+" "+i.getChannelName());});
	}
	public void unSubscribedChannels(List<YoutubeChannel> listOfChannels) {
		listOfChannels.stream().forEach(i->{subscribedChannels.remove(i);System.out.println("Unsubscribed Succesfully to Channel-->"+" "+i.getChannelName());});
	}
	
	public void getNotificationWhenContantIsUploaded(YoutubeChannel youtubeChannel,Contant contant) {
		System.out.println("Hello Subscriber-->"+this.getUserName()+" this Kind Of Contant:"+contant.getContantType()+" "+contant.getMessage()+"is Uploaded in YoutubeChannelName-->"+" "+youtubeChannel.getChannelName());
	}
	
	
}
