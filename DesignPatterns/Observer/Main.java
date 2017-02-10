package Observer;

/*
 * Observer Design Pattern
 * http://javabypatel.blogspot.in/2016/06/observer-design-pattern-java.html
 * In our example we will notify SocialMediaNotifier and SubscribedUserNotifier whenever a new post is published on BlogPost blog.  
SocialMediaNotifier and SubscribedUserNotifier will update post to necessary places. 
 */
public class Main {

    public static void main(String[] args) {
        SocialMediaNotifier socialMediaNotifier = new SocialMediaNotifier();
        SubscribedUserNotifier subscribedUserNotifier = new SubscribedUserNotifier();

        BlogPost blogPost = new BlogPost();
        blogPost.addObserver(socialMediaNotifier);
        blogPost.addObserver(subscribedUserNotifier);

        blogPost.newPost("HelloPost");
    }
}
