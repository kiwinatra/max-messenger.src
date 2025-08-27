package defpackage;

/* renamed from: yne  reason: default package */
public abstract class yne {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.n78 a(byte[] r10) {
        /*
            ru.ok.tamtam.nano.Protos$LogEvent r0 = new ru.ok.tamtam.nano.Protos$LogEvent     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            r0.<init>()     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            ad9 r10 = defpackage.ad9.mergeFrom(r0, r10)     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            ru.ok.tamtam.nano.Protos$LogEvent r10 = (ru.ok.tamtam.nano.Protos.LogEvent) r10     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            long r1 = r10.time     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            java.lang.String r7 = r10.type     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            java.lang.String r8 = r10.event     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            byte[] r0 = r10.params     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            r3 = 0
            if (r0 == 0) goto L_0x0028
            int r4 = r0.length     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            if (r4 != 0) goto L_0x001a
            goto L_0x0026
        L_0x001a:
            pf9 r0 = defpackage.fd9.a(r0)     // Catch:{ IOException -> 0x002c }
            q1 r0 = r0.B0()     // Catch:{ IOException -> 0x002c }
            java.lang.Object r3 = defpackage.ryg.R(r0)     // Catch:{ IOException -> 0x002c }
        L_0x0026:
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
        L_0x0028:
            r9 = r3
            goto L_0x0033
        L_0x002a:
            r10 = move-exception
            goto L_0x003e
        L_0x002c:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            r0.<init>(r10)     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            throw r0     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
        L_0x0033:
            long r3 = r10.userId     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            long r5 = r10.sessionId     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            n78 r10 = new n78     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            r0 = r10
            r0.<init>(r1, r3, r5, r7, r8, r9)     // Catch:{ InvalidProtocolBufferNanoException -> 0x002a }
            return r10
        L_0x003e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yne.a(byte[]):n78");
    }
}
