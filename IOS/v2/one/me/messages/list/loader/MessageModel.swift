package one.me.messages.list.loader;

import android.text.Layout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/me/messages/list/loader/MessageModel;", "Lgz6;", "Llz7;", "zc9", "yc9", "Companion", "message-list_release"}, k = 1, mv = {2, 0, 0})
public final class MessageModel implements gz6, lz7 {
    public static final Companion G0 = new Object();
    public final boolean A0;
    public final oa9 B0;
    public Layout C0;
    public Layout D0;
    public yc9 E0;
    public int F0;
    public final xz X;
    public final boolean Y;
    public final jf9 Z;
    public final long a;
    public final long b;
    public final long c;
    public final CharSequence o;
    public final CharSequence v;
    public final nc9 v0;
    public final CharSequence w;
    public final zc9 w0;
    public final hcg x;
    public final rr2 x0;
    public final boolean y;
    public final xd9 y0;
    public final boolean z;
    public final long z0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/list/loader/MessageModel$Companion;", "", "", "displayText", "", "pinId", "Lone/me/messages/list/loader/MessageModel;", "control", "(Ljava/lang/CharSequence;J)Lone/me/messages/list/loader/MessageModel;", "message-list_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        @JvmStatic
        @Keep
        public final MessageModel control(CharSequence charSequence, long j) {
            xz xzVar = xz.f;
            oa9 oa9 = oa9.SENT;
            zc9 zc9 = r0;
            zc9 zc92 = new zc9(j);
            return new MessageModel(0, 0, 0, charSequence, "", "", hcg.None, false, false, xzVar, false, (jf9) null, (nc9) null, zc9, rr2.b, (xd9) null, 0, true, oa9, (yc9) null, 3152896);
        }
    }

    public MessageModel(long j, long j2, long j3, CharSequence charSequence, String str, CharSequence charSequence2, hcg hcg, boolean z2, boolean z3, xz xzVar, boolean z4, jf9 jf9, nc9 nc9, zc9 zc9, rr2 rr2, xd9 xd9, long j4, boolean z5, oa9 oa9, yc9 yc9, int i) {
        int i2 = i;
        int i3 = 0;
        boolean z6 = (i2 & 1024) != 0 ? false : z4;
        jf9 jf92 = (i2 & 2048) != 0 ? null : jf9;
        nc9 nc92 = (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : nc9;
        zc9 zc92 = (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : zc9;
        yc9 yc92 = (2097152 & i2) != 0 ? null : yc9;
        i3 = (i2 & 4194304) != 0 ? -1 : i3;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = charSequence;
        this.v = str;
        this.w = charSequence2;
        this.x = hcg;
        this.y = z2;
        this.z = z3;
        this.X = xzVar;
        this.Y = z6;
        this.Z = jf92;
        this.v0 = nc92;
        this.w0 = zc92;
        this.x0 = rr2;
        this.y0 = xd9;
        this.z0 = j4;
        this.A0 = z5;
        this.B0 = oa9;
        this.C0 = null;
        this.D0 = null;
        this.E0 = yc92;
        this.F0 = i3;
    }

    @JvmStatic
    @Keep
    public static final MessageModel control(CharSequence charSequence, long j) {
        return G0.control(charSequence, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return this.a == messageModel.a && this.b == messageModel.b && this.c == messageModel.c && Intrinsics.areEqual((Object) this.o, (Object) messageModel.o) && Intrinsics.areEqual((Object) this.v, (Object) messageModel.v) && Intrinsics.areEqual((Object) this.w, (Object) messageModel.w) && this.x == messageModel.x && this.y == messageModel.y && this.z == messageModel.z && Intrinsics.areEqual((Object) this.X, (Object) messageModel.X) && this.Y == messageModel.Y && Intrinsics.areEqual((Object) this.Z, (Object) messageModel.Z) && Intrinsics.areEqual((Object) this.v0, (Object) messageModel.v0) && Intrinsics.areEqual((Object) this.w0, (Object) messageModel.w0) && this.x0 == messageModel.x0 && Intrinsics.areEqual((Object) this.y0, (Object) messageModel.y0) && this.z0 == messageModel.z0 && this.A0 == messageModel.A0 && this.B0 == messageModel.B0 && Intrinsics.areEqual((Object) this.C0, (Object) messageModel.C0) && Intrinsics.areEqual((Object) this.D0, (Object) messageModel.D0) && Intrinsics.areEqual((Object) this.E0, (Object) messageModel.E0) && ig9.a(this.F0, messageModel.F0);
    }

    public final boolean f(lz7 lz7) {
        return this.a == lz7.getItemId();
    }

    public final long getId() {
        return this.a;
    }

    public final long getItemId() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int e = g63.e((this.X.hashCode() + g63.e(g63.e((this.x.hashCode() + wj6.e(this.w, wj6.e(this.v, wj6.e(this.o, wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31)) * 31, 31, this.y), 31, this.z)) * 31, 31, this.Y);
        int i = 0;
        jf9 jf9 = this.Z;
        int hashCode = (e + (jf9 == null ? 0 : jf9.hashCode())) * 31;
        nc9 nc9 = this.v0;
        int hashCode2 = (hashCode + (nc9 == null ? 0 : nc9.hashCode())) * 31;
        zc9 zc9 = this.w0;
        int hashCode3 = (this.x0.hashCode() + ((hashCode2 + (zc9 == null ? 0 : Long.hashCode(zc9.a))) * 31)) * 31;
        xd9 xd9 = this.y0;
        int hashCode4 = (this.B0.hashCode() + g63.e(wzf.i((hashCode3 + (xd9 == null ? 0 : xd9.hashCode())) * 31, 31, this.z0), 31, this.A0)) * 31;
        Layout layout = this.C0;
        int hashCode5 = (hashCode4 + (layout == null ? 0 : layout.hashCode())) * 31;
        Layout layout2 = this.D0;
        int hashCode6 = (hashCode5 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
        yc9 yc9 = this.E0;
        if (yc9 != null) {
            i = yc9.hashCode();
        }
        return Integer.hashCode(this.F0) + ((hashCode6 + i) * 31);
    }

    public final int i() {
        return this.F0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r15) {
        /*
            r14 = this;
            lz7 r15 = (defpackage.lz7) r15
            boolean r0 = r15 instanceof one.me.messages.list.loader.MessageModel
            if (r0 != 0) goto L_0x0009
            r14 = 0
            goto L_0x0082
        L_0x0009:
            xz r0 = r14.X
            zf7 r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001a
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            xz r4 = r4.X
            zf7 r4 = r4.e
            if (r4 != 0) goto L_0x002b
        L_0x001a:
            if (r1 == 0) goto L_0x0028
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            xz r4 = r4.X
            zf7 r4 = r4.e
            boolean r1 = r1.b(r4)
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r13 = r3
            goto L_0x002e
        L_0x002d:
            r13 = r2
        L_0x002e:
            android.text.Layout r1 = r14.C0
            one.me.messages.list.loader.MessageModel r15 = (one.me.messages.list.loader.MessageModel) r15
            android.text.Layout r4 = r15.C0
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            r5 = r1 ^ 1
            android.text.Layout r1 = r14.D0
            android.text.Layout r4 = r15.D0
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            r6 = r1 ^ 1
            hcg r1 = r14.x
            hcg r4 = r15.x
            if (r1 == r4) goto L_0x004c
            r8 = r3
            goto L_0x004d
        L_0x004c:
            r8 = r2
        L_0x004d:
            java.lang.CharSequence r1 = r14.v
            java.lang.CharSequence r4 = r15.v
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            r7 = r1 ^ 1
            jf9 r1 = r14.Z
            jf9 r4 = r15.Z
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            r9 = r1 ^ 1
            xd9 r1 = r14.y0
            xd9 r4 = r15.y0
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            r10 = r1 ^ 1
            boolean r14 = r14.Y
            boolean r1 = r15.Y
            if (r14 == r1) goto L_0x0073
            r11 = r3
            goto L_0x0074
        L_0x0073:
            r11 = r2
        L_0x0074:
            xz r14 = r15.X
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r14)
            r12 = r14 ^ 1
            jd9 r14 = new jd9
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0082:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.loader.MessageModel.l(java.lang.Object):java.lang.Object");
    }

    public final String n() {
        String e = ig9.e(this.F0);
        return StringsKt.trimIndent("\n        MessageModel(mid=" + this.a + ", sid=" + this.b + " time=" + this.c + " viewType=" + e + ")\n    ");
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        Layout layout = this.C0;
        Layout layout2 = this.D0;
        yc9 yc9 = this.E0;
        String e = ig9.e(this.F0);
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", sortTime=");
        sb.append(this.c);
        sb.append(", displayText=");
        sb.append(this.o);
        sb.append(", displayTime=");
        sb.append(this.v);
        sb.append(", decorTime=");
        sb.append(this.w);
        sb.append(", viewStatus=");
        sb.append(this.x);
        sb.append(", drawBackground=");
        sb.append(this.y);
        sb.append(", needCorners=");
        sb.append(this.z);
        sb.append(", attachInfo=");
        sb.append(this.X);
        sb.append(", isEdit=");
        sb.append(this.Y);
        sb.append(", messageTextStaticLayout=");
        sb.append(this.Z);
        sb.append(", messageLink=");
        sb.append(this.v0);
        sb.append(", controlInfo=");
        sb.append(this.w0);
        sb.append(", chatType=");
        sb.append(this.x0);
        sb.append(", reactionsData=");
        sb.append(this.y0);
        sb.append(", senderId=");
        sb.append(this.z0);
        sb.append(", isIncoming=");
        sb.append(this.A0);
        sb.append(", deliveryStatus=");
        sb.append(this.B0);
        sb.append(", sender=");
        sb.append(layout);
        sb.append(", alias=");
        sb.append(layout2);
        sb.append(", avatarParams=");
        sb.append(yc9);
        sb.append(", messageViewType=");
        return wj6.n(sb, e, ")");
    }
}
