package com.okhttp;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/17.
 */
public class Video {


    private Integer id;
    private String password;
    private String account;
    private String name;
    private String gender;
    private String age;
    private String zodiac;
    private String address;
    private String height;
    private String weight;
    private String hobbys;
    private String phone;
    private String blood;
    private String iconpath;
    private String level;
    private Date regDate;

    public Video() {
    }

    public Video(String zodiac, String account, String address, String age, String blood, String gender, String height, String hobbys, String iconpath, Integer id, String level, String name, String password, String phone, Date regDate, String weight) {
        this.zodiac = zodiac;
        this.account = account;
        this.address = address;
        this.age = age;
        this.blood = blood;
        this.gender = gender;
        this.height = height;
        this.hobbys = hobbys;
        this.iconpath = iconpath;
        this.id = id;
        this.level = level;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.regDate = regDate;
        this.weight = weight;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    public String getIconpath() {
        return iconpath;
    }

    public void setIconpath(String iconpath) {
        this.iconpath = iconpath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

/*  private String video;
    private String videoName;
    private String imgUrl;
    public Video() {
    }

    public Video(String video, String videoName, String imgUrl) {
        this.video = video;
        this.videoName = videoName;
        this.imgUrl = imgUrl;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
*/}
