package defpackage;

import kotlin.enums.EnumEntriesKt;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: kfg  reason: default package */
public enum kfg {
    URL(3, "url"),
    FOLDER(4, "folder"),
    INLINE_BUTTON(5, "inline_button"),
    FROM_NOTIFICATION(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "from_notification");
    
    public static final nfd c = null;
    public final String a;
    public final int b;

    static {
        kfg[] kfgArr;
        z = EnumEntriesKt.enumEntries((E[]) kfgArr);
        c = new nfd(21);
    }

    /* access modifiers changed from: public */
    kfg(int i, String str) {
        this.a = str;
        this.b = i;
    }
}
