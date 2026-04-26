import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleAudioPlayers {
    Long currentFrame;
    Clip TakeOnMe;
    //current status of clip
    String status;
    AudioInputStream audioInputStream;
    static String filePath;

    //constructor to initialize streams and clips
    public SimpleAudioPlayers()
            throws UnsupportedAudioFileException, IOException,
            LineUnavailableException {
        //create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        TakeOnMe = AudioSystem.getClip();
        TakeOnMe.open(audioInputStream);
        TakeOnMe.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public static void main(String[] args){
        try {
            filePath  = "C:\\Users\\USER\\Documents\\NIIT\\Aha-Take-On-Me.wav";
            SimpleAudioPlayers audioPlayer = new SimpleAudioPlayers();
            audioPlayer.play();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1. pause");
                System.out.println("2. resume");
                System.out.println("3. restart");
                System.out.println("4. stop");
                System.out.println("5. jump to specific time");
                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 4)
                    break;
            }sc.close();
        }catch (Exception ex){
            System.out.println("Error with playing around");
            ex.printStackTrace();
        }
    }
    private void gotoChoice(int c)
            throws IOException,LineUnavailableException,UnsupportedAudioFileException{
        switch (c)
        {
            case 1: pause();
                break;
            case 2: resumeAudio();
                break;
            case 3: restart();
                break;
            case 4: stop();
                break;
            case 5:
                System.out.println("Enter time (" + 0 + "," +TakeOnMe.getMicrosecondLength() + ")");
                Scanner sc = new Scanner(System.in);
                long c1 = sc.nextLong();
                jump(c1);
                break;

        }
    }
    public void play(){
        TakeOnMe.start();
        status = "play";
    }public void pause(){
        if (status.equals("paused")){
            System.out.println("audio is already paused");
            return;
        }this.currentFrame = this.TakeOnMe.getMicrosecondLength();
        TakeOnMe.stop();
        status = "paused";
    }
    // method to resume audio
    public void resumeAudio()
            throws UnsupportedAudioFileException,IOException,LineUnavailableException
    {
        if (status.equals("play")){
            System.out.println("Audio is already playing" + "being played");
            return;
        }
        TakeOnMe.close();
        resetAudioStream();
        TakeOnMe.setMicrosecondPosition(currentFrame);
        this.play();
    }
    //method to restart the audio
    public void restart()
            throws UnsupportedAudioFileException,IOException,LineUnavailableException
    {
        TakeOnMe.stop();
        TakeOnMe.close();
        resetAudioStream();
        currentFrame = 0L;
        TakeOnMe.getMicrosecondLength();
        this.play();
    }
    //method to stop the audio
    public void stop()
            throws UnsupportedAudioFileException,IOException,LineUnavailableException
    {
        currentFrame = 0L;
        TakeOnMe.stop();
        TakeOnMe.close();
    }
    //method to jump over a specific part
    public void jump(long c)
            throws UnsupportedAudioFileException,IOException,LineUnavailableException
    {
        TakeOnMe.stop();
        TakeOnMe.close();
        resetAudioStream();
        currentFrame = c;
        TakeOnMe.setMicrosecondPosition(c);
        this.play();
    }

    // method to reset audio stream
    public void resetAudioStream()
            throws UnsupportedAudioFileException,IOException,LineUnavailableException {
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        TakeOnMe.open(audioInputStream);
        TakeOnMe.loop(Clip.LOOP_CONTINUOUSLY);
    }
}



