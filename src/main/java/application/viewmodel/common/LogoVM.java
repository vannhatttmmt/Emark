package application.viewmodel.common;

public class LogoVM {
    private String logoImageUrl;
    private String logoImageAltText;

    public LogoVM(String logoImageUrl, String logoImageAltText) {
        this.logoImageUrl = logoImageUrl;
        this.logoImageAltText = logoImageAltText;
    }

    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    public String getLogoImageAltText() {
        return logoImageAltText;
    }

    public void setLogoImageAltText(String logoImageAltText) {
        this.logoImageAltText = logoImageAltText;
    }
}
