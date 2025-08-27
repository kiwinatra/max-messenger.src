package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: k88  reason: default package */
public final class k88 extends fbf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k88(String str, boolean z, long j, long j2, long j3, String str2, long j4, long j5, long j6) {
        super(x3b.LOGIN);
        long j7;
        long j8 = j;
        long j9 = j2;
        long j10 = j3;
        String str3 = str2;
        long j11 = j4;
        long j12 = j5;
        long j13 = j6;
        t(ApiProtocol.KEY_TOKEN, str);
        d("interactive", z);
        if (j8 > 0) {
            p(j8, "chatsSync");
            j7 = 0;
        } else {
            j7 = 0;
        }
        if (j9 > j7) {
            p(j9, "contactsSync");
        }
        if (j10 != j7) {
            p(j10, "presenceSync");
        }
        if (!(str3 == null || str2.length() == 0)) {
            t("configHash", str3);
        }
        if (j11 > 0) {
            p(j11, "callsSync");
        }
        if (j12 > 0) {
            p(j12, "lastLogin");
        }
        if (j13 > 0) {
            p(j13, "draftsSync");
        }
    }

    public final gbf P() {
        return sx6.w;
    }

    public final boolean U() {
        return false;
    }
}
