package Execution;
import Definitions.Video;
public class Main
{
    public static void main(String[] args){
        Video vid=new Video("Bahubali",true,10);
//        vid.setVideoName("Bahubali:the beginning");
//        vid.setCheckOut(true);
//        vid.setRating(10);
        System.out.println(vid.getVideoName());
        System.out.println(vid.getRating());
        System.out.println(vid.isCheckOut());
        System.out.println(vid.toString());




    }
}
