package model.DTO;

public class EBookDTO extends BookDTO{
    private float fileSize;
    private String fileFormat;
    private int numPages;

    private EBookDTO(Builder builder) {
        super(builder);
        this.fileSize = builder.fileSize;
        this.fileFormat = builder.fileFormat;
        this.numPages = builder.numPages;

    }

    public float getFileSize() {
        return fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return "EBookDTO{" +
                "title='" + getTitle() + '\'' +
                ", stock=" + getStock() +
                ", buyingPrice=" + getBuyingPrice() +
                ", sellingPrice=" + getSellingPrice() +
                ", format='" + getFormat() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publisher='" + getPublisher() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", series='" + getSeries() + '\'' +
                ", releaseDate=" + getReleaseDate() +
                ", fileSize=" + getFileSize() +
                ", fileFormat='" + getFileFormat() + '\'' +
                ", numPages=" + getNumPages() +
                '}';

    }

    public static class Builder extends BookDTO.Builder<Builder>{
        private float fileSize;
        private String fileFormat;
        private int numPages;

        public Builder setFileSize(float fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Builder setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        public Builder setNumPages(int numPages) {
            this.numPages = numPages;
            return this;
        }

        @Override
        protected Builder self(){
            return this;
        }

        @Override
        public EBookDTO build() {
            return new EBookDTO(this);
        }

    }
}
