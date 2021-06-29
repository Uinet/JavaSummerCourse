package ua.training.main.task1.model;

public class Model {
    private String value;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public void Append(String text){
        value += text;
    }
}
