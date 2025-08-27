package defpackage;

import android.media.CamcorderProfile;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.google.android.gms.tasks.Task;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONObject;

/* renamed from: nfd  reason: default package */
public final class nfd implements hq2, zi6, qk3, mx3, zq1, Provider, op7, gze {
    public static final qbb X = new qbb(27);
    public static final /* synthetic */ nfd Y = new nfd(6);
    public static final nfd b = new nfd(1);
    public static final ws0 c;
    public static final ws0 o;
    public static final a93 v;
    public static final nnf w = new nnf(new mnf(-1, -15921907, 336136457, -15757630, 2047675661, 168364297, -1727033662), new qnf(-15921907, -2062742259, -1, -15757630, -1552977290, -1552977290, -1543503873, -1191182337), new onf(-15921907, -11447211, -7762804, -4407874, -1, -15757630, 336136457, -1552977290, -1552977290, -1552977290, -1552977290, -1191182337, -1191182337, -1727033662, 168364297), new pnf(688655630, 252448014));
    public static final zqg x = new zqg(new yqg(-1, -1, -592138, 336136457), new crg(-15987442, -2062807794, -2062807794, -1207169778, 1712065806, -15987442, -15757630), new arg(-15757630, -15987442, -7762804, -7762804, 1879837966), new brg(-15757630, 252448014, 252448014));
    public static final nfd y = new nfd(2);
    public static final nfd z = new nfd(4);
    public final /* synthetic */ int a;

