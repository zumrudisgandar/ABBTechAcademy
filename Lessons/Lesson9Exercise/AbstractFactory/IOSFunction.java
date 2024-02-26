public class IOSFunction implements PhoneFunctions{
    public Camera createCamera() {
        return new IOSCamera();
    }

    public ApplicationStore createApplicationStore() {
        return new IOSAppStore();
    }
}
