package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: ib9  reason: default package */
public final /* synthetic */ class ib9 implements za3 {
    public final /* synthetic */ sd3 a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ long c;
    public final /* synthetic */ a32 o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long[] w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ ib9(sd3 sd3, long[] jArr, long j, a32 a32, String str, long[] jArr2, boolean z) {
        this.a = sd3;
        this.b = jArr;
        this.c = j;
        this.o = a32;
        this.v = str;
        this.w = jArr2;
        this.x = z;
    }

    public final void b(pa3 pa3) {
        z9f z9f;
        String str;
        int i;
        Object obj;
        String str2;
        String str3;
        a89 a89;
        long j;
        int i2;
        a89 a892;
        sd3 sd3 = this.a;
        sd3.getClass();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        long[] jArr = this.b;
        int length = jArr.length;
        int i3 = 0;
        while (true) {
            z9f = (z9f) sd3.f;
            if (i3 >= length) {
                break;
            }
            long j2 = jArr[i3];
            List list = (List) sd3.h;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a892 = (a89) it.next();
                    ha9 ha9 = a892.a;
                    i2 = i3;
                    if (ha9.b == j2 && ha9.Y != qe9.DELETED) {
                        break;
                    }
                    i3 = i2;
                }
            }
            i2 = i3;
            a892 = (a89) ((sjd) z9f).q().a(j2, true).n(xfd.b()).f();
            if (a892 != null) {
                arrayList.add(a892);
            }
            i3 = i2 + 1;
        }
        Collections.sort(arrayList, new oj4(13));
        Iterator it2 = arrayList.iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                break;
            }
            a89 a893 = (a89) it2.next();
            if (a893 != null) {
                ha9 ha92 = a893.a;
                if (ha92.Y != qe9.DELETED) {
                    long j3 = this.c;
                    int i4 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                    a32 a32 = this.o;
                    if (i4 != 0) {
                        w28 w28 = ha92.x0;
                        if (w28.G() > 1 && i4 > 0) {
                            cjf.u((List) w28.b, new g18(sd3, a893, a32, 23));
                            obj = new tud(new sud(a32.a, ha92.b, j3));
                            linkedList.add(obj);
                        }
                    }
                    if (ha92.F()) {
                        ype ype = ype.FORWARD;
                        d6a d6a = (d6a) sd3.g;
                        d6a.getClass();
                        String q = d6a.q(ype);
                        boolean isEmpty = TextUtils.isEmpty(q);
                        nd ndVar = (nd) d6a.b;
                        if (isEmpty) {
                            ndVar.e("STICKER_SENT");
                        } else {
                            ndVar.f("STICKER_SENT", q);
                        }
                    }
                    boolean K = a32.K();
                    m72 m72 = a32.b;
                    String str4 = K ? m72.g : null;
                    if (a32.K()) {
                        str = m72.I;
                    }
                    long j4 = m72.a;
                    if (ha92.q()) {
                        mc9 mc9 = a893.c;
                        long j5 = mc9.b;
                        String str5 = mc9.d;
                        String str6 = mc9.e;
                        a89 = mc9.c;
                        str2 = str6;
                        str3 = str5;
                        j = j5;
                    } else {
                        a89 = a893;
                        str2 = str;
                        str3 = str4;
                        j = j4;
                    }
                    mc9 mc92 = new mc9(2, j, a89, str3, str2, j4, ha92.c);
                    kvd kvd = new kvd(0, (String) null, false, CollectionsKt.emptyList());
                    kvd.b = mc92;
                    obj = new mvd(kvd);
                    linkedList.add(obj);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            String str7 = this.v;
            if (str7 != null) {
                str = str7.trim();
            }
            String str8 = str;
            if (!cvg.A(str8)) {
                i = 0;
                linkedList.add(0, new mvd(new kvd(0, str8, true, CollectionsKt.emptyList())));
                ((qra) ym.e()).c().e("ACTION_FORWARD_WITH_DESCRIPTION");
            } else {
                i = 0;
            }
            long[] jArr2 = this.w;
            int length2 = jArr2.length;
            for (int i5 = i; i5 < length2; i5++) {
                kud kud = new kud(jArr2[i5], new LinkedList(linkedList), 2);
                kud.e = this.x;
                ((sjd) z9f).A().a(new jvd(kud));
            }
        }
        if (!pa3.f()) {
            pa3.b();
        }
    }
}
