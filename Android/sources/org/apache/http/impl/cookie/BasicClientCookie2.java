package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.SetCookie2;

@Deprecated
public class BasicClientCookie2 extends BasicClientCookie implements SetCookie2 {
    private String commentURL;
    private boolean discard;
    private int[] ports;

    public BasicClientCookie2(String str, String str2) {
        super(str, str2);
    }

    public Object clone() throws CloneNotSupportedException {
        BasicClientCookie2 basicClientCookie2 = (BasicClientCookie2) super.clone();
        basicClientCookie2.ports = (int[]) this.ports.clone();
        return basicClientCookie2;
    }

    public String getCommentURL() {
        return this.commentURL;
    }

    public int[] getPorts() {
        return this.ports;
    }

    public boolean isExpired(Date date) {
        return this.discard || super.isExpired(date);
    }

    public boolean isPersistent() {
        return !this.discard && super.isPersistent();
    }

    public void setCommentURL(String str) {
        this.commentURL = str;
    }

    public void setDiscard(boolean z) {
        this.discard = z;
    }

    public void setPorts(int[] iArr) {
        this.ports = iArr;
    }
}
