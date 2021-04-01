package com.example.project;

public class BodyPartsImage {

    String imgName;
    int imgPic;

    public BodyPartsImage(String imgName, int imgPic){
        this.imgName = imgName;
        this.imgPic = imgPic;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public int getImgPic() {
        return imgPic;
    }

    public void setImgPic(int imgPic) {
        this.imgPic = imgPic;
    }
}
