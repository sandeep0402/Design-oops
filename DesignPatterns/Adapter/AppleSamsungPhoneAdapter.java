package Adapter;

class AppleSamsungPhoneAdapter implements ApplePhone {

    private SamsungPhone samsung;

    public AppleSamsungPhoneAdapter(SamsungPhone samsung) {
        this.samsung = samsung;
    }

    @Override
    public void charge() {
        samsung.charge();
    }
}
