package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.common.ParserException;
import java.io.Serializable;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.apache.http.HttpHost;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o54  reason: default package */
public abstract class o54 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};
    public static final int[] f = {16842755, 16843213};
    public static final frg g = new frg("SAMPLED_TRACE", 2);
    public static final String[] h = {"_id", "lookup"};
    public static final String[] i = {"contact_id", "mimetype", "data2", "data3", "data5", "_id", "data1", "display_name", "photo_uri"};
    public static final tj5 j;
    public static final tj5[] k;
    public static final /* synthetic */ int l = 0;
    public static int m = 3;
    public static volatile String n;

    static {
        tj5 tj5 = new tj5("app_set_id", 1);
        j = tj5;
        k = new tj5[]{tj5};
    }

    public static final boolean A(int i2, int i3, v3d v3d) {
        if (v3d == null) {
            if (((float) ((int) (((float) i2) * 1.3333334f))) < 2048.0f || ((int) (((float) i3) * 1.3333334f)) < 2048) {
                return false;
            }
        } else if (((int) (((float) i2) * 1.3333334f)) < v3d.a || ((int) (((float) i3) * 1.3333334f)) < v3d.b) {
            return false;
        }
        return true;
    }

    public static final boolean B(j55 j55, v3d v3d) {
        if (j55 == null) {
            return false;
        }
        j55.m0();
        int i2 = j55.o;
        if (i2 == 90 || i2 == 270) {
            j55.m0();
            int i3 = j55.x;
            j55.m0();
            return A(i3, j55.w, v3d);
        }
        j55.m0();
        int i4 = j55.w;
        j55.m0();
        return A(i4, j55.x, v3d);
    }

    public static boolean C(int i2, String str) {
        return m <= i2 || Log.isLoggable(str, i2);
    }

    public static Bitmap D(int i2, Context context) {
        int i3;
        switch (i2) {
            case 0:
                i3 = oya.a;
                break;
            case 1:
                i3 = oya.b;
                break;
            case 2:
                i3 = oya.m;
                break;
            case 3:
                i3 = oya.s;
                break;
            case 4:
                i3 = oya.t;
                break;
            case 5:
                i3 = oya.u;
                break;
            case 6:
                i3 = oya.v;
                break;
            case 7:
                i3 = oya.w;
                break;
            case 8:
                i3 = oya.x;
                break;
            case 9:
                i3 = oya.y;
                break;
            case 10:
                i3 = oya.c;
                break;
            case 11:
                i3 = oya.d;
                break;
            case 12:
                i3 = oya.e;
                break;
            case 13:
                i3 = oya.f;
                break;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                i3 = oya.g;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                i3 = oya.h;
                break;
            case 16:
                i3 = oya.i;
                break;
            case LangUtils.HASH_SEED /*17*/:
                i3 = oya.j;
                break;
            case 18:
                i3 = oya.k;
                break;
            case 19:
                i3 = oya.l;
                break;
            case 20:
                i3 = oya.n;
                break;
            case 21:
                i3 = oya.o;
                break;
            case 22:
                i3 = oya.p;
                break;
            case 23:
                i3 = oya.q;
                break;
            default:
                i3 = oya.r;
                break;
        }
        Drawable D = iq.D(context, i3);
        if (D instanceof BitmapDrawable) {
            return ((BitmapDrawable) D).getBitmap();
        }
        return null;
    }

    public static final Boolean E(String str, Bundle bundle) {
        String string = bundle.getString(str, (String) null);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    public static final Long F(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    public static sp9 G(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = v0g.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                i8b.V("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(wkb.a(new l8b(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    i8b.W("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new geg(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new sp9((List) arrayList);
    }

    public static ykb H(l8b l8b, boolean z, boolean z2) {
        if (z) {
            S(3, l8b, false);
        }
        l8b.s((int) l8b.l(), x22.c);
        long l2 = l8b.l();
        String[] strArr = new String[((int) l2)];
        for (int i2 = 0; ((long) i2) < l2; i2++) {
            strArr[i2] = l8b.s((int) l8b.l(), x22.c);
        }
        if (!z2 || (l8b.u() & 1) != 0) {
            return new ykb(12, strArr);
        }
        throw ParserException.a("framing bit expected to be set", (RuntimeException) null);
    }

    public static final boolean I(String str, Bundle bundle) {
        Boolean E = E(str, bundle);
        if (E != null) {
            return E.booleanValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final double J(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Double valueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
        if (valueOf != null) {
            return valueOf.doubleValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final int K(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Integer valueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final long L(String str, Bundle bundle) {
        Long F = F(str, bundle);
        if (F != null) {
            return F.longValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final long[] M(String str, Bundle bundle) {
        return CollectionsKt.toLongArray(SequencesKt.toList(SequencesKt.map(SequencesKt.filter(StringsKt__StringsKt.splitToSequence$default((CharSequence) N(str, bundle), new String[]{","}, true, 0, 4, (Object) null), ka4.a), la4.a)));
    }

    public static final String N(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARNING: type inference failed for: r9v9, types: [java.lang.Object, rt0] */
    public static final String O(String str) {
        int i2 = 0;
        int i3 = -1;
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            InetAddress j2 = (!StringsKt__StringsJVMKt.startsWith$default(str, "[", false, 2, (Object) null) || !StringsKt__StringsJVMKt.endsWith$default(str, "]", false, 2, (Object) null)) ? j(0, str.length(), str) : j(1, str.length() - 1, str);
            if (j2 == null) {
                return null;
            }
            byte[] address = j2.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                ? obj = new Object();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        obj.u0(58);
                        i2 += i5;
                        if (i2 == 16) {
                            obj.u0(58);
                        }
                    } else {
                        if (i2 > 0) {
                            obj.u0(58);
                        }
                        byte b2 = address[i2];
                        byte[] bArr = u0g.a;
                        obj.w0((long) (((b2 & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (address[i2 + 1] & UByte.MAX_VALUE)));
                        i2 += 2;
                    }
                }
                return obj.q0();
            } else if (address.length == 4) {
                return j2.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                Locale locale = Locale.US;
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    if (lowerCase.length() == 0) {
                        return null;
                    }
                    int length = lowerCase.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        char charAt = lowerCase.charAt(i8);
                        if (Intrinsics.compare((int) charAt, 31) <= 0) {
                            return null;
                        }
                        if (Intrinsics.compare((int) charAt, 127) >= 0) {
                            return null;
                        }
                        if (StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                            return null;
                        }
                    }
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static String P(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < 'A' || charAt > 'Z') {
                i2++;
            } else {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static String Q(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < 'a' || charAt > 'z') {
                i2++;
            } else {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List R(java.util.List r18, defpackage.ms1 r19, defpackage.ms1 r20, defpackage.tm3 r21, long r22, long r24) {
        /*
            r0 = 2
            r1 = 1
            if (r18 == 0) goto L_0x0247
            boolean r3 = r18.isEmpty()
            if (r3 == 0) goto L_0x000c
            goto L_0x0247
        L_0x000c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r18.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0036
            java.lang.Object r6 = r5.next()
            fo3 r6 = (defpackage.fo3) r6
            long r9 = r6.x
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x001a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.add(r6)
            goto L_0x001a
        L_0x0036:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0053
            r5 = r20
            java.lang.Object r5 = r5.b
            km3 r5 = (defpackage.km3) r5
            hs7 r5 = r5.f
            java.lang.Object r5 = r5.get()
            s74 r5 = (defpackage.s74) r5
            a74 r5 = (defpackage.a74) r5
            c7d r5 = r5.e
            java.util.ArrayList r4 = r5.g(r4)
            goto L_0x0057
        L_0x0053:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0057:
            java.util.Iterator r5 = r18.iterator()
        L_0x005b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0245
            java.lang.Object r6 = r5.next()
            fo3 r6 = (defpackage.fo3) r6
            long r9 = r6.a
            r15 = r19
            java.lang.Object r11 = r15.b
            km3 r11 = (defpackage.km3) r11
            r13 = 0
            vk3 r9 = r11.p(r9, r13)
            long r11 = r6.b
            if (r9 == 0) goto L_0x0083
            vm3 r10 = r9.a
            um3 r10 = r10.c
            long r13 = r10.g
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0083
            goto L_0x005b
        L_0x0083:
            if (r9 == 0) goto L_0x008d
            vm3 r9 = r9.a
            long r13 = r9.b
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
        L_0x008d:
            r16 = r3
            r2 = r11
            r17 = 0
            goto L_0x00bb
        L_0x0093:
            um3 r9 = r9.c
            long r13 = r9.s
            long r13 = r13 + r22
            int r10 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r10 > 0) goto L_0x00b5
            java.lang.String r10 = "o54"
            java.lang.String r13 = "force update non-contact"
            defpackage.z68.c(r10, r13, new java.lang.Object[0])
            long r13 = r9.t
            r9 = r6
            r10 = r21
            r16 = r3
            r2 = r11
            r11 = r24
            r17 = 0
            um3 r9 = i(r9, r10, r11, r13)
            goto L_0x00c6
        L_0x00b5:
            r16 = r3
            r2 = r11
            r17 = 0
            goto L_0x00c6
        L_0x00bb:
            r13 = 0
            r9 = r6
            r10 = r21
            r11 = r24
            um3 r9 = i(r9, r10, r11, r13)
        L_0x00c6:
            long r10 = r6.x
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r13 = 0
            if (r12 != 0) goto L_0x00cf
        L_0x00cd:
            r14 = r13
            goto L_0x00e9
        L_0x00cf:
            java.util.Iterator r12 = r4.iterator()
        L_0x00d3:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00cd
            java.lang.Object r14 = r12.next()
            xdb r14 = (defpackage.xdb) r14
            long r7 = r14.w
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x00e6
            goto L_0x00e9
        L_0x00e6:
            r7 = 0
            goto L_0x00d3
        L_0x00e9:
            nm3 r7 = r9.c()
            long r8 = r6.a
            r7.a = r8
            r7.g = r2
            r7.h = r10
            int r2 = r6.z
            int r3 = defpackage.tr1.y(r2)
            java.lang.String r8 = " in proto model"
            java.lang.String r9 = "No such value for "
            if (r3 == 0) goto L_0x0130
            if (r3 == r1) goto L_0x012e
            if (r3 != r0) goto L_0x0107
            r2 = 3
            goto L_0x0131
        L_0x0107:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r9)
            if (r2 == r1) goto L_0x011e
            if (r2 == r0) goto L_0x011b
            r0 = 3
            if (r2 == r0) goto L_0x0118
            java.lang.String r0 = "null"
            goto L_0x0120
        L_0x0118:
            java.lang.String r0 = "FEMALE"
            goto L_0x0120
        L_0x011b:
            java.lang.String r0 = "MALE"
            goto L_0x0120
        L_0x011e:
            java.lang.String r0 = "UNKNOWN"
        L_0x0120:
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x012e:
            r2 = r0
            goto L_0x0131
        L_0x0130:
            r2 = r1
        L_0x0131:
            r7.l = r2
            java.lang.String r2 = r6.Y
            r7.o = r2
            java.lang.String r2 = r6.Z
            r7.p = r2
            long r2 = r6.w
            r7.e = r2
            java.lang.String r2 = r6.v0
            r7.q = r2
            ak3 r2 = r6.w0
            if (r2 != 0) goto L_0x0149
            r3 = r13
            goto L_0x0152
        L_0x0149:
            qm3 r3 = new qm3
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r2)
        L_0x0152:
            r7.u = r3
            int[] r2 = r6.x0
            r7.v = r2
            sm3 r2 = defpackage.sm3.b
            os3 r3 = r6.y
            if (r3 != 0) goto L_0x015f
            goto L_0x0181
        L_0x015f:
            int r10 = r3.ordinal()
            if (r10 == 0) goto L_0x017e
            if (r10 != r1) goto L_0x0169
            r13 = r2
            goto L_0x0181
        L_0x0169:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017e:
            sm3 r3 = defpackage.sm3.a
            r13 = r3
        L_0x0181:
            r7.i = r13
            if (r13 == 0) goto L_0x018c
            tm3 r3 = defpackage.tm3.b
            r7.k = r3
            r3 = r21
            goto L_0x0190
        L_0x018c:
            r3 = r21
            r7.k = r3
        L_0x0190:
            java.lang.String r8 = r6.c
            boolean r9 = defpackage.cvg.A(r8)
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x019d
            r7.b = r8
            goto L_0x01a1
        L_0x019d:
            if (r13 == r2) goto L_0x01a1
            r7.b = r10
        L_0x01a1:
            java.lang.String r8 = r6.o
            boolean r9 = defpackage.cvg.A(r8)
            if (r9 != 0) goto L_0x01ac
            r7.c = r8
            goto L_0x01b0
        L_0x01ac:
            if (r13 == r2) goto L_0x01b0
            r7.c = r10
        L_0x01b0:
            java.util.List r2 = r6.v
            java.util.ArrayList r2 = defpackage.qe8.j(r2)
            r7.f = r2
            if (r14 == 0) goto L_0x01ee
            java.lang.String r2 = r14.X
            boolean r8 = defpackage.cvg.A(r2)
            if (r8 != 0) goto L_0x01c6
            r7.d = r2
            r13 = r1
            goto L_0x01c8
        L_0x01c6:
            r13 = r17
        L_0x01c8:
            java.lang.String r2 = r14.y
            boolean r8 = defpackage.cvg.A(r2)
            if (r8 != 0) goto L_0x01f0
            java.lang.String r8 = r14.z
            if (r8 == 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r8 = r10
        L_0x01d6:
            pm3 r9 = new pm3
            om3 r11 = defpackage.om3.b
            r9.<init>(r2, r11, r8)
            java.util.List r2 = r7.f
            if (r2 != 0) goto L_0x01e8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.f = r2
        L_0x01e8:
            java.util.List r2 = r7.f
            r2.add(r9)
            goto L_0x01f0
        L_0x01ee:
            r13 = r17
        L_0x01f0:
            if (r13 != 0) goto L_0x01f4
            r7.d = r10
        L_0x01f4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r6 = r6.X
            java.util.Iterator r6 = r6.iterator()
        L_0x01ff:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r6.next()
            eo3 r8 = (defpackage.eo3) r8
            int r8 = r8.ordinal()
            if (r8 == r1) goto L_0x022d
            r9 = 3
            if (r8 == r9) goto L_0x0227
            r10 = 4
            if (r8 == r10) goto L_0x0221
            r10 = 5
            if (r8 == r10) goto L_0x021b
            goto L_0x01ff
        L_0x021b:
            rm3 r8 = defpackage.rm3.o
            r2.add(r8)
            goto L_0x01ff
        L_0x0221:
            rm3 r8 = defpackage.rm3.c
            r2.add(r8)
            goto L_0x01ff
        L_0x0227:
            rm3 r8 = defpackage.rm3.b
            r2.add(r8)
            goto L_0x01ff
        L_0x022d:
            r9 = 3
            rm3 r8 = defpackage.rm3.a
            r2.add(r8)
            goto L_0x01ff
        L_0x0234:
            r9 = 3
            r7.n = r2
            um3 r2 = r7.a()
            r6 = r16
            r6.add(r2)
            r3 = r6
            r7 = 0
            goto L_0x005b
        L_0x0245:
            r6 = r3
            return r6
        L_0x0247:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o54.R(java.util.List, ms1, ms1, tm3, long, long):java.util.List");
    }

    public static boolean S(int i2, l8b l8b, boolean z) {
        if (l8b.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a("too short header: " + l8b.a(), (RuntimeException) null);
        } else if (l8b.u() != i2) {
            if (z) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i2), (RuntimeException) null);
        } else if (l8b.u() == 118 && l8b.u() == 111 && l8b.u() == 114 && l8b.u() == 98 && l8b.u() == 105 && l8b.u() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.a("expected characters 'vorbis'", (RuntimeException) null);
        }
    }

    public static void T(int i2, int i3) {
        String str;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                str = y64.P("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i3 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15);
                sb.append("negative size: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str = y64.P("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void U(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? V(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? V(i3, i4, "end index") : y64.P("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static String V(int i2, int i3, String str) {
        if (i2 < 0) {
            return y64.P("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return y64.P("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static ru0 a(int i2, int i3, cu0 cu0) {
        ru0 dh3;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            cu0 = cu0.a;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 == 0) {
                    dh3 = cu0 == cu0.a ? new ru0(0, (Function1) null) : new dh3(1, cu0, (Function1) null);
                } else if (i2 != Integer.MAX_VALUE) {
                    return cu0 == cu0.a ? new ru0(i2, (Function1) null) : new dh3(i2, cu0, (Function1) null);
                } else {
                    dh3 = new ru0(IntCompanionObject.MAX_VALUE, (Function1) null);
                }
            } else if (cu0 == cu0.a) {
                return new dh3(1, cu0.b, (Function1) null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (cu0 == cu0.a) {
            x02.l.getClass();
            dh3 = new ru0(w02.b, (Function1) null);
        } else {
            dh3 = new dh3(1, cu0, (Function1) null);
        }
        return dh3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.JsonEncodingException, java.lang.IllegalArgumentException] */
    public static final JsonEncodingException b(usd usd) {
        return new IllegalArgumentException("Value of type '" + usd.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + usd.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.IllegalArgumentException, kotlinx.serialization.json.internal.JsonDecodingException] */
    public static final JsonDecodingException c(String str, CharSequence charSequence, int i2) {
        StringBuilder m2 = g63.m(str, "\nJSON input: ");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = str2 + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str3 = i3 <= 0 ? "" : str2;
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder o = tr1.o(str3);
                o.append(charSequence.subSequence(RangesKt.coerceAtLeast(i3, 0), RangesKt.coerceAtMost(i4, charSequence.length())).toString());
                o.append(str2);
                charSequence = o.toString();
            }
        }
        m2.append(charSequence);
        String sb = m2.toString();
        if (i2 >= 0) {
            sb = "Unexpected JSON token at offset " + i2 + ": " + sb;
        }
        return new IllegalArgumentException(sb);
    }

    public static final h3b d(Context context, AttributeSet attributeSet) {
        h3b.E0.getClass();
        if (!h3b.G0) {
            return new ot7(context, attributeSet);
        }
        h3b h3b = new h3b(context, attributeSet);
        h3b.addView(h3b.getTitleTextView(), new FrameLayout.LayoutParams(-2, -2));
        h3b.l();
        h3b.m();
        return h3b;
    }

    public static final Uri e(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (StringsKt__StringsJVMKt.startsWith(str, "file:", true) || StringsKt__StringsJVMKt.startsWith(str, HttpHost.DEFAULT_SCHEME_NAME, true) || StringsKt__StringsJVMKt.startsWith(str, "content", true) || StringsKt__StringsJVMKt.startsWith(str, "android.resource", true) || StringsKt__StringsJVMKt.startsWith(str, "res:/", true)) ? Uri.parse(str) : Uri.parse("file:".concat(str));
    }

    public static final Bundle f(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(str, (String) null);
            } else if (component2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) component2).booleanValue());
            } else if (component2 instanceof Byte) {
                bundle.putByte(str, ((Number) component2).byteValue());
            } else if (component2 instanceof Character) {
                bundle.putChar(str, ((Character) component2).charValue());
            } else if (component2 instanceof Double) {
                bundle.putDouble(str, ((Number) component2).doubleValue());
            } else if (component2 instanceof Float) {
                bundle.putFloat(str, ((Number) component2).floatValue());
            } else if (component2 instanceof Integer) {
                bundle.putInt(str, ((Number) component2).intValue());
            } else if (component2 instanceof Long) {
                bundle.putLong(str, ((Number) component2).longValue());
            } else if (component2 instanceof Short) {
                bundle.putShort(str, ((Number) component2).shortValue());
            } else if (component2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) component2);
            } else if (component2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) component2);
            } else if (component2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) component2);
            } else if (component2 instanceof Object[]) {
                Class<?> componentType = component2.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) component2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) component2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) component2);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) component2);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + Typography.quote);
                }
            } else if (component2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) component2);
            } else if (component2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) component2);
            } else if (component2 instanceof Size) {
                dv0.a(bundle, str, (Size) component2);
            } else if (component2 instanceof SizeF) {
                dv0.b(bundle, str, (SizeF) component2);
            } else {
                throw new IllegalArgumentException("Illegal value type " + component2.getClass().getCanonicalName() + " for key \"" + str + Typography.quote);
            }
        }
        return bundle;
    }

    public static void g(nm3 nm3, String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                str2 = "";
            }
            om3 om3 = om3.o;
            if (!nm3.f.isEmpty()) {
                nm3.f.set(0, new pm3(str, ((pm3) nm3.f.get(0)).c, str2));
                return;
            }
            nm3.f.add(0, new pm3(str, om3, str2));
            return;
        }
        nm3.f.remove(0);
    }

    public static void h(View view, x6 x6Var) {
        new gb3(10, view).z(300, TimeUnit.MILLISECONDS).s(qe.a()).a(new or7(new ibd(x6Var, 0), new qbb(16), m58.e));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [nm3, java.lang.Object] */
    public static um3 i(fo3 fo3, tm3 tm3, long j2, long j3) {
        ArrayList j4 = qe8.j(fo3.v);
        ak3 ak3 = fo3.w0;
        qm3 qm3 = ak3 == null ? null : new qm3((String) ak3.a);
        ? obj = new Object();
        obj.a = fo3.a;
        obj.f = j4;
        obj.o = fo3.Y;
        obj.p = fo3.Z;
        obj.k = tm3;
        obj.b = null;
        obj.c = null;
        obj.e = fo3.w;
        obj.s = j2;
        obj.t = j3;
        obj.u = qm3;
        obj.v = fo3.x0;
        return obj.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r13 - r9) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        if (r7 == r0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d4, code lost:
        if (r8 != -1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d7, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress j(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r5 = -1
            r7 = 0
            r6 = r17
            r8 = r5
            r9 = r8
        L_0x000e:
            r10 = 0
            if (r6 >= r0) goto L_0x00d1
            if (r7 != r2) goto L_0x0014
            return r10
        L_0x0014:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            if (r11 > r0) goto L_0x0031
            java.lang.String r13 = "::"
            boolean r13 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r1, r13, r6, false, 4, (java.lang.Object) null)
            if (r13 == 0) goto L_0x0031
            if (r8 == r5) goto L_0x0025
            return r10
        L_0x0025:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002d
            r0 = r2
            r8 = r7
            goto L_0x00d2
        L_0x002d:
            r8 = r7
            r9 = r11
            goto L_0x00a0
        L_0x0031:
            if (r7 == 0) goto L_0x003d
            java.lang.String r11 = ":"
            boolean r11 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r1, r11, r6, false, 4, (java.lang.Object) null)
            if (r11 == 0) goto L_0x0040
            int r6 = r6 + 1
        L_0x003d:
            r9 = r6
            goto L_0x00a0
        L_0x0040:
            java.lang.String r11 = "."
            boolean r6 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r1, r11, r6, false, 4, (java.lang.Object) null)
            if (r6 == 0) goto L_0x009f
            int r6 = r7 + -2
            r11 = r6
        L_0x004b:
            if (r9 >= r0) goto L_0x0096
            if (r11 != r2) goto L_0x0050
            goto L_0x009f
        L_0x0050:
            if (r11 == r6) goto L_0x005d
            char r13 = r1.charAt(r9)
            r14 = 46
            if (r13 == r14) goto L_0x005b
            goto L_0x009f
        L_0x005b:
            int r9 = r9 + 1
        L_0x005d:
            r13 = r9
            r14 = 0
        L_0x005f:
            if (r13 >= r0) goto L_0x0087
            char r15 = r1.charAt(r13)
            r4 = 48
            int r16 = kotlin.jvm.internal.Intrinsics.compare((int) r15, (int) r4)
            if (r16 < 0) goto L_0x0087
            r2 = 57
            int r2 = kotlin.jvm.internal.Intrinsics.compare((int) r15, (int) r2)
            if (r2 <= 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            if (r14 != 0) goto L_0x007b
            if (r9 == r13) goto L_0x007b
            goto L_0x009f
        L_0x007b:
            int r14 = r14 * 10
            int r14 = r14 + r15
            int r14 = r14 - r4
            if (r14 <= r12) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            int r13 = r13 + 1
            r2 = 16
            goto L_0x005f
        L_0x0087:
            int r2 = r13 - r9
            if (r2 != 0) goto L_0x008c
            goto L_0x009f
        L_0x008c:
            int r2 = r11 + 1
            byte r4 = (byte) r14
            r3[r11] = r4
            r11 = r2
            r9 = r13
            r2 = 16
            goto L_0x004b
        L_0x0096:
            int r0 = r7 + 2
            if (r11 != r0) goto L_0x009f
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00d2
        L_0x009f:
            return r10
        L_0x00a0:
            r6 = r9
            r2 = 0
        L_0x00a2:
            if (r6 >= r0) goto L_0x00b5
            char r4 = r1.charAt(r6)
            int r4 = defpackage.u0g.q(r4)
            if (r4 != r5) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00b5:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d0
            r11 = 4
            if (r4 <= r11) goto L_0x00bd
            goto L_0x00d0
        L_0x00bd:
            int r4 = r7 + 1
            int r10 = r2 >>> 8
            r10 = r10 & r12
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r7 + 2
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            goto L_0x000e
        L_0x00d0:
            return r10
        L_0x00d1:
            r0 = r2
        L_0x00d2:
            if (r7 == r0) goto L_0x00e6
            if (r8 != r5) goto L_0x00d7
            return r10
        L_0x00d7:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00e6:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o54.j(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void k(mq4 mq4) {
        if (!y(mq4)) {
            mq4.dispose();
        }
    }

    public static boolean l(CharSequence charSequence, CharSequence charSequence2) {
        char c2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence2.charAt(i2);
            if (charAt != charAt2 && ((c2 = (char) ((charAt | ' ') - 'a')) >= 26 || c2 != ((char) ((charAt2 | ' ') - 'a')))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [wdb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v10, types: [eeb, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection o(android.content.Context r24, defpackage.m95 r25) {
        /*
            java.lang.String r2 = "loadPhonebook failed"
            java.lang.String r0 = "/photo"
            java.lang.String r3 = "vnd.android.cursor.item/name"
            java.lang.String r4 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r5 = "o54"
            android.content.ContentResolver r6 = r24.getContentResolver()
            if (r6 != 0) goto L_0x0015
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0015:
            ya8 r12 = new ya8
            r13 = 0
            r12.<init>((java.lang.Object) r13)
            ya8 r14 = new ya8
            r14.<init>((java.lang.Object) r13)
            java.lang.String r9 = "mimetype IN (?, ?)"
            java.lang.String[] r10 = new java.lang.String[]{r4, r3}     // Catch:{ Exception -> 0x01d7, all -> 0x01d3 }
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x01d7, all -> 0x01d3 }
            java.lang.String[] r8 = i     // Catch:{ Exception -> 0x01d7, all -> 0x01d3 }
            java.lang.String r11 = "display_name ASC"
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01d7, all -> 0x01d3 }
            if (r6 == 0) goto L_0x01c0
            java.lang.String r7 = "_id"
            int r7 = r6.getColumnIndex(r7)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r8 = "mimetype"
            int r8 = r6.getColumnIndex(r8)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r9 = "contact_id"
            int r9 = r6.getColumnIndex(r9)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r10 = "display_name"
            int r10 = r6.getColumnIndex(r10)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r11 = "data1"
            int r11 = r6.getColumnIndex(r11)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r1 = "photo_uri"
            int r1 = r6.getColumnIndex(r1)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r15 = "data2"
            int r15 = r6.getColumnIndex(r15)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r13 = "data3"
            int r13 = r6.getColumnIndex(r13)     // Catch:{ Exception -> 0x01c4 }
            r16 = r2
            java.lang.String r2 = "data5"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x01bc }
        L_0x006a:
            boolean r17 = r6.moveToNext()     // Catch:{ Exception -> 0x01bc }
            if (r17 == 0) goto L_0x01c0
            r18 = r2
            r17 = r3
            long r2 = r6.getLong(r9)     // Catch:{ Exception -> 0x01bc }
            r19 = r5
            java.lang.String r5 = r6.getString(r8)     // Catch:{ Exception -> 0x01b9 }
            java.lang.Object r20 = r14.f(r2)     // Catch:{ Exception -> 0x01b9 }
            eeb r20 = (defpackage.eeb) r20     // Catch:{ Exception -> 0x01b9 }
            if (r20 != 0) goto L_0x00b2
            r21 = r8
            eeb r8 = new eeb     // Catch:{ Exception -> 0x00ae }
            r8.<init>()     // Catch:{ Exception -> 0x00ae }
            r22 = r14
            r14 = 0
            r8.a = r14     // Catch:{ Exception -> 0x00ed }
            r8.b = r14     // Catch:{ Exception -> 0x00ed }
            r8.c = r14     // Catch:{ Exception -> 0x00ed }
            r14 = 0
            r8.d = r14     // Catch:{ Exception -> 0x00ed }
            r23 = r13
            r13 = 0
            r8.e = r13     // Catch:{ Exception -> 0x00ed }
        L_0x009f:
            r13 = 0
            goto L_0x00bb
        L_0x00a1:
            r13 = r6
            goto L_0x029a
        L_0x00a4:
            r2 = r16
            r3 = r19
            r1 = r22
            goto L_0x01e0
        L_0x00ac:
            r0 = move-exception
            goto L_0x00a1
        L_0x00ae:
            r0 = move-exception
            r22 = r14
            goto L_0x00a4
        L_0x00b2:
            r21 = r8
            r23 = r13
            r22 = r14
            r8 = r20
            goto L_0x009f
        L_0x00bb:
            r8.a = r13     // Catch:{ Exception -> 0x01b5 }
            r8.b = r13     // Catch:{ Exception -> 0x01b5 }
            boolean r13 = r4.equals(r5)     // Catch:{ Exception -> 0x01b5 }
            if (r13 == 0) goto L_0x0133
            java.lang.String r5 = r6.getString(r11)     // Catch:{ Exception -> 0x00ed }
            boolean r13 = defpackage.cvg.A(r5)     // Catch:{ Exception -> 0x00ed }
            if (r13 == 0) goto L_0x00dc
            r3 = r17
            r2 = r18
            r5 = r19
            r8 = r21
            r14 = r22
            r13 = r23
            goto L_0x006a
        L_0x00dc:
            java.lang.Object r13 = r12.f(r2)     // Catch:{ Exception -> 0x00ed }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ Exception -> 0x00ed }
            if (r13 != 0) goto L_0x00ef
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x00ed }
            ws r13 = defpackage.n54.b(r5)     // Catch:{ Exception -> 0x00ed }
            goto L_0x00f2
        L_0x00ed:
            r0 = move-exception
            goto L_0x00a4
        L_0x00ef:
            r13.add(r5)     // Catch:{ Exception -> 0x00ed }
        L_0x00f2:
            r12.i(r2, r13)     // Catch:{ Exception -> 0x00ed }
            int r5 = r6.getInt(r9)     // Catch:{ Exception -> 0x00ed }
            r8.d = r5     // Catch:{ Exception -> 0x00ed }
            long r13 = r6.getLong(r7)     // Catch:{ Exception -> 0x00ed }
            r8.e = r13     // Catch:{ Exception -> 0x00ed }
            java.lang.String r5 = r6.getString(r10)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r13 = r8.a     // Catch:{ Exception -> 0x00ed }
            if (r13 != 0) goto L_0x010b
            r8.a = r5     // Catch:{ Exception -> 0x00ed }
        L_0x010b:
            java.lang.String r5 = r6.getString(r1)     // Catch:{ Exception -> 0x00ed }
            boolean r13 = defpackage.cvg.A(r5)     // Catch:{ Exception -> 0x00ed }
            if (r13 != 0) goto L_0x0121
            boolean r13 = r5.endsWith(r0)     // Catch:{ Exception -> 0x00ed }
            if (r13 == 0) goto L_0x0121
            java.lang.String r13 = ""
            java.lang.String r5 = r5.replace(r0, r13)     // Catch:{ Exception -> 0x00ed }
        L_0x0121:
            r8.c = r5     // Catch:{ Exception -> 0x00ed }
            r20 = r1
            r13 = r17
            r1 = r22
            r14 = r23
            r17 = r0
            r23 = r18
            r18 = r4
            goto L_0x019b
        L_0x0133:
            r13 = r17
            boolean r5 = r13.equals(r5)     // Catch:{ Exception -> 0x01b5 }
            if (r5 == 0) goto L_0x0190
            java.lang.String r5 = r6.getString(r15)     // Catch:{ Exception -> 0x00ed }
            r17 = r0
            r14 = r23
            java.lang.String r0 = r6.getString(r14)     // Catch:{ Exception -> 0x00ed }
            r20 = r1
            r1 = r18
            r18 = r4
            java.lang.String r4 = r6.getString(r1)     // Catch:{ Exception -> 0x00ed }
            boolean r23 = defpackage.cvg.A(r5)     // Catch:{ Exception -> 0x00ed }
            if (r23 == 0) goto L_0x0164
            boolean r4 = defpackage.cvg.D(r0)     // Catch:{ Exception -> 0x00ed }
            if (r4 == 0) goto L_0x015f
            r8.a = r0     // Catch:{ Exception -> 0x00ed }
        L_0x015f:
            r23 = r1
        L_0x0161:
            r1 = r22
            goto L_0x019b
        L_0x0164:
            boolean r23 = defpackage.cvg.D(r4)     // Catch:{ Exception -> 0x00ed }
            if (r23 == 0) goto L_0x0183
            r23 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ed }
            r1.<init>()     // Catch:{ Exception -> 0x00ed }
            r1.append(r5)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r5 = " "
            r1.append(r5)     // Catch:{ Exception -> 0x00ed }
            r1.append(r4)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ed }
            r8.a = r1     // Catch:{ Exception -> 0x00ed }
            goto L_0x0187
        L_0x0183:
            r23 = r1
            r8.a = r5     // Catch:{ Exception -> 0x00ed }
        L_0x0187:
            boolean r1 = defpackage.cvg.D(r0)     // Catch:{ Exception -> 0x00ed }
            if (r1 == 0) goto L_0x0161
            r8.b = r0     // Catch:{ Exception -> 0x00ed }
            goto L_0x0161
        L_0x0190:
            r17 = r0
            r20 = r1
            r14 = r23
            r23 = r18
            r18 = r4
            goto L_0x0161
        L_0x019b:
            r1.i(r2, r8)     // Catch:{ Exception -> 0x01af }
            r3 = r13
            r13 = r14
            r0 = r17
            r4 = r18
            r5 = r19
            r8 = r21
            r2 = r23
            r14 = r1
            r1 = r20
            goto L_0x006a
        L_0x01af:
            r0 = move-exception
        L_0x01b0:
            r2 = r16
        L_0x01b2:
            r3 = r19
            goto L_0x01e0
        L_0x01b5:
            r0 = move-exception
            r1 = r22
            goto L_0x01b0
        L_0x01b9:
            r0 = move-exception
        L_0x01ba:
            r1 = r14
            goto L_0x01b0
        L_0x01bc:
            r0 = move-exception
            r19 = r5
            goto L_0x01ba
        L_0x01c0:
            r19 = r5
            r1 = r14
            goto L_0x01cb
        L_0x01c4:
            r0 = move-exception
            r16 = r2
            r19 = r5
            r1 = r14
            goto L_0x01b2
        L_0x01cb:
            if (r6 == 0) goto L_0x01d0
            r6.close()
        L_0x01d0:
            r3 = r19
            goto L_0x01f5
        L_0x01d3:
            r0 = move-exception
            r13 = 0
            goto L_0x029a
        L_0x01d7:
            r0 = move-exception
            r16 = r2
            r19 = r5
            r1 = r14
            r3 = r19
            r6 = 0
        L_0x01e0:
            defpackage.z68.f(r3, r2, r0)     // Catch:{ all -> 0x00ac }
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x00ac }
            r0.<init>(r2)     // Catch:{ all -> 0x00ac }
            r2 = r25
            uta r2 = (defpackage.uta) r2     // Catch:{ all -> 0x00ac }
            r4 = 1
            r2.c(r0, r4)     // Catch:{ all -> 0x00ac }
            if (r6 == 0) goto L_0x01f5
            r6.close()
        L_0x01f5:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r14 = 0
        L_0x01fb:
            int r2 = r12.k()
            if (r14 >= r2) goto L_0x0295
            long r4 = r12.h(r14)
            java.lang.Object r2 = r12.l(r14)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r1.f(r4)
            eeb r4 = (defpackage.eeb) r4
            if (r4 != 0) goto L_0x0225
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r4 = "contact is null"
            r5 = 0
            defpackage.z68.n(r3, r5, r4, r2)
        L_0x0220:
            r2 = 0
            r4 = 1
            r6 = 0
            goto L_0x0292
        L_0x0225:
            if (r2 == 0) goto L_0x022d
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x022f
        L_0x022d:
            r2 = 0
            goto L_0x0285
        L_0x022f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0233:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0220
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            wdb r6 = new wdb
            r6.<init>()
            int r7 = r4.d
            r6.b = r7
            r6.c = r5
            java.lang.String r7 = r4.a
            boolean r7 = defpackage.cvg.A(r7)
            if (r7 == 0) goto L_0x0254
            r7 = r5
            goto L_0x0256
        L_0x0254:
            java.lang.String r7 = r4.a
        L_0x0256:
            r6.e = r7
            java.lang.String r7 = r4.b
            r6.f = r7
            long r7 = r4.e
            r6.a = r7
            r7 = 0
            r6.h = r7
            java.lang.String r7 = r4.c
            r6.g = r7
            java.lang.Object r7 = r0.get(r5)
            wdb r7 = (defpackage.wdb) r7
            if (r7 != 0) goto L_0x0273
            r0.put(r5, r6)
            goto L_0x0233
        L_0x0273:
            java.lang.String r7 = r7.a()
            java.lang.String r8 = r6.a()
            int r7 = r8.compareTo(r7)
            if (r7 >= 0) goto L_0x0233
            r0.put(r5, r6)
            goto L_0x0233
        L_0x0285:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r5 = "phones is null or empty"
            r6 = 0
            defpackage.z68.n(r3, r6, r5, r4)
            r4 = 1
        L_0x0292:
            int r14 = r14 + r4
            goto L_0x01fb
        L_0x0295:
            java.util.Collection r0 = r0.values()
            return r0
        L_0x029a:
            if (r13 == 0) goto L_0x029f
            r13.close()
        L_0x029f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o54.o(android.content.Context, m95):java.util.Collection");
    }

    public static String p(String str) {
        if (cvg.A(str)) {
            return null;
        }
        try {
            ArrayList q = q(str);
            if (q.size() > 0) {
                return (String) q.get(0);
            }
            return null;
        } catch (Exception e2) {
            z68.f("o54", "getPhotoToken: exception while getting photo token from response", e2);
            return null;
        }
    }

    public static ArrayList q(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_msg")) {
                z68.c("o54", "getPhotoToken: got json error: %s", jSONObject.getString("error_msg"));
                return arrayList;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("photos");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                arrayList.add(jSONObject2.getJSONObject(keys.next()).getString(ApiProtocol.KEY_TOKEN));
            }
            return arrayList;
        } catch (Exception e2) {
            z68.c("o54", "exception while parsing photo upload response: " + e2.getMessage(), new Object[0]);
            throw e2;
        }
    }

    public static final String r() {
        String str = n;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        n = processName;
        return processName;
    }

    public static String s(String str) {
        try {
            JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
            if (jSONObject.has(ApiProtocol.KEY_TOKEN)) {
                return jSONObject.getString(ApiProtocol.KEY_TOKEN);
            }
            return null;
        } catch (JSONException e2) {
            z68.f("o54", "getStickerToken: error", e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0051 A[SYNTHETIC, Splitter:B:37:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x005e A[SYNTHETIC, Splitter:B:45:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String t(android.content.ContentResolver r5, android.net.Uri r6, defpackage.m95 r7) {
        /*
            java.lang.String r0 = "o54"
            r1 = 0
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r6, r2)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r5 != 0) goto L_0x001c
            java.lang.String r6 = "getVCardStringFromUri: failed to get file descriptor"
            defpackage.z68.f(r0, r6, r1)     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            if (r5 == 0) goto L_0x0015
            r5.close()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            return r1
        L_0x0016:
            r2 = r1
            goto L_0x003a
        L_0x0018:
            r6 = move-exception
            goto L_0x0059
        L_0x001a:
            r6 = move-exception
            goto L_0x0016
        L_0x001c:
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            java.lang.String r7 = defpackage.j4b.S(r6)     // Catch:{ Exception -> 0x002f, all -> 0x002b }
            defpackage.j4b.k(r6)
            r5.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            return r7
        L_0x002b:
            r7 = move-exception
            r1 = r6
            r6 = r7
            goto L_0x0059
        L_0x002f:
            r2 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L_0x003a
        L_0x0034:
            r6 = move-exception
            r5 = r1
            goto L_0x0059
        L_0x0037:
            r6 = move-exception
            r5 = r1
            r2 = r5
        L_0x003a:
            java.lang.String r3 = "getVCardStringFromUri: failed to get vCardString from Uri"
            defpackage.z68.f(r0, r3, r6)     // Catch:{ all -> 0x0057 }
            ru.ok.tamtam.util.HandledException r6 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "getVCardStringFromUri failed"
            r6.<init>(r0)     // Catch:{ all -> 0x0057 }
            uta r7 = (defpackage.uta) r7     // Catch:{ all -> 0x0057 }
            r0 = 1
            r7.c(r6, r0)     // Catch:{ all -> 0x0057 }
            defpackage.j4b.k(r2)
            if (r5 == 0) goto L_0x0054
            r5.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r1
        L_0x0055:
            r1 = r2
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            goto L_0x0055
        L_0x0059:
            defpackage.j4b.k(r1)
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o54.t(android.content.ContentResolver, android.net.Uri, m95):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r10.isClosed() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r10.isClosed() == false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.SparseArray u(android.content.Context r11, java.util.List r12, defpackage.m95 r13) {
        /*
            java.lang.String r0 = "getVCardsByPhoneContactIds failed"
            java.lang.String r1 = "_id IN ("
            android.util.SparseArray r2 = new android.util.SparseArray
            int r3 = r12.size()
            r2.<init>(r3)
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.lang.String r3 = "o54"
            if (r11 != 0) goto L_0x001b
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: contentResolver is null"
            defpackage.z68.e(r3, r11)
            return r2
        L_0x001b:
            r10 = 0
            java.lang.String r4 = ","
            java.lang.String r12 = android.text.TextUtils.join(r4, r12)     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x0053 }
            java.lang.String[] r6 = h     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0053 }
            r4.append(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r12 = ")"
            r4.append(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r8 = 0
            r9 = 0
            r4 = r11
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0053 }
            if (r10 != 0) goto L_0x0055
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: cursor is null"
            defpackage.z68.e(r3, r11)     // Catch:{ Exception -> 0x0053 }
            if (r10 == 0) goto L_0x0050
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x0050
            r10.close()
        L_0x0050:
            return r2
        L_0x0051:
            r11 = move-exception
            goto L_0x00ba
        L_0x0053:
            r11 = move-exception
            goto L_0x00a2
        L_0x0055:
            java.lang.String r12 = "_id"
            int r12 = r10.getColumnIndex(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = "lookup"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x0053 }
        L_0x0061:
            boolean r4 = r10.moveToNext()     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x0098
            int r4 = r10.getInt(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = r10.getString(r1)     // Catch:{ Exception -> 0x0053 }
            boolean r6 = defpackage.cvg.A(r5)     // Catch:{ Exception -> 0x0053 }
            if (r6 == 0) goto L_0x0084
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: lookupKey is empty or null"
            defpackage.z68.e(r3, r11)     // Catch:{ Exception -> 0x0053 }
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x0083
            r10.close()
        L_0x0083:
            return r2
        L_0x0084:
            android.net.Uri r6 = android.provider.ContactsContract.Contacts.CONTENT_VCARD_URI     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r5 = android.net.Uri.withAppendedPath(r6, r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = t(r11, r5, r13)     // Catch:{ Exception -> 0x0053 }
            boolean r6 = defpackage.cvg.A(r5)     // Catch:{ Exception -> 0x0053 }
            if (r6 != 0) goto L_0x0061
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0061
        L_0x0098:
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x00b9
        L_0x009e:
            r10.close()
            goto L_0x00b9
        L_0x00a2:
            defpackage.z68.f(r3, r0, r11)     // Catch:{ all -> 0x0051 }
            ru.ok.tamtam.util.HandledException r11 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0051 }
            r11.<init>(r0)     // Catch:{ all -> 0x0051 }
            uta r13 = (defpackage.uta) r13     // Catch:{ all -> 0x0051 }
            r12 = 1
            r13.c(r11, r12)     // Catch:{ all -> 0x0051 }
            if (r10 == 0) goto L_0x00b9
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x00b9
            goto L_0x009e
        L_0x00b9:
            return r2
        L_0x00ba:
            if (r10 == 0) goto L_0x00c5
            boolean r12 = r10.isClosed()
            if (r12 != 0) goto L_0x00c5
            r10.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o54.u(android.content.Context, java.util.List, m95):android.util.SparseArray");
    }

    public static int v(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static final void w(mqf mqf, String str) {
        mqf.z(mqf.b - 1, a81.m("Trailing comma before the end of JSON ", str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void x(mqf mqf) {
        w(mqf, "object");
        throw null;
    }

    public static boolean y(mq4 mq4) {
        return mq4 == null || mq4.f();
    }

    public static final boolean z(byte b2) {
        byte b3 = b2 & UByte.MAX_VALUE;
        return b3 <= Byte.MAX_VALUE || b3 >= 224;
    }

    public abstract ngf m();

    public abstract Integer n();
}
