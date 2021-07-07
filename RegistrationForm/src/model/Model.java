package model;

public class Model {
    private String surname;
    private String nickname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return " surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'';
    }
}
