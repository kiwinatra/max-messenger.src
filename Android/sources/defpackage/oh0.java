package defpackage;

import com.my.tracker.ads.AdFormat;
import kotlin.enums.EnumEntriesKt;

/* renamed from: oh0  reason: default package */
public enum oh0 {
    CAROUSEL("carousel"),
    BANNER(AdFormat.BANNER);
    
    public final String a;

    static {
        oh0[] oh0Arr;
        v = EnumEntriesKt.enumEntries((E[]) oh0Arr);
    }

    /* access modifiers changed from: public */
    oh0(String str) {
        this.a = str;
    }
}
