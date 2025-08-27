package com.my.tracker.personalize;

import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

public final class PersonalizeSetRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> {
        public Builder(String str) {
            super(str);
        }

        public PersonalizeSetRequest build() {
            return new PersonalizeSetRequest(this.b, this.a, this.d, this.c);
        }
    }

    public PersonalizeSetRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> newBuilder(String str) {
        return new Builder(str);
    }

    public String a() {
        return "/set";
    }
}