    static {
        vs0 vs0 = new vs0(-15757630, 336563906, -1, -2062577982);
        c = new ws0(new qs0(new ps0(-1559261502, -1559261502, 1712295618), new rs0(new ss0(1019586, 521113282), new ts0(1019586, 1024429762), new us0(821435, 1024231611)), vs0, -1, -15757630, 1024429762, 336563906, 336563906, 336563906, 336563906, -1, new int[]{-1, -1, -1}), new zs0(new at0(-1, -15757630, -15757630, -1), -15757630, -15757630, -15987442, -2062807794, -2062807794, -15757630, -1207169778, -2062807794, -2062807794, -1207169778), new xs0(-15757630, -1, -1, -15757630, -8682855, -1307603262, -15757630, -53188, -8682855, -15757630, -1559491314, -1895035634, 1879837966, -1895035634), new ys0(-15757630, -1, 336563906));
        vs0 vs02 = new vs0(-15757630, 521113282, -1, -2062577982);
        o = new ws0(new qs0(new ps0(-1728006644, -1728006644, 1711322636), new rs0(new ss0(1019586, 521113282), new ts0(1019586, 1024429762), new us0(821435, 1024231611)), vs02, -1442305, -15757630, 1544523458, 336563906, 336563906, 336563906, 521113282, -656897, new int[]{-1442305, -1442305, -1442305}), new zs0(new at0(-1, -15757630, -15757630, -1), -15757630, -15757630, -16438468, -2063258820, -15757630, -15757630, -1207620804, -2063258820, -2063258820, -1207620804), new xs0(-15757630, -1, -1442305, -15757630, -2063258820, -15757630, -15757630, -53188, -2063258820, -15757630, -1559942340, -1895486660, 1879386940, -1895486660), new ys0(-15757630, -1442305, 336563906));
        r63 r63 = new r63(new p63(1308622847, new int[]{16777215, 1090519039, -2130706433}), new q63(-986638, new int[]{16777215, 1090519039, -2130706433}), new t63(new s63(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new v63(new u63(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444}));
        v = new a93(new n63(new m63(526344, -6695465, -8340225, 1291877119), new o63(-371456, 1039815936, 704271616, -1543503873, 1024489791, 688945471, -2409396, 1037777996, 702233676, -16544549, 1023642843, 688098523, 1033643952, 698099632, -10587743, 1029599649, 694055329, 1025203902, 689659582, 1024429762, 688885442, -9158436, 1031028956, 695484636), r63, -8734748, 1543503872, -1192234767, -2062577982, -1249810, -1184014, new int[]{-2062577982, -2062577982}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6695465, -8340225}), new o93(-1, -15987442), new b93(-15757630), new n93(1308622847, -1, 688655630), new l63(-15757630, -2693121, -15921907, -53188, -15757630, -15987442, -4933959), new h93(251658240, 167772160, 251658240, 251658240), new k93(new j93(new i93(-16089170)), new l93(-1545253546, -1727033662), new m93(-1545253546, -1727033662)));
    }

    public /* synthetic */ nfd(int i) {
        this.a = i;
    }

    public static final String b(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z2;
        byte b2;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int i4 = -1;
        byte[] bArr5 = PublicSuffixDatabase.e;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > i4 && bArr3[i6] != ((byte) 10)) {
                i6 += i4;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr3[i2] == ((byte) 10)) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z3 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z3) {
                    b2 = 46;
                    z2 = false;
                } else {
                    byte b3 = bArr4[i10][i11];
                    byte[] bArr6 = u0g.a;
                    byte b4 = b3 & UByte.MAX_VALUE;
                    z2 = z3;
                    b2 = b4;
                }
                byte b5 = bArr3[i7 + i12];
                byte[] bArr7 = u0g.a;
                i3 = b2 - (b5 & UByte.MAX_VALUE);
                if (i3 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z3 = z2;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z3 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    int length3 = bArr4.length;
                    for (int i14 = i10 + 1; i14 < length3; i14++) {
                        length2 += bArr4[i14].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
                i4 = -1;
            }
            length = i6;
            i4 = -1;
        }
        return null;
    }

    public static final List g(DataInputStream dataInputStream) {
        Object obj;
        List createListBuilder = CollectionsKt.createListBuilder();
        while (dataInputStream.read() == 3) {
            long readLong = dataInputStream.readLong();
            String readUTF = dataInputStream.readUTF();
            long readLong2 = dataInputStream.readLong();
            String readUTF2 = dataInputStream.readUTF();
            Map createMapBuilder = MapsKt.createMapBuilder();
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                String readUTF3 = dataInputStream.readUTF();
                int readInt2 = dataInputStream.readInt();
                if (readInt2 == 1) {
                    obj = dataInputStream.readUTF();
                } else if (readInt2 == 2) {
                    obj = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (readInt2 == 3) {
                    obj = Long.valueOf(dataInputStream.readLong());
                } else if (readInt2 == 4) {
                    obj = Double.valueOf(dataInputStream.readDouble());
                } else {
                    throw new IOException(wj6.h(readInt2, "Unsupported attribute value type "));
                }
                createMapBuilder.put(readUTF3, obj);
            }
            createListBuilder.add(new wbb(readLong, readUTF, readLong2, readUTF2, MapsKt.build(createMapBuilder)));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public static final void h(DataOutputStream dataOutputStream, wbb wbb) {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeLong(wbb.a);
        dataOutputStream.writeUTF(wbb.b);
        dataOutputStream.writeLong(wbb.c);
        dataOutputStream.writeUTF(wbb.d);
        Map map = wbb.e;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            dataOutputStream.writeUTF((String) entry.getKey());
            if (value instanceof Boolean) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
            } else {
                if (value instanceof Long ? true : value instanceof Integer ? true : value instanceof Byte ? true : value instanceof Short) {
                    dataOutputStream.writeInt(3);
                    dataOutputStream.writeLong(((Number) value).longValue());
                } else {
                    if (value instanceof Double ? true : value instanceof Float) {
                        dataOutputStream.writeInt(4);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF(value.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r0 = kotlin.text.StringsKt.toFloatOrNull(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(ru.ok.android.externcalls.analytics.events.EventItemsMap r2, defpackage.uw1 r3) {
        /*
            java.lang.String r0 = r3.b
            java.lang.String r1 = "local_connection_type"
            r2.set((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = r3.e
            java.lang.String r1 = "remote_connection_type"
            r2.set((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = r3.d
            java.lang.String r1 = "local_address"
            r2.set((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = r3.g
            java.lang.String r1 = "remote_address"
            r2.set((java.lang.String) r1, (java.lang.String) r0)
            yk1[] r0 = defpackage.yk1.b
            java.lang.String r0 = r3.h
            if (r0 == 0) goto L_0x0032
            java.lang.Float r0 = kotlin.text.StringsKt.toFloatOrNull(r0)
            if (r0 == 0) goto L_0x0032
            float r0 = r0.floatValue()
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            java.lang.String r1 = "rtt"
            r2.set((java.lang.String) r1, (java.lang.Integer) r0)
            java.lang.String r3 = r3.i
            java.lang.String r0 = "transport"
            r2.set((java.lang.String) r0, (java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfd.m(ru.ok.android.externcalls.analytics.events.EventItemsMap, uw1):void");
    }

    public static p01 o(z35 z35, j28 j28) {
        int i;
        IOException iOException = j28.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).o) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (z35.a(1)) {
            return new p01(1, 3, 300000);
        }
        if (z35.a(2)) {
            return new p01(2, 3, 60000);
        }
        return null;
    }

    public static long q(j28 j28) {
        Throwable th = j28.a;
        if (!(th instanceof ParserException) && !(th instanceof FileNotFoundException) && !(th instanceof HttpDataSource$CleartextNotPermittedException) && !(th instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.b;
            while (th != null) {
                if (!(th instanceof DataSourceException) || ((DataSourceException) th).a != 2008) {
                    th = th.getCause();
                }
            }
            return (long) Math.min((j28.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static boolean r(aj8 aj8) {
        return aj8 == aj8.c;
    }

    public static zwd s(JSONObject jSONObject) {
        return jSONObject.has("roomId") ? new ywd(jSONObject.getInt("roomId")) : xwd.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ni0 u() {
        /*
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "dns.google.com"
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "resolve"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "name"
            java.lang.String r2 = "api._endpoint.ok.ru."
            r0.appendQueryParameter(r1, r2)
            r2 = 16
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "type"
            r0.appendQueryParameter(r3, r2)
            java.lang.String r0 = r0.toString()
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            java.net.URLConnection r0 = r2.openConnection()
            r2 = 3000(0xbb8, float:4.204E-42)
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            java.io.InputStream r0 = r0.getInputStream()
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r0, r2)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r2)
            java.lang.String r2 = kotlin.io.TextStreamsKt.readText(r0)     // Catch:{ all -> 0x0089 }
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0082 }
            r0.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "Answer"
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0082 }
            r2 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0082 }
            r0.getString(r1)     // Catch:{ JSONException -> 0x0082 }
            r0.getInt(r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r1 = "TTL"
            int r1 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "data"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0082 }
            ni0 r2 = new ni0     // Catch:{ JSONException -> 0x0082 }
            r3 = 8
            r2.<init>((int) r1, (java.io.Serializable) r0, (int) r3)     // Catch:{ JSONException -> 0x0082 }
            return r2
        L_0x0082:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfd.u():ni0");
    }

    public static aj8 v(aj8 aj8) {
        int ordinal = aj8.ordinal();
        if (ordinal == 0) {
            return aj8.c;
        }
        if (ordinal == 1) {
            return aj8.b;
        }
        if (ordinal == 2) {
            return aj8.o;
        }
        if (ordinal == 3) {
            return aj8.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int D(ea6 ea6) {
        return 1;
    }

    public void accept(Object obj) {
        hga.d.getClass();
        z68.b(hga.f, "onSelfReadMarkChanged: failed to remove sent analytics entries", (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                List list = (List) obj;
                return list.isEmpty() ? uh8.a : nh8.e(list);
            default:
                return obj;
        }
    }

    public CamcorderProfile c(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public boolean d(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public ws0 e() {
        return c;
    }

    public zqg f() {
        return x;
    }

    public Object get() {
        return va0.f;
    }

    public ws0 i() {
        return o;
    }

    public nnf j() {
        return w;
    }

    public boolean k(ea6 ea6) {
        return false;
    }

    public a93 l() {
        return v;
    }

    public Object n(Task task) {
        if (task.h()) {
            return (Bundle) task.f();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.e()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.e());
    }

    public int p(int i) {
        return i == 7 ? 6 : 3;
    }

    public Object parse(sp7 sp7) {
        sp7.A();
        return null;
    }

    public ize t(ea6 ea6) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }
}
