package com.my.tracker.personalize;

import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

public final class PersonalizeRankingRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> {
        public Builder(String str) {
            super(str);
        }

        public PersonalizeRankingRequest build() {
            return new PersonalizeRankingRequest(this.b, this.a, this.d, this.c);
        }
    }

    public PersonalizeRankingRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> newBuilder(String str) {
        return new Builder(str);
    }

    public String a() {
        return "/ranking";
    }
}
