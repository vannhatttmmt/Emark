package application.viewmodel.home;

public class BannerVM {
    private String link;
    private String imageUrl;
    private String altText;

    public BannerVM(String link, String imageUrl, String altText) {
        this.link = link;
        this.imageUrl = imageUrl;
        this.altText = altText;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }
}