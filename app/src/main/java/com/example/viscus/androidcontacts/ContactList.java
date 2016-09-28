package com.example.viscus.androidcontacts;

/**
 * Created by Viscus on 9/28/16.
 */

public class ContactList {
    String nameText;
    String phoneText;
    //boolean isRemoved;


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

    //public boolean isRemoved() {
    //    return isRemoved;
   // }

   // public void setRemoved(boolean removed) {
   //     isRemoved = removed;
   // }

    public ContactList(String nameText, String phoneText, boolean isRemoved) {
        this.nameText = nameText;
        this.phoneText = phoneText;
        //this.isRemoved = isRemoved;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "nameText='" + nameText + '\'' +
                ", phoneText='" + phoneText + '\'' +
                //", isRemoved=" + isRemoved +
                '}';
    }
}
