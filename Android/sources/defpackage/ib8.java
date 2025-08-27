package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

/* renamed from: ib8  reason: default package */
public final class ib8 {
    public LinkedList a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: gb8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.gb8 r6) {
        /*
            r5 = this;
            java.util.LinkedList r0 = r5.a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Iterator r0 = r0.descendingIterator()
            r1 = 0
            r2 = r1
        L_0x000b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            gb8 r3 = (defpackage.gb8) r3
            if (r3 != 0) goto L_0x0023
            r0.remove()
            goto L_0x000b
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            r2 = r3
        L_0x0026:
            if (r3 != r6) goto L_0x000b
            if (r2 != r6) goto L_0x0044
            java.util.Set r3 = r6.a
            if (r3 == 0) goto L_0x0044
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            eb8 r4 = (defpackage.eb8) r4
            ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView r4 = (ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView) r4
            r4.stopAnimation()
            goto L_0x0032
        L_0x0044:
            r0.remove()
            goto L_0x000b
        L_0x0048:
            java.util.LinkedList r5 = r5.a
            java.util.Iterator r5 = r5.descendingIterator()
        L_0x004e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0067
            java.lang.Object r6 = r5.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            r1 = r6
            gb8 r1 = (defpackage.gb8) r1
            if (r1 != 0) goto L_0x0067
            r5.remove()
            goto L_0x004e
        L_0x0067:
            if (r1 == 0) goto L_0x0083
            java.util.Set r5 = r1.a
            if (r5 == 0) goto L_0x0083
            java.util.Iterator r5 = r5.iterator()
        L_0x0071:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r5.next()
            eb8 r6 = (defpackage.eb8) r6
            ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView r6 = (ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView) r6
            r6.playAnimation()
            goto L_0x0071
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib8.a(gb8):void");
    }

    public final void b(gb8 gb8) {
        Set<eb8> set;
        LinkedList linkedList = this.a;
        WeakReference weakReference = null;
        if (linkedList == null) {
            this.a = new LinkedList();
        } else {
            Iterator descendingIterator = linkedList.descendingIterator();
            gb8 gb82 = null;
            while (descendingIterator.hasNext()) {
                WeakReference weakReference2 = (WeakReference) descendingIterator.next();
                gb8 gb83 = (gb8) weakReference2.get();
                if (gb83 == null) {
                    descendingIterator.remove();
                } else {
                    if (gb82 == null) {
                        if (!(gb83 == gb8 || (set = gb83.a) == null)) {
                            for (eb8 eb8 : set) {
                                ((KeyboardLottieAnimationView) eb8).stopAnimation();
                            }
                        }
                        gb82 = gb83;
                    }
                    if (gb83 == gb8) {
                        descendingIterator.remove();
                        weakReference = weakReference2;
                    }
                }
            }
        }
        if (weakReference == null) {
            weakReference = new WeakReference(gb8);
        }
        this.a.add(weakReference);
        Set<eb8> set2 = gb8.a;
        if (set2 != null) {
            for (eb8 eb82 : set2) {
                ((KeyboardLottieAnimationView) eb82).playAnimation();
            }
        }
    }
}
