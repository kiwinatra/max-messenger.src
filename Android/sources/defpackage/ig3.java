package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ig3  reason: default package */
public enum ig3 {
    SUCCESS(gdc.global_text_positive),
    ERROR(gdc.global_text_negative),
    NORMAL(gdc.global_text_primary);
    
    public final int a;

    static {
        ig3[] ig3Arr;
        w = EnumEntriesKt.enumEntries((E[]) ig3Arr);
    }

    /* access modifiers changed from: public */
    ig3(int i) {
        this.a = i;
    }
}
