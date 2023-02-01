package solid.lsp;

public class ReadOnlyFile implements FileOperation{

    @Override
    public byte[] read(String filename) {
        System.out.println("Reading from file "+ filename);
        return new byte[0];
    }

    @Override
    public void write(String filrname, byte[] content) {
        throw new UnsupportedOperationException("Can't write to read-only file");
    }
}
