package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Range;
import com.my.tracker.obfuscated.i2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.LongCompanionObject;
import ru.ok.messages.location.FrgLocationMap;
import ru.ok.messages.views.fragments.FrgChatProfile;
import ru.ok.messages.views.fragments.FrgContactProfile;

/* renamed from: y55  reason: default package */
public final /* synthetic */ class y55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ y55(int i, long j, long j2, Object obj) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        oaa oaa;
        switch (this.a) {
            case 0:
                g65 g65 = (g65) this.o;
                switch (tr1.y(g65.D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = g65.D;
                        g65.i(4);
                        Long l = (Long) g65.t.getLower();
                        long longValue = l.longValue();
                        if (longValue != LongCompanionObject.MAX_VALUE) {
                            long j = this.b;
                            if (j == -1 || j < longValue) {
                                j = this.c;
                            }
                            if (j >= longValue) {
                                g65.t = Range.create(l, Long.valueOf(j));
                                n54.M(j);
                                if (i != 3 || g65.w == null) {
                                    g65.v = true;
                                    g65.x = ryg.G().schedule((Runnable) new u55(g65, 1), 1000, TimeUnit.MILLISECONDS);
                                    return;
                                }
                                g65.j();
                                return;
                            }
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        throw new AssertionError("There should be a \"start\" before \"stop\"");
                    case 4:
                    case 5:
                        g65.i(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(g65.D)));
                }
            case 1:
                FrgChatProfile frgChatProfile = (FrgChatProfile) this.o;
                ((j18) frgChatProfile.q1.p()).l(this.b);
                bvd I = cjf.I(frgChatProfile.X1.a);
                I.n = 14.0f;
                I.o = this.c;
                frgChatProfile.q1.A().a(new cvd(I));
                return;
            case 2:
                FrgContactProfile frgContactProfile = (FrgContactProfile) this.o;
                ((j18) frgContactProfile.q1.p()).l(this.b);
                bvd I2 = cjf.I(frgContactProfile.X1);
                I2.n = 14.0f;
                I2.o = this.c;
                frgContactProfile.q1.A().a(new cvd(I2));
                return;
            case 3:
                FrgLocationMap frgLocationMap = (FrgLocationMap) this.o;
                ((j18) frgLocationMap.q1.p()).l(this.b);
                bvd I3 = cjf.I(frgLocationMap.H1);
                I3.n = 14.0f;
                I3.o = this.c;
                frgLocationMap.q1.A().a(new cvd(I3));
                return;
            case 4:
                ne7 ne7 = (ne7) this.o;
                ne7.getClass();
                StringBuilder sb = new StringBuilder("startTimer: chatId = ");
                long j2 = this.b;
                sb.append(j2);
                sb.append(", sender = ");
                long j3 = this.c;
                sb.append(j3);
                z68.a("ne7", sb.toString());
                long currentTimeMillis = System.currentTimeMillis();
                Map a2 = ne7.a(j2);
                if (a2 != null && (oaa = (oaa) a2.get(Long.valueOf(j3))) != null) {
                    StringBuilder sb2 = new StringBuilder("startTimer: now - userTime = ");
                    long j4 = currentTimeMillis - oaa.a;
                    sb2.append(j4);
                    z68.a("ne7", sb2.toString());
                    if (j4 >= 6000) {
                        ne7.c(j2, j3);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ekd ekd = idb.b;
                wbf wbf = (wbf) ((pbf) ((ysc) this.o).h.getValue());
                Lazy lazy = wbf.e;
                q7d q7d = ((a74) ((s74) ((eef) lazy.getValue()).a.get())).f;
                hef b2 = q7d.b();
                b2.getClass();
                d7d a3 = d7d.a(1, "SELECT * FROM tasks WHERE type = ?");
                b2.c.getClass();
                a3.k(1, (long) 11);
                i6d i6d = b2.a;
                i6d.b();
                Cursor o2 = i6d.o(a3, (CancellationSignal) null);
                try {
                    int u = kne.u(o2, "id");
                    int u2 = kne.u(o2, "type");
                    int u3 = kne.u(o2, "status");
                    int u4 = kne.u(o2, "fails_count");
                    int u5 = kne.u(o2, "depends_request_id");
                    int u6 = kne.u(o2, "dependency_type");
                    int u7 = kne.u(o2, "data");
                    int u8 = kne.u(o2, "created_time");
                    ArrayList arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList.add(new vdf(o2.getLong(u), o9a.u(o2.getInt(u2)), o9a.t(o2.getInt(u3)), o2.getInt(u4), o2.getLong(u5), o2.getInt(u6), o2.isNull(u7) ? null : o2.getBlob(u7), o2.getLong(u8)));
                    }
                    o2.close();
                    a3.o();
                    List<tdf> c2 = q7d.c(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (tdf tdf : c2) {
                        hdb hdb = tdf.f;
                        if (hdb instanceof nc2) {
                            nc2 nc2 = (nc2) hdb;
                            if (nc2.a != this.b && nc2.o == this.c) {
                                String str = wbf.q;
                                idb idb = idb.TYPE_CHAT_MARK;
                                a67 a67 = z68.b;
                                if (a67 != null && a67.c()) {
                                    w78 w78 = w78.o;
                                    a67.d(w78, str, "Cancelling task of type=" + idb + ", task=" + tdf.f.getClass().getName() + ", id=" + tdf.a + ", status=" + tdf.b, (Throwable) null);
                                }
                                CopyOnWriteArraySet copyOnWriteArraySet = wbf.d;
                                long j5 = tdf.a;
                                copyOnWriteArraySet.add(Long.valueOf(j5));
                                arrayList2.add(Long.valueOf(j5));
                            }
                        }
                    }
                    ((eef) lazy.getValue()).e(arrayList2);
                    return;
                } catch (Throwable th) {
                    o2.close();
                    a3.o();
                    throw th;
                }
            default:
                ((i2) this.o).b(this.b, this.c);
                return;
        }
    }
}
