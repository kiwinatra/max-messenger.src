package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzdn;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.uuid.Uuid;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: tf6  reason: default package */
public abstract class tf6 {
    public static sf6 a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String[] c = {"🙂", "💬", "👍", "🤝", "🤓", "👥", "🍀", "☕", "🌏", "⏰", "⏳", "🔈", "🔔", "💻", "🔎", "📚", "💡", "📁", "📊", "📍", "📎", "🔒", "✳️", "🔴", "🟠", "🟡", "🟢", "🔵", "🟣", "🟤", "⚫", "⚪", "✅", "🟥", "🟧", "🟨", "🟩", "🟦", "🟪", "🟫", "⬛", "⬜", "🔶", "🔷", "*️⃣", "✴️", "❇️", "☑️", "⚙️", "📌", "📋", "📈", "✏️", "✒️", "🗒", "🗂", "💼", "📝", "📫", "📢", "📣", "🖼", "🍏", "🍎", "☘️", "🌿", "🗯", "👁️‍", "🚩", "🔲", "🔘"};
    public static final s9a d = new s9a(17, (byte) 0);
    public static boolean e;

    public static ArrayList A(JSONObject jSONObject) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("roles")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(xe1.valueOf(optJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    public static void A0(int i, ByteArrayOutputStream byteArrayOutputStream) {
        z0(byteArrayOutputStream, (long) i, 2);
    }

    public static rp6 B(k6f k6f) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "switch-room");
        if (k6f == null) {
            return new rp6(jSONObject);
        }
        zwd zwd = k6f.a;
        if (zwd != null && (zwd instanceof ywd)) {
            jSONObject.put("toRoomId", ((ywd) zwd).a);
        }
        ue1 ue1 = k6f.b;
        if (ue1 != null) {
            jSONObject.put("participantId", (Object) ue1.c());
        }
        return new rp6(jSONObject);
    }

    public static int B0(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void C() {
        P();
    }

    public static /* bridge */ /* synthetic */ void C0(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!I0(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !I0(b4) && !I0(b5)) {
                byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((b6 >>> 10) + 55232);
                cArr[i + 1] = (char) ((b6 & UByte.MAX_VALUE) + UByte.MIN_VALUE);
                return;
            }
        }
        throw zzdn.a();
    }

    public static final boolean D(int i, int i2) {
        return i == i2;
    }

