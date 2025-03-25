public class Webcam {
    static String name="Webcam";
    static String resolution="ZEB-Crystal Clear is a web camera with a 3P lens with a resolution of 640x480";
    static String features="The web camera also comes with a built-in microphone, and auto white balance, night vision feature, and a manual switch for LED";
    static String video="Video resolution 640 x 480 (30 FPS) Cable length 1.3 Meter";
    static String additional="Webcam Built-in microphone Automatic white balance Night vision Manual switch for LED";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Resolution "+resolution);
        System.out.println("Features "+features);
        System.out.println("Video "+video);
        System.out.println("Additional "+additional);
        System.out.println("AFTER UPDATE");
        name="Webcam Pro";
        resolution="ZEB-HD Crystal Pro is a web camera with a 5P lens with a resolution of 1280x720";
        features="The web camera also comes with a built-in microphone, auto focus, low light enhancement, and a privacy shutter";
        video="Video resolution 1280 x 720 (60 FPS) Cable length 2 Meter";
        additional="Webcam Built-in microphone Auto focus Low light enhancement Privacy shutter";
        System.out.println("name is "+name);
        System.out.println("Resolution "+resolution);
        System.out.println("Features "+features);
        System.out.println("Video "+video);
        System.out.println("Additional "+additional);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Resolution "+resolution);
        System.out.println("Features "+features);
        System.out.println("Video "+video);
        System.out.println("Additional "+additional);
    }
    public static void afterUpdate() {
        name="Webcam Pro";
        resolution="ZEB-HD Crystal Pro is a web camera with a 5P lens with a resolution of 1280x720";
        features="The web camera also comes with a built-in microphone, auto focus, low light enhancement, and a privacy shutter";
        video="Video resolution 1280 x 720 (60 FPS) Cable length 2 Meter";
        additional="Webcam Built-in microphone Auto focus Low light enhancement Privacy shutter";
    }
}
