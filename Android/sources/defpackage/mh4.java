package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Triple;
import one.me.rlottie.RLottieDrawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mh4  reason: default package */
public final /* synthetic */ class mh4 implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh4 b;

    public /* synthetic */ mh4(oh4 oh4, int i) {
        this.a = i;
        this.b = oh4;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [fc4, java.lang.Object] */
    public void accept(Object obj) {
        int i = 0;
        switch (this.a) {
            case 2:
                List list = (List) obj;
                oh4 oh4 = this.b;
                oh4.getClass();
                z68.c("oh4", "loadRecentEmojis: loaded. size = %d", Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list);
                if (oh4.F0 == null) {
                    oh4.F0 = new ArrayList();
                    for (int i2 = 0; i2 < 40; i2++) {
                        CharSequence c = oh4.y.c(oh4.J0[i2]);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c);
                        Triple c2 = oh4.c(arrayList2);
                        oh4.F0.add(new e15(0, i2, c, arrayList2, (CharSequence) c2.getThird(), (String) c2.getFirst(), (RLottieDrawable) c2.getSecond()));
                    }
                }
                ArrayList arrayList3 = new ArrayList(oh4.F0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e15 e15 = (e15) it.next();
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            e15 e152 = (e15) it2.next();
                            if (cvg.c(e15.c.toString(), e152.c.toString())) {
                                arrayList3.remove(e152);
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList3);
                while (true) {
                    CopyOnWriteArrayList copyOnWriteArrayList = oh4.w0;
                    if (i < copyOnWriteArrayList.size()) {
                        g7b g7b = (g7b) copyOnWriteArrayList.get(i);
                        if (g7b.b == p7b.RECENTS) {
                            Drawable a2 = xoe.a(oh4.o.n);
                            Objects.requireNonNull(a2);
                            copyOnWriteArrayList.set(i, new hvc(a2, ((hvc) g7b).e, arrayList));
                        } else {
                            i++;
                        }
                    }
                }
                oh4.f(nh4.b);
                return;
            case 3:
                oh4 oh42 = this.b;
                oh42.getClass();
                z68.f("oh4", "loadRecentEmojis: failed", (Throwable) obj);
                oh42.f(nh4.b);
                return;
            case 4:
                this.b.e(nh4.v).a = new ArrayList((HashSet) new sha(jha.n((List) obj), new fj6(new HashSet()), new tb4(21)).f());
                return;
            case 6:
                oh4 oh43 = this.b;
                List list2 = (List) obj;
                oh43.y0 = list2;
                z68.c("oh4", "loadFavoriteStickerSetsPages: loaded=%s", list2);
                oh43.f(nh4.v);
                return;
            case 7:
                oh4 oh44 = this.b;
                oh44.getClass();
                z68.f("oh4", "loadFavoriteStickerSetsPages: failed", (Throwable) obj);
                oh44.f(nh4.v);
                return;
            case 9:
                oh4 oh45 = this.b;
                List list3 = (List) obj;
                oh45.getClass();
                if (list3.isEmpty()) {
                    oh45.z0 = null;
                } else {
                    hpe hpe = oh45.z0;
                    oh45.z0 = new hpe(hpe != null ? hpe.c : xoe.a(oh45.o.o), list3);
                }
                z68.c("oh4", "loadFavoriteStickersPage: loaded =%s", oh45.z0);
                oh45.f(nh4.o);
                return;
            case 10:
                oh4 oh46 = this.b;
                oh46.getClass();
                z68.f("oh4", "loadFavoriteStickersPage: failed", (Throwable) obj);
                oh46.f(nh4.o);
                return;
            case 13:
                List list4 = (List) obj;
                oh4 oh47 = this.b;
                oh47.getClass();
                z68.c("oh4", "loadEmojiGroups: loaded. size = %d", Integer.valueOf(list4.size()));
                oh47.g(p7b.EMOJI, new o25(oh47.v, list4));
                oh47.f(nh4.a);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                oh4 oh48 = this.b;
                oh48.getClass();
                z68.f("oh4", "loadEmojiGroups: failed", (Throwable) obj);
                oh48.f(nh4.a);
                return;
            case 16:
                List list5 = (List) obj;
                oh4 oh49 = this.b;
                oh49.getClass();
                z68.c("oh4", "loadRecentStickersAndGifs: loaded. size = %d", Integer.valueOf(list5.size()));
                while (true) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = oh49.w0;
                    if (i < copyOnWriteArrayList2.size()) {
                        g7b g7b2 = (g7b) copyOnWriteArrayList2.get(i);
                        if (g7b2.b == p7b.RECENTS) {
                            hvc hvc = (hvc) g7b2;
                            if (!list5.isEmpty()) {
                                ? obj2 = new Object();
                                obj2.d = "more_stickers";
                                obj2.e = "";
                                list5.add(new qq7(obj2));
                            }
                            Drawable a3 = xoe.a(oh49.o.n);
                            Objects.requireNonNull(a3);
                            copyOnWriteArrayList2.set(i, new hvc(a3, list5, hvc.f));
                        } else {
                            i++;
                        }
                    }
                }
                oh49.f(nh4.c);
                return;
            default:
                oh4 oh410 = this.b;
                oh410.getClass();
                z68.f("oh4", "loadRecentStickersAndGifs: failed", (Throwable) obj);
                oh410.f(nh4.c);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.concurrent.CountDownLatch, tp0, cla] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0098;
                case 5: goto L_0x0075;
                case 8: goto L_0x005e;
                case 11: goto L_0x0037;
                case 12: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.List r14 = (java.util.List) r14
            nh4 r0 = defpackage.nh4.c
            oh4 r13 = r13.b
            tq7 r13 = r13.e(r0)
            r13.a = r14
            oha r13 = r13.b(r14)
            java.lang.Object r13 = r13.f()
            java.util.List r13 = (java.util.List) r13
            return r13
        L_0x001c:
            java.util.HashSet r14 = (java.util.HashSet) r14
            oh4 r13 = r13.b
            r13.getClass()
            int r13 = r14.size()
            nh4[] r14 = defpackage.nh4.values()
            int r14 = r14.length
            r0 = 1
            int r14 = r14 - r0
            if (r13 >= r14) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            return r13
        L_0x0037:
            bqe r14 = (defpackage.bqe) r14
            oh4 r13 = r13.b
            r13.getClass()
            wxd r0 = new wxd
            long r1 = r14.a
            java.lang.String r3 = r14.c
            java.lang.String r3 = defpackage.o5a.z(r3)
            nh4 r4 = defpackage.nh4.v
            tq7 r13 = r13.e(r4)
            java.util.List r14 = r14.h
            oha r13 = r13.b(r14)
            java.lang.Object r13 = r13.f()
            java.util.List r13 = (java.util.List) r13
            r0.<init>(r1, r3, r13)
            return r0
        L_0x005e:
            java.util.List r14 = (java.util.List) r14
            nh4 r0 = defpackage.nh4.o
            oh4 r13 = r13.b
            tq7 r13 = r13.e(r0)
            r13.a = r14
            oha r13 = r13.b(r14)
            java.lang.Object r13 = r13.f()
            java.util.List r13 = (java.util.List) r13
            return r13
        L_0x0075:
            java.util.List r14 = (java.util.List) r14
            oh4 r13 = r13.b
            r13.getClass()
            gb3 r14 = defpackage.jha.n(r14)
            mh4 r0 = new mh4
            r1 = 11
            r0.<init>(r13, r1)
            yia r13 = new yia
            r1 = 3
            r13.<init>(r14, r0, r1)
            java.lang.Class<g7b> r14 = defpackage.g7b.class
            yia r13 = r13.e(r14)
            oha r13 = r13.B()
            return r13
        L_0x0098:
            java.util.List r14 = (java.util.List) r14
            oh4 r13 = r13.b
            t25 r0 = r13.w
            om0 r0 = r0.a
            r1 = 1
            rka r0 = r0.y(r1)
            tp0 r1 = new tp0
            r2 = 1
            r1.<init>(r2)
            r0.a(r1)
            java.lang.Object r0 = r1.a()
            if (r0 == 0) goto L_0x0133
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x00bd:
            int r4 = r14.size()
            if (r3 >= r4) goto L_0x0132
            java.lang.Object r4 = r14.get(r3)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            u25 r5 = r13.y
            java.lang.CharSequence r7 = r5.c(r4)
            java.util.Iterator r4 = r0.iterator()
            r5 = 0
        L_0x00d4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00fe
            java.lang.Object r6 = r4.next()
            d25 r6 = (defpackage.d25) r6
            java.util.List r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        L_0x00e6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00fc
            java.lang.Object r8 = r6.next()
            e15 r8 = (defpackage.e15) r8
            java.util.List r9 = r8.d
            boolean r9 = r9.contains(r7)
            if (r9 == 0) goto L_0x00e6
            java.util.List r5 = r8.d
        L_0x00fc:
            if (r5 == 0) goto L_0x00d4
        L_0x00fe:
            if (r5 != 0) goto L_0x010a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r4.add(r7)
            r8 = r4
            goto L_0x010b
        L_0x010a:
            r8 = r5
        L_0x010b:
            kotlin.Triple r4 = r13.c(r8)
            java.lang.Object r5 = r4.getFirst()
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r4.getSecond()
            r11 = r5
            one.me.rlottie.RLottieDrawable r11 = (one.me.rlottie.RLottieDrawable) r11
            java.lang.Object r4 = r4.getThird()
            r9 = r4
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            e15 r12 = new e15
            r5 = 0
            r4 = r12
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x0132:
            return r1
        L_0x0133:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L_0x0139:
            oh4 r13 = r13.b
            nh4 r14 = (defpackage.nh4) r14
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArrayList r0 = r13.w0
            int r0 = r0.size()
            java.util.List r1 = r13.y0
            int r1 = r1.size()
            int r1 = r1 + r0
            hpe r0 = r13.z0
            if (r0 == 0) goto L_0x0155
            r0 = 1
            goto L_0x0156
        L_0x0155:
            r0 = 0
        L_0x0156:
            int r1 = r1 + r0
            r14.<init>(r1)
            java.util.concurrent.CopyOnWriteArrayList r0 = r13.w0
            r14.addAll(r0)
            hpe r0 = r13.z0
            if (r0 == 0) goto L_0x0166
            r14.add(r0)
        L_0x0166:
            java.util.List r13 = r13.y0
            r14.addAll(r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh4.apply(java.lang.Object):java.lang.Object");
    }
}
