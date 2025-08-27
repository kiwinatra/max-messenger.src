package defpackage;

import java.util.List;

/* renamed from: def  reason: default package */
public final /* synthetic */ class def implements zi6, nsb {
    public final /* synthetic */ eef a;
    public final /* synthetic */ List b;

    public /* synthetic */ def(eef eef, List list) {
        this.a = eef;
        this.b = list;
    }

    public Object apply(Object obj) {
        eef eef = this.a;
        eef.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return ua3.a;
        }
        def def = new def(eef, this.b);
        dac dac = eef.c;
        dac.getClass();
        return new fja(new mha(dac, def, 3));
    }

    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        eef eef = this.a;
        eef.getClass();
        List list = this.b;
        return !((Boolean) new tbe(new mka(2, new z52(10, eef, list)), new uqe(3, list), 3).i(new dre(28)).f()).booleanValue();
    }
}
