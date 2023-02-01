package solid.isp.fix;

public interface MessageService extends ReadableMessageService {

    void writeMessage(String message);
}
