package solid.lsp;

public interface FileOperation {

    byte[] read(String filename);

    void write(String filrname, byte[] content);

}
