package model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Product {
    private Integer id;
    private String uuid;
    private String productName;
    private Double price;
    private String image;
    private String description;
    private LocalDateTime releasedDate;
    private LocalDateTime expiration;
    private Boolean isDeleted;
    private Boolean isNew;
    private Boolean isIncludeVat;
/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(LocalDateTime releasedDate) {
        this.releasedDate = releasedDate;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getIncludeVat() {
        return isIncludeVat;
    }

    public void setIncludeVat(Boolean includeVat) {
        isIncludeVat = includeVat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", releasedDate=" + releasedDate +
                ", expiration=" + expiration +
                ", isDeleted=" + isDeleted +
                ", isNew=" + isNew +
                ", isIncludeVat=" + isIncludeVat +
                '}';
    }

 */
}
