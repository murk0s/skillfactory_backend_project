package org.example;

import java.util.ArrayList;

public class University
{
    String id, fullName, shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    private static ArrayList <University> universityList = new ArrayList<University>();


    public University(String id, String fullName, String shortName, StudyProfile mainProfile, int yearOfFoundation) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
        universityList.add(this);
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }

    @Override
    public String toString() {
        return fullName + "("
                + shortName +
                ", код " + id +
                ", основан в " + yearOfFoundation + "г." +
                ", основное направление " + mainProfile.getProfileName() +
                ')';
    }

    static public University getById(String id){
        for (University u: universityList){
            if (u.getId().equals(id)) return u;
        }
        return null;
    }
}
