package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* renamed from: kq9  reason: default package */
public final class kq9 implements yze {
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;

    public /* synthetic */ kq9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.v = obj5;
        this.w = obj6;
    }

    public void a(String str, String str2) {
        Map map = (Map) this.w;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public ua0 b() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((l55) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.o) == null) {
            str = tr1.j(str, " eventMillis");
        }
        if (((Long) this.v) == null) {
            str = tr1.j(str, " uptimeMillis");
        }
        if (((Map) this.w) == null) {
            str = tr1.j(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new ua0((String) this.a, (Integer) this.b, (l55) this.c, ((Long) this.o).longValue(), ((Long) this.v).longValue(), (Map) this.w);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public List c() {
        return SequencesKt.toList(SequencesKt.filter(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(((wze) this.w).c()), new uze(this, 0)), new uze(this, 1)), new duc(14)));
    }

    public fwd d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.o;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        bwd d = bwd.d((jq9) this.c, size);
        d.b.c = 1;
        za7 za7 = new za7(surface);
        this.a = za7;
        hd8.a(hd8.J(za7.e), new xe8(18, surface, surfaceTexture), ryg.j());
        d.b((za7) this.a, vy4.d, -1);
        cwd cwd = (cwd) this.w;
        if (cwd != null) {
            cwd.b();
        }
        cwd cwd2 = new cwd(new b87(2, this));
        this.w = cwd2;
        d.f = cwd2;
        return d.c();
    }

    public ArrayList e() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    public List f(String str) {
        return SequencesKt.toList(SequencesKt.map(SequencesKt.mapNotNull(SequencesKt.map(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(((wze) this.w).c()), new uze(this, 3)), new vze(this, str, 0)), new vze(this, str, 1)), new duc(15)), new vze(this, str, 2)));
    }

    public ArrayList g() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(e());
            synchronized (this.b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.v);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public void h() {
        ((yl4) this.b).b = -1;
        ((yl4) this.c).b = -1;
        ((yl4) this.o).b = -1;
        ((yl4) this.v).b = -1;
    }

    public tze i(vk3 vk3, String str) {
        String m = vk3.m();
        ArrayList arrayList = new ArrayList();
        pm3 k = vk3.k();
        String a2 = k != null ? k.a() : null;
        if (a2 != null) {
            arrayList.add(a2);
        }
        return ((zqd) this.b).r(vk3.r(), arrayList, m, str, vk3.u(((ltb) ((jtb) this.c)).a.p(), kl0.c), ((ptb) this.o).b(vk3.r()), ((drd) ((Lazy) this.v).getValue()).a(vk3.r()));
    }

    public List l(LinkedHashSet linkedHashSet) {
        return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(((wze) this.w).c()), new ued(7, linkedHashSet, this)), new uze(this, 2)));
    }
}
