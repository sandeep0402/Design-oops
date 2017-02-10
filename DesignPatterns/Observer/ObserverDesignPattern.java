package Observer;

/*
 * Observer Design Pattern
 * http://javabypatel.blogspot.in/2016/06/observer-design-pattern-java.html
 */
public class ObserverDesignPattern {

    public static void main(String[] args) {
        SocialMediaNotifier socialMediaNotifier = new SocialMediaNotifier();
        SubscribedUserNotifier subscribedUserNotifier = new SubscribedUserNotifier();

        BlogPost blogPost = new BlogPost();
        blogPost.addObserver(socialMediaNotifier);
        blogPost.addObserver(subscribedUserNotifier);

        blogPost.newPost("HelloPost");
    }
}
