package youtube;

import java.util.ArrayList;
import java.util.List;

public class Youtube {
	List<Subscriber> users;
	
	public Youtube(List<Subscriber> users) {
		super();
		this.users = users;
	}
	public List<Subscriber> getUsers() {
		return users;
	}
	public void setUsers(List<Subscriber> users) {
		this.users = users;
	}
	//Rules:
	//User should not be able to subscribe and Unsubcribe to his own youtube channel
	
	//Functinality
	//Notify to all the Subscribed Users when contant is uploaded in youtube channel
	public void UploadContantToYoutubeChannel(String channelId,List<Contant> contants) {
			YoutubeChannel youtubeChannel=findYoutubeChannelById(channelId);
			if(youtubeChannel!=null) {
				youtubeChannel.addContantsToYoutubeChannel(contants);
			}else {
				System.out.println("No such youtube channel is present in Youtube");
			}
		}
	
	//subscribe to youtube channel
	public void subscribeToAChannel(Subscriber user,String channelId) {
		if(!user.getYoutubeChannel().getChannelId().equalsIgnoreCase(channelId)) {
			YoutubeChannel youtubeChannel=findYoutubeChannelById(channelId);
			if(youtubeChannel!=null) {
				List<YoutubeChannel> listOfChannels=new ArrayList<YoutubeChannel>();
				listOfChannels.add(youtubeChannel);
				user.SubscribeToAChannel(listOfChannels);
				//Establishing Bidirectional Relationship
				youtubeChannel.addSubscribers(user);
			}else {
				System.out.println("No such youtube channel is present in Youtube");
			}
		}else {
			System.out.println("Cannot subscribe to same youtube channel");
		}
		
	}
	//unsubscribe to youtube channel
	public void unSubscribeToAChannel(Subscriber user,String channelId) {
		if(!user.getYoutubeChannel().getChannelId().equalsIgnoreCase(channelId)) {
			YoutubeChannel youtubeChannel=findYoutubeChannelById(channelId);
			if(youtubeChannel!=null) {
				List<YoutubeChannel> listOfChannels=new ArrayList<YoutubeChannel>();
				listOfChannels.add(youtubeChannel);
				user.unSubscribedChannels(listOfChannels);
				//Establishing Bidirectional Relationship
				youtubeChannel.removeSubscribers(user);
				
			}else {
				System.out.println("No such youtube channel is present in Youtube");
			}
		}else {
			System.out.println("Cannot unsubscribe to same youtube channel");
		}
		
	}
	
	private YoutubeChannel findYoutubeChannelById(String channelId) {
		for(int i=0;i<=users.size()-1;i++) {
			if(users.get(i).getYoutubeChannel().getChannelId().equalsIgnoreCase(channelId)) {
				return users.get(i).getYoutubeChannel();
			}
		}
		return null;
	}
}
