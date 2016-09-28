package com.example.viscus.androidcontacts;

/**
 * Created by Viscus on 9/28/16.
 */

public class ContactList {
    String nameText;
    String phoneText;



    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    public String getPhoneText() {
        return phoneText;
    }

    public void setPhoneText(String phoneText) {
        this.phoneText = phoneText;
    }



    public ContactList(String nameText, String phoneText) {
        this.nameText = nameText;
        this.phoneText = phoneText;

    }

    @Override
    public String toString() {
        return nameText + '\'' +
                 "  (" + phoneText +")"+ '\'' ;
    }
}
