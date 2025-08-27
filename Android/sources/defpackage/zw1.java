package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zw1  reason: default package */
public final class zw1 {
    public final List a;

    public zw1(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }
}
