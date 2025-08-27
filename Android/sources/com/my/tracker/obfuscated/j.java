package com.my.tracker.obfuscated;

import java.util.ArrayList;
import java.util.List;

public final class j {
    public List a;

    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public j(List list) {
        this.a = new ArrayList(list);
    }
}
