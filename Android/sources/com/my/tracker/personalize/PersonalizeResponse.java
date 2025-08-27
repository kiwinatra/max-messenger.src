package com.my.tracker.personalize;

public final class PersonalizeResponse<T> {
    public final String error;
    public final String rawData;
    public final T result;

    public PersonalizeResponse(Object obj, String str, String str2) {
        this.result = obj;
        this.error = str;
        this.rawData = str2;
    }
}
