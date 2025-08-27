package defpackage;

import java.util.NoSuchElementException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tkb  reason: default package */
public enum tkb implements hv0 {
    FORWARD("forward"),
    EDIT_FOLDER("edit_folder"),
    EXTERNAL_SHARE("external_share");
    
    public final String a;

    static {
        tkb[] tkbArr;
        w = EnumEntriesKt.enumEntries((E[]) tkbArr);
    }

    /* access modifiers changed from: public */
    tkb(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        for (tkb tkb : w) {
            if (Intrinsics.areEqual((Object) tkb.a, (Object) this.a)) {
                return tkb;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
