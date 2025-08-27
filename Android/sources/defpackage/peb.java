package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* renamed from: peb  reason: default package */
public final class peb implements Externalizable {
    public String a = "";
    public String b = "";
    public final ArrayList c = new ArrayList();
    public boolean o;
    public String v = "";
    public boolean w = false;
    public boolean x;
    public String y = "";

    public final void readExternal(ObjectInput objectInput) {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.o = true;
            this.v = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.x = true;
            this.y = readUTF2;
        }
        this.w = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            objectOutput.writeUTF(this.v);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            objectOutput.writeUTF(this.y);
        }
        objectOutput.writeBoolean(this.w);
    }
}
