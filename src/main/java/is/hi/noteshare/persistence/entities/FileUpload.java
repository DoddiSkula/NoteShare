package is.hi.noteshare.persistence.entities;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
    private String title;
    private String description;
    private MultipartFile fileFormat;

    public FileUpload() {}

    public FileUpload(String title, String description, MultipartFile fileFormat) {
        this.title = title;
        this.description = description;
        this.fileFormat = fileFormat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MultipartFile getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(MultipartFile fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
