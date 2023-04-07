import java.util.ArrayList;

public class TopicManager {
    public ArrayList<Topic> topics = new ArrayList<>();
    public Topic addTopic(Long Id , String Name  ){
        Topic newtopic = new Topic( Name , Id);
        topics.add(newtopic);
        return newtopic;
    }
    public void assignSubscriberToTopic( Subscriber subscriber ,Topic topic){
        topic.AddSubscriber(subscriber);
    }

    public void showInfo(){
        for(Topic topic : topics){
            System.out.println(topic.toString());
            System.out.println("");

        }
    }



}
