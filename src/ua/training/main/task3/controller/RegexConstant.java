package ua.training.main.task3.controller;

public interface RegexConstant {

    String REG_SURNAME = "^[A-Z]{1}[a-z]+$";
    String REG_NAME = "^[A-Z]{1}[a-z]+$";
    String REG_PATRONYMIC = "^[A-Z]{1}[a-z]+$";
    String REG_NICKNAME = "^\\w{3,15}$";
    String REG_HOME_PHONE = "";
    String REG_MOBILE_PHONE = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REG_EMAIL = "^\\w+@\\w+\\.\\w+$";
    String REG_POST_INDEX = "^\\d{5}$";
    String REG_CITY = "^[A-Z]{1}[a-z]+$";
    String REG_STREET = "^[A-Z]{1}[a-z]+$";
    String REG_HOUSE_NUMBER = "^\\d{1,4}[a-z]*$";
    String REG_FLAT_NUMBER = "^\\d{1,4}$";
}
