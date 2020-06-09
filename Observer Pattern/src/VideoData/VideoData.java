package VideoData;

public class VideoData extends Subject {
	private String _title;
	private String _description;
	private String _fileName;
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public String get_fileName() {
		return _fileName;
	}
	public void set_fileName(String _fileName) {
		this._fileName = _fileName;
	}


	public void videoDataChanged() {
		notifyObservers(this, null);
	}
}
