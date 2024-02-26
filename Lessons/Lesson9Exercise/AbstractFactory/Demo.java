public class Demo {
    private static Application configureApp() {
        Application app;
        PhoneFunctions function;

        String osType = "iOS";
        if (osType.toLowerCase().contains("android")) {
            function = new AndroidFunction();
        } else {
            function = new IOSFunction();
        }

        app = new Application(function);
        return app;
    }

    public static void main (String[] args) {
        Application app = configureApp();
        app.save();
    }
}
