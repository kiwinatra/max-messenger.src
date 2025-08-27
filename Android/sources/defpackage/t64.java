package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: t64  reason: default package */
public final class t64 {
    public static final t64 b;
    public final HashMap a;

    static {
        h88.V("Data");
        t64 t64 = new t64((Map) new HashMap());
        f(t64);
        b = t64;
    }

    public t64(t64 t64) {
        this.a = new HashMap(t64.a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|4|5|6|(2:8|9)|13|14|15|16|30|32) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.t64 a(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x002b, all -> 0x0029 }
        L_0x0019:
            if (r5 <= 0) goto L_0x002d
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x002b, all -> 0x0029 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x002b, all -> 0x0029 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x002b, all -> 0x0029 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r5 = move-exception
            goto L_0x0037
        L_0x002b:
            r5 = r2
            goto L_0x0040
        L_0x002d:
            r2.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x0030
            r5.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0030
        L_0x0046:
            t64 r5 = new t64
            r5.<init>((java.util.Map) r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t64.a(byte[]):t64");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|(2:7|5)|12|13|14|15|16|(2:19|20)(2:21|22)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(0)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:11|10|24|25|(0)|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[SYNTHETIC, Splitter:B:27:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c A[SYNTHETIC, Splitter:B:34:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] f(defpackage.t64 r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005d }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005d }
            java.util.HashMap r1 = r4.a     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            int r1 = r1.size()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.HashMap r4 = r4.a     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
        L_0x001e:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            goto L_0x001e
        L_0x003b:
            r4 = move-exception
            r1 = r2
            goto L_0x006a
        L_0x003e:
            r1 = r2
            goto L_0x005d
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x0053
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0053:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x005b:
            r4 = move-exception
            goto L_0x006a
        L_0x005d:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r0.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            return r4
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r0.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t64.f(t64):byte[]");
    }

    public final boolean b(String str, boolean z) {
        Object obj = this.a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final float c(String str) {
        Object obj = this.a.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : c44.DEFAULT_ASPECT_RATIO;
    }

    public final long d(String str, long j) {
        Object obj = this.a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public final String e(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || t64.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.a;
        Set<String> keySet = hashMap.keySet();
        HashMap hashMap2 = ((t64) obj).a;
        if (!keySet.equals(hashMap2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hashMap2.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public t64(Map map) {
        this.a = new HashMap(map);
    }
}
