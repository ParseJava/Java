package oop.home.project;

/**
 * @author ParseJava on 17.07.2016.
 */
public interface Communications {
    String writePrivateMessage();
    String readPrivateMessage(String message);

    String writeReview();
    String readReview(String review);

    void setAccessPrivateInfo();
    void getAccessPrivateInfo();
}

