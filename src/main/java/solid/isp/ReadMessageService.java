package solid.isp;

import java.util.List;

public class ReadMessageService implements MessageService{
    private List<String> messages;

    public ReadMessageService(List<String> messages){
        this.messages = messages;
    }

    @Override
    public void writeMessage(String message) {

    }

    @Override
    public List<String> readMessages() {
        return null;
    }
}
