package model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String fullName;
    private String email;
    private String password;
    private String confirmPass;
    private String homePage;
    private String aboutYou;

    public User(String fullName, String email, String password, String confirmPass, String homePage, String aboutYou) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.confirmPass = confirmPass;
        this.homePage = homePage;
        this.aboutYou = aboutYou;
    }

    protected User(Parcel in) {
        fullName = in.readString();
        email = in.readString();
        password = in.readString();
        confirmPass = in.readString();
        homePage = in.readString();
        aboutYou = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getAboutYou() {
        return aboutYou;
    }

    public void setAboutYou(String aboutYou) {
        this.aboutYou = aboutYou;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fullName);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(confirmPass);
        dest.writeString(homePage);
        dest.writeString(aboutYou);
    }
}
