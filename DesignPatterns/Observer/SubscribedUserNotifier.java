package Observer;

class SubscribedUserNotifier implements Observer {

    @Override
    public void notify(String post) {
        System.out.println("SubscribedUserNotifier: New post published :" + post);
    }
}
