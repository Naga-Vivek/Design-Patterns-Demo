package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    // Map to store prototypes based on keys
    private Map<String, Notebook> notebookMap = new HashMap<>();

    // Method to register prototypes
    public void registerNotebook(String key, Notebook notebook) {
        notebookMap.put(key, notebook);
    }

    // Method to retrieve clones of the prototypes
    public Notebook getNotebook(String key) throws CloneNotSupportedException {
        Notebook notebook = notebookMap.get(key);
        if (notebook != null) {
            return notebook.clone();  // Return a cloned object
        }
        return null;  // Return null if the key is not found
    }
}
