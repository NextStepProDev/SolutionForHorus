import java.util.List;

public class MultiFolderImpl implements MultiFolder {

    private final String name;
    private final String size;
    private final List<Folder> folders;

    public MultiFolderImpl(String name, String size, List<Folder> folders) {
        this.name = name;
        this.size = size;
        this.folders = folders;
    }

    @Override
    public List<Folder> getFolder() {
        return folders;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }
}
