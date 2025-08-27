package org.apache.http.protocol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

@Deprecated
public final class BasicHttpProcessor implements HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList, Cloneable {
    protected List requestInterceptors = null;
    protected List responseInterceptors = null;

    public final void addInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        addRequestInterceptor(httpRequestInterceptor);
    }

    public void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            if (this.requestInterceptors == null) {
                this.requestInterceptors = new ArrayList();
            }
            this.requestInterceptors.add(httpRequestInterceptor);
        }
    }

    public void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        } else if (httpResponseInterceptor != null) {
            if (this.responseInterceptors == null) {
                if (i <= 0) {
                    this.responseInterceptors = new ArrayList();
                } else {
                    throw new IndexOutOfBoundsException(String.valueOf(i));
                }
            }
            this.responseInterceptors.add(i, httpResponseInterceptor);
        }
    }

    public void clearInterceptors() {
        clearRequestInterceptors();
        clearResponseInterceptors();
    }

    public void clearRequestInterceptors() {
        this.requestInterceptors = null;
    }

    public void clearResponseInterceptors() {
        this.responseInterceptors = null;
    }

    public Object clone() throws CloneNotSupportedException {
        BasicHttpProcessor basicHttpProcessor = (BasicHttpProcessor) super.clone();
        copyInterceptors(basicHttpProcessor);
        return basicHttpProcessor;
    }

    public BasicHttpProcessor copy() {
        BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        copyInterceptors(basicHttpProcessor);
        return basicHttpProcessor;
    }

    public void copyInterceptors(BasicHttpProcessor basicHttpProcessor) {
        if (this.requestInterceptors != null) {
            basicHttpProcessor.requestInterceptors = new ArrayList(this.requestInterceptors);
        }
        if (this.responseInterceptors != null) {
            basicHttpProcessor.responseInterceptors = new ArrayList(this.responseInterceptors);
        }
    }

    public HttpRequestInterceptor getRequestInterceptor(int i) {
        List list = this.requestInterceptors;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (HttpRequestInterceptor) this.requestInterceptors.get(i);
    }

    public int getRequestInterceptorCount() {
        List list = this.requestInterceptors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public HttpResponseInterceptor getResponseInterceptor(int i) {
        List list = this.responseInterceptors;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (HttpResponseInterceptor) this.responseInterceptors.get(i);
    }

    public int getResponseInterceptorCount() {
        List list = this.responseInterceptors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException, HttpException {
        if (this.requestInterceptors != null) {
            for (int i = 0; i < this.requestInterceptors.size(); i++) {
                ((HttpRequestInterceptor) this.requestInterceptors.get(i)).process(httpRequest, httpContext);
            }
        }
    }

    public void removeRequestInterceptorByClass(Class cls) {
        List list = this.requestInterceptors;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getClass().equals(cls)) {
                    it.remove();
                }
            }
        }
    }

    public void removeResponseInterceptorByClass(Class cls) {
        List list = this.responseInterceptors;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getClass().equals(cls)) {
                    it.remove();
                }
            }
        }
    }

    public void setInterceptors(List list) {
        if (list != null) {
            List list2 = this.requestInterceptors;
            if (list2 != null) {
                list2.clear();
            }
            List list3 = this.responseInterceptors;
            if (list3 != null) {
                list3.clear();
            }
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof HttpRequestInterceptor) {
                    addInterceptor((HttpRequestInterceptor) obj);
                }
                if (obj instanceof HttpResponseInterceptor) {
                    addInterceptor((HttpResponseInterceptor) obj);
                }
            }
            return;
        }
        throw new IllegalArgumentException("List must not be null.");
    }

    public final void addInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i) {
        addRequestInterceptor(httpRequestInterceptor, i);
    }

    public final void addInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        addResponseInterceptor(httpResponseInterceptor);
    }

    public final void addInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i) {
        addResponseInterceptor(httpResponseInterceptor, i);
    }

    public void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        } else if (httpRequestInterceptor != null) {
            if (this.requestInterceptors == null) {
                if (i <= 0) {
                    this.requestInterceptors = new ArrayList();
                } else {
                    throw new IndexOutOfBoundsException(String.valueOf(i));
                }
            }
            this.requestInterceptors.add(i, httpRequestInterceptor);
        }
    }

    public void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            if (this.responseInterceptors == null) {
                this.responseInterceptors = new ArrayList();
            }
            this.responseInterceptors.add(httpResponseInterceptor);
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) throws IOException, HttpException {
        if (this.responseInterceptors != null) {
            for (int i = 0; i < this.responseInterceptors.size(); i++) {
                ((HttpResponseInterceptor) this.responseInterceptors.get(i)).process(httpResponse, httpContext);
            }
        }
    }
}
