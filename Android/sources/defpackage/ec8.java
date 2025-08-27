package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: ec8  reason: default package */
public final class ec8 {
    public final gaf a;
    public final Lazy b;
    public final Lazy c;
    public final jx3 d;
    public final qz9 e = new qz9(6);
    public final LinkedHashMap f = new LinkedHashMap();
    public long g = -1;
    public boolean h = true;
    public boolean i;

    public ec8(gaf gaf, Lazy lazy, Lazy lazy2) {
        this.a = gaf;
        this.b = lazy;
        this.c = lazy2;
        this.d = e14.a(((osa) gaf).b());
        long[] jArr = bed.a;
    }

    public final void a(List list) {
        ybb ybb = ybb.CHAT_INIT_TO_RENDER;
        qz9 qz9 = this.e;
        xbb xbb = (xbb) qz9.c(ybb);
        if (xbb != null && xbb.e == -1) {
            xbb xbb2 = (xbb) qz9.c(ybb);
            if (xbb2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                xbb2.e = elapsedRealtime - xbb2.b;
                xbb2.h = list;
                f(elapsedRealtime);
            }
            if (!this.i) {
                this.g = ((a33) ((x23) this.b.getValue())).B();
            }
            ((ecb) this.c.getValue()).d(vbb.SUCCESS, (ubb) null);
        }
    }

    public final void b(List list) {
        ybb ybb = ybb.CHATS_INIT_TO_RENDER;
        qz9 qz9 = this.e;
        xbb xbb = (xbb) qz9.c(ybb);
        if (xbb != null && xbb.e == -1) {
            xbb xbb2 = (xbb) qz9.c(ybb);
            if (xbb2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                xbb2.e = elapsedRealtime - xbb2.b;
                xbb2.h = list;
                xbb xbb3 = (xbb) qz9.c(ybb.FOLDERS_INIT_TO_RENDER);
                if (xbb3 == null || xbb3.e != -1) {
                    f(elapsedRealtime);
                }
            }
            ((ecb) this.c.getValue()).e(vbb.SUCCESS, (ubb) null);
        }
    }

    public final acb c(tbb tbb) {
        List list;
        xbb xbb;
        ybb ybb = ybb.MAIN_ACTIVITY_INIT_TO_RENDER;
        qz9 qz9 = this.e;
        xbb xbb2 = (xbb) qz9.c(ybb);
        long j = 0;
        if (xbb2 != null) {
            if (!this.h) {
                xbb2 = null;
            }
            if (xbb2 != null) {
                xbb2.f = 0;
                j = 1;
            }
        }
        ybb ybb2 = ybb.FOLDERS_INIT_TO_RENDER;
        xbb xbb3 = (xbb) qz9.c(ybb2);
        long j2 = -1;
        if (xbb3 != null) {
            if (tbb != tbb.EVENT_OPEN_CHATS) {
                xbb3 = null;
            }
            if (xbb3 != null) {
                xbb3.f = j;
                j++;
                if (this.h) {
                    xbb xbb4 = (xbb) qz9.c(ybb);
                    xbb3.g = xbb4 != null ? xbb4.f : -1;
                }
            }
        }
        ybb ybb3 = ybb.CHATS_INIT_TO_RENDER;
        xbb xbb5 = (xbb) qz9.c(ybb3);
        if (xbb5 != null) {
            if (tbb != tbb.EVENT_OPEN_CHATS) {
                xbb5 = null;
            }
            if (xbb5 != null) {
                xbb5.f = j;
                j++;
                if (this.h) {
                    xbb xbb6 = (xbb) qz9.c(ybb);
                    xbb5.g = xbb6 != null ? xbb6.f : -1;
                }
            }
        }
        ybb ybb4 = ybb.CHAT_INIT_TO_RENDER;
        xbb xbb7 = (xbb) qz9.c(ybb4);
        if (xbb7 != null) {
            if (tbb != tbb.EVENT_OPEN_CHAT) {
                xbb7 = null;
            }
            if (xbb7 != null) {
                xbb7.f = j;
                if (this.h) {
                    xbb xbb8 = (xbb) qz9.c(ybb);
                    xbb7.g = xbb8 != null ? xbb8.f : -1;
                }
            }
        }
        int ordinal = tbb.ordinal();
        if (ordinal == 1) {
            List createListBuilder = CollectionsKt.createListBuilder();
            if (!this.h) {
                return null;
            }
            xbb xbb9 = (xbb) qz9.c(ybb);
            if (xbb9 != null) {
                j2 = xbb9.e;
                createListBuilder.add(xbb9);
            }
            xbb xbb10 = (xbb) qz9.c(ybb2);
            if (xbb10 != null) {
                createListBuilder.add(xbb10);
            }
            xbb xbb11 = (xbb) qz9.c(ybb3);
            if (xbb11 != null) {
                createListBuilder.add(xbb11);
            }
            list = CollectionsKt.build(createListBuilder);
        } else if (ordinal != 2) {
            return null;
        } else {
            List createListBuilder2 = CollectionsKt.createListBuilder();
            if (this.h && (xbb = (xbb) qz9.c(ybb)) != null) {
                j2 = xbb.e;
                createListBuilder2.add(xbb);
            }
            xbb xbb12 = (xbb) qz9.c(ybb4);
            if (xbb12 == null) {
                return null;
            }
            if (!this.h) {
                j2 = xbb12.e;
            }
            createListBuilder2.add(xbb12);
            list = CollectionsKt.build(createListBuilder2);
        }
        this.h = false;
        return new acb(j2, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.content.Intent r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.getAction()
            if (r3 == 0) goto L_0x0037
            int r0 = r3.hashCode()
            r1 = -1173447682(0xffffffffba0e9bfe, float:-5.440115E-4)
            if (r0 == r1) goto L_0x002c
            r1 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r0 == r1) goto L_0x0023
            r1 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r0 == r1) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0023:
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0037
            goto L_0x0035
        L_0x002c:
            java.lang.String r0 = "android.intent.action.MAIN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            r2.i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec8.d(android.content.Intent):void");
    }

    public final void e(tbb tbb, List list) {
        pm7 pm7 = (pm7) this.f.remove(tbb);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.i(((xbb) it.next()).a);
        }
        this.i = false;
    }

    public final void f(long j) {
        xbb xbb = (xbb) this.e.c(ybb.MAIN_ACTIVITY_INIT_TO_RENDER);
        if (xbb != null) {
            if (xbb.e != -1) {
                xbb = null;
            }
            if (xbb != null) {
                xbb.e = j - xbb.b;
            }
        }
    }
}
