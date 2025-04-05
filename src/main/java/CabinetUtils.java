import java.util.LinkedList;
import java.util.List;

public class CabinetUtils {

    // Trochę to przekombinowane, ale zrobione po to, żeby nie dublować kodu
    public static List<Folder> findFolderBySize(List<? extends Folder> folders, String size) {
        List<Folder> result = new LinkedList<>();
        for (Folder folder : folders) {
            if (size.equalsIgnoreCase(folder.getSize())) {
                result.add(folder);
            }
        }
        return result;
    }
}