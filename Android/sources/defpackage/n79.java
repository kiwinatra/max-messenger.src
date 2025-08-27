package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: n79  reason: default package */
public final class n79 {
    public static final Object c = new Object();
    public static ExecutorService d;
    public static final of3 e = new of3(18);
    public static final ui0 f = new ui0(10);
    public static final aq7[] g = new aq7[0];
    public final /* synthetic */ int a;
    public final r9e b;

    public /* synthetic */ n79(r9e r9e, int i) {
        this.a = i;
        this.b = r9e;
    }

    public static final String A(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Uri B(Cursor cursor, int i) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(cursor.getString(i));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        String str = (String) obj;
        if (!(str == null || str.length() == 0)) {
            try {
                if (cjf.p(str)) {
                    return o5a.x(str);
                }
                return null;
            } catch (Throwable th2) {
                z68.o("LocalMediaRepository:Cursor:getUri", "Failure Uri.fromFile(File(" + str + "))", th2);
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r0 = r1.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.equals("error.limit.violate") == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r0.equals("error.code.attempt.limit") == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        if (r0.equals("code.limit") == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
        r1 = defpackage.qad.D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        r1 = defpackage.qad.u1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        r2 = new defpackage.igf(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.v88 C(defpackage.qaf r4) {
        /*
            java.lang.String r0 = r4.b
            java.lang.String r1 = "service.unavailable"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r1 = 0
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = r4.b
            java.lang.String r2 = "service.timeout"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x010c
            java.lang.String r2 = "errors.event.unavailable"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x001f
            goto L_0x010c
        L_0x001f:
            boolean r2 = r4 instanceof defpackage.aaf
            if (r2 == 0) goto L_0x003a
            u88 r4 = new u88
            int r0 = defpackage.ead.O
            igf r1 = new igf
            r1.<init>(r0)
            int r0 = defpackage.ead.N
            igf r2 = new igf
            r2.<init>(r0)
            q80 r0 = defpackage.q80.NO_NETWORK
            r4.<init>(r1, r2, r0)
            goto L_0x0140
        L_0x003a:
            java.lang.String r2 = "error.limit.violate"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r3 == 0) goto L_0x0076
            boolean r0 = r4 instanceof defpackage.raf
            if (r0 == 0) goto L_0x0049
            r1 = r4
            raf r1 = (defpackage.raf) r1
        L_0x0049:
            s88 r4 = new s88
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = r1.w
            if (r0 == 0) goto L_0x0057
            mgf r2 = new mgf
            r2.<init>(r0)
            goto L_0x005e
        L_0x0057:
            int r0 = defpackage.nlc.oneme_login_sms_count_exceeded_title
            igf r2 = new igf
            r2.<init>(r0)
        L_0x005e:
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = r1.x
            if (r0 == 0) goto L_0x006a
            mgf r1 = new mgf
            r1.<init>(r0)
            goto L_0x0071
        L_0x006a:
            int r0 = defpackage.nlc.oneme_login_sms_count_exceeded_description
            igf r1 = new igf
            r1.<init>(r0)
        L_0x0071:
            r4.<init>(r2, r1)
            goto L_0x0140
        L_0x0076:
            java.lang.String r1 = r4.o
            if (r1 == 0) goto L_0x0088
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            mgf r2 = new mgf
            r2.<init>(r1)
            goto L_0x00fb
        L_0x0088:
            int r1 = r0.hashCode()
            switch(r1) {
                case -2107093715: goto L_0x00e9;
                case -1988099974: goto L_0x00dd;
                case -1927764058: goto L_0x00d1;
                case -1458260801: goto L_0x00c8;
                case -890707199: goto L_0x00bc;
                case -802380906: goto L_0x00b0;
                case 106239865: goto L_0x00a4;
                case 255501108: goto L_0x0098;
                case 1415134249: goto L_0x0091;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x00f1
        L_0x0091:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L_0x00e6
            goto L_0x00f1
        L_0x0098:
            java.lang.String r1 = "login.token"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00a1
            goto L_0x00f1
        L_0x00a1:
            int r1 = defpackage.qad.E
            goto L_0x00f6
        L_0x00a4:
            java.lang.String r1 = "verify.code.expired"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00ad
            goto L_0x00f1
        L_0x00ad:
            int r1 = defpackage.qad.C
            goto L_0x00f6
        L_0x00b0:
            java.lang.String r1 = "error.phone.blacklisted"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00b9
            goto L_0x00f1
        L_0x00b9:
            int r1 = defpackage.qad.B
            goto L_0x00f6
        L_0x00bc:
            java.lang.String r1 = "verify.code.wrong"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00c5
            goto L_0x00f1
        L_0x00c5:
            int r1 = defpackage.qad.A
            goto L_0x00f6
        L_0x00c8:
            java.lang.String r1 = "error.code.attempt.limit"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e6
            goto L_0x00f1
        L_0x00d1:
            java.lang.String r1 = "auth.blocked"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00da
            goto L_0x00f1
        L_0x00da:
            int r1 = defpackage.qad.y
            goto L_0x00f6
        L_0x00dd:
            java.lang.String r1 = "code.limit"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e6
            goto L_0x00f1
        L_0x00e6:
            int r1 = defpackage.qad.D
            goto L_0x00f6
        L_0x00e9:
            java.lang.String r1 = "phone.wrong"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00f4
        L_0x00f1:
            int r1 = defpackage.qad.u1
            goto L_0x00f6
        L_0x00f4:
            int r1 = defpackage.qad.F
        L_0x00f6:
            igf r2 = new igf
            r2.<init>(r1)
        L_0x00fb:
            q88 r1 = new q88
            n9f r4 = r4.v
            if (r4 == 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>(r0)
        L_0x0107:
            r1.<init>(r2, r4)
            r4 = r1
            goto L_0x0140
        L_0x010c:
            boolean r0 = r4 instanceof defpackage.raf
            if (r0 == 0) goto L_0x0113
            r1 = r4
            raf r1 = (defpackage.raf) r1
        L_0x0113:
            if (r1 == 0) goto L_0x011f
            java.lang.String r4 = r1.w
            if (r4 == 0) goto L_0x011f
            mgf r0 = new mgf
            r0.<init>(r4)
            goto L_0x0126
        L_0x011f:
            int r4 = defpackage.ead.Q
            igf r0 = new igf
            r0.<init>(r4)
        L_0x0126:
            if (r1 == 0) goto L_0x0132
            java.lang.String r4 = r1.x
            if (r4 == 0) goto L_0x0132
            mgf r1 = new mgf
            r1.<init>(r4)
            goto L_0x0139
        L_0x0132:
            int r4 = defpackage.ead.P
            igf r1 = new igf
            r1.<init>(r4)
        L_0x0139:
            u88 r4 = new u88
            q80 r2 = defpackage.q80.NO_RESPONSE
            r4.<init>(r0, r1, r2)
        L_0x0140:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.C(qaf):v88");
    }

    public static CharSequence D(Context context, CharSequence charSequence, boolean z, boolean z2) {
        if (!z) {
            return charSequence;
        }
        fv4 fv4 = new fv4(ew3.b(context, nad.Z0), ro4.a(4.0f), 0, 0, 0, z2);
        Lazy lazy = scf.b0;
        iq.a0(fv4, j4b.k0(context).l);
        fv4.setBounds(0, 0, fv4.getIntrinsicWidth(), fv4.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(fv4);
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(imageSpan, charSequence.length() - 1, charSequence.length(), 17);
            return spannableStringBuilder;
        }
        SpannableString spannableString = new SpannableString(charSequence + " ");
        spannableString.setSpan(imageSpan, charSequence.length(), charSequence.length() + 1, 17);
        return spannableString;
    }

    public static int E(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(g63.h("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: lp9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: lp9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: lp9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: lp9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: lp9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(android.content.Intent r17) {
        /*
            r0 = r17
            boolean r1 = R(r17)
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "_nr"
            android.os.Bundle r2 = r17.getExtras()
            G(r1, r2)
        L_0x0011:
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = r17.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            boolean r2 = x()
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x0196
            m9c r2 = com.google.firebase.messaging.FirebaseMessaging.l
            java.lang.Object r2 = r2.get()
            osf r2 = (defpackage.osf) r2
            if (r2 != 0) goto L_0x0035
            goto L_0x0196
        L_0x0035:
            r3 = 0
            if (r0 != 0) goto L_0x003a
            goto L_0x0156
        L_0x003a:
            android.os.Bundle r4 = r17.getExtras()
            if (r4 != 0) goto L_0x0042
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x0042:
            java.lang.String r5 = "google.ttl"
            java.lang.Object r5 = r4.get(r5)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0054
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r1 = r5.intValue()
        L_0x0052:
            r13 = r1
            goto L_0x0064
        L_0x0054:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x0052
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0060 }
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0060 }
            goto L_0x0052
        L_0x0060:
            java.util.Objects.toString(r5)
            goto L_0x0052
        L_0x0064:
            java.lang.String r1 = "google.to"
            java.lang.String r1 = r4.getString(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0072
        L_0x0070:
            r9 = r1
            goto L_0x0090
        L_0x0072:
            hp5 r1 = defpackage.hp5.b()     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            java.lang.Object r5 = defpackage.lp5.m     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            r1.a()     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            ic3 r1 = r1.d     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            java.lang.Class<mp5> r5 = defpackage.mp5.class
            java.lang.Object r1 = r1.a(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            lp5 r1 = (defpackage.lp5) r1     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            s7h r1 = r1.c()     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            java.lang.Object r1 = defpackage.hsg.c(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException | ExecutionException -> 0x018f }
            goto L_0x0070
        L_0x0090:
            hp5 r1 = defpackage.hp5.b()
            r1.a()
            android.content.Context r1 = r1.a
            java.lang.String r11 = r1.getPackageName()
            boolean r1 = defpackage.er7.N(r4)
            if (r1 == 0) goto L_0x00a7
            jp9 r1 = defpackage.jp9.DISPLAY_NOTIFICATION
        L_0x00a5:
            r10 = r1
            goto L_0x00aa
        L_0x00a7:
            jp9 r1 = defpackage.jp9.DATA_MESSAGE
            goto L_0x00a5
        L_0x00aa:
            java.lang.String r1 = "google.message_id"
            java.lang.String r1 = r4.getString(r1)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = "message_id"
            java.lang.String r1 = r4.getString(r1)
        L_0x00b8:
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x00be
            r8 = r1
            goto L_0x00bf
        L_0x00be:
            r8 = r5
        L_0x00bf:
            java.lang.String r1 = "from"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00d0
            java.lang.String r6 = "/topics/"
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L_0x00d0
            r3 = r1
        L_0x00d0:
            if (r3 == 0) goto L_0x00d4
            r14 = r3
            goto L_0x00d5
        L_0x00d4:
            r14 = r5
        L_0x00d5:
            java.lang.String r1 = "collapse_key"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00df
            r12 = r1
            goto L_0x00e0
        L_0x00df:
            r12 = r5
        L_0x00e0:
            java.lang.String r1 = "google.c.a.m_l"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00ea
            r15 = r1
            goto L_0x00eb
        L_0x00ea:
            r15 = r5
        L_0x00eb:
            java.lang.String r1 = "google.c.a.c_l"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00f6
            r16 = r1
            goto L_0x00f8
        L_0x00f6:
            r16 = r5
        L_0x00f8:
            java.lang.String r1 = "google.c.sender.id"
            boolean r3 = r4.containsKey(r1)
            r5 = 0
            if (r3 == 0) goto L_0x010b
            java.lang.String r1 = r4.getString(r1)     // Catch:{ NumberFormatException -> 0x010b }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x010b }
            goto L_0x0149
        L_0x010b:
            hp5 r1 = defpackage.hp5.b()
            r1.a()
            rp5 r3 = r1.c
            java.lang.String r4 = r3.e
            if (r4 == 0) goto L_0x011d
            long r3 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x011d }
            goto L_0x0149
        L_0x011d:
            r1.a()
            java.lang.String r1 = r3.b
            java.lang.String r3 = "1:"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x012f
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0139 }
            goto L_0x0149
        L_0x012f:
            java.lang.String r3 = ":"
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r4 = 2
            if (r3 >= r4) goto L_0x013b
        L_0x0139:
            r3 = r5
            goto L_0x0149
        L_0x013b:
            r3 = 1
            r1 = r1[r3]
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0145
            goto L_0x0139
        L_0x0145:
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0139 }
        L_0x0149:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x014f
            r6 = r3
            goto L_0x0150
        L_0x014f:
            r6 = r5
        L_0x0150:
            lp9 r3 = new lp9
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0156:
            if (r3 != 0) goto L_0x0159
            goto L_0x0196
        L_0x0159:
            java.lang.String r1 = "google.product_id"
            r4 = 111881503(0x6ab2d1f, float:6.438935E-35)
            int r0 = r0.getIntExtra(r1, r4)     // Catch:{ RuntimeException -> 0x0196 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x0196 }
            wb0 r1 = new wb0     // Catch:{ RuntimeException -> 0x0196 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0196 }
            java.lang.String r0 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r4 = "proto"
            l65 r5 = new l65     // Catch:{ RuntimeException -> 0x0196 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0196 }
            p79 r4 = new p79     // Catch:{ RuntimeException -> 0x0196 }
            r6 = 18
            r4.<init>(r6)     // Catch:{ RuntimeException -> 0x0196 }
            psf r2 = (defpackage.psf) r2     // Catch:{ RuntimeException -> 0x0196 }
            pk4 r0 = r2.a(r0, r5, r4)     // Catch:{ RuntimeException -> 0x0196 }
            mp9 r2 = new mp9     // Catch:{ RuntimeException -> 0x0196 }
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x0196 }
            ta0 r3 = new ta0     // Catch:{ RuntimeException -> 0x0196 }
            r3.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x0196 }
            r0.D(r3)     // Catch:{ RuntimeException -> 0x0196 }
            goto L_0x0196
        L_0x018f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.F(android.content.Intent):void");
    }

    public static void G(String str, Bundle bundle) {
        try {
            hp5.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str2 = bundle.getString("google.c.a.udt");
            }
            if (str2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str2));
                } catch (NumberFormatException unused2) {
                }
            }
            String str3 = er7.N(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            hp5 b2 = hp5.b();
            b2.a();
            rae.w(b2.d.a(od.class));
        } catch (IllegalStateException unused3) {
        }
    }

    public static boolean I(Parcel parcel, int i) {
        b0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte J(Parcel parcel, int i) {
        b0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float K(Parcel parcel, int i) {
        b0(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float L(Parcel parcel, int i) {
        int P = P(parcel, i);
        if (P == 0) {
            return null;
        }
        a0(parcel, P);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder M(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + P);
        return readStrongBinder;
    }

    public static int N(Parcel parcel, int i) {
        b0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long O(Parcel parcel, int i) {
        b0(parcel, i, 8);
        return parcel.readLong();
    }

    public static int P(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void Q(String str) {
        throw new CharConversionException(wj6.k("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public static boolean R(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static p01 S(int i, hf4 hf4, l8b l8b) {
        p01 c2 = p01.c(hf4, l8b);
        while (true) {
            int i2 = c2.b;
            if (i2 == i) {
                return c2;
            }
            i2a.m(i2, "Ignoring unknown WAV chunk: ");
            long j = c2.c;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 <= 2147483647L) {
                hf4.z((int) j2);
                c2 = p01.c(hf4, l8b);
            } else {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
        }
    }

    public static void T(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + P(parcel, i));
    }

    public static final String U(Continuation continuation) {
        Object obj;
        if (continuation instanceof zp4) {
            return ((zp4) continuation).toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(continuation + '@' + A(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r2 = Result.m26exceptionOrNullimpl(obj);
        String str = obj;
        if (r2 != null) {
            str = continuation.getClass().getName() + '@' + A(continuation);
        }
        return (String) str;
    }

    public static final File V(Uri uri) {
        if (Intrinsics.areEqual((Object) uri.getScheme(), (Object) "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    public static String W(int i) {
        switch (i) {
            case 0:
                return "eof";
            case 34:
                return "string";
            case 39:
                return "name";
            case 44:
                return "`,`";
            case 49:
                return "number";
            case 58:
                return "`:`";
            case 91:
                return "`[`";
            case 93:
                return "`]`";
            case 98:
                return "boolean";
            case 110:
                return "null";
            case 123:
                return "`{`";
            case 125:
                return "`}`";
            default:
                throw new AssertionError();
        }
    }

    public static final void X(fwf fwf) {
        fwf.c(oa4.class, new xoa(13));
        fwf.e(szb.class, new fm8(27));
        fwf.e(lwb.class, new xoa(18));
        Class<dn4> cls = dn4.class;
        fwf.c(cls, new xoa(14));
        fwf.c(cls, new xoa(15));
        fwf.c(cls, new xoa(16));
        fwf.c(cls, new xoa(17));
    }

    public static int Y(Parcel parcel) {
        int readInt = parcel.readInt();
        int P = P(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i = P + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new SafeParcelReader$ParseException(parcel, g63.h("Size read is invalid start=", dataPosition, i, " end="));
        }
        throw new SafeParcelReader$ParseException(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static String Z(fzg fzg) {
        StringBuilder sb = new StringBuilder(fzg.e());
        for (int i = 0; i < fzg.e(); i++) {
            byte b2 = fzg.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 >= 32 && b2 <= 126) {
                            sb.append((char) b2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void a(TextView textView, a32 a32, scf scf) {
        vk3 m;
        boolean z = true;
        if (!a32.Y() && (!a32.N() || (m = a32.m()) == null || !m.z())) {
            z = false;
        }
        boolean g0 = a32.g0();
        boolean K = a32.K();
        boolean J = a32.J();
        textView.getContext();
        ro4 b2 = ro4.b();
        boolean y = ct.y(textView.getContext());
        dv4 dv4 = K ? new dv4(iq.E(nad.E, scf.G, textView.getContext()), 0, b2.d, 0, y) : (!J || g0) ? null : new dv4(iq.E(nad.x, scf.G, textView.getContext()), b2.b, b2.d, 0, y);
        if (dv4 != null) {
            iq.a0(dv4, scf.G);
        }
        dv4 b3 = z ? ew3.b(textView.getContext(), nad.Y0) : null;
        if (z) {
            dv4 dv42 = new dv4(b3, b2.a, 0, b2.d, y);
            iq.a0(dv42, scf.l);
            b3 = dv42;
        }
        hsg.D(dv4, (Drawable) null, b3, (Drawable) null, textView);
        textView.setCompoundDrawablePadding(0);
    }

    public static void a0(Parcel parcel, int i) {
        if (i != 4) {
            String hexString = Integer.toHexString(i);
            throw new SafeParcelReader$ParseException(parcel, "Expected size 4 got " + i + " (0x" + hexString + ")");
        }
    }

    public static void b(TextView textView, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        dv4 dv4;
        textView.getContext();
        ro4 b2 = ro4.b();
        boolean y = ct.y(textView.getContext());
        Context context = textView.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        if (z2) {
            Drawable b3 = ew3.b(textView.getContext(), nad.L1);
            iq.a0(b3, k0.G);
            dv4 = new dv4(b3, 0, 0, b2.d, y);
            i = vo4.b((int) 2.0f);
        } else {
            i = 0;
            if (z) {
                Drawable b4 = ew3.b(textView.getContext(), nad.Y0);
                iq.a0(b4, k0.l);
                dv4 = new dv4(b4, 0, 0, b2.d, y);
                iq.a0(dv4, k0.l);
            } else {
                dv4 = null;
            }
        }
        if (!z3 || z4) {
            hsg.D((Drawable) null, (Drawable) null, dv4, (Drawable) null, textView);
        } else {
            Drawable b5 = ew3.b(textView.getContext(), nad.x);
            iq.a0(b5, k0.G);
            hsg.D(new dv4(b5, 0, b2.d, 0, y), (Drawable) null, dv4, (Drawable) null, textView);
        }
        textView.setCompoundDrawablePadding(i);
    }

    public static void b0(Parcel parcel, int i, int i2) {
        int P = P(parcel, i);
        if (P != i2) {
            throw new SafeParcelReader$ParseException(parcel, wj6.n(a81.n("Expected size ", i2, " got ", P, " (0x"), Integer.toHexString(P), ")"));
        }
    }

    public static final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final void d(ie0 ie0, m58 m58, x15 x15) {
        Drawable drawable;
        scf scf;
        scf scf2;
        scf scf3;
        if (m58 instanceof r67) {
            Context context = ie0.getContext();
            ((r67) m58).getClass();
            Drawable b2 = ew3.b(context, nad.o0);
            if (ie0.isInEditMode()) {
                scf2 = vi4.f0;
            } else {
                Context context2 = ie0.getContext();
                Lazy lazy = scf.b0;
                scf2 = j4b.k0(context2);
            }
            iq.a0(b2, scf2.x);
            if (ie0.isInEditMode()) {
                scf3 = vi4.f0;
            } else {
                Context context3 = ie0.getContext();
                Lazy lazy2 = scf.b0;
                scf3 = j4b.k0(context3);
            }
            drawable = new ge0(b2, scf3.I, false);
        } else if (m58 instanceof s67) {
            CharSequence charSequence = ((s67) m58).k;
            if (ie0.isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context4 = ie0.getContext();
                Lazy lazy3 = scf.b0;
                scf = j4b.k0(context4);
            }
            int i = scf.I;
            x15.getClass();
            drawable = new de0((ce0) x15.b.getValue(), (yva) x15.a.getValue(), charSequence, i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ie0.z = false;
        yd0 yd0 = new yd0(ie0.o, ie0.v, ie0.w, drawable);
        ie0.c = yd0;
        ie0.e(yd0);
        ie0.a.i((gv4) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: rt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: rt0} */
    /* JADX WARNING: type inference failed for: r13v5, types: [yfe, java.lang.Object, rt0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(long r21, defpackage.rt0 r23, int r24, java.util.List r25, int r26, int r27, java.util.List r28) {
        /*
            r0 = r23
            r1 = r24
            r10 = r25
            r2 = r26
            r11 = r27
            r12 = r28
            r3 = 0
            r4 = 1
            if (r2 >= r11) goto L_0x0012
            r5 = r4
            goto L_0x0013
        L_0x0012:
            r5 = r3
        L_0x0013:
            java.lang.String r6 = "Failed requirement."
            if (r5 == 0) goto L_0x01ca
            r5 = r2
        L_0x0018:
            if (r5 >= r11) goto L_0x0033
            java.lang.Object r7 = r10.get(r5)
            vw0 r7 = (defpackage.vw0) r7
            int r7 = r7.c()
            if (r7 < r1) goto L_0x0029
            int r5 = r5 + 1
            goto L_0x0018
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L_0x0033:
            java.lang.Object r5 = r25.get(r26)
            vw0 r5 = (defpackage.vw0) r5
            int r6 = r11 + -1
            java.lang.Object r6 = r10.get(r6)
            vw0 r6 = (defpackage.vw0) r6
            int r7 = r5.c()
            r13 = -1
            if (r1 != r7) goto L_0x0061
            java.lang.Object r5 = r12.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r2 = r2 + 1
            java.lang.Object r7 = r10.get(r2)
            vw0 r7 = (defpackage.vw0) r7
            r20 = r7
            r7 = r2
            r2 = r5
            r5 = r20
            goto L_0x0063
        L_0x0061:
            r7 = r2
            r2 = r13
        L_0x0063:
            byte r8 = r5.f(r1)
            byte r9 = r6.f(r1)
            r14 = 4
            r15 = 2
            if (r8 == r9) goto L_0x013c
            int r3 = r7 + 1
        L_0x0071:
            if (r3 >= r11) goto L_0x0090
            int r5 = r3 + -1
            java.lang.Object r5 = r10.get(r5)
            vw0 r5 = (defpackage.vw0) r5
            byte r5 = r5.f(r1)
            java.lang.Object r6 = r10.get(r3)
            vw0 r6 = (defpackage.vw0) r6
            byte r6 = r6.f(r1)
            if (r5 == r6) goto L_0x008d
            int r4 = r4 + 1
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0071
        L_0x0090:
            long r5 = r0.b
            long r8 = (long) r14
            long r5 = r5 / r8
            long r5 = r5 + r21
            long r14 = (long) r15
            long r5 = r5 + r14
            int r3 = r4 * 2
            long r14 = (long) r3
            long r14 = r14 + r5
            r0.x0(r4)
            r0.x0(r2)
            r2 = r7
        L_0x00a3:
            if (r2 >= r11) goto L_0x00c7
            java.lang.Object r3 = r10.get(r2)
            vw0 r3 = (defpackage.vw0) r3
            byte r3 = r3.f(r1)
            if (r2 == r7) goto L_0x00bf
            int r4 = r2 + -1
            java.lang.Object r4 = r10.get(r4)
            vw0 r4 = (defpackage.vw0) r4
            byte r4 = r4.f(r1)
            if (r3 == r4) goto L_0x00c4
        L_0x00bf:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.x0(r3)
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00c7:
            rt0 r6 = new rt0
            r6.<init>()
        L_0x00cc:
            if (r7 >= r11) goto L_0x0136
            java.lang.Object r2 = r10.get(r7)
            vw0 r2 = (defpackage.vw0) r2
            byte r2 = r2.f(r1)
            int r3 = r7 + 1
            r4 = r3
        L_0x00db:
            if (r4 >= r11) goto L_0x00ee
            java.lang.Object r5 = r10.get(r4)
            vw0 r5 = (defpackage.vw0) r5
            byte r5 = r5.f(r1)
            if (r2 == r5) goto L_0x00eb
            r5 = r4
            goto L_0x00ef
        L_0x00eb:
            int r4 = r4 + 1
            goto L_0x00db
        L_0x00ee:
            r5 = r11
        L_0x00ef:
            if (r3 != r5) goto L_0x0112
            int r2 = r1 + 1
            java.lang.Object r3 = r10.get(r7)
            vw0 r3 = (defpackage.vw0) r3
            int r3 = r3.c()
            if (r2 != r3) goto L_0x0112
            java.lang.Object r2 = r12.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.x0(r2)
            r17 = r5
            r13 = r6
            r18 = r8
            goto L_0x012f
        L_0x0112:
            long r2 = r6.b
            long r2 = r2 / r8
            long r2 = r2 + r14
            int r2 = (int) r2
            int r2 = r2 * r13
            r0.x0(r2)
            int r16 = r1 + 1
            r2 = r14
            r4 = r6
            r17 = r5
            r5 = r16
            r13 = r6
            r6 = r25
            r18 = r8
            r8 = r17
            r9 = r28
            e(r2, r4, r5, r6, r7, r8, r9)
        L_0x012f:
            r6 = r13
            r7 = r17
            r8 = r18
            r13 = -1
            goto L_0x00cc
        L_0x0136:
            r13 = r6
            r0.t0(r13)
            goto L_0x01c9
        L_0x013c:
            int r4 = r5.c()
            int r8 = r6.c()
            int r4 = java.lang.Math.min(r4, r8)
            r8 = r1
        L_0x0149:
            if (r8 >= r4) goto L_0x015a
            byte r9 = r5.f(r8)
            byte r13 = r6.f(r8)
            if (r9 != r13) goto L_0x015a
            int r3 = r3 + 1
            int r8 = r8 + 1
            goto L_0x0149
        L_0x015a:
            long r8 = r0.b
            long r13 = (long) r14
            long r8 = r8 / r13
            long r8 = r8 + r21
            r17 = r13
            long r13 = (long) r15
            long r8 = r8 + r13
            long r13 = (long) r3
            long r8 = r8 + r13
            r13 = 1
            long r8 = r8 + r13
            int r4 = -r3
            r0.x0(r4)
            r0.x0(r2)
            int r4 = r1 + r3
        L_0x0172:
            if (r1 >= r4) goto L_0x0180
            byte r2 = r5.f(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.x0(r2)
            int r1 = r1 + 1
            goto L_0x0172
        L_0x0180:
            int r1 = r7 + 1
            if (r1 != r11) goto L_0x01aa
            java.lang.Object r1 = r10.get(r7)
            vw0 r1 = (defpackage.vw0) r1
            int r1 = r1.c()
            if (r4 != r1) goto L_0x019e
            java.lang.Object r1 = r12.get(r7)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.x0(r1)
            goto L_0x01c9
        L_0x019e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            rt0 r13 = new rt0
            r13.<init>()
            long r1 = r13.b
            long r1 = r1 / r17
            long r1 = r1 + r8
            int r1 = (int) r1
            r2 = -1
            int r1 = r1 * r2
            r0.x0(r1)
            r1 = r8
            r3 = r13
            r5 = r25
            r6 = r7
            r7 = r27
            r8 = r28
            e(r1, r3, r4, r5, r6, r7, r8)
            r0.t0(r13)
        L_0x01c9:
            return
        L_0x01ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.e(long, rt0, int, java.util.List, int, int, java.util.List):void");
    }

    public static void f(Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean h(hf4 hf4) {
        l8b l8b = new l8b(8);
        int i = p01.c(hf4, l8b).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        hf4.q(l8b.a, 0, 4, false);
        l8b.G(0);
        int g2 = l8b.g();
        if (g2 == 1463899717) {
            return true;
        }
        i8b.o("Unsupported form type: " + g2);
        return false;
    }

    public static void i(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void j(Object obj) {
        obj.getClass();
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void l(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder n = tr1.n(j, "size=", " offset=");
            n.append(j2);
            n.append(" byteCount=");
            n.append(j3);
            throw new ArrayIndexOutOfBoundsException(n.toString());
        }
    }

    public static void m(Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void o(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static ow3 q(c32 c32) {
        switch (c32.ordinal()) {
            case 0:
                return new ow3(hra.x, (ngf) new igf(ead.j), Integer.valueOf(cad.c), Integer.valueOf(jya.F), 4);
            case 1:
                return new ow3(hra.L, (ngf) new igf(ead.w), Integer.valueOf(cad.c), Integer.valueOf(jya.F), 4);
            case 2:
                return new ow3(hra.w, (ngf) new igf(ead.t), Integer.valueOf(cad.E1), Integer.valueOf(jya.F), 4);
            case 3:
                return new ow3(hra.K, (ngf) new igf(ead.u), Integer.valueOf(cad.C1), Integer.valueOf(jya.F), 4);
            case 4:
                return new ow3(hra.H, (ngf) new igf(ead.s), Integer.valueOf(cad.o1), Integer.valueOf(jya.F), 4);
            case 5:
                return new ow3(hra.G, (ngf) new igf(ead.r), Integer.valueOf(cad.o1), Integer.valueOf(jya.F), 4);
            case 6:
                return new ow3(hra.J, (ngf) new igf(ead.v), Integer.valueOf(cad.v1), Integer.valueOf(jya.F), 4);
            case 7:
                return new ow3(hra.P, (ngf) new igf(ead.B), Integer.valueOf(cad.w1), Integer.valueOf(jya.F), 4);
            case 8:
                return new ow3(hra.F, (ngf) new igf(ead.q), Integer.valueOf(jya.I), Integer.valueOf(cad.C), Integer.valueOf(jya.E));
            case 9:
                return new ow3(hra.F, (ngf) new igf(ead.p), Integer.valueOf(jya.I), Integer.valueOf(cad.C), Integer.valueOf(jya.E));
            case 10:
                return new ow3(hra.F, (ngf) new igf(ead.C), Integer.valueOf(jya.I), Integer.valueOf(cad.C), Integer.valueOf(jya.E));
            case 11:
                return new ow3(hra.D, (ngf) new igf(ead.n), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case 12:
            case 13:
                return new ow3(hra.E, (ngf) new igf(ead.o), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new ow3(hra.y, (ngf) new igf(ead.k), Integer.valueOf(jya.I), Integer.valueOf(cad.T), Integer.valueOf(jya.E));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new ow3(hra.M, (ngf) new igf(ead.y), Integer.valueOf(cad.m), Integer.valueOf(jya.F), 4);
            case 16:
                return new ow3(dad.a, (ngf) new igf(ead.x), Integer.valueOf(cad.Q0), Integer.valueOf(jya.F), 4);
            case LangUtils.HASH_SEED /*17*/:
                return new ow3(hra.z, (ngf) new igf(ead.l), Integer.valueOf(cad.F0), Integer.valueOf(jya.F), 4);
            case 18:
                return new ow3(hra.O, (ngf) new igf(ead.A), Integer.valueOf(jya.I), Integer.valueOf(cad.r1), Integer.valueOf(jya.E));
            case 19:
                return new ow3(hra.N, (ngf) new igf(ead.z), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case 20:
                return new ow3(hra.A, (ngf) new igf(ead.m), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.a96 r(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            defpackage.bs0.q(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L_0x0019
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L_0x0019
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0019
            goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r2 = r4
            goto L_0x006d
        L_0x003a:
            java.lang.String r1 = r3.authority     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0066 }
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch:{ NameNotFoundException -> 0x0066 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0066 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0066 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0066 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0066 }
        L_0x004c:
            if (r2 >= r6) goto L_0x005a
            r7 = r0[r2]     // Catch:{ NameNotFoundException -> 0x0066 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0066 }
            r5.add(r7)     // Catch:{ NameNotFoundException -> 0x0066 }
            int r2 = r2 + 1
            goto L_0x004c
        L_0x005a:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ NameNotFoundException -> 0x0066 }
            soc r2 = new soc     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>((java.lang.String) r1, (java.lang.String) r3, (java.lang.String) r5, (java.util.List) r0)     // Catch:{ NameNotFoundException -> 0x0066 }
            goto L_0x006d
        L_0x0066:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x0038
        L_0x006d:
            if (r2 != 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            a96 r4 = new a96
            z86 r0 = new z86
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L_0x007a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.r(android.content.Context):a96");
    }

    public static Bundle s(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + P);
        return readBundle;
    }

    public static Parcelable t(Parcel parcel, int i, Parcelable.Creator creator) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + P);
        return parcelable;
    }

    public static String u(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + P);
        return readString;
    }

    public static Object[] v(Parcel parcel, int i, Parcelable.Creator creator) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + P);
        return createTypedArray;
    }

    public static ArrayList w(Parcel parcel, int i, Parcelable.Creator creator) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + P);
        return createTypedArrayList;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            defpackage.hp5.b()     // Catch:{ IllegalStateException -> 0x0045 }
            hp5 r2 = defpackage.hp5.b()
            r2.a()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.Context r2 = r2.a
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0022
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0022:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0045
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.x():boolean");
    }

    public static sa0 y(sa0 sa0, Size size, Range range) {
        sa0 sa02 = sa0;
        int i = sa02.c;
        int width = size.getWidth();
        int height = size.getHeight();
        int i2 = sa02.h;
        int i3 = sa02.d;
        int c2 = e4g.c(i, i2, i2, i3, i3, width, sa02.e, height, sa02.f, range);
        int width2 = size.getWidth();
        int height2 = size.getHeight();
        return new sa0(sa02.a, sa02.b, c2, sa02.d, width2, height2, sa02.g, sa02.h, sa02.i, sa02.j);
    }

    public static void z(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(parcel, wj6.h(i, "Overread allowed size end="));
        }
    }

    public final x9e H(r9e r9e) {
        switch (this.a) {
            case 0:
                return r9e instanceof s9e ? new w9e((s9e) this.b) : u9e.a;
            default:
                return r9e instanceof t9e ? new w9e((t9e) this.b) : u9e.a;
        }
    }
}
