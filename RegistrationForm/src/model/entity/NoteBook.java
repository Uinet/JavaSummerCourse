package model.entity;

public class NoteBook {
    private String surname;
    private String nickName;

    public NoteBook(String surname, String nickName) throws NotUniqueException{
        this.surname = surname;
        if(!NoteBookDB.nickNameIsUnique(nickName)){
            throw new NotUniqueException("Not unique Exception");
        }
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "surname='" + surname + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
