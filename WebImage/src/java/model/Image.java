package model;

import java.util.Date;

public class Image {
    private int imageId;
    private int userId;
    private String imagePath;
    private Date uploadDate;
    private String description;

    public Image(int imageId, int userId, String imagePath, Date uploadDate, String description) {
        this.imageId = imageId;
        this.userId = userId;
        this.imagePath = imagePath;
        this.uploadDate = uploadDate;
        this.description = description;
    }

    public Image(int userId, String imagePath, Date uploadDate, String description) {
        this(0, userId, imagePath, uploadDate, description);
    }

    public Image() {
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
