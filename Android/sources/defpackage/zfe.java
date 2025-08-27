package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: zfe  reason: default package */
public enum zfe {
    DIALOG_USER_ID(1),
    DIALOG_BOT_ID(2),
    CHAT_ID(3),
    FOLDER_ID(5),
    WEBAPP_ID(6);
    
    public static final mz4 b = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v3, types: [mz4, java.lang.Object] */
    static {
        zfe[] zfeArr;
        z = EnumEntriesKt.enumEntries((E[]) zfeArr);
        b = new Object();
    }

    /* access modifiers changed from: public */
    zfe(int i) {
        this.a = i;
    }
}
