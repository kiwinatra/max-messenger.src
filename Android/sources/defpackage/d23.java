package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.messages.stickers.FrgStickerPreview;

/* renamed from: d23  reason: default package */
public final class d23 implements fv, tt {
    public static final /* synthetic */ int x = 0;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object o;
    public Object v;
    public Object w;

    public d23(voc voc, o60 o60, zqd zqd, ox0 ox0, npg npg, dm4 dm4) {
        this.a = voc;
        this.b = o60;
        this.c = zqd;
        this.o = ox0;
        this.v = npg;
        this.w = dm4;
    }

    public static dxd c(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1881281404) {
            if (hashCode != -1785516855) {
                if (hashCode != -873347853) {
                    if (hashCode == -595928767 && str.equals("TIMEOUT")) {
                        return dxd.o;
                    }
                } else if (str.equals("ACTIVATE")) {
                    return dxd.c;
                }
            } else if (str.equals("UPDATE")) {
                return dxd.a;
            }
        } else if (str.equals("REMOVE")) {
            return dxd.b;
        }
        return null;
    }

    public static od4 d(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = v0g.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
                i++;
            } else {
                throw new IOException(wj6.h(readInt2, "Invalid value size: "));
            }
        }
        return new od4(hashMap);
    }

    public static void e(od4 od4, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = od4.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void D(qq7 qq7) {
        boe a2;
        FrgStickerPreview frgStickerPreview = (FrgStickerPreview) this.b;
        if (frgStickerPreview != null && (a2 = ((tq7) this.v).a(qq7)) != null) {
            frgStickerPreview.getClass();
            frgStickerPreview.n3(a2, goe.a);
        }
    }

    public cxd a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            dxd c2 = c(jSONArray.getString(i));
            if (c2 != null) {
                linkedHashSet.add(c2);
            }
        }
        int i2 = jSONObject.getInt("roomId");
        boolean optBoolean = jSONObject.optBoolean("deactivate");
        JSONObject optJSONObject = jSONObject.optJSONObject("room");
        return new cxd(linkedHashSet, i2, optJSONObject != null ? p(optJSONObject) : null, optBoolean);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016d, code lost:
        if (r2.equals("bmp") == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.vt b(defpackage.e05 r8, android.os.Looper r9, defpackage.ut r10, defpackage.qd3 r11) {
        /*
            r7 = this;
            r0 = 19
            r1 = 1
            ir8 r2 = r8.a
            xq8 r2 = r2.b
            java.lang.Object r3 = r7.a
            android.content.Context r3 = (android.content.Context) r3
            if (r2 != 0) goto L_0x000f
            goto L_0x01af
        L_0x000f:
            java.lang.String r4 = r2.b
            if (r4 != 0) goto L_0x01a6
            android.net.Uri r2 = r2.a
            java.lang.String r5 = r2.getScheme()
            java.lang.String r6 = "content"
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L_0x002b
            android.content.ContentResolver r1 = r3.getContentResolver()
            java.lang.String r4 = r1.getType(r2)
            goto L_0x01a6
        L_0x002b:
            java.lang.String r2 = r2.getPath()
            if (r2 != 0) goto L_0x0033
            goto L_0x01af
        L_0x0033:
            java.lang.String r5 = "."
            int r5 = r2.lastIndexOf(r5)
            if (r5 < 0) goto L_0x01a6
            int r6 = r2.length()
            int r6 = r6 - r1
            if (r5 >= r6) goto L_0x01a6
            int r5 = r5 + r1
            java.lang.String r2 = r2.substring(r5)
            java.lang.String r2 = defpackage.o54.P(r2)
            r2.getClass()
            r4 = -1
            int r5 = r2.hashCode()
            switch(r5) {
                case 96870: goto L_0x0171;
                case 97669: goto L_0x0167;
                case 98723: goto L_0x015b;
                case 99453: goto L_0x014f;
                case 102340: goto L_0x0143;
                case 104085: goto L_0x0137;
                case 104430: goto L_0x012b;
                case 105133: goto L_0x011f;
                case 105223: goto L_0x0112;
                case 105439: goto L_0x0104;
                case 105441: goto L_0x00f6;
                case 111145: goto L_0x00e8;
                case 112680: goto L_0x00da;
                case 114276: goto L_0x00cd;
                case 114833: goto L_0x00c0;
                case 3006482: goto L_0x00b3;
                case 3198679: goto L_0x00a6;
                case 3198682: goto L_0x0099;
                case 3259225: goto L_0x008c;
                case 3268712: goto L_0x0080;
                case 3542678: goto L_0x0073;
                case 3559925: goto L_0x0066;
                case 3645340: goto L_0x0059;
                default: goto L_0x0056;
            }
        L_0x0056:
            r1 = r4
            goto L_0x017c
        L_0x0059:
            java.lang.String r1 = "webp"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0062
            goto L_0x0056
        L_0x0062:
            r1 = 22
            goto L_0x017c
        L_0x0066:
            java.lang.String r1 = "tiff"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006f
            goto L_0x0056
        L_0x006f:
            r1 = 21
            goto L_0x017c
        L_0x0073:
            java.lang.String r1 = "svgz"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x007c
            goto L_0x0056
        L_0x007c:
            r1 = 20
            goto L_0x017c
        L_0x0080:
            java.lang.String r1 = "jpeg"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0089
            goto L_0x0056
        L_0x0089:
            r1 = r0
            goto L_0x017c
        L_0x008c:
            java.lang.String r1 = "jfif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0095
            goto L_0x0056
        L_0x0095:
            r1 = 18
            goto L_0x017c
        L_0x0099:
            java.lang.String r1 = "heif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00a2
            goto L_0x0056
        L_0x00a2:
            r1 = 17
            goto L_0x017c
        L_0x00a6:
            java.lang.String r1 = "heic"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00af
            goto L_0x0056
        L_0x00af:
            r1 = 16
            goto L_0x017c
        L_0x00b3:
            java.lang.String r1 = "avif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00bc
            goto L_0x0056
        L_0x00bc:
            r1 = 15
            goto L_0x017c
        L_0x00c0:
            java.lang.String r1 = "tif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00c9
            goto L_0x0056
        L_0x00c9:
            r1 = 14
            goto L_0x017c
        L_0x00cd:
            java.lang.String r1 = "svg"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00d6
            goto L_0x0056
        L_0x00d6:
            r1 = 13
            goto L_0x017c
        L_0x00da:
            java.lang.String r1 = "raw"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00e4
            goto L_0x0056
        L_0x00e4:
            r1 = 12
            goto L_0x017c
        L_0x00e8:
            java.lang.String r1 = "png"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00f2
            goto L_0x0056
        L_0x00f2:
            r1 = 11
            goto L_0x017c
        L_0x00f6:
            java.lang.String r1 = "jpg"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0100
            goto L_0x0056
        L_0x0100:
            r1 = 10
            goto L_0x017c
        L_0x0104:
            java.lang.String r1 = "jpe"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x010e
            goto L_0x0056
        L_0x010e:
            r1 = 9
            goto L_0x017c
        L_0x0112:
            java.lang.String r1 = "jif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x011c
            goto L_0x0056
        L_0x011c:
            r1 = 8
            goto L_0x017c
        L_0x011f:
            java.lang.String r1 = "jfi"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0129
            goto L_0x0056
        L_0x0129:
            r1 = 7
            goto L_0x017c
        L_0x012b:
            java.lang.String r1 = "k25"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0135
            goto L_0x0056
        L_0x0135:
            r1 = 6
            goto L_0x017c
        L_0x0137:
            java.lang.String r1 = "ico"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0141
            goto L_0x0056
        L_0x0141:
            r1 = 5
            goto L_0x017c
        L_0x0143:
            java.lang.String r1 = "gif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x014d
            goto L_0x0056
        L_0x014d:
            r1 = 4
            goto L_0x017c
        L_0x014f:
            java.lang.String r1 = "dib"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0159
            goto L_0x0056
        L_0x0159:
            r1 = 3
            goto L_0x017c
        L_0x015b:
            java.lang.String r1 = "cr2"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0165
            goto L_0x0056
        L_0x0165:
            r1 = 2
            goto L_0x017c
        L_0x0167:
            java.lang.String r5 = "bmp"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x017c
            goto L_0x0056
        L_0x0171:
            java.lang.String r1 = "arw"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x017b
            goto L_0x0056
        L_0x017b:
            r1 = 0
        L_0x017c:
            switch(r1) {
                case 0: goto L_0x01a3;
                case 1: goto L_0x01a0;
                case 2: goto L_0x01a3;
                case 3: goto L_0x01a0;
                case 4: goto L_0x019d;
                case 5: goto L_0x019a;
                case 6: goto L_0x01a3;
                case 7: goto L_0x0197;
                case 8: goto L_0x0197;
                case 9: goto L_0x0197;
                case 10: goto L_0x0197;
                case 11: goto L_0x0194;
                case 12: goto L_0x01a3;
                case 13: goto L_0x0191;
                case 14: goto L_0x018e;
                case 15: goto L_0x018b;
                case 16: goto L_0x0188;
                case 17: goto L_0x0185;
                case 18: goto L_0x0197;
                case 19: goto L_0x0197;
                case 20: goto L_0x0191;
                case 21: goto L_0x018e;
                case 22: goto L_0x0182;
                default: goto L_0x017f;
            }
        L_0x017f:
            r1 = 0
        L_0x0180:
            r4 = r1
            goto L_0x01a6
        L_0x0182:
            java.lang.String r1 = "image/webp"
            goto L_0x0180
        L_0x0185:
            java.lang.String r1 = "image/heif"
            goto L_0x0180
        L_0x0188:
            java.lang.String r1 = "image/heic"
            goto L_0x0180
        L_0x018b:
            java.lang.String r1 = "image/avif"
            goto L_0x0180
        L_0x018e:
            java.lang.String r1 = "image/tiff"
            goto L_0x0180
        L_0x0191:
            java.lang.String r1 = "image/svg+xml"
            goto L_0x0180
        L_0x0194:
            java.lang.String r1 = "image/png"
            goto L_0x0180
        L_0x0197:
            java.lang.String r1 = "image/jpeg"
            goto L_0x0180
        L_0x019a:
            java.lang.String r1 = "image/x-icon"
            goto L_0x0180
        L_0x019d:
            java.lang.String r1 = "image/gif"
            goto L_0x0180
        L_0x01a0:
            java.lang.String r1 = "image/bmp"
            goto L_0x0180
        L_0x01a3:
            java.lang.String r1 = "image/raw"
            goto L_0x0180
        L_0x01a6:
            if (r4 != 0) goto L_0x01a9
            goto L_0x01af
        L_0x01a9:
            boolean r1 = defpackage.vq9.i(r4)
            if (r1 != 0) goto L_0x01cf
        L_0x01af:
            java.lang.Object r0 = r7.w
            o5h r0 = (defpackage.o5h) r0
            if (r0 != 0) goto L_0x01c6
            o5h r0 = new o5h
            java.lang.Object r1 = r7.c
            c7f r1 = (defpackage.c7f) r1
            java.lang.Object r2 = r7.b
            e43 r2 = (defpackage.e43) r2
            m7h r2 = (defpackage.m7h) r2
            r0.<init>(r3, r2, r1)
            r7.w = r0
        L_0x01c6:
            java.lang.Object r7 = r7.w
            o5h r7 = (defpackage.o5h) r7
            vt r7 = r7.b(r8, r9, r10, r11)
            return r7
        L_0x01cf:
            java.lang.Object r1 = r7.o
            k74 r1 = (defpackage.k74) r1
            r1.getClass()
            boolean r2 = defpackage.v0g.K(r4)
            java.lang.String r3 = "Image format not supported by given bitmapLoader"
            defpackage.n79.m(r3, r2)
            java.lang.Object r2 = r7.v
            u6h r2 = (defpackage.u6h) r2
            if (r2 != 0) goto L_0x01ec
            u6h r2 = new u6h
            r2.<init>(r0, r1)
            r7.v = r2
        L_0x01ec:
            java.lang.Object r7 = r7.v
            u6h r7 = (defpackage.u6h) r7
            vt r7 = r7.b(r8, r9, r10, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d23.b(e05, android.os.Looper, ut, qd3):vt");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [w71, java.lang.Object] */
    public w71 f(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("updates");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            dxd c2 = c(next);
            if (c2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has("rooms")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("rooms");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(p(jSONArray.getJSONObject(i)));
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        eae eae = (eae) it.next();
                        arrayList.add(new cxd(SetsKt.setOf(c2), eae.a, eae, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roomIds");
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i2)));
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new cxd(SetsKt.setOf(c2), ((Number) it2.next()).intValue(), (eae) null, false));
                    }
                }
            }
        }
        ? obj = new Object();
        obj.a = arrayList;
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(long r9, defpackage.mta r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.b23
            if (r0 == 0) goto L_0x0013
            r0 = r12
            b23 r0 = (defpackage.b23) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            b23 r0 = new b23
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            long r9 = r0.c
            java.lang.Long r8 = r0.b
            d23 r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            r3 = r9
            r7 = r11
            r11 = r8
            r8 = r7
            goto L_0x0096
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "dropServerDraft "
            r12.<init>(r2)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            java.lang.Object r2 = r8.b
            java.lang.String r2 = (java.lang.String) r2
            defpackage.z68.c(r2, r12, new java.lang.Object[0])
            java.lang.Object r12 = r8.w
            kotlin.Lazy r12 = (kotlin.Lazy) r12
            java.lang.Object r12 = r12.getValue()
            bud r12 = (defpackage.bud) r12
            akd r12 = (defpackage.akd) r12
            boolean r12 = r12.w()
            if (r12 != 0) goto L_0x006d
            java.lang.String r8 = "Drafts sync NOT enabled. Not discard to server"
            defpackage.z68.c(r2, r8, new java.lang.Object[0])
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x006d:
            if (r11 == 0) goto L_0x0072
            java.lang.Long r11 = r11.e
            goto L_0x0073
        L_0x0072:
            r11 = 0
        L_0x0073:
            if (r11 != 0) goto L_0x007d
            java.lang.String r8 = "Drafts sync enabled. No old draft. Not discard to server"
            defpackage.z68.c(r2, r8, new java.lang.Object[0])
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x007d:
            java.lang.String r12 = "Drafts sync enabled. Discard to server"
            defpackage.z68.c(r2, r12, new java.lang.Object[0])
            r0.a = r8
            r0.b = r11
            r0.c = r9
            r0.w = r3
            java.lang.Object r12 = r8.a
            a23 r12 = (defpackage.a23) r12
            java.lang.Object r12 = r12.a(r9, r0)
            if (r12 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r3 = r9
        L_0x0096:
            java.lang.Object r8 = r8.v
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r8 = r8.getValue()
            rl r8 = (defpackage.rl) r8
            long r5 = r11.longValue()
            jna r8 = (defpackage.jna) r8
            boolean r9 = r8.r(r3)
            if (r9 == 0) goto L_0x00c8
            r9 = 0
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b3
            goto L_0x00c8
        L_0x00b3:
            qt4 r9 = new qt4
            jtb r10 = r8.D()
            ltb r10 = (defpackage.ltb) r10
            a33 r10 = r10.a
            long r1 = r10.n()
            r0 = r9
            r0.<init>(r1, r3, r5)
            defpackage.jna.A(r8, r9)
        L_0x00c8:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d23.g(long, mta, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.w;
        if (!arrayDeque.isEmpty()) {
            j7f j7f = (j7f) this.b;
            if (!j7f.a.hasMessages(0)) {
                j7f.getClass();
                h7f b2 = j7f.b();
                b2.a = j7f.a.obtainMessage(0);
                j7f.getClass();
                Message message = b2.a;
                message.getClass();
                j7f.a.sendMessageAtFrontOfQueue(message);
                b2.a();
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.v;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public fy0 j(String str) {
        return (fy0) ((HashMap) this.a).get(str);
    }

    public fy0 k(String str) {
        HashMap hashMap = (HashMap) this.a;
        fy0 fy0 = (fy0) hashMap.get(str);
        if (fy0 != null) {
            return fy0;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        fy0 fy02 = new fy0(keyAt, str, od4.c);
        hashMap.put(str, fy02);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.o).put(keyAt, true);
        ((hy0) this.v).d(fy02);
        return fy02;
    }

    public void l(qq7 qq7) {
        boe a2;
        FrgStickerPreview frgStickerPreview = (FrgStickerPreview) this.b;
        if (frgStickerPreview != null && (a2 = ((tq7) this.v).a(qq7)) != null) {
            frgStickerPreview.getClass();
            frgStickerPreview.n3(a2, goe.a);
        }
    }

    public void m(long j) {
        hy0 hy0;
        hy0 hy02 = (hy0) this.v;
        hy02.j(j);
        hy0 hy03 = (hy0) this.w;
        if (hy03 != null) {
            hy03.j(j);
        }
        boolean e = hy02.e();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        if (e || (hy0 = (hy0) this.w) == null || !hy0.e()) {
            hy02.l(hashMap, sparseArray);
        } else {
            ((hy0) this.w).l(hashMap, sparseArray);
            hy02.b(hashMap);
        }
        hy0 hy04 = (hy0) this.w;
        if (hy04 != null) {
            hy04.n();
            this.w = null;
        }
    }

    public Object n(long j, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) ((Lazy) this.o).getValue())).b(), new c23(this, j, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public void o(String str) {
        HashMap hashMap = (HashMap) this.a;
        fy0 fy0 = (fy0) hashMap.get(str);
        if (fy0 != null && fy0.c.isEmpty() && fy0.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.o;
            int i = fy0.a;
            boolean z = sparseBooleanArray.get(i);
            ((hy0) this.v).c(fy0, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            ((SparseBooleanArray) this.c).put(i, true);
        }
    }

    public eae p(JSONObject jSONObject) {
        dae dae;
        yz0 yz0;
        gae gae;
        gae gae2;
        dae dae2;
        JSONObject jSONObject2 = jSONObject;
        int i = jSONObject2.getInt("id");
        String string = jSONObject2.getString("name");
        Boolean valueOf = jSONObject2.has("active") ? Boolean.valueOf(jSONObject2.optBoolean("active")) : null;
        if (jSONObject2.has("countdownSec")) {
            jSONObject2.optInt("countdownSec");
        }
        Long valueOf2 = jSONObject2.has("timeoutMs") ? Long.valueOf(jSONObject2.optLong("timeoutMs")) : null;
        int optInt = jSONObject2.optInt("participantCount");
        JSONArray optJSONArray = jSONObject2.optJSONArray("participantIds");
        o60 o60 = (o60) this.b;
        ArrayList b2 = optJSONArray != null ? o60.b(optJSONArray) : null;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("addParticipantIds");
        ArrayList b3 = optJSONArray2 != null ? o60.b(optJSONArray2) : null;
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("removeParticipantIds");
        ArrayList b4 = optJSONArray3 != null ? o60.b(optJSONArray3) : null;
        JSONObject optJSONObject = jSONObject2.optJSONObject("recordInfo");
        if (optJSONObject != null) {
            ox0 ox0 = (ox0) this.o;
            ox0.getClass();
            try {
                dae2 = ox0.p(optJSONObject);
            } catch (JSONException e) {
                ((voc) ox0.c).logException("RecordInfoParser", "Can't parse record info", e);
                dae2 = null;
            }
            dae = dae2;
        } else {
            dae = null;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("asrInfo");
        if (optJSONObject2 != null) {
            ((npg) this.v).getClass();
            yz0 = npg.P(optJSONObject2);
        } else {
            yz0 = null;
        }
        Map p = jSONObject2.has("muteStates") ? tf6.p(jSONObject) : MapsKt.emptyMap();
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("participants");
        cae y = optJSONObject3 != null ? ((zqd) this.c).y(optJSONObject3, new ywd(i)) : null;
        boolean isNull = jSONObject2.isNull("pinnedParticipantId");
        String C = ct.C(jSONObject2, "pinnedParticipantId");
        ue1 a2 = (isNull || C == null) ? null : ue1.a(C);
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("urlSharingInfo");
        if (optJSONObject4 != null) {
            dm4 dm4 = (dm4) this.w;
            dm4.getClass();
            try {
                gae2 = new gae(ue1.a(optJSONObject4.getString("initiatorId")), optJSONObject4.getString("sharedUrl"));
            } catch (JSONException e2) {
                ((voc) dm4.b).logException("UrlSharingParser", "Can't parse url sharing", e2);
                gae2 = null;
            }
            gae = gae2;
        } else {
            gae = null;
        }
        return new eae(i, string, valueOf, b2, b3, b4, valueOf2, Integer.valueOf(optInt), dae, yz0, p, y, a2, gae);
    }

    public void q(int i, h08 h08) {
        ((ArrayDeque) this.w).add(new kh1((Object) new CopyOnWriteArraySet((CopyOnWriteArraySet) this.o), i, (Object) h08, 11));
    }

    public void r(int i, h08 h08) {
        q(i, h08);
        h();
    }

    public void s() {
        ((hy0) this.v).i((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.o).clear();
    }

    public void t() {
        o54.k((ao1) this.w);
        tq7 tq7 = (tq7) this.v;
        fce j = tq7.b(tq7.a).n((lfd) this.c).j((lfd) this.o);
        gv gvVar = (gv) this.a;
        Objects.requireNonNull(gvVar);
        ao1 ao1 = new ao1(3, new d9d(4, gvVar), new rx0(20));
        j.l(ao1);
        this.w = ao1;
    }

    public void u() {
        FrgStickerPreview frgStickerPreview = (FrgStickerPreview) this.b;
        if (frgStickerPreview != null) {
            frgStickerPreview.getClass();
        }
    }

    public void w(qq7 qq7) {
        boe a2;
        FrgStickerPreview frgStickerPreview = (FrgStickerPreview) this.b;
        if (frgStickerPreview != null && (a2 = ((tq7) this.v).a(qq7)) != null) {
            frgStickerPreview.getClass();
            frgStickerPreview.n3(a2, goe.b);
        }
    }

    public d23(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, a23 a23) {
        this.a = a23;
        this.b = d23.class.getName();
        this.c = lazy;
        this.o = lazy2;
        this.v = lazy3;
        this.w = lazy4;
    }

    public d23(gv gvVar, FrgStickerPreview frgStickerPreview, lfd lfd, lfd lfd2) {
        gvVar.J(this);
        this.a = gvVar;
        this.b = frgStickerPreview;
        this.c = lfd;
        this.o = lfd2;
        this.v = new tq7();
    }

    public d23(Context context, m7h m7h, c7f c7f) {
        BitmapFactory.Options options;
        n08 n08;
        n08 ct9;
        this.a = context.getApplicationContext();
        this.b = m7h;
        this.c = c7f;
        if (v0g.a >= 26) {
            options = new BitmapFactory.Options();
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else {
            options = null;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (newSingleThreadExecutor instanceof n08) {
            n08 = (n08) newSingleThreadExecutor;
        } else {
            if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                ct9 = new ft9((ScheduledExecutorService) newSingleThreadExecutor);
            } else {
                ct9 = new ct9(newSingleThreadExecutor);
            }
            n08 = ct9;
        }
        this.o = new k74(n08, new ud4(context), options);
    }

    public d23(Looper looper, b7f b7f, j08 j08) {
        this(new CopyOnWriteArraySet(), looper, b7f, j08);
    }

    public d23(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, b7f b7f, j08 j08) {
        this.a = b7f;
        this.o = copyOnWriteArraySet;
        this.c = j08;
        this.v = new ArrayDeque();
        this.w = new ArrayDeque();
        this.b = b7f.a(looper, new xp4(3, this));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [srd, java.lang.Object] */
    public d23(u74 u74, File file, boolean z) {
        Object obj;
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.o = new SparseBooleanArray();
        if (u74 != null) {
            ? obj2 = new Object();
            obj2.b = u74;
            obj2.c = new SparseArray();
            obj = obj2;
        } else {
            obj = null;
        }
        gy0 gy0 = new gy0(new File(file, "cached_content_index.exi"), 1);
        if (obj == null || z) {
            int i = v0g.a;
            this.v = gy0;
            this.w = obj;
            return;
        }
        this.v = obj;
        this.w = gy0;
    }
}
