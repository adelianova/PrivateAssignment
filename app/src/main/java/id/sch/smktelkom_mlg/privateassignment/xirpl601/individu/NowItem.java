package id.sch.smktelkom_mlg.privateassignment.xirpl601.individu;

import java.io.Serializable;

/**
 * Created by intel on 13/05/2017.
 */

public class NowItem implements Serializable {
    private String imageUrl;
    private String title;

    public NowItem(String imageUrl, String title) {
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
