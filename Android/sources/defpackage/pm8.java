package defpackage;

/* renamed from: pm8  reason: default package */
public abstract class pm8 extends nm8 {
    public final /* synthetic */ sy8 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pm8(sy8 sy8) {
        super(sy8);
        this.w = sy8;
    }

    public final void P() {
        om8 om8 = new om8(this, this.w);
        this.b = om8;
        om8.onCreate();
    }
}
