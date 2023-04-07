public class Subscriber {
    public Long Id;
    public String Name;
    public Subscriber(int id , String Name){
        this.Id = Integer.toUnsignedLong(id);
        this.Name = Name;
    }
    public void RecieveMessage(String message , Topic topic){
        System.out.println( String.format("%s , received by = %s , topic = %s " , message , Long.toString(Id),topic.Name )  );
    }
    @Override
    public String toString(){
        return  Long.toString(Id) +  Name;
    }


}
