package defpackage;

import android.widget.ImageButton;
import android.widget.ImageView;
import ru.ok.messages.calls.views.IncomingCallControlsView;

/* renamed from: fe7  reason: default package */
public final /* synthetic */ class fe7 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IncomingCallControlsView b;

    public /* synthetic */ fe7(IncomingCallControlsView incomingCallControlsView, int i) {
        this.a = i;
        this.b = incomingCallControlsView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                IncomingCallControlsView incomingCallControlsView = this.b;
                ImageButton imageButton = incomingCallControlsView.b;
                ImageView imageView = incomingCallControlsView.v;
                ImageView imageView2 = incomingCallControlsView.y;
                incomingCallControlsView.e();
                incomingCallControlsView.k(imageView, imageView2, 0, true);
                incomingCallControlsView.j(imageButton, 1, 0);
                return;
            case 1:
                IncomingCallControlsView incomingCallControlsView2 = this.b;
                ImageButton imageButton2 = incomingCallControlsView2.c;
                ImageView imageView3 = incomingCallControlsView2.x;
                ImageView imageView4 = incomingCallControlsView2.v0;
                incomingCallControlsView2.e();
                incomingCallControlsView2.k(imageView3, imageView4, 0, true);
                incomingCallControlsView2.j(imageButton2, 1, 0);
                return;
            default:
                IncomingCallControlsView incomingCallControlsView3 = this.b;
                ImageButton imageButton3 = incomingCallControlsView3.o;
                ImageView imageView5 = incomingCallControlsView3.w;
                ImageView imageView6 = incomingCallControlsView3.z;
                incomingCallControlsView3.e();
                incomingCallControlsView3.k(imageView5, imageView6, 0, true);
                incomingCallControlsView3.j(imageButton3, 1, 0);
                return;
        }
    }
}
