package org.webrtc;

import org.webrtc.Camera1Session;
import org.webrtc.TextureBufferImpl;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((Camera1Session.AnonymousClass3) this.b).lambda$onPreviewFrame$1((byte[]) this.c);
                return;
            case 1:
                ((Camera1Session.AnonymousClass3) this.b).lambda$onPreviewFrame$0((byte[]) this.c);
                return;
            default:
                ((TextureBufferImpl) this.b).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.c);
                return;
        }
    }
}
