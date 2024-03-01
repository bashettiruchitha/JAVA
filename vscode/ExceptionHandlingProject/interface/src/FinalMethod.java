public class FinalMethod {
    public static void main(String[] args) {
        Camera cam = new Camera();
        cam.click();
        System.out.println("-------------");
        VideoCamera videoCamera = new VideoCamera();
        videoCamera.click();
        videoCamera.record();
    }
}

class PhotoBlurredException extends Exception {

PhotoBlurredException(String str)
super(str);
}

    class Camera {

        void click() {
            double val = Math.random() % 10;
            if (val > 0.95) {
                throw new PhotoBlurredException("photo is blurred,obj is not cleared");
            } else {

                System.out.print("camera is clicking");
            }
        }

    }

    class VideoCamera extends Camera {

    void click() {
        super.click();
        System.out.println("and its click during the shoots");
    }

        Void record() {
            System.out.println(" videoCa");
            return null;
        }
}