package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hvg  reason: default package */
public abstract class hvg extends Binder implements IInterface {
    public final /* synthetic */ int c;

    public /* synthetic */ hvg(int i) {
        this.c = i;
    }

    public abstract boolean H0(int i, Parcel parcel, Parcel parcel2);

    public boolean I0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean J0(Parcel parcel, int i);

    public abstract boolean K0(int i, Parcel parcel, Parcel parcel2);

    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.os.Parcelable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            int r5 = r6.c
            switch(r5) {
                case 0: goto L_0x0247;
                case 1: goto L_0x0232;
                case 2: goto L_0x00cd;
                case 3: goto L_0x004c;
                case 4: goto L_0x0037;
                case 5: goto L_0x0022;
                default: goto L_0x000c;
            }
        L_0x000c:
            if (r7 <= r4) goto L_0x0013
            boolean r2 = super.onTransact(r7, r8, r9, r10)
            goto L_0x001a
        L_0x0013:
            java.lang.String r10 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r10)
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            boolean r3 = r6.K0(r7, r8, r9)
        L_0x0021:
            return r3
        L_0x0022:
            if (r7 <= r4) goto L_0x002b
            boolean r9 = super.onTransact(r7, r8, r9, r10)
            if (r9 == 0) goto L_0x0032
            goto L_0x0036
        L_0x002b:
            java.lang.String r9 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r9)
        L_0x0032:
            boolean r3 = r6.J0(r8, r7)
        L_0x0036:
            return r3
        L_0x0037:
            if (r7 <= r4) goto L_0x0040
            boolean r10 = super.onTransact(r7, r8, r9, r10)
            if (r10 == 0) goto L_0x0047
            goto L_0x004b
        L_0x0040:
            java.lang.String r10 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r10)
        L_0x0047:
            boolean r3 = r6.I0(r7, r8, r9)
        L_0x004b:
            return r3
        L_0x004c:
            if (r7 <= r4) goto L_0x0056
            boolean r9 = super.onTransact(r7, r8, r9, r10)
            if (r9 == 0) goto L_0x005d
            goto L_0x00cc
        L_0x0056:
            java.lang.String r9 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r9)
        L_0x005d:
            e4h r6 = (defpackage.e4h) r6
            if (r7 != r1) goto L_0x00cb
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            int r9 = defpackage.mzg.a
            int r9 = r8.readInt()
            if (r9 != 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            java.lang.Object r7 = r7.createFromParcel(r8)
            r0 = r7
            android.os.Parcelable r0 = (android.os.Parcelable) r0
        L_0x0073:
            android.os.Bundle r0 = (android.os.Bundle) r0
            int r7 = r8.dataAvail()
            if (r7 > 0) goto L_0x00bf
            s4h r7 = r6.f
            h7h r7 = r7.a
            if (r7 == 0) goto L_0x009c
            qdf r8 = r6.e
            java.lang.Object r9 = r7.f
            monitor-enter(r9)
            java.util.HashSet r10 = r7.e     // Catch:{ all -> 0x0099 }
            r10.remove(r8)     // Catch:{ all -> 0x0099 }
            monitor-exit(r9)     // Catch:{ all -> 0x0099 }
            b6h r8 = new b6h
            r8.<init>(r2, r7)
            android.os.Handler r7 = r7.a()
            r7.post(r8)
            goto L_0x009c
        L_0x0099:
            r6 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0099 }
            throw r6
        L_0x009c:
            e35 r7 = r6.d
            java.lang.String r8 = "onGetLaunchReviewFlowInfo"
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r7.a(r8, r9)
            java.lang.String r7 = "confirmation_intent"
            java.lang.Object r7 = r0.get(r7)
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            java.lang.String r8 = "is_review_no_op"
            boolean r8 = r0.getBoolean(r8)
            bxg r9 = new bxg
            r9.<init>(r7, r8)
            qdf r6 = r6.e
            r6.d(r9)
            r2 = r3
            goto L_0x00cb
        L_0x00bf:
            android.os.BadParcelableException r6 = new android.os.BadParcelableException
            java.lang.String r8 = "Parcel data not fully consumed, unread size: "
            java.lang.String r7 = defpackage.wj6.h(r7, r8)
            r6.<init>(r7)
            throw r6
        L_0x00cb:
            r3 = r2
        L_0x00cc:
            return r3
        L_0x00cd:
            if (r7 <= r4) goto L_0x00d7
            boolean r9 = super.onTransact(r7, r8, r9, r10)
            if (r9 == 0) goto L_0x00de
            goto L_0x0227
        L_0x00d7:
            java.lang.String r9 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r9)
        L_0x00de:
            t6h r6 = (defpackage.t6h) r6
            java.lang.String r9 = "Parcel data not fully consumed, unread size: "
            if (r7 == r1) goto L_0x0121
            r10 = 3
            if (r7 == r10) goto L_0x00e9
            goto L_0x0226
        L_0x00e9:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            int r10 = defpackage.lzg.a
            int r10 = r8.readInt()
            if (r10 != 0) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.Object r7 = r7.createFromParcel(r8)
            r0 = r7
            android.os.Parcelable r0 = (android.os.Parcelable) r0
        L_0x00fb:
            android.os.Bundle r0 = (android.os.Bundle) r0
            int r7 = r8.dataAvail()
            if (r7 > 0) goto L_0x0117
            a7h r7 = r6.f
            x7h r7 = r7.a
            qdf r8 = r6.e
            r7.c(r8)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            kn5 r6 = r6.d
            java.lang.String r8 = "onCompleteUpdate"
            r6.d(r8, r7)
            goto L_0x0225
        L_0x0117:
            android.os.BadParcelableException r6 = new android.os.BadParcelableException
            java.lang.String r7 = defpackage.wj6.h(r7, r9)
            r6.<init>(r7)
            throw r6
        L_0x0121:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            int r10 = defpackage.lzg.a
            int r10 = r8.readInt()
            if (r10 != 0) goto L_0x012c
            goto L_0x0133
        L_0x012c:
            java.lang.Object r7 = r7.createFromParcel(r8)
            r0 = r7
            android.os.Parcelable r0 = (android.os.Parcelable) r0
        L_0x0133:
            android.os.Bundle r0 = (android.os.Bundle) r0
            int r7 = r8.dataAvail()
            if (r7 > 0) goto L_0x0228
            a7h r7 = r6.f
            x7h r7 = r7.a
            qdf r8 = r6.e
            r7.c(r8)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            kn5 r9 = r6.d
            java.lang.String r10 = "onRequestInfo"
            r9.d(r10, r7)
            java.lang.String r7 = "error.code"
            r9 = -2
            int r10 = r0.getInt(r7, r9)
            if (r10 == 0) goto L_0x0164
            com.google.android.play.core.install.InstallException r6 = new com.google.android.play.core.install.InstallException
            int r7 = r0.getInt(r7, r9)
            r6.<init>(r7)
            r8.c(r6)
            goto L_0x0225
        L_0x0164:
            java.lang.String r7 = "version.code"
            r9 = -1
            r0.getInt(r7, r9)
            java.lang.String r7 = "update.availability"
            int r7 = r0.getInt(r7)
            java.lang.String r10 = "install.status"
            r0.getInt(r10, r2)
            java.lang.String r10 = "client.version.staleness"
            int r1 = r0.getInt(r10, r9)
            if (r1 != r9) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            r0.getInt(r10)
        L_0x0181:
            java.lang.String r9 = "in.app.update.priority"
            r0.getInt(r9, r2)
            java.lang.String r9 = "bytes.downloaded"
            r0.getLong(r9)
            java.lang.String r9 = "total.bytes.to.download"
            r0.getLong(r9)
            java.lang.String r9 = "additional.size.required"
            r0.getLong(r9)
            a7h r6 = r6.g
            f7h r6 = r6.d
            r6.getClass()
            java.io.File r9 = new java.io.File
            android.content.Context r6 = r6.a
            java.io.File r6 = r6.getFilesDir()
            java.lang.String r10 = "assetpacks"
            r9.<init>(r6, r10)
            defpackage.f7h.a(r9)
            java.lang.String r6 = "blocking.intent"
            android.os.Parcelable r9 = r0.getParcelable(r6)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            java.lang.String r9 = "nonblocking.intent"
            android.os.Parcelable r10 = r0.getParcelable(r9)
            android.app.PendingIntent r10 = (android.app.PendingIntent) r10
            java.lang.String r10 = "blocking.destructive.intent"
            android.os.Parcelable r1 = r0.getParcelable(r10)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            java.lang.String r1 = "nonblocking.destructive.intent"
            android.os.Parcelable r2 = r0.getParcelable(r1)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "update.precondition.failures:blocking.destructive.intent"
            java.util.ArrayList r4 = r0.getIntegerArrayList(r4)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r4 == 0) goto L_0x01e1
            r5.addAll(r4)
        L_0x01e1:
            r2.put(r10, r5)
            java.lang.String r10 = "update.precondition.failures:nonblocking.destructive.intent"
            java.util.ArrayList r10 = r0.getIntegerArrayList(r10)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            if (r10 == 0) goto L_0x01f4
            r4.addAll(r10)
        L_0x01f4:
            r2.put(r1, r4)
            java.lang.String r10 = "update.precondition.failures:blocking.intent"
            java.util.ArrayList r10 = r0.getIntegerArrayList(r10)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            if (r10 == 0) goto L_0x0207
            r1.addAll(r10)
        L_0x0207:
            r2.put(r6, r1)
            java.lang.String r6 = "update.precondition.failures:nonblocking.intent"
            java.util.ArrayList r6 = r0.getIntegerArrayList(r6)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            if (r6 == 0) goto L_0x021a
            r10.addAll(r6)
        L_0x021a:
            r2.put(r9, r10)
            qq r6 = new qq
            r6.<init>(r7, r2)
            r8.d(r6)
        L_0x0225:
            r2 = r3
        L_0x0226:
            r3 = r2
        L_0x0227:
            return r3
        L_0x0228:
            android.os.BadParcelableException r6 = new android.os.BadParcelableException
            java.lang.String r7 = defpackage.wj6.h(r7, r9)
            r6.<init>(r7)
            throw r6
        L_0x0232:
            if (r7 <= r4) goto L_0x023b
            boolean r10 = super.onTransact(r7, r8, r9, r10)
            if (r10 == 0) goto L_0x0242
            goto L_0x0246
        L_0x023b:
            java.lang.String r10 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r10)
        L_0x0242:
            boolean r3 = r6.I0(r7, r8, r9)
        L_0x0246:
            return r3
        L_0x0247:
            if (r7 <= r4) goto L_0x0250
            boolean r10 = super.onTransact(r7, r8, r9, r10)
            if (r10 == 0) goto L_0x0257
            goto L_0x025b
        L_0x0250:
            java.lang.String r10 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r10)
        L_0x0257:
            boolean r3 = r6.H0(r7, r8, r9)
        L_0x025b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvg.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public hvg(String str, int i) {
        this.c = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                return;
            case 4:
                attachInterface(this, str);
                return;
            case 5:
                attachInterface(this, str);
                return;
            case 6:
                attachInterface(this, str);
                return;
            default:
                attachInterface(this, str);
                return;
        }
    }
}
