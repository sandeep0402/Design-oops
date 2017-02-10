package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * http://javabypatel.blogspot.in/2016/06/observer-design-pattern-java.html
 */
public class BlogPost implements Subject {

    private String post;
    private List<Observer> listOfObserver = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        listOfObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : listOfObserver) {
            observer.notify(post);
        }
    }

    public void newPost(String post) {
        this.post = post;
        notifyObservers();
    }
}
