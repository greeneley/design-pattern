package VideoData;

public class YoutubeNotifier implements IObserver {
	private Subject subject;
	public YoutubeNotifier(Subject subject) {
		this.subject = subject;
		this.subject.AttachObserver(this);
	}
	@Override
	public void notify(Subject subject, Object object) {
		// TODO Auto-generated method stub
		if (subject instanceof VideoData) {
			System.out.println("Notify all subscribers via Youtube with:" +
								"\n\t Name: " + ((VideoData) subject).get_title() +
								"\n\t Description: " + ((VideoData) subject).get_description() +
								"\n\t File Name: " + ((VideoData) subject).get_fileName());
		}
	}

}
