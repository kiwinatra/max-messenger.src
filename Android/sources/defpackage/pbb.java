package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.fragment.app.a;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: pbb  reason: default package */
public final /* synthetic */ class pbb implements eo1, edg, knd, qk3, zi6, mx3, mja, lbd, ia7, StatsObserver, vu, ice, i08, p6f, ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pbb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public Object a() {
        switch (this.a) {
            case 27:
                nbd nbd = (nbd) ((zyf) this.b).c;
                nbd.getClass();
                Iterable iterable = (Iterable) this.c;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                nbd.m().compileStatement("DELETE FROM events WHERE _id in " + nbd.k0(iterable)).execute();
                return null;
            default:
                zyf zyf = (zyf) this.b;
                zyf.getClass();
                for (Map.Entry entry : ((Map) this.c).entrySet()) {
                    ((nbd) zyf.i).V((long) ((Integer) entry.getValue()).intValue(), t78.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 5:
                a aVar = (a) obj2;
                Uri uri = (Uri) obj;
                n09 n09 = (n09) obj3;
                n09.getClass();
                try {
                    m5a.k(aVar, (jbf) n09.x, uri, (po5) n09.b);
                    return;
                } catch (ActivityNotFoundException e) {
                    z68.f("n09", "capturePhoto: failed to capture photo", e);
                    Context G2 = aVar.G2();
                    int i = qad.n0;
                    Handler handler = hi7.j;
                    hi7.b0(0, G2, G2.getString(i));
                    return;
                }
            case 21:
                ((zff) obj3).a.put((CharSequence) obj2, (yff) obj);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                jxf jxf = (jxf) obj3;
                jxf.getClass();
                if (((Throwable) obj) instanceof TamHttpUrlExpiredException) {
                    axf b2 = ((bxf) obj2).b();
                    b2.d = null;
                    b2.e = c44.DEFAULT_ASPECT_RATIO;
                    jxf.b(b2.a());
                    return;
                }
                return;
            case 25:
                jxf jxf2 = (jxf) obj3;
                jxf2.getClass();
                StringBuilder sb = new StringBuilder("onErrorUpload: data=");
                kxf kxf = (kxf) obj2;
                sb.append(kxf);
                z68.f("jxf", sb.toString(), (Throwable) obj);
                jxf2.d(kxf);
                jxf2.c(kxf);
                return;
            default:
                Throwable th = (Throwable) obj;
                lyf lyf = (lyf) obj3;
                lyf.getClass();
                if ((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b)) {
                    kxf b3 = lyf.b((qf9) obj2);
                    jxf jxf3 = lyf.a;
                    jxf3.d(b3);
                    jxf3.c(b3);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.lang.Object, zpe] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4 A[Catch:{ all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 9: goto L_0x0183;
                case 10: goto L_0x0171;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r13.b
            vqe r0 = (defpackage.vqe) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            fqe r13 = (defpackage.fqe) r13
            long r0 = r13.a
            zpe r2 = new zpe
            r2.<init>()
            r2.a = r0
            java.lang.String r0 = r13.b
            r2.b = r0
            java.lang.String r0 = r13.c
            r2.c = r0
            long r0 = r13.d
            r2.d = r0
            long r0 = r13.e
            r2.e = r0
            long r0 = r13.f
            r2.f = r0
            java.lang.String r0 = r13.g
            r2.g = r0
            r2.h = r14
            boolean r13 = r13.i
            r2.i = r13
            bqe r13 = new bqe
            r13.<init>(r2)
            return r13
        L_0x003f:
            r3 = r14
            android.database.sqlite.SQLiteDatabase r3 = (android.database.sqlite.SQLiteDatabase) r3
            java.lang.Object r14 = r13.b
            nbd r14 = (defpackage.nbd) r14
            va0 r0 = r14.o
            int r1 = r0.b
            java.lang.Object r13 = r13.c
            tc0 r13 = (defpackage.tc0) r13
            java.util.ArrayList r1 = r14.U(r3, r13, r1)
            tub[] r2 = defpackage.tub.values()
            int r4 = r2.length
            r11 = 0
            r5 = r11
        L_0x0059:
            if (r5 >= r4) goto L_0x0093
            r6 = r2[r5]
            tub r7 = r13.c
            if (r6 != r7) goto L_0x0062
            goto L_0x0088
        L_0x0062:
            int r7 = r1.size()
            int r8 = r0.b
            int r8 = r8 - r7
            if (r8 > 0) goto L_0x006c
            goto L_0x0093
        L_0x006c:
            g6d r7 = defpackage.tc0.a()
            java.lang.String r9 = r13.a
            r7.y(r9)
            if (r6 == 0) goto L_0x008b
            r7.o = r6
            byte[] r6 = r13.b
            r7.c = r6
            tc0 r6 = r7.k()
            java.util.ArrayList r6 = r14.U(r3, r6, r8)
            r1.addAll(r6)
        L_0x0088:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x008b:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "Null priority"
            r13.<init>(r14)
            throw r13
        L_0x0093:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "event_id IN ("
            r14.<init>(r0)
            r0 = r11
        L_0x00a0:
            int r2 = r1.size()
            r12 = 1
            if (r0 >= r2) goto L_0x00c1
            java.lang.Object r2 = r1.get(r0)
            rb0 r2 = (defpackage.rb0) r2
            long r4 = r2.a
            r14.append(r4)
            int r2 = r1.size()
            int r2 = r2 - r12
            if (r0 >= r2) goto L_0x00be
            r2 = 44
            r14.append(r2)
        L_0x00be:
            int r0 = r0 + 1
            goto L_0x00a0
        L_0x00c1:
            r0 = 41
            r14.append(r0)
            java.lang.String r0 = "value"
            java.lang.String r2 = "event_id"
            java.lang.String r4 = "name"
            java.lang.String[] r5 = new java.lang.String[]{r2, r4, r0}
            java.lang.String r6 = r14.toString()
            r9 = 0
            r10 = 0
            java.lang.String r4 = "event_metadata"
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r3.query(r4, r5, r6, r7, r8, r9, r10)
        L_0x00de:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0112
            long r2 = r14.getLong(r11)     // Catch:{ all -> 0x016c }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x016c }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x016c }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x0100
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x016c }
            r0.<init>()     // Catch:{ all -> 0x016c }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x016c }
            r13.put(r2, r0)     // Catch:{ all -> 0x016c }
        L_0x0100:
            mbd r2 = new mbd     // Catch:{ all -> 0x016c }
            java.lang.String r3 = r14.getString(r12)     // Catch:{ all -> 0x016c }
            r4 = 2
            java.lang.String r4 = r14.getString(r4)     // Catch:{ all -> 0x016c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x016c }
            r0.add(r2)     // Catch:{ all -> 0x016c }
            goto L_0x00de
        L_0x0112:
            r14.close()
            java.util.ListIterator r14 = r1.listIterator()
        L_0x0119:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r14.next()
            rb0 r0 = (defpackage.rb0) r0
            long r2 = r0.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r13.containsKey(r2)
            if (r2 != 0) goto L_0x0132
            goto L_0x0119
        L_0x0132:
            ua0 r2 = r0.c
            kq9 r2 = r2.c()
            long r3 = r0.a
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r5 = r13.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0148:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x015c
            java.lang.Object r6 = r5.next()
            mbd r6 = (defpackage.mbd) r6
            java.lang.String r7 = r6.a
            java.lang.String r6 = r6.b
            r2.a(r7, r6)
            goto L_0x0148
        L_0x015c:
            ua0 r2 = r2.b()
            rb0 r5 = new rb0
            tc0 r0 = r0.b
            r5.<init>(r3, r0, r2)
            r14.set(r5)
            goto L_0x0119
        L_0x016b:
            return r1
        L_0x016c:
            r13 = move-exception
            r14.close()
            throw r13
        L_0x0171:
            ouc r14 = (defpackage.ouc) r14
            java.lang.Object r0 = r13.b
            wuc r0 = (defpackage.wuc) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            kuc r13 = (defpackage.kuc) r13
            bi8 r13 = defpackage.wuc.d(r13, r14)
            return r13
        L_0x0183:
            kuc r14 = (defpackage.kuc) r14
            java.lang.Object r0 = r13.b
            wuc r0 = (defpackage.wuc) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            ouc r13 = (defpackage.ouc) r13
            bi8 r13 = defpackage.wuc.d(r14, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbb.apply(java.lang.Object):java.lang.Object");
    }

    public void b() {
        enb enb = (enb) this.b;
        enb.getClass();
        int ordinal = ((dnb) this.c).ordinal();
        if (ordinal == 0) {
            enb.b(enb.w, false);
        } else if (ordinal == 1) {
            enb.b(enb.x, false);
        } else if (ordinal == 2) {
            enb.b(enb.y, false);
        } else if (ordinal == 3) {
            enb.b(enb.z, false);
        }
    }

    public void c(yha yha) {
        k14 k14 = new k14((String[]) this.b, yha, 2);
        i6d i6d = (i6d) this.c;
        i6d.e.a(k14);
        qq4.d(yha, new o7(0, new p00(19, (OneMeRoomDatabase) i6d, k14)));
        yha.d(te8.g);
    }

    public void e(rh8 rh8) {
        List list;
        izf izf = (izf) this.b;
        izf.getClass();
        z68.c("izf", "getUploadsWithStatus: uploadStatus=" + ((wyf) this.c), new Object[0]);
        synchronized (izf) {
            list = (List) ((fzf) izf.b.getValue()).f().b();
        }
        if (rh8.f()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            rh8.b();
        } else {
            rh8.a(list);
        }
    }

    public void h(pbe pbe) {
        wbf wbf = (wbf) this.b;
        wbf.getClass();
        ubf ubf = new ubf(pbe);
        Lazy lazy = wbf.m;
        ((zbf) lazy.getValue()).e();
        d6a d6a = new d6a(12, (Object) ubf);
        zbf zbf = (zbf) lazy.getValue();
        fbf fbf = (fbf) this.c;
        long d = wbf.d(fbf);
        xvd xvd = (xvd) zbf.f.get();
        if (xvd != null && !zbf.d(fbf, d6a)) {
            xvd.g(fbf, false, d, d6a);
        }
    }

    public void i(ja7 ja7) {
        obd obd = (obd) this.b;
        obd.getClass();
        ((ia7) this.c).i(obd);
    }

    public void invoke(Object obj) {
        c19 c19 = (c19) obj;
        lrf lrf = (lrf) this.b;
        lrf.t.getClass();
        yd5 a2 = lrf.q.a();
        String str = c19.b;
        ExportException exportException = (ExportException) this.c;
        z68.f(str, "onError", exportException);
        RuntimeException runtimeException = new RuntimeException("Media transform failed", exportException);
        a19 a19 = c19.a;
        a19.f.set(a2);
        a19.g.set(runtimeException);
        c19.a();
    }

    public jnd j(int i) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 3:
                int i2 = ((tzb) ((lz7) ((ProfileEditAdminPermissionsWidget) obj2).x.E(i))).i();
                if (((qi7) obj).a(i2 & 536870911)) {
                    return null;
                }
                return tf6.U(i2) ? jnd.a : tf6.W(i2) ? jnd.b : tf6.V(i2) ? jnd.c : jnd.o;
            case 4:
                int i3 = ((tzb) ((lz7) ((ProfileEditScreen) obj2).v.E(i))).i();
                if (((qi7) obj).a(i3 & 536870911)) {
                    return null;
                }
                return tf6.U(i3) ? jnd.a : tf6.W(i3) ? jnd.b : tf6.V(i3) ? jnd.c : jnd.o;
            case 6:
                int i4 = ((t3c) ((lz7) ((ProfileInviteScreen) obj2).o.E(i))).i();
                if (((qi7) obj).a(i4 & 536870911)) {
                    return null;
                }
                return (i4 & 536870912) != 0 ? jnd.a : (i4 & 1073741824) != 0 ? jnd.b : (i4 & IntCompanionObject.MIN_VALUE) != 0 ? jnd.c : jnd.o;
            case 7:
                int i5 = ((tzb) ((lz7) ((ProfileMemberPermissionsScreen) obj2).c.E(i))).i();
                if (((qi7) obj).a(i5 & 536870911)) {
                    return null;
                }
                return tf6.U(i5) ? jnd.a : tf6.W(i5) ? jnd.b : tf6.V(i5) ? jnd.c : jnd.o;
            default:
                KProperty[] kPropertyArr = ProfileScreen.D0;
                int i6 = ((t3c) ((lz7) ((x5c) ((EndlessRecyclerView2) obj2).getAdapter()).E(i))).i();
                if (((qi7) obj).a(i6 & 536870911)) {
                    return null;
                }
                return (i6 & 536870912) != 0 ? jnd.a : (i6 & 1073741824) != 0 ? jnd.b : (i6 & IntCompanionObject.MIN_VALUE) != 0 ? jnd.c : jnd.o;
        }
    }

    public Object n(Task task) {
        zqd zqd = (zqd) this.b;
        String str = (String) this.c;
        synchronized (zqd) {
            ((ts) zqd.c).remove(str);
        }
        return task;
    }

    public void onComplete(StatsReport[] statsReportArr) {
        String str;
        StatsReport[] statsReportArr2 = statsReportArr;
        ktd ktd = (ktd) this.b;
        ktd.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = statsReportArr2.length;
        int i = 0;
        while (i < length) {
            StatsReport statsReport = statsReportArr2[i];
            if ("ssrc".equals(statsReport.type) && "ssrc".equals(statsReport.type)) {
                StatsReport.Value[] valueArr = statsReport.values;
                int length2 = valueArr.length;
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    StatsReport.Value value = valueArr[i2];
                    if ("googTrackId".equals(value.name)) {
                        String str2 = value.value;
                        if (str2 != null && str2.endsWith("audio-mix")) {
                            arrayList2.add(new wsg((ue1) null, true, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        String str3 = value.value;
                        ue1 b2 = (TextUtils.isEmpty(str3) || !str3.startsWith("audio-") || str3.length() == 6) ? null : ue1.b(str3.substring(6));
                        if (b2 == null) {
                            b2 = tf6.c0(str3);
                        }
                        if (b2 == null) {
                            d dVar = ktd.y;
                            if (!(dVar == null || (str = value.value) == null || !str.startsWith(((v48) dVar.a().b).m))) {
                                arrayList2.add(new wsg((ue1) null, false, true));
                                arrayList.add(statsReport);
                                break;
                            }
                        } else {
                            arrayList2.add(new wsg(b2, false, false));
                            arrayList.add(statsReport);
                            break;
                        }
                    } else if ("mediaType".equals(value.name) && MediaStreamTrack.AUDIO_TRACK_KIND.equals(value.value)) {
                        z = true;
                    } else if ("packetsReceived".equals(value.name)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        arrayList2.add(new wsg((ue1) null, true, false));
                        arrayList.add(statsReport);
                        break;
                    }
                    i2++;
                    StatsReport[] statsReportArr3 = statsReportArr;
                }
            }
            i++;
            statsReportArr2 = statsReportArr;
        }
        ktd.a.post(new po1(ktd, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[0]), arrayList2, (xne) this.c, 8));
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 0:
                yu9 yu9 = (yu9) this.b;
                v7b v7b = (v7b) yu9.b;
                if (v7b != null) {
                    do1 do12 = (do1) v7b.a;
                    Objects.requireNonNull(do12);
                    do12.c();
                }
                Object obj = this.c;
                yu9.b = new v7b(do1, obj);
                return "PendingValue " + obj;
            case 2:
                uv1 uv1 = (uv1) this.c;
                synchronized (((cvb) this.b).a) {
                    oj6 a2 = oj6.a(xa7.c);
                    uq uqVar = new uq(7, new bn7(3, uv1));
                    ep4 j = ryg.j();
                    a2.getClass();
                    hd8.a(hd8.b0(a2, uqVar, j), new xe8(21, do1, uv1), ryg.j());
                    Unit unit = Unit.INSTANCE;
                }
                return "ProcessCameraProvider-initializeCameraX";
            case 18:
                z3f z3f = (z3f) this.b;
                z3f.getClass();
                ((AtomicReference) this.c).set(do1);
                return "SurfaceRequest-surface-recreation(" + z3f.hashCode() + ")";
            default:
                mhf mhf = (mhf) this.b;
                z3f z3f2 = mhf.h;
                ep4 j2 = ryg.j();
                a0 a0Var = new a0(18, do1);
                Surface surface = (Surface) this.c;
                z3f2.b(surface, j2, a0Var);
                return "provideSurface[request=" + mhf.h + " surface=" + surface + "]";
        }
    }

    public /* synthetic */ pbb(izf izf) {
        this.a = 29;
        wyf wyf = wyf.UPLOADING;
        this.b = izf;
        this.c = wyf;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public zz7 m1529apply(Object obj) {
        List list = (List) obj;
        ((t6f) this.b).toString();
        Objects.toString(list);
        if (list.isEmpty()) {
            return new xa7(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        if (!list.contains((Object) null)) {
            return hd8.E(list);
        }
        return new xa7(1, new DeferrableSurface$SurfaceClosedException((lk4) ((List) this.c).get(list.indexOf((Object) null)), "Surface closed"));
    }
}
