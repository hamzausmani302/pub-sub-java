// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Topic> topics = new ArrayList<Topic>();
        ArrayList<Publisher> publishers =new ArrayList<Publisher>();
        ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
        publishers.add(new Publisher(1,"hamza"));
        publishers.add(new Publisher(2,"ali"));

        subscribers.add(new Subscriber(1, "s1"));
        subscribers.add(new Subscriber(2, "s2"));
        subscribers.add(new Subscriber(3, "s3"));


        TopicManager topicManager = new TopicManager();
        topics.add(topicManager.addTopic(Integer.toUnsignedLong(1) , "science"));
        topics.add(topicManager.addTopic(Integer.toUnsignedLong(2) , "math"));
        topics.add(topicManager.addTopic(Integer.toUnsignedLong(3) , "others"));

        topicManager.assignSubscriberToTopic(subscribers.get(0) , topics.get(0) );
        topicManager.assignSubscriberToTopic(subscribers.get(1) , topics.get(0) );
        topicManager.assignSubscriberToTopic(subscribers.get(0) , topics.get(1) );


        publishers.get(1).publishMessage("hello" , topics.get(1) );

        topicManager.showInfo();




    }
}