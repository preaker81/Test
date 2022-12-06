package model;

public class ImageHandler {

    private static String cat = "./image/cat.jpg";
    private static String dog = "./image/dog.jpg";

    public static String getFileName(String whatToShow) {

        if (whatToShow.equals("cat")) {
            return cat;

        } else if (whatToShow.equals("dog")) {
            return dog;
        }
        return "";
    }

}