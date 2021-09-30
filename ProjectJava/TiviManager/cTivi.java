package ProjectJava.TiviManager;

public class cTivi {
    private String[] channelList;
    private boolean isOn;
    private String currentChannel;
    public cTivi(){
        isOn = false;
        channelList = new String[3];
        channelList[0] = "VTV1";
        channelList[1] = "VTV2";
        channelList[2] = "VTV3";
        currentChannel = "VTV1";
    }
    public cTivi(String[] channelList){
        this.channelList = channelList;
        this.isOn = false;
        currentChannel = channelList[0];
    }
    public String searchNextChannel(boolean isForward){
        // ktra xem no dang o vi tri nao!!!
        int currentIndex = -1;
        for(int i = 0; i < channelList.length;i++){
            if(channelList[i].equalsIgnoreCase(currentChannel)){
                currentIndex = i; 
                break;
            }
        }
        if(isForward){
            currentIndex++;
            if(currentIndex >= channelList.length){
                currentIndex = 0;
            }
        }
        else{
            currentIndex--;
            if(currentIndex < 0){
                currentIndex = channelList.length -1;
            }
        }
        currentChannel = channelList[currentIndex];
        return currentChannel;
    }
    public void On(){
        isOn = true;
        System.out.println("---TV On----");
    }
    public void Off(){
        isOn = false;
        System.out.println("---TV OFF---");
    }
    public void Switch(){ // chuyen trang thai tu true sang false
        if(isOn){
            Off();
        }
        else{
            On();
        }
    }
    public void Switch(String channel){
        Switch();
        boolean chech = false;
        if(isOn){
            for(int i = 0; i < channelList.length; i++){
                if(channelList[i].equals(channel)){
                    chech = true;
                    currentChannel = channel;
                    break;
                }
            }
        }
        if(!chech){ System.out.println("khong tim thay!!" + channel);}
        else System.out.println("co tim thay:" + channel);
    }
    public void nextChannel(){
        if(isOn){
            searchNextChannel(true);
            System.out.println("Ten kenh moi after Next: " + currentChannel);
        }
    }
    public void previousChannel(){
        if(isOn){
            searchNextChannel(false);
            System.out.println("Ten kenh moi sau khi previous: " + currentChannel);
        }
    }
    public void Show(){
        if(isOn){
            System.out.println("--Tivi is On at channel:" +currentChannel);
        }
        else{
            System.out.println("--Tivi now off--");
        }
    }
}
