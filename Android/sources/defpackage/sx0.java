package defpackage;

/* renamed from: sx0  reason: default package */
public final /* synthetic */ class sx0 implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ sx0(wx0 wx0, int i) {
        this.a = i;
        this.b = wx0;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 135 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0005;
                case 2: goto L_0x0076;
                case 3: goto L_0x005c;
                case 4: goto L_0x0039;
                case 5: goto L_0x001f;
                case 6: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            wx0 r0 = r2.b
            monitor-enter(r0)
            r2 = 0
            r0.j = r2     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r2
        L_0x0011:
            r2 = move-exception
            goto L_0x000f
        L_0x0013:
            wx0 r0 = r2.b
            ux0 r3 = (defpackage.ux0) r3
            monitor-enter(r0)
            r0.k = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        L_0x001f:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            wx0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "wx0"
            java.lang.String r1 = "onClearCacheClicked: failed"
            defpackage.z68.f(r0, r1, r3)
            vx0 r2 = r2.h
            r3 = r2
            ru.ok.messages.views.fragments.base.FrgBase r3 = (ru.ok.messages.views.fragments.base.FrgBase) r3
            r3.a3()
            r2.r1()
            return
        L_0x0039:
            ux0 r3 = (defpackage.ux0) r3
            wx0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "wx0"
            java.lang.String r1 = "onClearCacheClicked: finished"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            vx0 r2 = r2.h
            r0 = r2
            ru.ok.messages.views.fragments.base.FrgBase r0 = (ru.ok.messages.views.fragments.base.FrgBase) r0
            r0.a3()
            java.lang.String r0 = r3.b
            r2.Y(r0)
            java.util.List r3 = r3.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2.F(r3)
            return
        L_0x005c:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            wx0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "wx0"
            java.lang.String r1 = "onClearCacheTypesPicked: failed"
            defpackage.z68.f(r0, r1, r3)
            vx0 r2 = r2.h
            r3 = r2
            ru.ok.messages.views.fragments.base.FrgBase r3 = (ru.ok.messages.views.fragments.base.FrgBase) r3
            r3.a3()
            r2.r1()
            return
        L_0x0076:
            ux0 r3 = (defpackage.ux0) r3
            wx0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "wx0"
            java.lang.String r1 = "onClearCacheTypesPicked: success"
            defpackage.z68.a(r0, r1)
            vx0 r2 = r2.h
            r0 = r2
            ru.ok.messages.views.fragments.base.FrgBase r0 = (ru.ok.messages.views.fragments.base.FrgBase) r0
            r0.a3()
            r2.p1()
            java.lang.String r3 = r3.b
            r2.Y(r3)
            return
        L_0x0095:
            ux0 r3 = (defpackage.ux0) r3
            wx0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "wx0"
            java.lang.String r1 = "onViewCreated: finished"
            defpackage.z68.a(r0, r1)
            java.lang.String r3 = r3.b
            vx0 r2 = r2.h
            r2.Y(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx0.accept(java.lang.Object):void");
    }

    public Object apply(Object obj) {
        jha c;
        wx0 wx0 = this.b;
        String str = (String) obj;
        synchronized (wx0) {
            wx0.j = null;
            c = wx0.c();
        }
        return c;
    }
}
