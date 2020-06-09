package VideoData;

import java.util.ArrayList;


public class Subject {
	private ArrayList<IObserver> _observers = new ArrayList<IObserver>();
	public void AttachObserver(IObserver observer) {
		_observers.add(observer);
	}
	public void deleteObserver(IObserver observer) {
		_observers.remove(observer);
	}
	public void notifyObservers(Subject subject, Object arg) {
		for (int i = 0; i < _observers.size(); i++) {
			IObserver observer = (IObserver)_observers.get(i);
			observer.notify(subject, arg);
		}
	}
}
