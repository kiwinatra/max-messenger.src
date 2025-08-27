package defpackage;

/* renamed from: ybd  reason: default package */
public abstract class ybd extends an7 {
    public vm7 dequeueWork() {
        try {
            tm7 tm7 = this.mJobImpl;
            if (tm7 != null) {
                return tm7.b();
            }
            synchronized (this.mCompatQueue) {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                vm7 remove = this.mCompatQueue.remove(0);
                return remove;
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new xm7(this, 1);
    }
}
