package Observer;

class SocialMediaNotifier implements Observer {

    @Override
    public void notify(String post) {
        System.out.println("SocialMediaNotifier: New post published :" + post);
    }
}
