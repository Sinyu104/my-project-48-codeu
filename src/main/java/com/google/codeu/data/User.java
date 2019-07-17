package com.google.codeu.data;

public class User {

    private String email;
    private String aboutMe;
    private String learnCategory;
    private String teachCategory;
    private String school;
    private String name;
    private String age;
    private String skillLevel;
    private String pic;
    private String url;

    public User(String email, String aboutMe, String learnCategory, String teachCategory, String school,
                String age, String name, String skillLevel, String pic, String url) {
        this.email = email;
        this.aboutMe = aboutMe;
        this.learnCategory = learnCategory;
        this.teachCategory = teachCategory;
        this.school = school;
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
        this.pic = pic;
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public String getLearnCategory() {
        return learnCategory;
    }

    public String getTeachCategory() {
        return teachCategory;
    }

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public String getPic(){return pic;}

    public String getUrl(){return url;}

    public void setEmail(String email){
        this.email = email;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public void setLearnCategory(String learnCategory) {
        this.learnCategory = learnCategory;
    }

    public void setTeachCategory(String teachCategory) {
        this.teachCategory = teachCategory;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setSkillLevel(String skillLevel){
        this.skillLevel = skillLevel;
    }

    public void setPic(String pic){
        this.pic = pic;
    }

    public void setUrl(String url){
        this.url = url;
    }

}