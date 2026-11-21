package conference;

public class Talk {

    String title;

    String speaker;

    Track track;

    int duration;

    double rating;

    Attendee[] attendees;

    public static class Attendee {

        String email;

        String company;

        int age;
    }

    public enum Track {
        BACKEND,
        FRONTEND,
        DATA,
        SECURITY,
        CLOUD
    }
}
