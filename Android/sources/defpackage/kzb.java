package defpackage;

/* renamed from: kzb  reason: default package */
public final class kzb implements mzb {
    public final long a;

    public kzb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzb) && this.a == ((kzb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ProfilePhotoUpdate(photoId="), this.a, ")");
    }
}
