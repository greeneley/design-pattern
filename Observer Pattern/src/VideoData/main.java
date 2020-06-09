package VideoData;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoData videoData = new VideoData();
		EmailNotifier emailNotifier = new EmailNotifier(videoData);
		PhoneNotifier phoneNotifier = new PhoneNotifier(videoData);
		YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);

		videoData.set_title("I'm superman");
		videoData.videoDataChanged();

		System.out.println("=========================");
		videoData.deleteObserver(emailNotifier);
		videoData.videoDataChanged();
		System.out.println("=========================");
		videoData.set_description("Description");
		videoData.videoDataChanged();

	}

}
