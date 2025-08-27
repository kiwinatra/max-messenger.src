package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: fw9  reason: default package */
public final class fw9 extends ibf {
    public final long c;
    public final b89 o;
    public final b32 v;

    public /* synthetic */ fw9() {
        this(0, (b89) null, (b32) null);
    }

    public static final fw9 d(pf9 pf9) {
        String str;
        if (!pf9.m()) {
            return new fw9();
        }
        int y0 = pf9.y0();
        if (y0 == 0) {
            return new fw9();
        }
        b89 b89 = null;
        b32 b32 = null;
        long j = 0;
        for (int i = 0; i < y0; i++) {
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = ytd.a.iterator();
                while (it.hasNext()) {
                    ((xm) it.next()).a(th);
                }
                xtd.a.getClass();
                int ordinal = xtd.b.ordinal();
                if (ordinal == 0) {
                    str = null;
                } else if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1361631597) {
                    if (hashCode != 3052376) {
                        if (hashCode == 954925063 && str.equals("message")) {
                            b89 = z79.a(pf9);
                        }
                    } else if (str.equals("chat")) {
                        b32 = b32.a(pf9);
                    }
                } else if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    try {
                        j = ryg.d0(pf9, 0);
                    } catch (Throwable th2) {
                        z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it2 = ytd.a.iterator();
                        while (it2.hasNext()) {
                            ((xm) it2.next()).a(th2);
                        }
                        xtd.a.getClass();
                        int ordinal2 = xtd.b.ordinal();
                        if (ordinal2 == 0) {
                            j = 0;
                        } else if (ordinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th2;
                        }
                    }
                }
                pf9.A();
            }
        }
        return new fw9(j, b89, b32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw9)) {
            return false;
        }
        fw9 fw9 = (fw9) obj;
        return this.c == fw9.c && Intrinsics.areEqual((Object) this.o, (Object) fw9.o) && Intrinsics.areEqual((Object) this.v, (Object) fw9.v);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        int i = 0;
        b89 b89 = this.o;
        int hashCode2 = (hashCode + (b89 == null ? 0 : b89.hashCode())) * 31;
        b32 b32 = this.v;
        if (b32 != null) {
            i = b32.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", message=" + this.o + ")";
    }

    public fw9(long j, b89 b89, b32 b32) {
        this.c = j;
        this.o = b89;
        this.v = b32;
    }
}
