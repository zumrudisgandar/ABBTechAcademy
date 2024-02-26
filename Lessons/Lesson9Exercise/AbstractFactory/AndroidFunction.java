public class AndroidFunction implements PhoneFunctions{
    public Camera createCamera() {
        return new AndroidCamera();
    }

    public ApplicationStore createApplicationStore() {
        return new AndroidAppStore();
    }
}