    public static /* bridge */ /* synthetic */ void D0(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!I0(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!I0(b4)) {
                cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzdn.a();
    }

    public static ue1 E(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("participantId");
        String optString = jSONObject.optString("participantType");
        return new ue1("GROUP".equals(optString) ? 2 : 1, jSONObject.optInt("deviceIdx"), optLong);
    }

    public static void E0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static ue1 F(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("id");
        String optString = jSONObject.optString("idType");
        return new ue1("GROUP".equals(optString) ? 2 : 1, jSONObject.optInt("deviceIdx"), optLong);
    }

    public static /* bridge */ /* synthetic */ void F0(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || I0(b3)) {
            throw zzdn.a();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static kbb G(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        mbb mbb = null;
        if (optJSONObject == null) {
            return null;
        }
        int optInt = optJSONObject.optInt("maxDimension");
        int optInt2 = optJSONObject.optInt("maxBitrateK");
        int optInt3 = optJSONObject.optInt("maxFramerate");
        String optString = optJSONObject.optString("degradationPreference");
        try {
            mbb = mbb.a(optJSONObject.getJSONObject("bitrates"));
        } catch (Exception unused) {
        }
        return new kbb(optInt, optInt, optInt2, optInt3, optString, mbb, 1, 0, "");
    }

    public static void G0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static ap0 H(aq9 aq9) {
        long j;
        aq9 aq92 = aq9;
        aq92.R(4);
        int readUnsignedShort = aq9.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            aq92.R(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int K = aq9.K();
                aq92.R(4);
                j = aq9.W();
                aq92.R(4);
                if (1835365473 == K) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                aq92.R((int) (j - aq9.h()));
                aq92.R(12);
                long W = aq9.W();
                for (int i2 = 0; ((long) i2) < W; i2++) {
                    int K2 = aq9.K();
                    long W2 = aq9.W();
                    long W3 = aq9.W();
                    if (1164798569 == K2 || 1701669481 == K2) {
                        return new ap0(8, W2 + j, W3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static /* bridge */ /* synthetic */ boolean H0(byte b2) {
        return b2 >= 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x07d4, code lost:
        r3 = r1 + 1;
        r41[r1] = 'F';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x07e4, code lost:
        r3 = r1 + 1;
        r41[r1] = 'm';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x07ec, code lost:
        r3 = r1 + 1;
        r41[r1] = 'f';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x07fc, code lost:
        r3 = r1 + 1;
        r41[r1] = 'V';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0802, code lost:
        r3 = r1 + 1;
        r41[r1] = 'O';
        r1 = r1 + 2;
        r41[r3] = 'U';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x080e, code lost:
        r3 = r1 + 1;
        r41[r1] = 'M';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0816, code lost:
        r3 = r1 + 1;
        r41[r1] = 'a';
        r1 = r1 + 2;
        r41[r3] = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0820, code lost:
        r3 = r1 + 1;
        r41[r1] = 'A';
        r1 = r1 + 2;
        r41[r3] = 'E';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0866, code lost:
        r3 = r1 + 1;
        r41[r1] = 'd';
        r1 = r1 + 2;
        r41[r3] = 'z';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0876, code lost:
        r3 = r1 + 1;
        r41[r1] = 'B';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x087e, code lost:
        r3 = r1 + 1;
        r41[r1] = 'b';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0886, code lost:
        r3 = r1 + 1;
        r41[r1] = 'z';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x088c, code lost:
        r3 = r1 + 1;
        r41[r1] = 'Z';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0894, code lost:
        r3 = r1 + 1;
        r41[r1] = 'Y';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x08a4, code lost:
        r3 = r1 + 1;
        r41[r1] = 'W';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x08ac, code lost:
        r3 = r1 + 1;
        r41[r1] = 'U';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x08b4, code lost:
        r3 = r1 + 1;
        r41[r1] = 't';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x08ba, code lost:
        r3 = r1 + 1;
        r41[r1] = 'T';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x08c0, code lost:
        r3 = r1 + 1;
        r41[r1] = 's';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x08c6, code lost:
        r3 = r1 + 1;
        r41[r1] = 'S';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x08ce, code lost:
        r3 = r1 + 1;
        r41[r1] = 'r';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x08d6, code lost:
        r3 = r1 + 1;
        r41[r1] = 'R';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x08e8, code lost:
        r3 = r1 + 1;
        r41[r1] = 'O';
        r1 = r1 + 2;
        r41[r3] = 'E';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x08f4, code lost:
        r3 = r1 + 1;
        r41[r1] = 'O';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x08fa, code lost:
        r3 = r1 + 1;
        r41[r1] = 'n';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0902, code lost:
        r3 = r1 + 1;
        r41[r1] = 'N';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x090a, code lost:
        r3 = r1 + 1;
        r41[r1] = 'l';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0910, code lost:
        r3 = r1 + 1;
        r41[r1] = 'L';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0916, code lost:
        r3 = r1 + 1;
        r41[r1] = 'q';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x091e, code lost:
        r3 = r1 + 1;
        r41[r1] = 'k';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0926, code lost:
        r3 = r1 + 1;
        r41[r1] = 'K';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x092e, code lost:
        r3 = r1 + 1;
        r41[r1] = 'j';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0934, code lost:
        r3 = r1 + 1;
        r41[r1] = 'J';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0950, code lost:
        r3 = r1 + 1;
        r41[r1] = 'i';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0956, code lost:
        r3 = r1 + 1;
        r41[r1] = 'I';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x095e, code lost:
        r3 = r1 + 1;
        r41[r1] = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0966, code lost:
        r3 = r1 + 1;
        r41[r1] = 'g';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x096e, code lost:
        r3 = r1 + 1;
        r41[r1] = 'G';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0976, code lost:
        r3 = r1 + 1;
        r41[r1] = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x097c, code lost:
        r3 = r1 + 1;
        r41[r1] = 'E';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0984, code lost:
        r3 = r1 + 1;
        r41[r1] = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x098a, code lost:
        r3 = r1 + 1;
        r41[r1] = 'D';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0992, code lost:
        r3 = r1 + 1;
        r41[r1] = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x099a, code lost:
        r3 = r1 + 1;
        r41[r1] = 'C';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x09a2, code lost:
        r3 = r1 + 1;
        r41[r1] = 'a';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x09a8, code lost:
        r3 = r1 + 1;
        r41[r1] = 'A';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x09b7, code lost:
        r3 = r1 + 1;
        r41[r1] = 'y';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x09bd, code lost:
        r3 = r1 + 1;
        r41[r1] = 'u';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x09c3, code lost:
        r3 = r1 + 1;
        r41[r1] = 'o';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012f, code lost:
        r3 = r1 + 1;
        r41[r1] = 'D';
        r1 = r1 + 2;
        r41[r3] = 'z';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        r3 = r1 + 1;
        r41[r1] = 'D';
        r1 = r1 + 2;
        r41[r3] = 'Z';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d6, code lost:
        r3 = r1 + 1;
        r41[r1] = 'T';
        r1 = r1 + 2;
        r41[r3] = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02be, code lost:
        r3 = r1 + 1;
        r41[r1] = 'Q';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int I(char[] r40, char[] r41, int r42) {
        /*
            r0 = 0
            r1 = 0
            r2 = r42
        L_0x0004:
            if (r0 >= r2) goto L_0x09fd
            char r3 = r40[r0]
            r4 = 128(0x80, float:1.794E-43)
            if (r3 >= r4) goto L_0x0013
            int r4 = r1 + 1
            r41[r1] = r3
        L_0x0010:
            r1 = r4
            goto L_0x09f9
        L_0x0013:
            r4 = 178(0xb2, float:2.5E-43)
            r5 = 50
            if (r3 == r4) goto L_0x09f3
            r4 = 179(0xb3, float:2.51E-43)
            r6 = 51
            if (r3 == r4) goto L_0x09ed
            r4 = 420(0x1a4, float:5.89E-43)
            if (r3 == r4) goto L_0x09e5
            r4 = 421(0x1a5, float:5.9E-43)
            if (r3 == r4) goto L_0x09dd
            r4 = 613(0x265, float:8.59E-43)
            r7 = 104(0x68, float:1.46E-43)
            if (r3 == r4) goto L_0x09d7
            r4 = 614(0x266, float:8.6E-43)
            if (r3 == r4) goto L_0x09d7
            r4 = 84
            r8 = 74
            r9 = 100
            r10 = 86
            r11 = 121(0x79, float:1.7E-43)
            r12 = 76
            r13 = 101(0x65, float:1.42E-43)
            r14 = 117(0x75, float:1.64E-43)
            r15 = 105(0x69, float:1.47E-43)
            r16 = 33
            r17 = 63
            r18 = 118(0x76, float:1.65E-43)
            r19 = 52
            r20 = 53
            r21 = 54
            r22 = 55
            r23 = 56
            r24 = 57
            r25 = 122(0x7a, float:1.71E-43)
            r26 = 79
            r27 = 48
            r28 = 106(0x6a, float:1.49E-43)
            r29 = 111(0x6f, float:1.56E-43)
            r30 = 116(0x74, float:1.63E-43)
            r31 = 115(0x73, float:1.61E-43)
            r32 = 65
            r33 = 97
            r34 = 108(0x6c, float:1.51E-43)
            r35 = 102(0x66, float:1.43E-43)
            r36 = 46
            r37 = 49
            r38 = 40
            r39 = 41
            switch(r3) {
                case 171: goto L_0x09cf;
                case 185: goto L_0x09c9;
                case 187: goto L_0x09cf;
                case 248: goto L_0x09c3;
                case 249: goto L_0x09bd;
                case 250: goto L_0x09bd;
                case 251: goto L_0x09bd;
                case 252: goto L_0x09bd;
                case 253: goto L_0x09b7;
                case 254: goto L_0x09ae;
                case 255: goto L_0x09b7;
                case 256: goto L_0x09a8;
                case 257: goto L_0x09a2;
                case 258: goto L_0x09a8;
                case 259: goto L_0x09a2;
                case 260: goto L_0x09a8;
                case 261: goto L_0x09a2;
                case 262: goto L_0x099a;
                case 263: goto L_0x0992;
                case 264: goto L_0x099a;
                case 265: goto L_0x0992;
                case 266: goto L_0x099a;
                case 267: goto L_0x0992;
                case 268: goto L_0x099a;
                case 269: goto L_0x0992;
                case 270: goto L_0x098a;
                case 271: goto L_0x0984;
                case 272: goto L_0x098a;
                case 273: goto L_0x0984;
                case 274: goto L_0x097c;
                case 275: goto L_0x0976;
                case 276: goto L_0x097c;
                case 277: goto L_0x0976;
                case 278: goto L_0x097c;
                case 279: goto L_0x0976;
                case 280: goto L_0x097c;
                case 281: goto L_0x0976;
                case 282: goto L_0x097c;
                case 283: goto L_0x0976;
                case 284: goto L_0x096e;
                case 285: goto L_0x0966;
                case 286: goto L_0x096e;
                case 287: goto L_0x0966;
                case 288: goto L_0x096e;
                case 289: goto L_0x0966;
                case 290: goto L_0x096e;
                case 291: goto L_0x0966;
                case 292: goto L_0x095e;
                case 293: goto L_0x09d7;
                case 294: goto L_0x095e;
                case 295: goto L_0x09d7;
                case 296: goto L_0x0956;
                case 297: goto L_0x0950;
                case 298: goto L_0x0956;
                case 299: goto L_0x0950;
                case 300: goto L_0x0956;
                case 301: goto L_0x0950;
                case 302: goto L_0x0956;
                case 303: goto L_0x0950;
                case 304: goto L_0x0956;
                case 305: goto L_0x0950;
                case 306: goto L_0x0944;
                case 307: goto L_0x093a;
                case 308: goto L_0x0934;
                case 309: goto L_0x092e;
                case 310: goto L_0x0926;
                case 311: goto L_0x091e;
                case 312: goto L_0x0916;
                case 313: goto L_0x0910;
                case 314: goto L_0x090a;
                case 315: goto L_0x0910;
                case 316: goto L_0x090a;
                case 317: goto L_0x0910;
                case 318: goto L_0x090a;
                case 319: goto L_0x0910;
                case 320: goto L_0x090a;
                case 321: goto L_0x0910;
                case 322: goto L_0x090a;
                case 323: goto L_0x0902;
                case 324: goto L_0x08fa;
                case 325: goto L_0x0902;
                case 326: goto L_0x08fa;
                case 327: goto L_0x0902;
                case 328: goto L_0x08fa;
                case 329: goto L_0x08fa;
                case 330: goto L_0x0902;
                case 331: goto L_0x08fa;
                case 332: goto L_0x08f4;
                case 333: goto L_0x09c3;
                case 334: goto L_0x08f4;
                case 335: goto L_0x09c3;
                case 336: goto L_0x08f4;
                case 337: goto L_0x09c3;
                case 338: goto L_0x08e8;
                case 339: goto L_0x08de;
                case 340: goto L_0x08d6;
                case 341: goto L_0x08ce;
                case 342: goto L_0x08d6;
                case 343: goto L_0x08ce;
                case 344: goto L_0x08d6;
                case 345: goto L_0x08ce;
                case 346: goto L_0x08c6;
                case 347: goto L_0x08c0;
                case 348: goto L_0x08c6;
                case 349: goto L_0x08c0;
                case 350: goto L_0x08c6;
                case 351: goto L_0x08c0;
                case 352: goto L_0x08c6;
                case 353: goto L_0x08c0;
                case 354: goto L_0x08ba;
                case 355: goto L_0x08b4;
                case 356: goto L_0x08ba;
                case 357: goto L_0x08b4;
                case 358: goto L_0x08ba;
                case 359: goto L_0x08b4;
                case 360: goto L_0x08ac;
                case 361: goto L_0x09bd;
                case 362: goto L_0x08ac;
                case 363: goto L_0x09bd;
                case 364: goto L_0x08ac;
                case 365: goto L_0x09bd;
                case 366: goto L_0x08ac;
                case 367: goto L_0x09bd;
                case 368: goto L_0x08ac;
                case 369: goto L_0x09bd;
                case 370: goto L_0x08ac;
                case 371: goto L_0x09bd;
                case 372: goto L_0x08a4;
                case 373: goto L_0x089c;
                case 374: goto L_0x0894;
                case 375: goto L_0x09b7;
                case 376: goto L_0x0894;
                case 377: goto L_0x088c;
                case 378: goto L_0x0886;
                case 379: goto L_0x088c;
                case 380: goto L_0x0886;
                case 381: goto L_0x088c;
                case 382: goto L_0x0886;
                case 383: goto L_0x08c0;
                case 384: goto L_0x087e;
                case 385: goto L_0x0876;
                case 386: goto L_0x0876;
                case 387: goto L_0x087e;
                case 447: goto L_0x089c;
                case 616: goto L_0x0950;
                case 644: goto L_0x092e;
                case 647: goto L_0x08b4;
                case 648: goto L_0x08b4;
                case 649: goto L_0x09bd;
                case 651: goto L_0x0870;
                case 652: goto L_0x0870;
                case 653: goto L_0x089c;
                case 654: goto L_0x09b7;
                case 655: goto L_0x0894;
                case 656: goto L_0x0886;
                case 657: goto L_0x0886;
                case 663: goto L_0x099a;
                case 665: goto L_0x0876;
                case 666: goto L_0x0976;
                case 667: goto L_0x096e;
                case 668: goto L_0x095e;
                case 669: goto L_0x092e;
                case 670: goto L_0x091e;
                case 671: goto L_0x0910;
                case 672: goto L_0x0916;
                case 675: goto L_0x0866;
                case 677: goto L_0x0866;
                case 678: goto L_0x085c;
                case 680: goto L_0x0850;
                case 682: goto L_0x0846;
                case 683: goto L_0x083c;
                case 686: goto L_0x09d7;
                case 687: goto L_0x09d7;
                case 1025: goto L_0x0834;
                case 1105: goto L_0x082c;
                case 7424: goto L_0x09a8;
                case 7425: goto L_0x0820;
                case 7426: goto L_0x0816;
                case 7427: goto L_0x0876;
                case 7428: goto L_0x099a;
                case 7429: goto L_0x098a;
                case 7430: goto L_0x098a;
                case 7431: goto L_0x097c;
                case 7432: goto L_0x0976;
                case 7433: goto L_0x0950;
                case 7434: goto L_0x0934;
                case 7435: goto L_0x0926;
                case 7436: goto L_0x0910;
                case 7437: goto L_0x080e;
                case 7438: goto L_0x0902;
                case 7439: goto L_0x08f4;
                case 7440: goto L_0x08f4;
                case 7444: goto L_0x08de;
                case 7445: goto L_0x0802;
                case 7446: goto L_0x09c3;
                case 7447: goto L_0x09c3;
                case 7448: goto L_0x09e5;
                case 7449: goto L_0x08d6;
                case 7450: goto L_0x08d6;
                case 7451: goto L_0x08ba;
                case 7452: goto L_0x08ac;
                case 7456: goto L_0x07fc;
                case 7457: goto L_0x08a4;
                case 7458: goto L_0x088c;
                case 7522: goto L_0x0950;
                case 7523: goto L_0x08ce;
                case 7524: goto L_0x09bd;
                case 7525: goto L_0x0870;
                case 7531: goto L_0x07f2;
                case 7532: goto L_0x087e;
                case 7533: goto L_0x0984;
                case 7534: goto L_0x07ec;
                case 7535: goto L_0x07e4;
                case 7536: goto L_0x08fa;
                case 7537: goto L_0x09dd;
                case 7538: goto L_0x08ce;
                case 7539: goto L_0x08ce;
                case 7540: goto L_0x08c0;
                case 7541: goto L_0x08b4;
                case 7542: goto L_0x0886;
                case 7543: goto L_0x0966;
                case 7545: goto L_0x0966;
                case 7546: goto L_0x09ae;
                case 7547: goto L_0x0956;
                case 7548: goto L_0x0950;
                case 7549: goto L_0x09dd;
                case 7550: goto L_0x08ac;
                case 7552: goto L_0x087e;
                case 7553: goto L_0x0984;
                case 7554: goto L_0x07ec;
                case 7555: goto L_0x0966;
                case 7556: goto L_0x091e;
                case 7557: goto L_0x090a;
                case 7558: goto L_0x07e4;
                case 7559: goto L_0x08fa;
                case 7560: goto L_0x09dd;
                case 7561: goto L_0x08ce;
                case 7562: goto L_0x08c0;
                case 7564: goto L_0x0870;
                case 7565: goto L_0x07dc;
                case 7566: goto L_0x0886;
                case 7567: goto L_0x09a2;
                case 7569: goto L_0x0984;
                case 7570: goto L_0x0976;
                case 7571: goto L_0x0976;
                case 7572: goto L_0x0976;
                case 7573: goto L_0x09a2;
                case 7574: goto L_0x0950;
                case 7575: goto L_0x09c3;
                case 7577: goto L_0x09bd;
                case 7680: goto L_0x09a8;
                case 7681: goto L_0x09a2;
                case 7682: goto L_0x0876;
                case 7683: goto L_0x087e;
                case 7684: goto L_0x0876;
                case 7685: goto L_0x087e;
                case 7686: goto L_0x0876;
                case 7687: goto L_0x087e;
                case 7688: goto L_0x099a;
                case 7689: goto L_0x0992;
                case 7690: goto L_0x098a;
                case 7691: goto L_0x0984;
                case 7692: goto L_0x098a;
                case 7693: goto L_0x0984;
                case 7694: goto L_0x098a;
                case 7695: goto L_0x0984;
                case 7696: goto L_0x098a;
                case 7697: goto L_0x0984;
                case 7698: goto L_0x098a;
                case 7699: goto L_0x0984;
                case 7700: goto L_0x097c;
                case 7701: goto L_0x0976;
                case 7702: goto L_0x097c;
                case 7703: goto L_0x0976;
                case 7704: goto L_0x097c;
                case 7705: goto L_0x0976;
                case 7706: goto L_0x097c;
                case 7707: goto L_0x0976;
                case 7708: goto L_0x097c;
                case 7709: goto L_0x0976;
                case 7710: goto L_0x07d4;
                case 7711: goto L_0x07ec;
                case 7712: goto L_0x096e;
                case 7713: goto L_0x0966;
                case 7714: goto L_0x095e;
                case 7715: goto L_0x09d7;
                case 7716: goto L_0x095e;
                case 7717: goto L_0x09d7;
                case 7718: goto L_0x095e;
                case 7719: goto L_0x09d7;
                case 7720: goto L_0x095e;
                case 7721: goto L_0x09d7;
                case 7722: goto L_0x095e;
                case 7723: goto L_0x09d7;
                case 7724: goto L_0x0956;
                case 7725: goto L_0x0950;
                case 7726: goto L_0x0956;
                case 7727: goto L_0x0950;
                case 7728: goto L_0x0926;
                case 7729: goto L_0x091e;
                case 7730: goto L_0x0926;
                case 7731: goto L_0x091e;
                case 7732: goto L_0x0926;
                case 7733: goto L_0x091e;
                case 7734: goto L_0x0910;
                case 7735: goto L_0x090a;
                case 7736: goto L_0x0910;
                case 7737: goto L_0x090a;
                case 7738: goto L_0x0910;
                case 7739: goto L_0x090a;
                case 7740: goto L_0x0910;
                case 7741: goto L_0x090a;
                case 7742: goto L_0x080e;
                case 7743: goto L_0x07e4;
                case 7744: goto L_0x080e;
                case 7745: goto L_0x07e4;
                case 7746: goto L_0x080e;
                case 7747: goto L_0x07e4;
                case 7748: goto L_0x0902;
                case 7749: goto L_0x08fa;
                case 7750: goto L_0x0902;
                case 7751: goto L_0x08fa;
                case 7752: goto L_0x0902;
                case 7753: goto L_0x08fa;
                case 7754: goto L_0x0902;
                case 7755: goto L_0x08fa;
                case 7756: goto L_0x08f4;
                case 7757: goto L_0x09c3;
                case 7758: goto L_0x08f4;
                case 7759: goto L_0x09c3;
                case 7760: goto L_0x08f4;
                case 7761: goto L_0x09c3;
                case 7762: goto L_0x08f4;
                case 7763: goto L_0x09c3;
                case 7764: goto L_0x09e5;
                case 7765: goto L_0x09dd;
                case 7766: goto L_0x09e5;
                case 7767: goto L_0x09dd;
                case 7768: goto L_0x08d6;
                case 7769: goto L_0x08ce;
                case 7770: goto L_0x08d6;
                case 7771: goto L_0x08ce;
                case 7772: goto L_0x08d6;
                case 7773: goto L_0x08ce;
                case 7774: goto L_0x08d6;
                case 7775: goto L_0x08ce;
                case 7776: goto L_0x08c6;
                case 7777: goto L_0x08c0;
                case 7778: goto L_0x08c6;
                case 7779: goto L_0x08c0;
                case 7780: goto L_0x08c6;
                case 7781: goto L_0x08c0;
                case 7782: goto L_0x08c6;
                case 7783: goto L_0x08c0;
                case 7784: goto L_0x08c6;
                case 7785: goto L_0x08c0;
                case 7786: goto L_0x08ba;
                case 7787: goto L_0x08b4;
                case 7788: goto L_0x08ba;
                case 7789: goto L_0x08b4;
                case 7790: goto L_0x08ba;
                case 7791: goto L_0x08b4;
                case 7792: goto L_0x08ba;
                case 7793: goto L_0x08b4;
                case 7794: goto L_0x08ac;
                case 7795: goto L_0x09bd;
                case 7796: goto L_0x08ac;
                case 7797: goto L_0x09bd;
                case 7798: goto L_0x08ac;
                case 7799: goto L_0x09bd;
                case 7800: goto L_0x08ac;
                case 7801: goto L_0x09bd;
                case 7802: goto L_0x08ac;
                case 7803: goto L_0x09bd;
                case 7804: goto L_0x07fc;
                case 7805: goto L_0x0870;
                case 7806: goto L_0x07fc;
                case 7807: goto L_0x0870;
                case 7808: goto L_0x08a4;
                case 7809: goto L_0x089c;
                case 7810: goto L_0x08a4;
                case 7811: goto L_0x089c;
                case 7812: goto L_0x08a4;
                case 7813: goto L_0x089c;
                case 7814: goto L_0x08a4;
                case 7815: goto L_0x089c;
                case 7816: goto L_0x08a4;
                case 7817: goto L_0x089c;
                case 7818: goto L_0x07cc;
                case 7819: goto L_0x07dc;
                case 7820: goto L_0x07cc;
                case 7821: goto L_0x07dc;
                case 7822: goto L_0x0894;
                case 7823: goto L_0x09b7;
                case 7824: goto L_0x088c;
                case 7825: goto L_0x0886;
                case 7826: goto L_0x088c;
                case 7827: goto L_0x0886;
                case 7828: goto L_0x088c;
                case 7829: goto L_0x0886;
                case 7830: goto L_0x09d7;
                case 7831: goto L_0x08b4;
                case 7832: goto L_0x089c;
                case 7833: goto L_0x09b7;
                case 7834: goto L_0x09a2;
                case 7835: goto L_0x07ec;
                case 7836: goto L_0x08c0;
                case 7837: goto L_0x08c0;
                case 7838: goto L_0x07c0;
                case 7840: goto L_0x09a8;
                case 7841: goto L_0x09a2;
                case 7842: goto L_0x09a8;
                case 7843: goto L_0x09a2;
                case 7844: goto L_0x09a8;
                case 7845: goto L_0x09a2;
                case 7846: goto L_0x09a8;
                case 7847: goto L_0x09a2;
                case 7848: goto L_0x09a8;
                case 7849: goto L_0x09a2;
                case 7850: goto L_0x09a8;
                case 7851: goto L_0x09a2;
                case 7852: goto L_0x09a8;
                case 7853: goto L_0x09a2;
                case 7854: goto L_0x09a8;
                case 7855: goto L_0x09a2;
                case 7856: goto L_0x09a8;
                case 7857: goto L_0x09a2;
                case 7858: goto L_0x09a8;
                case 7859: goto L_0x09a2;
                case 7860: goto L_0x09a8;
                case 7861: goto L_0x09a2;
                case 7862: goto L_0x09a8;
                case 7863: goto L_0x09a2;
                case 7864: goto L_0x097c;
                case 7865: goto L_0x0976;
                case 7866: goto L_0x097c;
                case 7867: goto L_0x0976;
                case 7868: goto L_0x097c;
                case 7869: goto L_0x0976;
                case 7870: goto L_0x097c;
                case 7871: goto L_0x0976;
                case 7872: goto L_0x097c;
                case 7873: goto L_0x0976;
                case 7874: goto L_0x097c;
                case 7875: goto L_0x0976;
                case 7876: goto L_0x097c;
                case 7877: goto L_0x0976;
                case 7878: goto L_0x097c;
                case 7879: goto L_0x0976;
                case 7880: goto L_0x0956;
                case 7881: goto L_0x0950;
                case 7882: goto L_0x0956;
                case 7883: goto L_0x0950;
                case 7884: goto L_0x08f4;
                case 7885: goto L_0x09c3;
                case 7886: goto L_0x08f4;
                case 7887: goto L_0x09c3;
                case 7888: goto L_0x08f4;
                case 7889: goto L_0x09c3;
                case 7890: goto L_0x08f4;
                case 7891: goto L_0x09c3;
                case 7892: goto L_0x08f4;
                case 7893: goto L_0x09c3;
                case 7894: goto L_0x08f4;
                case 7895: goto L_0x09c3;
                case 7896: goto L_0x08f4;
                case 7897: goto L_0x09c3;
                case 7898: goto L_0x08f4;
                case 7899: goto L_0x09c3;
                case 7900: goto L_0x08f4;
                case 7901: goto L_0x09c3;
                case 7902: goto L_0x08f4;
                case 7903: goto L_0x09c3;
                case 7904: goto L_0x08f4;
                case 7905: goto L_0x09c3;
                case 7906: goto L_0x08f4;
                case 7907: goto L_0x09c3;
                case 7908: goto L_0x08ac;
                case 7909: goto L_0x09bd;
                case 7910: goto L_0x08ac;
                case 7911: goto L_0x09bd;
                case 7912: goto L_0x08ac;
                case 7913: goto L_0x09bd;
                case 7914: goto L_0x08ac;
                case 7915: goto L_0x09bd;
                case 7916: goto L_0x08ac;
                case 7917: goto L_0x09bd;
                case 7918: goto L_0x08ac;
                case 7919: goto L_0x09bd;
                case 7920: goto L_0x08ac;
                case 7921: goto L_0x09bd;
                case 7922: goto L_0x0894;
                case 7923: goto L_0x09b7;
                case 7924: goto L_0x0894;
                case 7925: goto L_0x09b7;
                case 7926: goto L_0x0894;
                case 7927: goto L_0x09b7;
                case 7928: goto L_0x0894;
                case 7929: goto L_0x09b7;
                case 7930: goto L_0x07b6;
                case 7931: goto L_0x07ac;
                case 7932: goto L_0x07fc;
                case 7934: goto L_0x0894;
                case 7935: goto L_0x09b7;
                case 8208: goto L_0x07a4;
                case 8209: goto L_0x07a4;
                case 8210: goto L_0x07a4;
                case 8211: goto L_0x07a4;
                case 8212: goto L_0x07a4;
                case 8216: goto L_0x079c;
                case 8217: goto L_0x079c;
                case 8218: goto L_0x079c;
                case 8219: goto L_0x079c;
                case 8220: goto L_0x09cf;
                case 8221: goto L_0x09cf;
                case 8222: goto L_0x09cf;
                case 8242: goto L_0x079c;
                case 8243: goto L_0x09cf;
                case 8245: goto L_0x079c;
                case 8246: goto L_0x09cf;
                case 8248: goto L_0x0794;
                case 8249: goto L_0x079c;
                case 8250: goto L_0x079c;
                case 8252: goto L_0x078a;
                case 8260: goto L_0x0782;
                case 8261: goto L_0x077a;
                case 8262: goto L_0x0772;
                case 8263: goto L_0x0768;
                case 8264: goto L_0x075e;
                case 8265: goto L_0x0754;
                case 8270: goto L_0x074c;
                case 8271: goto L_0x0744;
                case 8274: goto L_0x073c;
                case 8275: goto L_0x0734;
                case 8304: goto L_0x072e;
                case 8305: goto L_0x0950;
                case 8308: goto L_0x0728;
                case 8309: goto L_0x0722;
                case 8310: goto L_0x071c;
                case 8311: goto L_0x0716;
                case 8312: goto L_0x0710;
                case 8313: goto L_0x070a;
                case 8314: goto L_0x0702;
                case 8315: goto L_0x07a4;
                case 8316: goto L_0x06fa;
                case 8317: goto L_0x06f4;
                case 8318: goto L_0x06ee;
                case 8319: goto L_0x08fa;
                case 8320: goto L_0x072e;
                case 8321: goto L_0x09c9;
                case 8322: goto L_0x09f3;
                case 8323: goto L_0x09ed;
                case 8324: goto L_0x0728;
                case 8325: goto L_0x0722;
                case 8326: goto L_0x071c;
                case 8327: goto L_0x0716;
                case 8328: goto L_0x0710;
                case 8329: goto L_0x070a;
                case 8330: goto L_0x0702;
                case 8331: goto L_0x07a4;
                case 8332: goto L_0x06fa;
                case 8333: goto L_0x06f4;
                case 8334: goto L_0x06ee;
                case 8336: goto L_0x09a2;
                case 8337: goto L_0x0976;
                case 8338: goto L_0x09c3;
                case 8339: goto L_0x07dc;
                case 8340: goto L_0x09a2;
                case 8580: goto L_0x0992;
                case 9312: goto L_0x09c9;
                case 9313: goto L_0x09f3;
                case 9314: goto L_0x09ed;
                case 9315: goto L_0x0728;
                case 9316: goto L_0x0722;
                case 9317: goto L_0x071c;
                case 9318: goto L_0x0716;
                case 9319: goto L_0x0710;
                case 9320: goto L_0x070a;
                case 9321: goto L_0x06e4;
                case 9322: goto L_0x06da;
                case 9323: goto L_0x06d0;
                case 9324: goto L_0x06c6;
                case 9325: goto L_0x06bc;
                case 9326: goto L_0x06b2;
                case 9327: goto L_0x06a8;
                case 9328: goto L_0x069e;
                case 9329: goto L_0x0694;
                case 9330: goto L_0x068a;
                case 9331: goto L_0x0680;
                case 9332: goto L_0x0672;
                case 9333: goto L_0x0664;
                case 9334: goto L_0x0656;
                case 9335: goto L_0x0648;
                case 9336: goto L_0x063a;
                case 9337: goto L_0x062c;
                case 9338: goto L_0x061e;
                case 9339: goto L_0x0610;
                case 9340: goto L_0x0602;
                case 9341: goto L_0x05f0;
                case 9342: goto L_0x05de;
                case 9343: goto L_0x05cc;
                case 9344: goto L_0x05ba;
                case 9345: goto L_0x05a8;
                case 9346: goto L_0x0596;
                case 9347: goto L_0x0584;
                case 9348: goto L_0x0572;
                case 9349: goto L_0x0560;
                case 9350: goto L_0x054e;
                case 9351: goto L_0x053c;
                case 9352: goto L_0x0532;
                case 9353: goto L_0x0528;
                case 9354: goto L_0x051e;
                case 9355: goto L_0x0514;
                case 9356: goto L_0x050a;
                case 9357: goto L_0x0500;
                case 9358: goto L_0x04f6;
                case 9359: goto L_0x04ec;
                case 9360: goto L_0x04e2;
                case 9361: goto L_0x04d4;
                case 9362: goto L_0x04c6;
                case 9363: goto L_0x04b8;
                case 9364: goto L_0x04aa;
                case 9365: goto L_0x049c;
                case 9366: goto L_0x048e;
                case 9367: goto L_0x0480;
                case 9368: goto L_0x0472;
                case 9369: goto L_0x0464;
                case 9370: goto L_0x0456;
                case 9371: goto L_0x0448;
                case 9372: goto L_0x043a;
                case 9373: goto L_0x042a;
                case 9374: goto L_0x041a;
                case 9375: goto L_0x040c;
                case 9376: goto L_0x03fe;
                case 9377: goto L_0x03f0;
                case 9378: goto L_0x03e0;
                case 9379: goto L_0x03d2;
                case 9380: goto L_0x03c4;
                case 9381: goto L_0x03b6;
                case 9382: goto L_0x03a6;
                case 9383: goto L_0x0398;
                case 9384: goto L_0x0388;
                case 9385: goto L_0x0378;
                case 9386: goto L_0x036a;
                case 9387: goto L_0x035a;
                case 9388: goto L_0x034a;
                case 9389: goto L_0x033a;
                case 9390: goto L_0x032c;
                case 9391: goto L_0x031e;
                case 9392: goto L_0x0310;
                case 9393: goto L_0x0302;
                case 9394: goto L_0x02f2;
                case 9395: goto L_0x02e2;
                case 9396: goto L_0x02d4;
                case 9397: goto L_0x02c6;
                case 9398: goto L_0x09a8;
                case 9399: goto L_0x0876;
                case 9400: goto L_0x099a;
                case 9401: goto L_0x098a;
                case 9402: goto L_0x097c;
                case 9403: goto L_0x07d4;
                case 9404: goto L_0x096e;
                case 9405: goto L_0x095e;
                case 9406: goto L_0x0956;
                case 9407: goto L_0x0934;
                case 9408: goto L_0x0926;
                case 9409: goto L_0x0910;
                case 9410: goto L_0x080e;
                case 9411: goto L_0x0902;
                case 9412: goto L_0x08f4;
                case 9413: goto L_0x09e5;
                case 9414: goto L_0x02be;
                case 9415: goto L_0x08d6;
                case 9416: goto L_0x08c6;
                case 9417: goto L_0x08ba;
                case 9418: goto L_0x08ac;
                case 9419: goto L_0x07fc;
                case 9420: goto L_0x08a4;
                case 9421: goto L_0x07cc;
                case 9422: goto L_0x0894;
                case 9423: goto L_0x088c;
                case 9424: goto L_0x09a2;
                case 9425: goto L_0x087e;
                case 9426: goto L_0x0992;
                case 9427: goto L_0x0984;
                case 9428: goto L_0x0976;
                case 9429: goto L_0x07ec;
                case 9430: goto L_0x0966;
                case 9431: goto L_0x09d7;
                case 9432: goto L_0x0950;
                case 9433: goto L_0x092e;
                case 9434: goto L_0x091e;
                case 9435: goto L_0x090a;
                case 9436: goto L_0x07e4;
                case 9437: goto L_0x08fa;
                case 9438: goto L_0x09c3;
                case 9439: goto L_0x09dd;
                case 9440: goto L_0x0916;
                case 9441: goto L_0x08ce;
                case 9442: goto L_0x08c0;
                case 9443: goto L_0x08b4;
                case 9444: goto L_0x09bd;
                case 9445: goto L_0x0870;
                case 9446: goto L_0x089c;
                case 9447: goto L_0x07dc;
                case 9448: goto L_0x09b7;
                case 9449: goto L_0x0886;
                case 9450: goto L_0x072e;
                case 9451: goto L_0x06da;
                case 9452: goto L_0x06d0;
                case 9453: goto L_0x06c6;
                case 9454: goto L_0x06bc;
                case 9455: goto L_0x06b2;
                case 9456: goto L_0x06a8;
                case 9457: goto L_0x069e;
                case 9458: goto L_0x0694;
                case 9459: goto L_0x068a;
                case 9460: goto L_0x0680;
                case 9461: goto L_0x09c9;
                case 9462: goto L_0x09f3;
                case 9463: goto L_0x09ed;
                case 9464: goto L_0x0728;
                case 9465: goto L_0x0722;
                case 9466: goto L_0x071c;
                case 9467: goto L_0x0716;
                case 9468: goto L_0x0710;
                case 9469: goto L_0x070a;
                case 9470: goto L_0x06e4;
                case 9471: goto L_0x072e;
                case 10075: goto L_0x079c;
                case 10076: goto L_0x079c;
                case 10077: goto L_0x09cf;
                case 10078: goto L_0x09cf;
                case 10088: goto L_0x06f4;
                case 10089: goto L_0x06ee;
                case 10090: goto L_0x06f4;
                case 10091: goto L_0x06ee;
                case 10092: goto L_0x02b6;
                case 10093: goto L_0x02ae;
                case 10094: goto L_0x09cf;
                case 10095: goto L_0x09cf;
                case 10096: goto L_0x02b6;
                case 10097: goto L_0x02ae;
                case 10098: goto L_0x077a;
                case 10099: goto L_0x0772;
                case 10100: goto L_0x02a6;
                case 10101: goto L_0x029e;
                case 10102: goto L_0x09c9;
                case 10103: goto L_0x09f3;
                case 10104: goto L_0x09ed;
                case 10105: goto L_0x0728;
                case 10106: goto L_0x0722;
                case 10107: goto L_0x071c;
                case 10108: goto L_0x0716;
                case 10109: goto L_0x0710;
                case 10110: goto L_0x070a;
                case 10111: goto L_0x06e4;
                case 10112: goto L_0x09c9;
                case 10113: goto L_0x09f3;
                case 10114: goto L_0x09ed;
                case 10115: goto L_0x0728;
                case 10116: goto L_0x0722;
                case 10117: goto L_0x071c;
                case 10118: goto L_0x0716;
                case 10119: goto L_0x0710;
                case 10120: goto L_0x070a;
                case 10121: goto L_0x06e4;
                case 10122: goto L_0x09c9;
                case 10123: goto L_0x09f3;
                case 10124: goto L_0x09ed;
                case 10125: goto L_0x0728;
                case 10126: goto L_0x0722;
                case 10127: goto L_0x071c;
                case 10128: goto L_0x0716;
                case 10129: goto L_0x0710;
                case 10130: goto L_0x070a;
                case 10131: goto L_0x06e4;
                case 11360: goto L_0x0910;
                case 11361: goto L_0x090a;
                case 11362: goto L_0x0910;
                case 11363: goto L_0x09e5;
                case 11364: goto L_0x08d6;
                case 11365: goto L_0x09a2;
                case 11366: goto L_0x08b4;
                case 11367: goto L_0x095e;
                case 11368: goto L_0x09d7;
                case 11369: goto L_0x0926;
                case 11370: goto L_0x091e;
                case 11371: goto L_0x088c;
                case 11372: goto L_0x0886;
                case 11374: goto L_0x080e;
                case 11375: goto L_0x09a2;
                case 11377: goto L_0x0870;
                case 11378: goto L_0x08a4;
                case 11379: goto L_0x089c;
                case 11380: goto L_0x0870;
                case 11381: goto L_0x095e;
                case 11382: goto L_0x09d7;
                case 11384: goto L_0x0976;
                case 11386: goto L_0x09c3;
                case 11387: goto L_0x097c;
                case 11388: goto L_0x092e;
                case 11816: goto L_0x0294;
                case 11817: goto L_0x028a;
                case 42792: goto L_0x027e;
                case 42793: goto L_0x0274;
                case 42800: goto L_0x07d4;
                case 42801: goto L_0x08c6;
                case 42802: goto L_0x026a;
                case 42803: goto L_0x0260;
                case 42804: goto L_0x0256;
                case 42805: goto L_0x024c;
                case 42806: goto L_0x0240;
                case 42807: goto L_0x0236;
                case 42808: goto L_0x022c;
                case 42809: goto L_0x0222;
                case 42810: goto L_0x022c;
                case 42811: goto L_0x0222;
                case 42812: goto L_0x0216;
                case 42813: goto L_0x020c;
                case 42814: goto L_0x0992;
                case 42815: goto L_0x0992;
                case 42816: goto L_0x0926;
                case 42817: goto L_0x091e;
                case 42818: goto L_0x0926;
                case 42819: goto L_0x091e;
                case 42820: goto L_0x0926;
                case 42821: goto L_0x091e;
                case 42822: goto L_0x0910;
                case 42823: goto L_0x090a;
                case 42824: goto L_0x0910;
                case 42825: goto L_0x090a;
                case 42826: goto L_0x08f4;
                case 42827: goto L_0x09c3;
                case 42828: goto L_0x08f4;
                case 42829: goto L_0x09c3;
                case 42830: goto L_0x0202;
                case 42831: goto L_0x01f8;
                case 42832: goto L_0x09e5;
                case 42833: goto L_0x09dd;
                case 42834: goto L_0x09e5;
                case 42835: goto L_0x09dd;
                case 42836: goto L_0x09e5;
                case 42837: goto L_0x09dd;
                case 42838: goto L_0x02be;
                case 42839: goto L_0x0916;
                case 42840: goto L_0x02be;
                case 42841: goto L_0x0916;
                case 42842: goto L_0x08d6;
                case 42843: goto L_0x08ce;
                case 42846: goto L_0x07fc;
                case 42847: goto L_0x0870;
                case 42848: goto L_0x01ec;
                case 42849: goto L_0x01e2;
                case 42850: goto L_0x088c;
                case 42851: goto L_0x0886;
                case 42854: goto L_0x01d6;
                case 42855: goto L_0x09ae;
                case 42856: goto L_0x07fc;
                case 42873: goto L_0x098a;
                case 42874: goto L_0x0984;
                case 42875: goto L_0x07d4;
                case 42876: goto L_0x07ec;
                case 42877: goto L_0x096e;
                case 42878: goto L_0x096e;
                case 42879: goto L_0x0966;
                case 42880: goto L_0x0910;
                case 42881: goto L_0x090a;
                case 42882: goto L_0x08d6;
                case 42883: goto L_0x08ce;
                case 42884: goto L_0x08c0;
                case 42885: goto L_0x08c6;
                case 42886: goto L_0x08ba;
                case 43003: goto L_0x07d4;
                case 43004: goto L_0x09dd;
                case 43005: goto L_0x080e;
                case 43006: goto L_0x0956;
                case 43007: goto L_0x080e;
                case 64256: goto L_0x01cc;
                case 64257: goto L_0x01c2;
                case 64258: goto L_0x01b8;
                case 64259: goto L_0x01aa;
                case 64260: goto L_0x019c;
                case 64262: goto L_0x0192;
                case 65281: goto L_0x018d;
                case 65282: goto L_0x09cf;
                case 65283: goto L_0x0186;
                case 65284: goto L_0x017f;
                case 65285: goto L_0x073c;
                case 65286: goto L_0x0178;
                case 65287: goto L_0x079c;
                case 65288: goto L_0x06f4;
                case 65289: goto L_0x06ee;
                case 65290: goto L_0x074c;
                case 65291: goto L_0x0702;
                case 65292: goto L_0x0171;
                case 65293: goto L_0x07a4;
                case 65294: goto L_0x016c;
                case 65295: goto L_0x0782;
                case 65296: goto L_0x072e;
                case 65297: goto L_0x09c9;
                case 65298: goto L_0x09f3;
                case 65299: goto L_0x09ed;
                case 65300: goto L_0x0728;
                case 65301: goto L_0x0722;
                case 65302: goto L_0x071c;
                case 65303: goto L_0x0716;
                case 65304: goto L_0x0710;
                case 65305: goto L_0x070a;
                case 65306: goto L_0x0165;
                case 65307: goto L_0x0744;
                case 65308: goto L_0x02b6;
                case 65309: goto L_0x06fa;
                case 65310: goto L_0x02ae;
                case 65311: goto L_0x0160;
                case 65312: goto L_0x0159;
                case 65313: goto L_0x09a8;
                case 65314: goto L_0x0876;
                case 65315: goto L_0x099a;
                case 65316: goto L_0x098a;
                case 65317: goto L_0x097c;
                case 65318: goto L_0x07d4;
                case 65319: goto L_0x096e;
                case 65320: goto L_0x095e;
                case 65321: goto L_0x0956;
                case 65322: goto L_0x0934;
                case 65323: goto L_0x0926;
                case 65324: goto L_0x0910;
                case 65325: goto L_0x080e;
                case 65326: goto L_0x0902;
                case 65327: goto L_0x08f4;
                case 65328: goto L_0x09e5;
                case 65329: goto L_0x02be;
                case 65330: goto L_0x08d6;
                case 65331: goto L_0x08c6;
                case 65332: goto L_0x08ba;
                case 65333: goto L_0x08ac;
                case 65334: goto L_0x07fc;
                case 65335: goto L_0x08a4;
                case 65336: goto L_0x07cc;
                case 65337: goto L_0x0894;
                case 65338: goto L_0x088c;
                case 65339: goto L_0x077a;
                case 65340: goto L_0x0152;
                case 65341: goto L_0x0772;
                case 65342: goto L_0x0794;
                case 65343: goto L_0x0149;
                case 65345: goto L_0x09a2;
                case 65346: goto L_0x087e;
                case 65347: goto L_0x0992;
                case 65348: goto L_0x0984;
                case 65349: goto L_0x0976;
                case 65350: goto L_0x07ec;
                case 65351: goto L_0x0966;
                case 65352: goto L_0x09d7;
                case 65353: goto L_0x0950;
                case 65354: goto L_0x092e;
                case 65355: goto L_0x091e;
                case 65356: goto L_0x090a;
                case 65357: goto L_0x07e4;
                case 65358: goto L_0x08fa;
                case 65359: goto L_0x09c3;
                case 65360: goto L_0x09dd;
                case 65361: goto L_0x0916;
                case 65362: goto L_0x08ce;
                case 65363: goto L_0x08c0;
                case 65364: goto L_0x08b4;
                case 65365: goto L_0x09bd;
                case 65366: goto L_0x0870;
                case 65367: goto L_0x089c;
                case 65368: goto L_0x07dc;
                case 65369: goto L_0x09b7;
                case 65370: goto L_0x0886;
                case 65371: goto L_0x02a6;
                case 65373: goto L_0x029e;
                case 65374: goto L_0x0734;
                default: goto L_0x0076;
            }
        L_0x0076:
            switch(r3) {
                case 434: goto L_0x07fc;
                case 435: goto L_0x0894;
                case 436: goto L_0x09b7;
                case 437: goto L_0x088c;
                case 438: goto L_0x0886;
                default: goto L_0x0079;
            }
        L_0x0079:
            switch(r3) {
                case 452: goto L_0x013b;
                case 453: goto L_0x012f;
                case 454: goto L_0x0866;
                case 455: goto L_0x0125;
                case 456: goto L_0x011b;
                case 457: goto L_0x0111;
                case 458: goto L_0x0105;
                case 459: goto L_0x00f9;
                case 460: goto L_0x00ed;
                case 461: goto L_0x09a8;
                case 462: goto L_0x09a2;
                case 463: goto L_0x0956;
                case 464: goto L_0x0950;
                case 465: goto L_0x08f4;
                case 466: goto L_0x09c3;
                case 467: goto L_0x08ac;
                case 468: goto L_0x09bd;
                case 469: goto L_0x08ac;
                case 470: goto L_0x09bd;
                case 471: goto L_0x08ac;
                case 472: goto L_0x09bd;
                case 473: goto L_0x08ac;
                case 474: goto L_0x09bd;
                case 475: goto L_0x08ac;
                case 476: goto L_0x09bd;
                case 477: goto L_0x0976;
                case 478: goto L_0x09a8;
                case 479: goto L_0x09a2;
                case 480: goto L_0x09a8;
                case 481: goto L_0x09a2;
                case 482: goto L_0x0820;
                case 483: goto L_0x0816;
                case 484: goto L_0x096e;
                case 485: goto L_0x096e;
                case 486: goto L_0x096e;
                case 487: goto L_0x096e;
                case 488: goto L_0x0926;
                case 489: goto L_0x091e;
                case 490: goto L_0x08f4;
                case 491: goto L_0x09c3;
                case 492: goto L_0x08f4;
                case 493: goto L_0x09c3;
                default: goto L_0x007c;
            }
        L_0x007c:
            switch(r3) {
                case 496: goto L_0x092e;
                case 497: goto L_0x013b;
                case 498: goto L_0x012f;
                case 499: goto L_0x0866;
                case 500: goto L_0x096e;
                case 501: goto L_0x0966;
                case 502: goto L_0x00e1;
                case 503: goto L_0x08a4;
                case 504: goto L_0x0902;
                case 505: goto L_0x08fa;
                case 506: goto L_0x09a8;
                case 507: goto L_0x09a2;
                case 508: goto L_0x0820;
                case 509: goto L_0x0816;
                case 510: goto L_0x08f4;
                case 511: goto L_0x09c3;
                case 512: goto L_0x09a8;
                case 513: goto L_0x09a2;
                case 514: goto L_0x09a8;
                case 515: goto L_0x09a2;
                case 516: goto L_0x097c;
                case 517: goto L_0x0976;
                case 518: goto L_0x097c;
                case 519: goto L_0x0976;
                case 520: goto L_0x0956;
                case 521: goto L_0x0950;
                case 522: goto L_0x0956;
                case 523: goto L_0x0950;
                case 524: goto L_0x08f4;
                case 525: goto L_0x09c3;
                case 526: goto L_0x08f4;
                case 527: goto L_0x09c3;
                case 528: goto L_0x08d6;
                case 529: goto L_0x08ce;
                case 530: goto L_0x08d6;
                case 531: goto L_0x08ce;
                case 532: goto L_0x08ac;
                case 533: goto L_0x09bd;
                case 534: goto L_0x08ac;
                case 535: goto L_0x09bd;
                case 536: goto L_0x08c6;
                case 537: goto L_0x08c0;
                case 538: goto L_0x08ba;
                case 539: goto L_0x08b4;
                case 540: goto L_0x088c;
                case 541: goto L_0x0886;
                case 542: goto L_0x095e;
                case 543: goto L_0x09d7;
                case 544: goto L_0x0902;
                case 545: goto L_0x0984;
                case 546: goto L_0x0802;
                case 547: goto L_0x00d7;
                case 548: goto L_0x088c;
                case 549: goto L_0x0886;
                case 550: goto L_0x09a8;
                case 551: goto L_0x09a2;
                case 552: goto L_0x097c;
                case 553: goto L_0x0976;
                case 554: goto L_0x08f4;
                case 555: goto L_0x09c3;
                case 556: goto L_0x08f4;
                case 557: goto L_0x09c3;
                case 558: goto L_0x08f4;
                case 559: goto L_0x09c3;
                case 560: goto L_0x08f4;
                case 561: goto L_0x09c3;
                case 562: goto L_0x0894;
                case 563: goto L_0x09b7;
                case 564: goto L_0x090a;
                case 565: goto L_0x08fa;
                case 566: goto L_0x08b4;
                case 567: goto L_0x092e;
                case 568: goto L_0x00cb;
                case 569: goto L_0x00bd;
                case 570: goto L_0x09a8;
                case 571: goto L_0x099a;
                case 572: goto L_0x0992;
                case 573: goto L_0x0910;
                case 574: goto L_0x08ba;
                case 575: goto L_0x08c0;
                case 576: goto L_0x0886;
                default: goto L_0x007f;
            }
        L_0x007f:
            switch(r3) {
                case 579: goto L_0x0876;
                case 580: goto L_0x08ac;
                case 581: goto L_0x07fc;
                case 582: goto L_0x097c;
                case 583: goto L_0x0976;
                case 584: goto L_0x0934;
                case 585: goto L_0x092e;
                case 586: goto L_0x02be;
                case 587: goto L_0x0916;
                case 588: goto L_0x08d6;
                case 589: goto L_0x08ce;
                case 590: goto L_0x0894;
                case 591: goto L_0x09b7;
                case 592: goto L_0x09a2;
                default: goto L_0x0082;
            }
        L_0x0082:
            switch(r3) {
                case 595: goto L_0x087e;
                case 596: goto L_0x09c3;
                case 597: goto L_0x0992;
                case 598: goto L_0x0984;
                case 599: goto L_0x0984;
                case 600: goto L_0x0976;
                case 601: goto L_0x09a2;
                case 602: goto L_0x09a2;
                case 603: goto L_0x0976;
                case 604: goto L_0x0976;
                case 605: goto L_0x0976;
                case 606: goto L_0x0976;
                case 607: goto L_0x092e;
                case 608: goto L_0x0966;
                case 609: goto L_0x0966;
                case 610: goto L_0x096e;
                default: goto L_0x0085;
            }
        L_0x0085:
            switch(r3) {
                case 618: goto L_0x0956;
                case 619: goto L_0x090a;
                case 620: goto L_0x090a;
                case 621: goto L_0x090a;
                default: goto L_0x0088;
            }
        L_0x0088:
            switch(r3) {
                case 623: goto L_0x07e4;
                case 624: goto L_0x07e4;
                case 625: goto L_0x07e4;
                case 626: goto L_0x08fa;
                case 627: goto L_0x08fa;
                case 628: goto L_0x0902;
                case 629: goto L_0x09c3;
                case 630: goto L_0x08e8;
                default: goto L_0x008b;
            }
        L_0x008b:
            switch(r3) {
                case 636: goto L_0x08ce;
                case 637: goto L_0x08ce;
                case 638: goto L_0x08ce;
                case 639: goto L_0x08ce;
                case 640: goto L_0x08d6;
                case 641: goto L_0x08d6;
                case 642: goto L_0x08c0;
                default: goto L_0x008e;
            }
        L_0x008e:
            switch(r3) {
                case 192: goto L_0x09a8;
                case 193: goto L_0x09a8;
                case 194: goto L_0x09a8;
                case 195: goto L_0x09a8;
                case 196: goto L_0x09a8;
                case 197: goto L_0x09a8;
                case 198: goto L_0x0820;
                case 199: goto L_0x099a;
                case 200: goto L_0x097c;
                case 201: goto L_0x097c;
                case 202: goto L_0x097c;
                case 203: goto L_0x097c;
                case 204: goto L_0x0956;
                case 205: goto L_0x0956;
                case 206: goto L_0x0956;
                case 207: goto L_0x0956;
                case 208: goto L_0x098a;
                case 209: goto L_0x0902;
                case 210: goto L_0x08f4;
                case 211: goto L_0x08f4;
                case 212: goto L_0x08f4;
                case 213: goto L_0x08f4;
                case 214: goto L_0x08f4;
                default: goto L_0x0091;
            }
        L_0x0091:
            switch(r3) {
                case 216: goto L_0x08f4;
                case 217: goto L_0x08ac;
                case 218: goto L_0x08ac;
                case 219: goto L_0x08ac;
                case 220: goto L_0x08ac;
                case 221: goto L_0x0894;
                case 222: goto L_0x01d6;
                case 223: goto L_0x00b3;
                case 224: goto L_0x09a2;
                case 225: goto L_0x09a2;
                case 226: goto L_0x09a2;
                case 227: goto L_0x09a2;
                case 228: goto L_0x09a2;
                case 229: goto L_0x09a2;
                case 230: goto L_0x0816;
                case 231: goto L_0x0992;
                case 232: goto L_0x0976;
                case 233: goto L_0x0976;
                case 234: goto L_0x0976;
                case 235: goto L_0x0976;
                case 236: goto L_0x0950;
                case 237: goto L_0x0950;
                case 238: goto L_0x0950;
                case 239: goto L_0x0950;
                case 240: goto L_0x0984;
                case 241: goto L_0x08fa;
                case 242: goto L_0x09c3;
                case 243: goto L_0x09c3;
                case 244: goto L_0x09c3;
                case 245: goto L_0x09c3;
                case 246: goto L_0x09c3;
                default: goto L_0x0094;
            }
        L_0x0094:
            switch(r3) {
                case 390: goto L_0x08f4;
                case 391: goto L_0x099a;
                case 392: goto L_0x0992;
                case 393: goto L_0x098a;
                case 394: goto L_0x098a;
                case 395: goto L_0x098a;
                case 396: goto L_0x0984;
                default: goto L_0x0097;
            }
        L_0x0097:
            switch(r3) {
                case 398: goto L_0x097c;
                case 399: goto L_0x09a8;
                case 400: goto L_0x097c;
                case 401: goto L_0x07d4;
                case 402: goto L_0x07ec;
                case 403: goto L_0x096e;
                default: goto L_0x009a;
            }
        L_0x009a:
            switch(r3) {
                case 405: goto L_0x00a9;
                case 406: goto L_0x0956;
                case 407: goto L_0x0956;
                case 408: goto L_0x0926;
                case 409: goto L_0x091e;
                case 410: goto L_0x090a;
                default: goto L_0x009d;
            }
        L_0x009d:
            switch(r3) {
                case 412: goto L_0x080e;
                case 413: goto L_0x0902;
                case 414: goto L_0x08fa;
                case 415: goto L_0x08f4;
                case 416: goto L_0x08f4;
                case 417: goto L_0x09c3;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            switch(r3) {
                case 427: goto L_0x08b4;
                case 428: goto L_0x08ba;
                case 429: goto L_0x08b4;
                case 430: goto L_0x08ba;
                case 431: goto L_0x08ac;
                case 432: goto L_0x09bd;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            int r4 = r1 + 1
            r41[r1] = r3
            goto L_0x0010
        L_0x00a9:
            int r3 = r1 + 1
            r41[r1] = r7
            int r1 = r1 + 2
            r41[r3] = r18
            goto L_0x09f9
        L_0x00b3:
            int r3 = r1 + 1
            r41[r1] = r31
            int r1 = r1 + 2
            r41[r3] = r31
            goto L_0x09f9
        L_0x00bd:
            int r3 = r1 + 1
            r4 = 113(0x71, float:1.58E-43)
            r41[r1] = r4
            int r1 = r1 + 2
            r4 = 112(0x70, float:1.57E-43)
            r41[r3] = r4
            goto L_0x09f9
        L_0x00cb:
            int r3 = r1 + 1
            r41[r1] = r9
            int r1 = r1 + 2
            r4 = 98
            r41[r3] = r4
            goto L_0x09f9
        L_0x00d7:
            int r3 = r1 + 1
            r41[r1] = r29
            int r1 = r1 + 2
            r41[r3] = r14
            goto L_0x09f9
        L_0x00e1:
            int r3 = r1 + 1
            r4 = 72
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r10
            goto L_0x09f9
        L_0x00ed:
            int r3 = r1 + 1
            r4 = 110(0x6e, float:1.54E-43)
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r28
            goto L_0x09f9
        L_0x00f9:
            int r3 = r1 + 1
            r4 = 78
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r28
            goto L_0x09f9
        L_0x0105:
            int r3 = r1 + 1
            r4 = 78
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r8
            goto L_0x09f9
        L_0x0111:
            int r3 = r1 + 1
            r41[r1] = r34
            int r1 = r1 + 2
            r41[r3] = r28
            goto L_0x09f9
        L_0x011b:
            int r3 = r1 + 1
            r41[r1] = r12
            int r1 = r1 + 2
            r41[r3] = r28
            goto L_0x09f9
        L_0x0125:
            int r3 = r1 + 1
            r41[r1] = r12
            int r1 = r1 + 2
            r41[r3] = r8
            goto L_0x09f9
        L_0x012f:
            int r3 = r1 + 1
            r4 = 68
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r25
            goto L_0x09f9
        L_0x013b:
            int r3 = r1 + 1
            r4 = 68
            r41[r1] = r4
            int r1 = r1 + 2
            r4 = 90
            r41[r3] = r4
            goto L_0x09f9
        L_0x0149:
            int r3 = r1 + 1
            r4 = 95
            r41[r1] = r4
        L_0x014f:
            r1 = r3
            goto L_0x09f9
        L_0x0152:
            int r3 = r1 + 1
            r4 = 92
            r41[r1] = r4
            goto L_0x014f
        L_0x0159:
            int r3 = r1 + 1
            r4 = 64
            r41[r1] = r4
            goto L_0x014f
        L_0x0160:
            int r3 = r1 + 1
            r41[r1] = r17
            goto L_0x014f
        L_0x0165:
            int r3 = r1 + 1
            r4 = 58
            r41[r1] = r4
            goto L_0x014f
        L_0x016c:
            int r3 = r1 + 1
            r41[r1] = r36
            goto L_0x014f
        L_0x0171:
            int r3 = r1 + 1
            r4 = 44
            r41[r1] = r4
            goto L_0x014f
        L_0x0178:
            int r3 = r1 + 1
            r4 = 38
            r41[r1] = r4
            goto L_0x014f
        L_0x017f:
            int r3 = r1 + 1
            r4 = 36
            r41[r1] = r4
            goto L_0x014f
        L_0x0186:
            int r3 = r1 + 1
            r4 = 35
            r41[r1] = r4
            goto L_0x014f
        L_0x018d:
            int r3 = r1 + 1
            r41[r1] = r16
            goto L_0x014f
        L_0x0192:
            int r3 = r1 + 1
            r41[r1] = r31
            int r1 = r1 + 2
            r41[r3] = r30
            goto L_0x09f9
        L_0x019c:
            int r3 = r1 + 1
            r41[r1] = r35
            int r4 = r1 + 2
            r41[r3] = r35
            int r1 = r1 + 3
            r41[r4] = r34
            goto L_0x09f9
        L_0x01aa:
            int r3 = r1 + 1
            r41[r1] = r35
            int r4 = r1 + 2
            r41[r3] = r35
            int r1 = r1 + 3
            r41[r4] = r15
            goto L_0x09f9
        L_0x01b8:
            int r3 = r1 + 1
            r41[r1] = r35
            int r1 = r1 + 2
            r41[r3] = r34
            goto L_0x09f9
        L_0x01c2:
            int r3 = r1 + 1
            r41[r1] = r35
            int r1 = r1 + 2
            r41[r3] = r15
            goto L_0x09f9
        L_0x01cc:
            int r3 = r1 + 1
            r41[r1] = r35
            int r1 = r1 + 2
            r41[r3] = r35
            goto L_0x09f9
        L_0x01d6:
            int r3 = r1 + 1
            r41[r1] = r4
            int r1 = r1 + 2
            r4 = 72
            r41[r3] = r4
            goto L_0x09f9
        L_0x01e2:
            int r3 = r1 + 1
            r41[r1] = r18
            int r1 = r1 + 2
            r41[r3] = r11
            goto L_0x09f9
        L_0x01ec:
            int r3 = r1 + 1
            r41[r1] = r10
            int r1 = r1 + 2
            r4 = 89
            r41[r3] = r4
            goto L_0x09f9
        L_0x01f8:
            int r3 = r1 + 1
            r41[r1] = r29
            int r1 = r1 + 2
            r41[r3] = r29
            goto L_0x09f9
        L_0x0202:
            int r3 = r1 + 1
            r41[r1] = r26
            int r1 = r1 + 2
            r41[r3] = r26
            goto L_0x09f9
        L_0x020c:
            int r3 = r1 + 1
            r41[r1] = r33
            int r1 = r1 + 2
            r41[r3] = r11
            goto L_0x09f9
        L_0x0216:
            int r3 = r1 + 1
            r41[r1] = r32
            int r1 = r1 + 2
            r4 = 89
            r41[r3] = r4
            goto L_0x09f9
        L_0x0222:
            int r3 = r1 + 1
            r41[r1] = r33
            int r1 = r1 + 2
            r41[r3] = r18
            goto L_0x09f9
        L_0x022c:
            int r3 = r1 + 1
            r41[r1] = r32
            int r1 = r1 + 2
            r41[r3] = r10
            goto L_0x09f9
        L_0x0236:
            int r3 = r1 + 1
            r41[r1] = r33
            int r1 = r1 + 2
            r41[r3] = r14
            goto L_0x09f9
        L_0x0240:
            int r3 = r1 + 1
            r41[r1] = r32
            int r1 = r1 + 2
            r4 = 85
            r41[r3] = r4
            goto L_0x09f9
        L_0x024c:
            int r3 = r1 + 1
            r41[r1] = r33
            int r1 = r1 + 2
            r41[r3] = r29
            goto L_0x09f9
        L_0x0256:
            int r3 = r1 + 1
            r41[r1] = r32
            int r1 = r1 + 2
            r41[r3] = r26
            goto L_0x09f9
        L_0x0260:
            int r3 = r1 + 1
            r41[r1] = r33
            int r1 = r1 + 2
            r41[r3] = r33
            goto L_0x09f9
        L_0x026a:
            int r3 = r1 + 1
            r41[r1] = r32
            int r1 = r1 + 2
            r41[r3] = r32
            goto L_0x09f9
        L_0x0274:
            int r3 = r1 + 1
            r41[r1] = r30
            int r1 = r1 + 2
            r41[r3] = r25
            goto L_0x09f9
        L_0x027e:
            int r3 = r1 + 1
            r41[r1] = r4
            int r1 = r1 + 2
            r4 = 90
            r41[r3] = r4
            goto L_0x09f9
        L_0x028a:
            int r3 = r1 + 1
            r41[r1] = r39
            int r1 = r1 + 2
            r41[r3] = r39
            goto L_0x09f9
        L_0x0294:
            int r3 = r1 + 1
            r41[r1] = r38
            int r1 = r1 + 2
            r41[r3] = r38
            goto L_0x09f9
        L_0x029e:
            int r3 = r1 + 1
            r4 = 125(0x7d, float:1.75E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x02a6:
            int r3 = r1 + 1
            r4 = 123(0x7b, float:1.72E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x02ae:
            int r3 = r1 + 1
            r4 = 62
            r41[r1] = r4
            goto L_0x014f
        L_0x02b6:
            int r3 = r1 + 1
            r4 = 60
            r41[r1] = r4
            goto L_0x014f
        L_0x02be:
            int r3 = r1 + 1
            r4 = 81
            r41[r1] = r4
            goto L_0x014f
        L_0x02c6:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r25
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x02d4:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r11
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x02e2:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 120(0x78, float:1.68E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x02f2:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 119(0x77, float:1.67E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0302:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r18
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0310:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r14
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x031e:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r30
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x032c:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r31
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x033a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 114(0x72, float:1.6E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x034a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 113(0x71, float:1.58E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x035a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 112(0x70, float:1.57E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x036a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r29
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0378:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 110(0x6e, float:1.54E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0388:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 109(0x6d, float:1.53E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0398:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r34
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03a6:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 107(0x6b, float:1.5E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03b6:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r28
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03c4:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r15
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03d2:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r7
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03e0:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 103(0x67, float:1.44E-43)
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03f0:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r35
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x03fe:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r13
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x040c:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r9
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x041a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 99
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x042a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r5 = 98
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x043a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r33
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0448:
            int r3 = r1 + 1
            r41[r1] = r5
            int r4 = r1 + 2
            r41[r3] = r27
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x0456:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r24
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x0464:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r23
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x0472:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r22
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x0480:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r21
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x048e:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r20
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x049c:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r19
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x04aa:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r6
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x04b8:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x04c6:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r37
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x04d4:
            int r3 = r1 + 1
            r41[r1] = r37
            int r4 = r1 + 2
            r41[r3] = r27
            int r1 = r1 + 3
            r41[r4] = r36
            goto L_0x09f9
        L_0x04e2:
            int r3 = r1 + 1
            r41[r1] = r24
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x04ec:
            int r3 = r1 + 1
            r41[r1] = r23
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x04f6:
            int r3 = r1 + 1
            r41[r1] = r22
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x0500:
            int r3 = r1 + 1
            r41[r1] = r21
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x050a:
            int r3 = r1 + 1
            r41[r1] = r20
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x0514:
            int r3 = r1 + 1
            r41[r1] = r19
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x051e:
            int r3 = r1 + 1
            r41[r1] = r6
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x0528:
            int r3 = r1 + 1
            r41[r1] = r5
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x0532:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r36
            goto L_0x09f9
        L_0x053c:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r5
            int r3 = r1 + 3
            r41[r4] = r27
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x054e:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r24
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x0560:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r23
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x0572:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r22
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x0584:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r21
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x0596:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r20
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x05a8:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r19
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x05ba:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r6
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x05cc:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r5
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x05de:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r37
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x05f0:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r3 = r1 + 3
            r41[r4] = r27
            int r1 = r1 + 4
            r41[r3] = r39
            goto L_0x09f9
        L_0x0602:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r24
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0610:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r23
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x061e:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r22
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x062c:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r21
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x063a:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r20
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0648:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r19
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0656:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r6
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0664:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r5
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0672:
            int r3 = r1 + 1
            r41[r1] = r38
            int r4 = r1 + 2
            r41[r3] = r37
            int r1 = r1 + 3
            r41[r4] = r39
            goto L_0x09f9
        L_0x0680:
            int r3 = r1 + 1
            r41[r1] = r5
            int r1 = r1 + 2
            r41[r3] = r27
            goto L_0x09f9
        L_0x068a:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r24
            goto L_0x09f9
        L_0x0694:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r23
            goto L_0x09f9
        L_0x069e:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r22
            goto L_0x09f9
        L_0x06a8:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r21
            goto L_0x09f9
        L_0x06b2:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r20
            goto L_0x09f9
        L_0x06bc:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r19
            goto L_0x09f9
        L_0x06c6:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r6
            goto L_0x09f9
        L_0x06d0:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r5
            goto L_0x09f9
        L_0x06da:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r37
            goto L_0x09f9
        L_0x06e4:
            int r3 = r1 + 1
            r41[r1] = r37
            int r1 = r1 + 2
            r41[r3] = r27
            goto L_0x09f9
        L_0x06ee:
            int r3 = r1 + 1
            r41[r1] = r39
            goto L_0x014f
        L_0x06f4:
            int r3 = r1 + 1
            r41[r1] = r38
            goto L_0x014f
        L_0x06fa:
            int r3 = r1 + 1
            r4 = 61
            r41[r1] = r4
            goto L_0x014f
        L_0x0702:
            int r3 = r1 + 1
            r4 = 43
            r41[r1] = r4
            goto L_0x014f
        L_0x070a:
            int r3 = r1 + 1
            r41[r1] = r24
            goto L_0x014f
        L_0x0710:
            int r3 = r1 + 1
            r41[r1] = r23
            goto L_0x014f
        L_0x0716:
            int r3 = r1 + 1
            r41[r1] = r22
            goto L_0x014f
        L_0x071c:
            int r3 = r1 + 1
            r41[r1] = r21
            goto L_0x014f
        L_0x0722:
            int r3 = r1 + 1
            r41[r1] = r20
            goto L_0x014f
        L_0x0728:
            int r3 = r1 + 1
            r41[r1] = r19
            goto L_0x014f
        L_0x072e:
            int r3 = r1 + 1
            r41[r1] = r27
            goto L_0x014f
        L_0x0734:
            int r3 = r1 + 1
            r4 = 126(0x7e, float:1.77E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x073c:
            int r3 = r1 + 1
            r4 = 37
            r41[r1] = r4
            goto L_0x014f
        L_0x0744:
            int r3 = r1 + 1
            r4 = 59
            r41[r1] = r4
            goto L_0x014f
        L_0x074c:
            int r3 = r1 + 1
            r4 = 42
            r41[r1] = r4
            goto L_0x014f
        L_0x0754:
            int r3 = r1 + 1
            r41[r1] = r16
            int r1 = r1 + 2
            r41[r3] = r17
            goto L_0x09f9
        L_0x075e:
            int r3 = r1 + 1
            r41[r1] = r17
            int r1 = r1 + 2
            r41[r3] = r16
            goto L_0x09f9
        L_0x0768:
            int r3 = r1 + 1
            r41[r1] = r17
            int r1 = r1 + 2
            r41[r3] = r17
            goto L_0x09f9
        L_0x0772:
            int r3 = r1 + 1
            r4 = 93
            r41[r1] = r4
            goto L_0x014f
        L_0x077a:
            int r3 = r1 + 1
            r4 = 91
            r41[r1] = r4
            goto L_0x014f
        L_0x0782:
            int r3 = r1 + 1
            r4 = 47
            r41[r1] = r4
            goto L_0x014f
        L_0x078a:
            int r3 = r1 + 1
            r41[r1] = r16
            int r1 = r1 + 2
            r41[r3] = r16
            goto L_0x09f9
        L_0x0794:
            int r3 = r1 + 1
            r4 = 94
            r41[r1] = r4
            goto L_0x014f
        L_0x079c:
            int r3 = r1 + 1
            r4 = 39
            r41[r1] = r4
            goto L_0x014f
        L_0x07a4:
            int r3 = r1 + 1
            r4 = 45
            r41[r1] = r4
            goto L_0x014f
        L_0x07ac:
            int r3 = r1 + 1
            r41[r1] = r34
            int r1 = r1 + 2
            r41[r3] = r34
            goto L_0x09f9
        L_0x07b6:
            int r3 = r1 + 1
            r41[r1] = r12
            int r1 = r1 + 2
            r41[r3] = r12
            goto L_0x09f9
        L_0x07c0:
            int r3 = r1 + 1
            r4 = 83
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r4
            goto L_0x09f9
        L_0x07cc:
            int r3 = r1 + 1
            r4 = 88
            r41[r1] = r4
            goto L_0x014f
        L_0x07d4:
            int r3 = r1 + 1
            r4 = 70
            r41[r1] = r4
            goto L_0x014f
        L_0x07dc:
            int r3 = r1 + 1
            r4 = 120(0x78, float:1.68E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x07e4:
            int r3 = r1 + 1
            r4 = 109(0x6d, float:1.53E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x07ec:
            int r3 = r1 + 1
            r41[r1] = r35
            goto L_0x014f
        L_0x07f2:
            int r3 = r1 + 1
            r41[r1] = r14
            int r1 = r1 + 2
            r41[r3] = r13
            goto L_0x09f9
        L_0x07fc:
            int r3 = r1 + 1
            r41[r1] = r10
            goto L_0x014f
        L_0x0802:
            int r3 = r1 + 1
            r41[r1] = r26
            int r1 = r1 + 2
            r4 = 85
            r41[r3] = r4
            goto L_0x09f9
        L_0x080e:
            int r3 = r1 + 1
            r4 = 77
            r41[r1] = r4
            goto L_0x014f
        L_0x0816:
            int r3 = r1 + 1
            r41[r1] = r33
            int r1 = r1 + 2
            r41[r3] = r13
            goto L_0x09f9
        L_0x0820:
            int r3 = r1 + 1
            r41[r1] = r32
            int r1 = r1 + 2
            r4 = 69
            r41[r3] = r4
            goto L_0x09f9
        L_0x082c:
            int r3 = r1 + 1
            r4 = 1077(0x435, float:1.509E-42)
            r41[r1] = r4
            goto L_0x014f
        L_0x0834:
            int r3 = r1 + 1
            r4 = 1045(0x415, float:1.464E-42)
            r41[r1] = r4
            goto L_0x014f
        L_0x083c:
            int r3 = r1 + 1
            r41[r1] = r34
            int r1 = r1 + 2
            r41[r3] = r25
            goto L_0x09f9
        L_0x0846:
            int r3 = r1 + 1
            r41[r1] = r34
            int r1 = r1 + 2
            r41[r3] = r31
            goto L_0x09f9
        L_0x0850:
            int r3 = r1 + 1
            r41[r1] = r30
            int r1 = r1 + 2
            r4 = 99
            r41[r3] = r4
            goto L_0x09f9
        L_0x085c:
            int r3 = r1 + 1
            r41[r1] = r30
            int r1 = r1 + 2
            r41[r3] = r31
            goto L_0x09f9
        L_0x0866:
            int r3 = r1 + 1
            r41[r1] = r9
            int r1 = r1 + 2
            r41[r3] = r25
            goto L_0x09f9
        L_0x0870:
            int r3 = r1 + 1
            r41[r1] = r18
            goto L_0x014f
        L_0x0876:
            int r3 = r1 + 1
            r4 = 66
            r41[r1] = r4
            goto L_0x014f
        L_0x087e:
            int r3 = r1 + 1
            r4 = 98
            r41[r1] = r4
            goto L_0x014f
        L_0x0886:
            int r3 = r1 + 1
            r41[r1] = r25
            goto L_0x014f
        L_0x088c:
            int r3 = r1 + 1
            r4 = 90
            r41[r1] = r4
            goto L_0x014f
        L_0x0894:
            int r3 = r1 + 1
            r4 = 89
            r41[r1] = r4
            goto L_0x014f
        L_0x089c:
            int r3 = r1 + 1
            r4 = 119(0x77, float:1.67E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x08a4:
            int r3 = r1 + 1
            r4 = 87
            r41[r1] = r4
            goto L_0x014f
        L_0x08ac:
            int r3 = r1 + 1
            r4 = 85
            r41[r1] = r4
            goto L_0x014f
        L_0x08b4:
            int r3 = r1 + 1
            r41[r1] = r30
            goto L_0x014f
        L_0x08ba:
            int r3 = r1 + 1
            r41[r1] = r4
            goto L_0x014f
        L_0x08c0:
            int r3 = r1 + 1
            r41[r1] = r31
            goto L_0x014f
        L_0x08c6:
            int r3 = r1 + 1
            r4 = 83
            r41[r1] = r4
            goto L_0x014f
        L_0x08ce:
            int r3 = r1 + 1
            r4 = 114(0x72, float:1.6E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x08d6:
            int r3 = r1 + 1
            r4 = 82
            r41[r1] = r4
            goto L_0x014f
        L_0x08de:
            int r3 = r1 + 1
            r41[r1] = r29
            int r1 = r1 + 2
            r41[r3] = r13
            goto L_0x09f9
        L_0x08e8:
            int r3 = r1 + 1
            r41[r1] = r26
            int r1 = r1 + 2
            r4 = 69
            r41[r3] = r4
            goto L_0x09f9
        L_0x08f4:
            int r3 = r1 + 1
            r41[r1] = r26
            goto L_0x014f
        L_0x08fa:
            int r3 = r1 + 1
            r4 = 110(0x6e, float:1.54E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x0902:
            int r3 = r1 + 1
            r4 = 78
            r41[r1] = r4
            goto L_0x014f
        L_0x090a:
            int r3 = r1 + 1
            r41[r1] = r34
            goto L_0x014f
        L_0x0910:
            int r3 = r1 + 1
            r41[r1] = r12
            goto L_0x014f
        L_0x0916:
            int r3 = r1 + 1
            r4 = 113(0x71, float:1.58E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x091e:
            int r3 = r1 + 1
            r4 = 107(0x6b, float:1.5E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x0926:
            int r3 = r1 + 1
            r4 = 75
            r41[r1] = r4
            goto L_0x014f
        L_0x092e:
            int r3 = r1 + 1
            r41[r1] = r28
            goto L_0x014f
        L_0x0934:
            int r3 = r1 + 1
            r41[r1] = r8
            goto L_0x014f
        L_0x093a:
            int r3 = r1 + 1
            r41[r1] = r15
            int r1 = r1 + 2
            r41[r3] = r28
            goto L_0x09f9
        L_0x0944:
            int r3 = r1 + 1
            r4 = 73
            r41[r1] = r4
            int r1 = r1 + 2
            r41[r3] = r8
            goto L_0x09f9
        L_0x0950:
            int r3 = r1 + 1
            r41[r1] = r15
            goto L_0x014f
        L_0x0956:
            int r3 = r1 + 1
            r4 = 73
            r41[r1] = r4
            goto L_0x014f
        L_0x095e:
            int r3 = r1 + 1
            r4 = 72
            r41[r1] = r4
            goto L_0x014f
        L_0x0966:
            int r3 = r1 + 1
            r4 = 103(0x67, float:1.44E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x096e:
            int r3 = r1 + 1
            r4 = 71
            r41[r1] = r4
            goto L_0x014f
        L_0x0976:
            int r3 = r1 + 1
            r41[r1] = r13
            goto L_0x014f
        L_0x097c:
            int r3 = r1 + 1
            r4 = 69
            r41[r1] = r4
            goto L_0x014f
        L_0x0984:
            int r3 = r1 + 1
            r41[r1] = r9
            goto L_0x014f
        L_0x098a:
            int r3 = r1 + 1
            r4 = 68
            r41[r1] = r4
            goto L_0x014f
        L_0x0992:
            int r3 = r1 + 1
            r4 = 99
            r41[r1] = r4
            goto L_0x014f
        L_0x099a:
            int r3 = r1 + 1
            r4 = 67
            r41[r1] = r4
            goto L_0x014f
        L_0x09a2:
            int r3 = r1 + 1
            r41[r1] = r33
            goto L_0x014f
        L_0x09a8:
            int r3 = r1 + 1
            r41[r1] = r32
            goto L_0x014f
        L_0x09ae:
            int r3 = r1 + 1
            r41[r1] = r30
            int r1 = r1 + 2
            r41[r3] = r7
            goto L_0x09f9
        L_0x09b7:
            int r3 = r1 + 1
            r41[r1] = r11
            goto L_0x014f
        L_0x09bd:
            int r3 = r1 + 1
            r41[r1] = r14
            goto L_0x014f
        L_0x09c3:
            int r3 = r1 + 1
            r41[r1] = r29
            goto L_0x014f
        L_0x09c9:
            int r3 = r1 + 1
            r41[r1] = r37
            goto L_0x014f
        L_0x09cf:
            int r3 = r1 + 1
            r4 = 34
            r41[r1] = r4
            goto L_0x014f
        L_0x09d7:
            int r3 = r1 + 1
            r41[r1] = r7
            goto L_0x014f
        L_0x09dd:
            int r3 = r1 + 1
            r4 = 112(0x70, float:1.57E-43)
            r41[r1] = r4
            goto L_0x014f
        L_0x09e5:
            int r3 = r1 + 1
            r4 = 80
            r41[r1] = r4
            goto L_0x014f
        L_0x09ed:
            int r3 = r1 + 1
            r41[r1] = r6
            goto L_0x014f
        L_0x09f3:
            int r3 = r1 + 1
            r41[r1] = r5
            goto L_0x014f
        L_0x09f9:
            int r0 = r0 + 1
            goto L_0x0004
        L_0x09fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf6.I(char[], char[], int):int");
    }

    public static boolean I0(byte b2) {
        return b2 > -65;
    }

    public static ylf J(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ylf.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ylf.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ylf.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ylf.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return ylf.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final String K(Collection collection) {
        Iterable<q82> iterable = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (q82 name : iterable) {
            arrayList.add(name.name());
        }
        return new JSONArray((Collection<?>) arrayList).toString();
    }

    public static final Map L(byte[] bArr) {
        if (bArr == null) {
            return MapsKt.emptyMap();
        }
        n86 n86 = new n86(0);
        ad9.mergeFrom(n86, bArr);
        EnumMap enumMap = new EnumMap(q82.class);
        long[] jArr = (long[]) n86.b;
        if (!(!(jArr.length == 0))) {
            return enumMap;
        }
        enumMap.put(q82.z0, jArr);
        return enumMap;
    }

    public static final Set M(byte[] bArr) {
        if (bArr != null) {
            n86 n86 = new n86(1);
            ad9.mergeFrom(n86, bArr);
            EnumSet s = m58.s(n86);
            if (s != null) {
                return s;
            }
        }
        return SetsKt.emptySet();
    }

    public static final List N(byte[] bArr) {
        if (bArr == null) {
            return CollectionsKt.emptyList();
        }
        n86 n86 = new n86(2);
        ad9.mergeFrom(n86, bArr);
        return m58.t(n86);
    }

    public static final KClass O(usd usd) {
        if (usd instanceof vsd) {
            return O(((vsd) usd).a);
        }
        return null;
    }

    public static sf6 P() {
        t9a t9a;
        sf6 sf6 = a;
        if (sf6 != null) {
            return sf6;
        }
        synchronized (tf6.class) {
            t9a = new t9a(10);
            a = t9a;
        }
        return t9a;
    }

    public static String Q(ft8 ft8) {
        if (ft8 == null) {
            return null;
        }
        int i = xv6.a[ft8.ordinal()];
        if (i == 1) {
            return "UNMUTE";
        }
        if (i == 2) {
            return "MUTE";
        }
        if (i == 3) {
            return "MUTE_PERMANENT";
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalArgumentException("Unknown media option state: " + ft8);
    }

    public static ArrayList R(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                ue1 b2 = ue1.b(optJSONArray.getString(i));
                if (b2 != null) {
                    arrayList.add(b2);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static String S(otd otd) {
        String str;
        String str2;
        vt9 vt9 = otd.a.c;
        if (vt9 != null) {
            str = ":m" + vt9.a;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        ln1 ln1 = otd.a;
        sb.append(ln1.b.c());
        sb.append(":");
        int i = xv6.b[ln1.a.ordinal()];
        if (i == 1) {
            str2 = "sCAMERA";
        } else if (i == 2) {
            str2 = "sSCREEN";
        } else if (i == 3) {
            str2 = "sMOVIE";
        } else if (i == 4) {
            str2 = "sSTREAM";
        } else if (i == 5) {
            str2 = "sANIMOJI";
        } else {
            throw new RuntimeException("Unknown VideoTrackType");
        }
        return wj6.n(sb, str2, str);
    }

    public static int[] T(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final boolean U(int i) {
        return (i & 536870912) != 0;
    }

    public static final boolean V(int i) {
        return (i & IntCompanionObject.MIN_VALUE) != 0;
    }

    public static final boolean W(int i) {
        return (i & 1073741824) != 0;
    }

    public static final boolean X() {
        P();
        return false;
    }

    public static String Y(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, e2);
                    StringBuilder p = tr1.p("<", str3, " threw ");
                    p.append(e2.getClass().getName());
                    p.append(">");
                    str2 = p.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb.append(str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append(str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void Z(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static rp6 a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", (Object) str);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new rp6(jSONObject2);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static HashSet a0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        kw6 kw6;
        if (!"hungup".equals(jSONObject.optString("notification")) || (optJSONArray = jSONObject.optJSONArray("errors")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            int optInt = optJSONArray.optInt(i, IntCompanionObject.MIN_VALUE);
            if (optInt != Integer.MIN_VALUE) {
                kw6[] values = kw6.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        kw6 = null;
                        break;
                    }
                    kw6 = values[i2];
                    kw6.getClass();
                    if (optInt == 1) {
                        break;
                    }
                    i2++;
                }
                if (kw6 != null) {
                    hashSet.add(kw6);
                }
            }
        }
        return hashSet;
    }

    public static void b(ue1 ue1, JSONObject jSONObject, boolean z) {
        jSONObject.put("participantId", ue1.a);
        jSONObject.put("participantType", (Object) a81.v(ue1.b));
        if (z) {
            jSONObject.put("deviceIdx", ue1.c);
        }
    }

    public static ln1 b0(String str) {
        String[] split = str.split(":");
        a9g a9g = a9g.a;
        a9g a9g2 = a9g;
        ue1 ue1 = null;
        vt9 vt9 = null;
        for (String str2 : split) {
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith("g")) {
                    ue1 = ue1.b(str);
                }
                if (str2.startsWith("s")) {
                    char c2 = 65535;
                    switch (str2.hashCode()) {
                        case -1579214262:
                            if (str2.equals("sANIMOJI")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -929065347:
                            if (str2.equals("sMOVIE")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 964253016:
                            if (str2.equals("sCAMERA")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1424315039:
                            if (str2.equals("sSCREEN")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1440014771:
                            if (str2.equals("sSTREAM")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            a9g2 = a9g.c;
                            break;
                        case 1:
                            a9g2 = a9g.o;
                            break;
                        case 2:
                            a9g2 = a9g;
                            break;
                        case 3:
                            a9g2 = a9g.b;
                            break;
                        case 4:
                            a9g2 = a9g.v;
                            break;
                        default:
                            throw new RuntimeException("Unknown video track type");
                    }
                }
                if (str2.startsWith("m")) {
                    vt9 = new vt9(Long.parseLong(str2.substring(1)));
                }
            }
        }
        if (ue1 == null) {
            return null;
        }
        l15 l15 = new l15();
        l15.a = ue1;
        l15.b = a9g2;
        l15.c = vt9;
        return l15.e();
    }

    public static final int c(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static ue1 c0(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("video-") || str.length() == 6) {
            return null;
        }
        return ue1.b(str.substring(6));
    }

    public static cy d() {
        cy cyVar = cy.j.f;
        Class<cy> cls = cy.class;
        if (cyVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(cy.h);
            if (cy.j.f != null || System.nanoTime() - nanoTime < cy.i) {
                return null;
            }
            return cy.j;
        }
        long nanoTime2 = cyVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        cy.j.f = cyVar.f;
        cyVar.f = null;
        return cyVar;
    }

    public static final boolean d0(String str) {
        return !Intrinsics.areEqual((Object) str, (Object) HttpGet.METHOD_NAME) && !Intrinsics.areEqual((Object) str, (Object) HttpHead.METHOD_NAME);
    }

    public static final void e(String str) {
        P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [aq9, java.lang.Object, u05] */
    /* JADX WARNING: type inference failed for: r6v3, types: [zp9, t8f] */
    public static zp9 e0(FileInputStream fileInputStream) {
        ? obj = new Object();
        obj.a = 0;
        obj.o = fileInputStream;
        byte[] bArr = new byte[4];
        obj.b = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        obj.c = wrap;
        wrap.order(ByteOrder.BIG_ENDIAN);
        ap0 H = H(obj);
        obj.R((int) (H.b - obj.a));
        long j = H.c;
        ByteBuffer allocate = ByteBuffer.allocate((int) j);
        int read = fileInputStream.read(allocate.array());
        if (((long) read) == j) {
            ? t8f = new t8f();
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            int position = allocate.position() + allocate.getInt(allocate.position());
            t8f.d = allocate;
            t8f.a = position;
            int i = position - allocate.getInt(position);
            t8f.b = i;
            t8f.c = ((ByteBuffer) t8f.d).getShort(i);
            return t8f;
        }
        throw new IOException("Needed " + j + " bytes, got " + read);
    }

    public static ArrayList f(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    public static byte[] f0(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(wj6.h(i, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static byte[] g(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] g0(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static byte[] h(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static long h0(InputStream inputStream, int i) {
        byte[] f0 = f0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (f0[i2] & UByte.MAX_VALUE)) << (i2 * 8);
        }
        return j;
    }

    public static rp6 i(Collection collection, Boolean bool, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ue1 ue1 = (ue1) it.next();
            jSONArray.put((Object) String.valueOf(a81.b(ue1.b)) + ue1.a);
        }
        jSONObject.put("participantIds", (Object) jSONArray);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, (Object) jSONObject2.toString());
        }
        return a(jSONObject, "add-participant");
    }

    public static String i0(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static rp6 j(Set set, Set set2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(((gz0) it.next()).name(), true);
                }
            }
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((gz0) it2.next()).name(), false);
                }
            }
            rp6 a2 = a((JSONObject) null, "change-options");
            a2.a.put("options", (Object) jSONObject);
            return a2;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String j0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] T = T(str2);
        if (T[0] != -1) {
            sb.append(str2);
            i0(sb, T[1], T[2]);
            return sb.toString();
        }
        int[] T2 = T(str);
        if (T[3] == 0) {
            sb.append(str, 0, T2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (T[2] == 0) {
            sb.append(str, 0, T2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i = T[1];
            if (i != 0) {
                int i2 = T2[0] + 1;
                sb.append(str, 0, i2);
                sb.append(str2);
                return i0(sb, T[1] + i2, i2 + T[2]);
            } else if (str2.charAt(i) == '/') {
                sb.append(str, 0, T2[1]);
                sb.append(str2);
                int i3 = T2[1];
                return i0(sb, i3, T[2] + i3);
            } else {
                int i4 = T2[0] + 2;
                int i5 = T2[1];
                if (i4 >= i5 || i5 != T2[2]) {
                    int lastIndexOf = str.lastIndexOf(47, T2[2] - 1);
                    int i6 = lastIndexOf == -1 ? T2[1] : lastIndexOf + 1;
                    sb.append(str, 0, i6);
                    sb.append(str2);
                    return i0(sb, T2[1], i6 + T[2]);
                }
                sb.append(str, 0, i5);
                sb.append('/');
                sb.append(str2);
                int i7 = T2[1];
                return i0(sb, i7, T[2] + i7 + 1);
            }
        }
    }

    public static rp6 k(Map map, ue1 ue1) {
        try {
            rp6 a2 = a((JSONObject) null, "change-participant-state");
            JSONObject jSONObject = a2.a;
            jSONObject.put("participantState", (Object) new JSONObject().put("state", (Object) new JSONObject((Map<?, ?>) map)));
            if (ue1 != null) {
                jSONObject.put("participantId", (Object) ue1.c());
            }
            return a2;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Uri k0(String str, String str2) {
        return Uri.parse(j0(str, str2));
    }

    public static rp6 l(ue1 ue1, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("participantId", ue1.a);
            jSONObject2.put("participantType", (Object) a81.v(ue1.b));
            jSONObject2.put("deviceIdx", ue1.c);
            jSONObject2.put("data", (Object) jSONObject);
            return a(jSONObject2, "custom-data");
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void l0(kp7 kp7, Appendable appendable) {
        int U = kp7.U();
        if (!(U == 34 || U == 49)) {
            boolean z = true;
            if (U == 91) {
                kp7.a(appendable);
                while (kp7.U() != 93) {
                    if (!z) {
                        kp7.b(44);
                        kp7.a(appendable);
                    }
                    l0(kp7, appendable);
                    z = false;
                }
                kp7.a(appendable);
                return;
            } else if (!(U == 98 || U == 110)) {
                if (U == 123) {
                    kp7.a(appendable);
                    while (kp7.U() != 125) {
                        if (!z) {
                            kp7.b(44);
                            kp7.a(appendable);
                        }
                        kp7.b(34);
                        kp7.a(appendable);
                        kp7.b(58);
                        kp7.a(appendable);
                        l0(kp7, appendable);
                        z = false;
                    }
                    kp7.a(appendable);
                    return;
                }
                throw JsonSyntaxException.b(kp7.U(), kp7.m(), (long) kp7.o);
            }
        }
        kp7.a(appendable);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0045=Splitter:B:19:0x0045, B:31:0x0075=Splitter:B:31:0x0075} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.e51 m(org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "decorativeExternalParticipantId"
            r1 = 0
            if (r11 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "deviceIdx"
            r3 = 0
            int r2 = r11.optInt(r2, r3)     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.has(r0)     // Catch:{ JSONException -> 0x007b }
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "vk"
            java.lang.String r8 = "anonym"
            java.lang.String r9 = "type"
            java.lang.String r10 = "id"
            if (r3 == 0) goto L_0x004c
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x007b }
            if (r11 != 0) goto L_0x0025
            goto L_0x004b
        L_0x0025:
            java.lang.String r0 = r11.getString(r10)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ JSONException -> 0x007b }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ JSONException -> 0x007b }
            r11.getClass()     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.equals(r8)
            if (r3 != 0) goto L_0x0045
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0044
            r4 = r6
            goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            e51 r11 = new e51     // Catch:{ JSONException -> 0x007b }
            r11.<init>(r0, r4, r2)     // Catch:{ JSONException -> 0x007b }
            r1 = r11
        L_0x004b:
            return r1
        L_0x004c:
            java.lang.String r0 = "externalId"
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x007b }
            if (r11 != 0) goto L_0x0055
            goto L_0x007b
        L_0x0055:
            java.lang.String r0 = r11.getString(r10)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ JSONException -> 0x007b }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ JSONException -> 0x007b }
            r11.getClass()     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.equals(r8)
            if (r3 != 0) goto L_0x0075
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0074
            r4 = r6
            goto L_0x0075
        L_0x0074:
            r4 = r5
        L_0x0075:
            e51 r11 = new e51     // Catch:{ JSONException -> 0x007b }
            r11.<init>(r0, r4, r2)     // Catch:{ JSONException -> 0x007b }
            r1 = r11
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf6.m(org.json.JSONObject):e51");
    }

    public static go1 m0(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hd8.J(((lk4) it.next()).c()));
        }
        return m5a.F(new u00((Object) m5a.F(new u52((Object) hd8.W(arrayList), (Object) scheduledExecutorService, (long) MultiFileUploader.UPLOAD_NEXT_INTERVAL, 8)), (Object) executor, (Object) list, 6));
    }

    public static JSONObject n(ue1 ue1, SessionDescription sessionDescription) {
        JSONObject jSONObject = new JSONObject();
        b(ue1, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) sessionDescription.type.canonicalForm());
        jSONObject2.put("sdp", (Object) sessionDescription.description);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sdp", (Object) jSONObject2);
        jSONObject.put("data", (Object) jSONObject3);
        return jSONObject;
    }

    public static final EnumSet n0(String str) {
        Object obj;
        JSONArray jSONArray = new JSONArray(str);
        EnumSet<E> noneOf = EnumSet.noneOf(q82.class);
        Iterator it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            String string = jSONArray.getString(((IntIterator) it).nextInt());
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m23constructorimpl(q82.valueOf(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m29isFailureimpl(obj)) {
                obj = null;
            }
            q82 q82 = (q82) obj;
            if (q82 != null) {
                noneOf.add(q82);
            }
        }
        return noneOf;
    }

    public static ft8 o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("UNMUTE")) {
            return ft8.a;
        }
        if (str.equals("MUTE")) {
            return ft8.b;
        }
        if (str.equals("MUTE_PERMANENT")) {
            return ft8.c;
        }
        return null;
    }

    public static byte[] o0(tw0 tw0) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(ConstantsKt.DEFAULT_BUFFER_SIZE, Math.max(Uuid.SIZE_BITS, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = tw0.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return g(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = ((long) min) * ((long) (min < 4096 ? 4 : 2));
            min = j > 2147483647L ? IntCompanionObject.MAX_VALUE : j < -2147483648L ? IntCompanionObject.MIN_VALUE : (int) j;
        }
        if (tw0.read() == -1) {
            return g(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static HashMap p(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("muteStates");
        if (optJSONObject != null) {
            hashMap.put(et8.a, o(optJSONObject.optString("AUDIO")));
            hashMap.put(et8.b, o(optJSONObject.optString("VIDEO")));
            hashMap.put(et8.c, o(optJSONObject.optString("SCREEN_SHARING")));
            hashMap.put(et8.o, o(optJSONObject.optString("MOVIE_SHARING")));
        }
        return hashMap;
    }

    public static String p0(int i) {
        return a81.j(i, "ProfileEditItemId(value=", ")");
    }

    public static mz9 q(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mediaSettings");
        if (optJSONObject == null) {
            return null;
        }
        return new mz9(optJSONObject.optBoolean("isAudioEnabled", false), optJSONObject.optBoolean("isVideoEnabled", false), optJSONObject.optBoolean("isScreenSharingEnabled", false), optJSONObject.optBoolean("isAnimojiEnabled", false));
    }

    public static final void q0(fwf fwf) {
        fwf.c(oa4.class, new qid(28));
        fwf.e(po7.class, new jye(20));
        fwf.e(d93.class, new jye(21));
        fwf.e(er6.class, new rid(22));
        fwf.e(vfg.class, new rid(23));
        Class<dn4> cls = dn4.class;
        fwf.c(cls, new qid(29));
        Class<xo7> cls2 = xo7.class;
        fwf.c(cls2, new ufg(0));
        fwf.c(cls2, new ufg(1));
        fwf.c(cls2, new ufg(2));
        fwf.c(cls2, new ufg(3));
        fwf.c(cls2, new ufg(4));
        fwf.c(cls, new ufg(5));
    }

    public static JSONObject r(aae aae, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isVideoEnabled", aae.a);
            jSONObject.put("isAudioEnabled", aae.b);
            jSONObject.put("isScreenSharingEnabled", aae.c);
            jSONObject.put("isAnimojiEnabled", aae.e);
            if (z) {
                jSONObject.put("isFastScreenSharingEnabled", aae.d);
            }
            if (z2) {
                jSONObject.put("isAudioSharingEnabled", aae.f);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void r0(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int B0 = B0(parcel, i);
            parcel.writeBundle(bundle);
            E0(parcel, B0);
        }
    }

    public static Pair s(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
        if (optJSONObject != null) {
            return new Pair(optJSONObject.getString("id"), optJSONObject.optString("type", "WEB_SOCKET"));
        }
        return null;
    }

    public static void s0(Parcel parcel, int i, Float f) {
        if (f != null) {
            G0(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static rp6 t(ue1 ue1, boolean z) {
        try {
            rp6 a2 = a((JSONObject) null, "promote-participant");
            JSONObject jSONObject = a2.a;
            jSONObject.put("demote", !z);
            jSONObject.put("participantId", (Object) ue1.c());
            return a2;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void t0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int B0 = B0(parcel, i);
            parcel.writeStrongBinder(iBinder);
            E0(parcel, B0);
        }
    }

    public static rp6 u(ue1 ue1, Boolean bool, boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(ue1, jSONObject, false);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, (Object) jSONObject2.toString());
        }
        return a(jSONObject, "add-participant");
    }

    public static void u0(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int B0 = B0(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            E0(parcel, B0);
        }
    }

    public static rp6 v(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", i);
        if (num != null) {
            jSONObject.put("estimatedPerformanceIndex", (Object) num);
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", i2);
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", z);
        jSONObject.put("onDemandTracks", z2);
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (z3) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (z4) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (z6) {
            jSONObject.put("animojiDataChannelVersion", 2);
        }
        if (z7) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (z8) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (z9) {
            jSONObject.put("audioShare", true);
        }
        jSONObject.put("red", z5);
        if (i3 > 0) {
            jSONObject.put("videoTracksCount", i3);
            jSONObject.put("csrcAccessible", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("capabilities", (Object) jSONObject);
        return a(jSONObject2, "allocate-consumer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0244, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0251, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:186:0x0230, B:202:0x024d] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ba A[SYNTHETIC, Splitter:B:139:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x028f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1 A[SYNTHETIC, Splitter:B:55:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v0(android.content.Context r17, java.util.concurrent.Executor r18, defpackage.y1c r19, boolean r20) {
        /*
            r1 = r17
            r8 = r19
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x0298 }
            java.io.File r13 = r17.getFilesDir()
            r14 = 0
            r15 = 1
            if (r20 != 0) goto L_0x0079
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x003f
            r0 = r11
            goto L_0x006d
        L_0x003f:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006c }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x006c }
            long r4 = r3.readLong()     // Catch:{ all -> 0x0060 }
            r3.close()     // Catch:{ IOException -> 0x006c }
            long r10 = r12.lastUpdateTime
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r0 = r15
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x006d
            r3 = 2
            r8.a(r3, r14)
            goto L_0x006d
        L_0x0060:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006b
        L_0x0066:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x006c }
        L_0x006b:
            throw r4     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x0070
            goto L_0x0079
        L_0x0070:
            r17.getPackageName()
            r2 = 0
            defpackage.o6c.c(r1, r2)
            goto L_0x0297
        L_0x0079:
            r17.getPackageName()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r10 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r10.<init>(r3, r2)
            cy3 r11 = new cy3
            java.lang.String r7 = "dexopt/baseline.prof"
            r2 = r11
            r3 = r9
            r4 = r18
            r5 = r19
            r16 = r7
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r2 = r11.d
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x00ad
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r11.p(r2, r0)
        L_0x00aa:
            r4 = r15
            goto L_0x028c
        L_0x00ad:
            boolean r0 = r10.exists()
            r3 = 4
            if (r0 == 0) goto L_0x00be
            boolean r0 = r10.canWrite()
            if (r0 != 0) goto L_0x00c1
            r11.p(r3, r14)
            goto L_0x00aa
        L_0x00be:
            r10.createNewFile()     // Catch:{ IOException -> 0x0288 }
        L_0x00c1:
            r11.a = r15
            byte[] r4 = defpackage.hi7.h
            r5 = 6
            r0 = r16
            java.io.FileInputStream r0 = r11.o(r9, r0)     // Catch:{ FileNotFoundException -> 0x00d5, IOException -> 0x00ce }
            r6 = r0
            goto L_0x00db
        L_0x00ce:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.a(r7, r6)
            goto L_0x00da
        L_0x00d5:
            r0 = move-exception
            r6 = r0
            r8.a(r5, r6)
        L_0x00da:
            r6 = r14
        L_0x00db:
            java.lang.String r7 = "Invalid magic"
            r10 = 8
            if (r6 == 0) goto L_0x013b
            byte[] r0 = f0(r6, r3)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            if (r0 == 0) goto L_0x0109
            byte[] r0 = f0(r6, r3)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            java.lang.Object r5 = r11.f     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            sn4[] r5 = defpackage.hi7.P(r6, r0, r5)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            r6.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x012d
        L_0x00fb:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.a(r15, r6)
            goto L_0x012d
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            r1 = r0
            goto L_0x0130
        L_0x0105:
            r0 = move-exception
            goto L_0x010f
        L_0x0107:
            r15 = 7
            goto L_0x0122
        L_0x0109:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            throw r0     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
        L_0x010f:
            r8.a(r10, r0)     // Catch:{ all -> 0x011d }
            r6.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x012c
        L_0x0116:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x0119:
            r8.a(r15, r5)
            goto L_0x012c
        L_0x011d:
            r0 = move-exception
            r15 = 7
            goto L_0x0103
        L_0x0120:
            r0 = move-exception
            goto L_0x0107
        L_0x0122:
            r8.a(r15, r0)     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ IOException -> 0x0129 }
            goto L_0x012c
        L_0x0129:
            r0 = move-exception
            r5 = r0
            goto L_0x0119
        L_0x012c:
            r5 = r14
        L_0x012d:
            r11.g = r5
            goto L_0x013b
        L_0x0130:
            r6.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x013a
        L_0x0134:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.a(r3, r2)
        L_0x013a:
            throw r1
        L_0x013b:
            java.lang.Object r0 = r11.g
            sn4[] r0 = (defpackage.sn4[]) r0
            if (r0 == 0) goto L_0x01a2
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 <= r6) goto L_0x0148
            goto L_0x01a2
        L_0x0148:
            switch(r5) {
                case 31: goto L_0x014c;
                case 32: goto L_0x014c;
                case 33: goto L_0x014c;
                case 34: goto L_0x014c;
                default: goto L_0x014b;
            }
        L_0x014b:
            goto L_0x01a2
        L_0x014c:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r11.o(r9, r5)     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            if (r5 == 0) goto L_0x0189
            byte[] r6 = defpackage.hi7.i     // Catch:{ all -> 0x0176 }
            byte[] r9 = f0(r5, r3)     // Catch:{ all -> 0x0176 }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x0176 }
            if (r6 == 0) goto L_0x0179
            byte[] r3 = f0(r5, r3)     // Catch:{ all -> 0x0176 }
            sn4[] r0 = defpackage.hi7.M(r5, r3, r2, r0)     // Catch:{ all -> 0x0176 }
            r11.g = r0     // Catch:{ all -> 0x0176 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            r0 = r11
            goto L_0x019f
        L_0x016f:
            r0 = move-exception
            goto L_0x018f
        L_0x0171:
            r0 = move-exception
            r2 = 7
            goto L_0x0195
        L_0x0174:
            r0 = move-exception
            goto L_0x0199
        L_0x0176:
            r0 = move-exception
            r2 = r0
            goto L_0x017f
        L_0x0179:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0176 }
            r0.<init>(r7)     // Catch:{ all -> 0x0176 }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x017f:
            r5.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0188
        L_0x0183:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
        L_0x0188:
            throw r2     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
        L_0x0189:
            if (r5 == 0) goto L_0x019e
            r5.close()     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            goto L_0x019e
        L_0x018f:
            r11.g = r14
            r8.a(r10, r0)
            goto L_0x019e
        L_0x0195:
            r8.a(r2, r0)
            goto L_0x019e
        L_0x0199:
            r2 = 9
            r8.a(r2, r0)
        L_0x019e:
            r0 = r14
        L_0x019f:
            if (r0 == 0) goto L_0x01a2
            r11 = r0
        L_0x01a2:
            java.lang.Object r0 = r11.c
            r2 = r0
            y1c r2 = (defpackage.y1c) r2
            java.lang.Object r0 = r11.g
            sn4[] r0 = (defpackage.sn4[]) r0
            java.lang.String r3 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0201
            java.lang.Object r5 = r11.d
            byte[] r5 = (byte[]) r5
            if (r5 != 0) goto L_0x01b6
            goto L_0x0201
        L_0x01b6:
            boolean r6 = r11.a
            if (r6 == 0) goto L_0x01fb
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            r6.<init>()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            r6.write(r4)     // Catch:{ all -> 0x01da }
            r6.write(r5)     // Catch:{ all -> 0x01da }
            boolean r0 = defpackage.hi7.f0(r6, r5, r0)     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01dd
            r0 = 5
            r2.a(r0, r14)     // Catch:{ all -> 0x01da }
            r11.g = r14     // Catch:{ all -> 0x01da }
            r6.close()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            goto L_0x0201
        L_0x01d5:
            r0 = move-exception
            goto L_0x01f1
        L_0x01d7:
            r0 = move-exception
            r4 = 7
            goto L_0x01f5
        L_0x01da:
            r0 = move-exception
            r4 = r0
            goto L_0x01e7
        L_0x01dd:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01da }
            r11.h = r0     // Catch:{ all -> 0x01da }
            r6.close()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            goto L_0x01f8
        L_0x01e7:
            r6.close()     // Catch:{ all -> 0x01eb }
            goto L_0x01f0
        L_0x01eb:
            r0 = move-exception
            r5 = r0
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
        L_0x01f0:
            throw r4     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
        L_0x01f1:
            r2.a(r10, r0)
            goto L_0x01f8
        L_0x01f5:
            r2.a(r4, r0)
        L_0x01f8:
            r11.g = r14
            goto L_0x0201
        L_0x01fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0201:
            java.lang.Object r0 = r11.h
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x020b
            r2 = 0
            r4 = 1
            goto L_0x0277
        L_0x020b:
            boolean r2 = r11.a
            if (r2 == 0) goto L_0x0282
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0257 }
            java.lang.Object r0 = r11.e     // Catch:{ all -> 0x0257 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0257 }
            r3.<init>(r0)     // Catch:{ all -> 0x0257 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x024a }
        L_0x0221:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x024a }
            if (r4 <= 0) goto L_0x022c
            r5 = 0
            r3.write(r0, r5, r4)     // Catch:{ all -> 0x024a }
            goto L_0x0221
        L_0x022c:
            r4 = 1
            r11.p(r4, r14)     // Catch:{ all -> 0x0247 }
            r3.close()     // Catch:{ all -> 0x0244 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
            r11.h = r14
            r11.g = r14
            r2 = r4
            goto L_0x0277
        L_0x023c:
            r0 = move-exception
            goto L_0x027d
        L_0x023e:
            r0 = move-exception
        L_0x023f:
            r2 = 7
            goto L_0x026a
        L_0x0241:
            r0 = move-exception
        L_0x0242:
            r2 = 6
            goto L_0x0272
        L_0x0244:
            r0 = move-exception
        L_0x0245:
            r3 = r0
            goto L_0x025a
        L_0x0247:
            r0 = move-exception
        L_0x0248:
            r5 = r0
            goto L_0x024d
        L_0x024a:
            r0 = move-exception
            r4 = 1
            goto L_0x0248
        L_0x024d:
            r3.close()     // Catch:{ all -> 0x0251 }
            goto L_0x0256
        L_0x0251:
            r0 = move-exception
            r3 = r0
            r5.addSuppressed(r3)     // Catch:{ all -> 0x0244 }
        L_0x0256:
            throw r5     // Catch:{ all -> 0x0244 }
        L_0x0257:
            r0 = move-exception
            r4 = 1
            goto L_0x0245
        L_0x025a:
            r2.close()     // Catch:{ all -> 0x025e }
            goto L_0x0263
        L_0x025e:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
        L_0x0263:
            throw r3     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
        L_0x0264:
            r0 = move-exception
            r4 = 1
            goto L_0x023f
        L_0x0267:
            r0 = move-exception
            r4 = 1
            goto L_0x0242
        L_0x026a:
            r11.p(r2, r0)     // Catch:{ all -> 0x023c }
        L_0x026d:
            r11.h = r14
            r11.g = r14
            goto L_0x0276
        L_0x0272:
            r11.p(r2, r0)     // Catch:{ all -> 0x023c }
            goto L_0x026d
        L_0x0276:
            r2 = 0
        L_0x0277:
            if (r2 == 0) goto L_0x028d
            Z(r12, r13)
            goto L_0x028d
        L_0x027d:
            r11.h = r14
            r11.g = r14
            throw r0
        L_0x0282:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0288:
            r4 = r15
            r11.p(r3, r14)
        L_0x028c:
            r2 = 0
        L_0x028d:
            if (r2 == 0) goto L_0x0293
            if (r20 == 0) goto L_0x0293
            r11 = r4
            goto L_0x0294
        L_0x0293:
            r11 = 0
        L_0x0294:
            defpackage.o6c.c(r1, r11)
        L_0x0297:
            return
        L_0x0298:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.a(r3, r2)
            r2 = 0
            defpackage.o6c.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf6.v0(android.content.Context, java.util.concurrent.Executor, y1c, boolean):void");
    }

    public static rp6 w(ue1 ue1, List list, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ue1.c());
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((Object) (xe1) it.next());
        }
        jSONObject.put("roles", (Object) jSONArray);
        jSONObject.put("revoke", z);
        return a(jSONObject, "grant-roles");
    }

    public static void w0(Parcel parcel, int i, String str) {
        if (str != null) {
            int B0 = B0(parcel, i);
            parcel.writeString(str);
            E0(parcel, B0);
        }
    }

    public static rp6 x(ue1 ue1, zwd zwd, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ue1.c());
        if (zwd instanceof ywd) {
            jSONObject.put("roomId", ((ywd) zwd).a);
        }
        jSONObject.put("unpin", !z);
        return a(jSONObject, "pin-participant");
    }

    public static void x0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int B0 = B0(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            E0(parcel, B0);
        }
    }

    public static rp6 y(ue1 ue1, IceCandidate iceCandidate) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", (Object) iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
        jSONObject.put("sdpMid", (Object) iceCandidate.sdpMid);
        jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        b(ue1, jSONObject3, true);
        jSONObject3.put("data", (Object) jSONObject2);
        return a(jSONObject3, "transmit-data");
    }

    public static void y0(Parcel parcel, List list, int i) {
        if (list != null) {
            int B0 = B0(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            E0(parcel, B0);
        }
    }

    public static rp6 z(ue1 ue1, IceCandidate[] iceCandidateArr) {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", (Object) iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
            jSONObject.put("sdpMid", (Object) iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            jSONArray.put((Object) jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidates-removed", (Object) jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        b(ue1, jSONObject3, true);
        jSONObject3.put("data", (Object) jSONObject2);
        return a(jSONObject3, "transmit-data");
    }

    public static void z0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }
}
