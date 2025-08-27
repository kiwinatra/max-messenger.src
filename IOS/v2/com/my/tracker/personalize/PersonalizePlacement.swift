package com.my.tracker.personalize;

public final class PersonalizePlacement {
    public final int groupId;
    public final String id;
    public final PersonalizeOffer offer;
    public final int testId;

    public PersonalizePlacement(String str, int i, int i2, PersonalizeOffer personalizeOffer) {
        this.id = str;
        this.groupId = i;
        this.testId = i2;
        this.offer = personalizeOffer;
    }
}
