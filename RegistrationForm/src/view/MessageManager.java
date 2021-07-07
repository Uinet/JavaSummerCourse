package view;

import java.util.Locale;
import java.util.ResourceBundle;

public enum MessageManager {
    EN(ResourceBundle.getBundle("messages",
            new Locale("en"))),
    UA(ResourceBundle.getBundle("messages",
            new Locale("ua", "UA")));

    private final ResourceBundle resourceBundle;

    MessageManager(ResourceBundle resourceBundle){
        this.resourceBundle = resourceBundle;
    }

    public String getString(String key){
        return resourceBundle.getString(key);
    }
}
