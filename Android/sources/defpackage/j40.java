package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j40  reason: default package */
public final class j40 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public j40(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                return;
            case 2:
                this.b = new AtomicInteger(0);
                return;
            case 3:
                this.b = new AtomicInteger(0);
                return;
            case 4:
                this.b = new AtomicInteger(1);
                return;
            default:
                this.b = new AtomicInteger(0);
                return;
        }
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(new i40(runnable, 0));
                Locale locale = Locale.US;
                int andIncrement = this.b.getAndIncrement();
                thread.setName("CameraX-camerax_audio_" + andIncrement);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                int andIncrement2 = this.b.getAndIncrement();
                thread2.setName("CameraX-core_camera_" + andIncrement2);
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.b.getAndIncrement());
                return thread3;
            case 3:
                Thread thread4 = new Thread(runnable);
                Locale locale3 = Locale.US;
                int andIncrement3 = this.b.getAndIncrement();
                thread4.setName("CameraX-camerax_io_" + andIncrement3);
                return thread4;
            default:
                return new Thread(runnable, "ModernAsyncTask #" + this.b.getAndIncrement());
        }
    }
}
