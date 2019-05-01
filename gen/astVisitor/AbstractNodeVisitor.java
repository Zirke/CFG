package astVisitor;

import ast.visitable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class AbstractNodeVisitor<T>{

    public Object visit(visitable v) throws NoSuchMethodException{
        Method m = findMethod(v);
        try {
           return m.invoke(this, new Object[] { v });
        }
        catch ( IllegalAccessException e1 ) {
            System.out.println("Christoffer's fault exception");
        }
        catch ( InvocationTargetException e2 ) {
            //System.out.println(e2.getTargetException() +"he");
            //e2.getTargetException().printStackTrace();
        }
        return null;
    }

    private Method findMethod(visitable o) throws NoSuchMethodException{

        Class<? extends Object> nodeClass = o.getClass();
        Method ans = null;

        for (Class<? extends Object> c = nodeClass; c != Object.class
                && ans == null; c = c.getSuperclass()) {
            try {
                ans = getClass().getMethod("visit", new Class[] { c });
            } catch (NoSuchMethodException e) {
            }
        }

        Class<? extends Object> iClass = nodeClass;
        while (ans == null && iClass != Object.class) {
            Class<? extends Object>[] interfaces = iClass.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                try {
                    ans = getClass().getMethod("visit",
                            new Class[] { interfaces[i] });
                } catch (NoSuchMethodException e) {
                }
            }
            iClass = iClass.getSuperclass();
        }

        if (ans == null) {
            try {
                ans = getClass().getMethod("defaultVisit",
                        new Class[] { (new Object()).getClass() });
            } catch (NoSuchMethodException e) {
                e.printStackTrace(System.err);
            }
        }
        return ans;
    }
}