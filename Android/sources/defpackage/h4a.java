package defpackage;

import java.util.HashMap;

/* renamed from: h4a  reason: default package */
public final /* synthetic */ class h4a implements tk3 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ h4a(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final void accept(Object obj) {
        a2a a2a = (a2a) obj;
        ype W = a2a.W();
        HashMap hashMap = a2a.Y;
        long j = this.a;
        jbd.c((mq4) hashMap.get(Long.valueOf(j)));
        ai5 ai5 = a2a.y;
        boolean z = this.b;
        bb3 h = ai5.h(j, z);
        jbf jbf = a2a.z;
        xa3 i = h.i(((kbf) jbf).c());
        jbf.getClass();
        xa3 l = i.l(((kbf) jbf).a());
        ao1 ao1 = new ao1(0, new g62(a2a, j, z, W), new v84(a2a, z, W));
        l.j(ao1);
        hashMap.put(Long.valueOf(j), ao1);
    }
}
