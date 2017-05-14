package id.sch.smktelkom_mlg.privateassignment.xirpl601.individu;

import java.io.Serializable;

/**
 * Created by intel on 13/05/2017.
 */

public class TopItem implements Serializable {
    private String imageUrl;
    private String title;

    public TopItem(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }
}
