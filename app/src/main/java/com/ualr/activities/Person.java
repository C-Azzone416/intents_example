package com.ualr.activities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by irconde on 2019-10-03.
 */
public class Person implements Parcelable {

    public Person(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    // TODO 02. We have to implement the describeContents and writeToParcel methods of the Parcelable interface
    @Override
    public int describeContents() {
        return 0;
    }

    // TODO 05. Note that we have to follow the same order both when we put and get data in and from the parcel
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    // TODO 04. We have to define a constructor that has a Parcel object as input parameter
    protected Person(Parcel in) {
        this.firstName = in.readString();
        this.lastName = in.readString();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

}
