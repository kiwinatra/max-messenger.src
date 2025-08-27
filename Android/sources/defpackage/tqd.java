package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: tqd  reason: default package */
public final class tqd implements Parcelable {
    public static final Parcelable.Creator<tqd> CREATOR = new g9d(6);
    public final k48 a;
    public final boolean b;
    public final Uri c;
    public final Uri o;
    public final String v;
    public final RectF w;
    public final Rect x;
    public final Uri y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqd(k48 k48, boolean z, Uri uri, Uri uri2, Uri uri3, int i) {
        this(k48, z, uri, uri2, (String) null, (RectF) null, (Rect) null, (i & Uuid.SIZE_BITS) != 0 ? null : uri3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqd)) {
            return false;
        }
        tqd tqd = (tqd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) tqd.a) && this.b == tqd.b && Intrinsics.areEqual((Object) this.c, (Object) tqd.c) && Intrinsics.areEqual((Object) this.o, (Object) tqd.o) && Intrinsics.areEqual((Object) this.v, (Object) tqd.v) && Intrinsics.areEqual((Object) this.w, (Object) tqd.w) && Intrinsics.areEqual((Object) this.x, (Object) tqd.x) && Intrinsics.areEqual((Object) this.y, (Object) tqd.y);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + ((this.c.hashCode() + g63.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        int i = 0;
        String str = this.v;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RectF rectF = this.w;
        int hashCode3 = (hashCode2 + (rectF == null ? 0 : rectF.hashCode())) * 31;
        Rect rect = this.x;
        int hashCode4 = (hashCode3 + (rect == null ? 0 : rect.hashCode())) * 31;
        Uri uri = this.y;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "SelectedLocalMediaItem(localMediaItem=" + this.a + ", isFile=" + this.b + ", photoEditorUri=" + this.c + ", thumbnail=" + this.o + ", photoEditorFilePath=" + this.v + ", relativeCrop=" + this.w + ", absoluteCrop=" + this.x + ", overlay=" + this.y + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeString(this.v);
        parcel.writeParcelable(this.w, i);
        parcel.writeParcelable(this.x, i);
        parcel.writeParcelable(this.y, i);
    }

    public tqd(k48 k48, boolean z, Uri uri, Uri uri2, String str, RectF rectF, Rect rect, Uri uri3) {
        this.a = k48;
        this.b = z;
        this.c = uri;
        this.o = uri2;
        this.v = str;
        this.w = rectF;
        this.x = rect;
        this.y = uri3;
    }
}
