package defpackage;

/* renamed from: hs0  reason: default package */
public abstract class hs0 {
    public boolean canRepeat() {
        return true;
    }

    public fm intoParam(String str) {
        return intoParam(new fs0(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(zp7 zp7);

    public final fm intoParam(fs0 fs0) {
        return new gs0(fs0, this);
    }
}
