package org.example;

public enum StudyProfile {
    MEDICINE("Медицина"), PROGRAMMING("Астоматизированные системы обработки информации"),
    TECHNIC ("Технический");
    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
