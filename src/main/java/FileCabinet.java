import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class FileCabinet implements Cabinet {

    private List<Folder> folders;

    public FileCabinet(List<Folder> folders) {
        this.folders = folders;
    }

    @Override
    public Optional<Folder> findFolderByName(String name) {

        return folders.stream()
                .filter(folder -> folder.getName().equals(name))
                .findFirst();
    }

    @Override
    public List<Folder> findFolderBySize(String size) {
        List<Folder> folderBySize = new LinkedList<>();
        for (Folder folder : folders) {
            if (size.equalsIgnoreCase(folder.getSize())) {
                folderBySize.add(folder);
            }
        }
        return folderBySize;
    }

    @Override
    public int count() {
        return folders.size();
    }
}
