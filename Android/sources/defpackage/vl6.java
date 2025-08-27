package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import ru.ok.messages.gallery.GalleryResultViewModel;

/* renamed from: vl6  reason: default package */
public final /* synthetic */ class vl6 implements u2f, qk3 {
    public final /* synthetic */ a a;

    public /* synthetic */ vl6(a aVar) {
        this.a = aVar;
    }

    public void accept(Object obj) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", (Uri) obj);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        if (!ym.v.c().c.u()) {
            intent.addFlags(65536);
        }
        this.a.S2(intent, 88, (Bundle) null);
    }

    public Object get() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GalleryResultViewModel.class);
        a aVar = this.a;
        return (ul6) new bbg(orCreateKotlinClass, (Function0) new tc(15, aVar), (Function0) new tc(17, aVar), (Function0) new tc(16, aVar)).getValue();
    }
}
