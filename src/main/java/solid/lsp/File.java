package solid.lsp;

public class File implements FileOperation {

    @Override
    public byte[] read(String filename) {
        return new byte[0];
    }

    @Override
    public void write(String filrname, byte[] content) {
        System.out.println("Writing to file "+ filrname);
    }
}
