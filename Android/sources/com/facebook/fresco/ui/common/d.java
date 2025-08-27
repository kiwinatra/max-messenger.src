package com.facebook.fresco.ui.common;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

public final class d extends j3h {
    public String b;
    public Object c;
    public Object o;
    public Object v;

    public final void n1() {
        this.c = null;
        this.o = null;
        this.v = null;
        o97 o97 = o97.a;
        wdg wdg = wdg.a;
        o1();
        ((ArrayList) this.a).clear();
    }

    public final void o1() {
        ((ArrayList) this.a).clear();
    }

    public final c p1() {
        return new c(this.b, this.c, this.o, this.v, CollectionsKt.toList((ArrayList) this.a));
    }
}
