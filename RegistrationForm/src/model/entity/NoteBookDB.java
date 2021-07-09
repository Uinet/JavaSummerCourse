package model.entity;

public enum NoteBookDB {
    NOTE_ONE("Maltsev", "maltsev123"),
    NOTE_TWO("Makarov","makarov123");

    private final String surname;
    private final String nickName;
    NoteBookDB(String surname, String nickName){
        this.surname = surname;
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSurname(){
        return surname;
    }

    public static boolean nickNameIsUnique(String nickName){
        for (NoteBookDB note: NoteBookDB.values()) {
            if(note.getNickName().equals(nickName)){
                return false;
            }
        }
        return true;
    }
}
