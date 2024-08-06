package org.example.enums;

public enum StudyProfile {
    MEDICINE("Медицина"),
    PHYSICS ("Физика"),
    LINGUISTICS ("Лингвистика"),
    MATHEMATICS ("Математика")
    ;
    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
