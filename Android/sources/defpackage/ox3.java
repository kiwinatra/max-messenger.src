package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: ox3  reason: default package */
public final class ox3 extends gz {
    public final String X;
    public final a20 Y;
    public final String Z;
    public final int o;
    public final Long v;
    public final String v0;
    public final List w;
    public final boolean w0;
    public final String x;
    public final int x0;
    public final String y;
    public final b89 y0;
    public final String z;
    public final String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox3(int i, Long l, List list, String str, String str2, String str3, String str4, a20 a20, String str5, String str6, boolean z2, int i2, b89 b89, String str7, boolean z3, boolean z4) {
        super(b10.CONTROL, z3, z4);
        this.o = i;
        this.v = l;
        this.w = list;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.X = str4;
        this.Y = a20;
        this.Z = str5;
        this.v0 = str6;
        this.w0 = z2;
        this.x0 = i2;
        this.y0 = b89;
        this.z0 = str7;
    }

    public final HashMap a() {
        String str;
        String str2;
        HashMap a = super.a();
        int i = this.o;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "new";
                break;
            case 3:
                str = "add";
                break;
            case 4:
                str = "remove";
                break;
            case 5:
                str = "leave";
                break;
            case 6:
                str = "title";
                break;
            case 7:
                str = "icon";
                break;
            case 8:
                str = "hello";
                break;
            case 9:
                str = "system";
                break;
            case 10:
                str = "joinByLink";
                break;
            case 11:
                str = "pin";
                break;
            case 12:
                str = "botStarted";
                break;
            default:
                throw null;
        }
        a.put("event", str);
        List list = this.w;
        if (list != null && list.size() > 0) {
            a.put("userIds", list);
        }
        Long l = this.v;
        if (!(l == null || l.longValue() == 0)) {
            a.put("userId", l);
        }
        String str3 = this.x;
        if (str3 != null) {
            a.put("title", str3);
        }
        String str4 = this.y;
        if (str4 != null) {
            a.put("photoToken", str4);
        }
        a20 a20 = this.Y;
        if (a20 != null) {
            a.put("crop", a20.a());
        }
        if (i == 3) {
            a.put("showHistory", Boolean.valueOf(this.w0));
        }
        if (i == 2) {
            int i2 = this.x0;
            if (i2 == 1) {
                str2 = "UNKNOWN";
            } else if (i2 == 2) {
                str2 = "DIALOG";
            } else if (i2 == 3) {
                str2 = "CHAT";
            } else if (i2 == 4) {
                str2 = "CHANNEL";
            } else if (i2 == 5) {
                str2 = "GROUP_CHAT";
            } else {
                throw null;
            }
            a.put("chatType", str2);
        }
        String str5 = this.z0;
        if (!cvg.A(str5)) {
            a.put("startPayload", str5);
        }
        return a;
    }
}
