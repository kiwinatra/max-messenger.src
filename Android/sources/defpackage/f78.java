package defpackage;

import java.util.Locale;
import kotlin.enums.EnumEntriesKt;

/* renamed from: f78  reason: default package */
public enum f78 {
    SEND,
    EXCEPTION(r2),
    SEND_ACK,
    QUEUE,
    ERROR(r2),
    RECEIVE,
    NOTIF;
    
    public final w78 a;
    public final String b;

    static {
        f78[] f78Arr;
        Y = EnumEntriesKt.enumEntries((E[]) f78Arr);
    }

    /* access modifiers changed from: public */
    f78(w78 w78) {
        this.a = w78;
        this.b = name().toLowerCase(Locale.ROOT);
    }
}
