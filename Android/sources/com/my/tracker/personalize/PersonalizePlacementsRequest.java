package com.my.tracker.personalize;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {
    private final Map a = d();
    public final Map<String, String> customParams;
    public final List<String> placements;
    public final boolean reset;
    public final String userId;

    public static abstract class Builder<T extends PersonalizePlacementsRequest> {
        final String a;
        List b;
        Map c;
        boolean d = true;

        public Builder(String str) {
            this.a = str;
        }

        public abstract T build();

        public Builder<T> withCustomParams(Map<String, String> map) {
            if (map != null) {
                this.c = new HashMap(map);
            } else {
                this.c = null;
            }
            return this;
        }

        public Builder<T> withPlacements(List<String> list) {
            if (list != null) {
                this.b = new ArrayList(list);
            } else {
                this.b = null;
            }
            return this;
        }

        public Builder<T> withReset(boolean z) {
            this.d = z;
            return this;
        }
    }

    public PersonalizePlacementsRequest(List list, String str, boolean z, Map map) {
        this.placements = list;
        this.userId = str;
        this.reset = z;
        this.customParams = map;
    }

    private Map d() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.customParams;
        if (map != null && !map.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove("reset");
            this.customParams.remove("flat");
            for (Map.Entry next : this.customParams.entrySet()) {
                hashMap.put((String) next.getKey(), Collections.singletonList((String) next.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            hashMap.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            hashMap.put("custom_user_id", Collections.singletonList(this.userId));
        }
        hashMap.put("reset", Collections.singletonList(this.reset ? "1" : "0"));
        hashMap.put("flat", Collections.singletonList("1"));
        return hashMap;
    }

    public final Map b() {
        return this.a;
    }

    public final b c() {
        return new d();
    }
}
