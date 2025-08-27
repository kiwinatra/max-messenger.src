package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* renamed from: seb  reason: default package */
public final class seb implements Externalizable {
    public boolean a;
    public String b = "";
    public final ArrayList c = new ArrayList();
    public final ArrayList o = new ArrayList();
    public boolean v;
    public String w = "";

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.a = true;
            this.b = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.o.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.v = true;
            this.w = readUTF2;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            objectOutput.writeUTF(this.b);
        }
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) this.c.get(i)).intValue());
        }
        ArrayList arrayList = this.o;
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            objectOutput.writeUTF(this.w);
        }
    }
}
