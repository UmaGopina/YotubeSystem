package youtube;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		//Create DataBase for Youtube 
		//Consider u1 is maintaining the Channel and Hosting videos Okay!! ....u2,u3 Subscribed to channel u1
		Subscriber u1=new Subscriber("u1","Ram","Ram123",new YoutubeChannel("y1", "RamSeethaRam", new ArrayList<Subscriber>(), new ArrayList<Contant>()));
		Subscriber u2=new Subscriber("u2","Krishna","Krish123",new YoutubeChannel("y2", "RadhaKrishna",  new ArrayList<Subscriber>(), new ArrayList<Contant>()));
		Subscriber u3=new Subscriber("u3","Hanuman","Hanuman123",new YoutubeChannel("y3", "AnjanaDeviHanuman",  new ArrayList<Subscriber>(), new ArrayList<Contant>()));
		Subscriber u4=new Subscriber("u4","Shiva","Shiva123",new YoutubeChannel("y4", "ShivaParvathiDevi",  new ArrayList<Subscriber>(), new ArrayList<Contant>()));
		List<Subscriber> listOfSubscribers=new ArrayList<>();
		listOfSubscribers.add(u1);
		listOfSubscribers.add(u2);
		listOfSubscribers.add(u3);
		listOfSubscribers.add(u4);
		Youtube youtube=new Youtube(listOfSubscribers); 
		
		//Users --u2,u3 ---> Subsribing to u1
		//Correction I must have took Set DataType 
		youtube.subscribeToAChannel(u2, "y1");
		youtube.subscribeToAChannel(u3, "y1");
		
		//Upload Contant by User u1
		List<Contant> contantList=new ArrayList<Contant>();
		contantList.add(new Contant(ContantType.video,"Hello Busy ppl"));
		contantList.add(new Contant(ContantType.shot,"Shottyyyy MiniVlog"));
		youtube.UploadContantToYoutubeChannel("y1", contantList);
	}

}
