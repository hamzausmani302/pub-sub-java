import java.util.ArrayList;

public class Publisher {

    public Long Id;
    public String Name;
    public ArrayList<Topic> pubTopics = new ArrayList<>();

    public void addTopicToPublisher(Topic topic){
        pubTopics.add(topic);
    }
    public Publisher(int  Id , String Name ){
        this.Id = Integer.toUnsignedLong(Id);
        this.Name = Name;
    }
    public void publishMessage(String message , Topic topic){
        topic.publishMessage(message);
    }
}
