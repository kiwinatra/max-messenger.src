package ru.ok.messages.media.chat;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgChatMediaLoader extends FrgBaseNonUi {
    public ye2 B1;

    public static ArrayList h3(List list, HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a89 a89 = (a89) it.next();
            int i = 0;
            while (true) {
                if (i >= a89.a.x0.G()) {
                    break;
                } else if (hashSet.contains(a89.a.x0.F(i).a)) {
                    arrayList.add(a89);
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        long j = this.x.getLong("ru.ok.tamtam.extra.CHAT_ID");
        HashSet hashSet = new HashSet(this.x.getIntegerArrayList("ru.ok.tamtam.extra.TYPES"));
        boolean z = this.x.getBoolean("ru.ok.tamtam.extra.DESC_ORDER");
        long j2 = this.x.getLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", -1);
        we2 we2 = (we2) this.q1.getAccessor().g(we2.class);
        Long valueOf = Long.valueOf(j2);
        we2.getClass();
        lfd lfd = we2.b;
        lfd lfd2 = we2.c;
        sv0 sv0 = we2.d;
        r62 r62 = we2.e;
        fa9 fa9 = we2.f;
        ed2 ed2 = we2.g;
        esb esb = we2.h;
        gb9 gb9 = we2.i;
        lfd lfd3 = we2.a;
        lfd lfd4 = lfd2;
        HashSet hashSet2 = hashSet;
        ye2 ye2 = r3;
        ye2 ye22 = new ye2(j, valueOf, z, hashSet, sv0, r62, fa9, ed2, esb, gb9, lfd3, lfd, lfd4);
        this.B1 = ye2;
        ye2.p.d(ye2);
        if (hashSet2.equals(e19.d)) {
            ye2 ye23 = this.B1;
            if (!ye23.k) {
                z68.c("ye2", "load: start", new Object[0]);
                ye23.d.clear();
                ye23.b(false);
            }
        }
    }

    public final void l2() {
        ye2 ye2 = this.B1;
        ye2.p.f(ye2);
        super.l2();
    }
}
