import java.util.ArrayList;

public class Topic {
    public String Name;
    public Long Id;

    public Topic(String Name , Long Id){
        this.Name= Name;
        this.Id = Id;
    }

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void AddSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        int index  = subscribers.indexOf(subscriber);
        if(  index == -1) {
            return ;
        }
        subscribers.remove(index);

    }



    public void publishMessage(String message) {
        for(Subscriber s : subscribers){
            s.RecieveMessage(message , this);
        }

    }

    @Override
    public String toString() {
        String result = "";
        result +=  Long.toString(Id) +" "+ Name;
        for(Subscriber subscriber : subscribers){
            result += subscriber.toString();
        }
        return result;
    }
}
