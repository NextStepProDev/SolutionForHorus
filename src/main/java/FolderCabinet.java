import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class FolderCabinet implements Cabinet {

    private final List<MultiFolder> multiFolders;

    public FolderCabinet(List<MultiFolder> multiFolders) {
        this.multiFolders = multiFolders;
    }

    @Override
    public Optional<Folder> findFolderByName(String name) {
        return multiFolders.stream()
                .filter(folder -> folder.getName().equalsIgnoreCase(name))
                .findFirst()
                .map(folder -> folder);
    }

    @Override
    public List<Folder> findFolderBySize(String size) {
        List<Folder> folderBySize = new LinkedList<>();
        for (Folder folder : multiFolders) {
            if (size.equalsIgnoreCase(folder.getSize())) {
                folderBySize.add(folder);
            }
        }
        return folderBySize;
    }
    @Override
    public int count() {
        return multiFolders.size();
    }
}
