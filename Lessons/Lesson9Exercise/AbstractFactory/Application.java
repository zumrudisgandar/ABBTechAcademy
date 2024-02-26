public class Application {
    private Camera camera;
    private ApplicationStore appStore;

    public Application(PhoneFunctions function) {
        camera = function.createCamera();
        appStore = function.createApplicationStore();
    }

    public void save() {
        camera.save();
        appStore.save();
    }
}
