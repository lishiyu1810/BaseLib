package com.lsy.base.baselibrary.Utils;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by lsy on 2019/8/17.
 * 日志输出工具类
 */

public class LogUtils {

    private static boolean isDebug = true;

    static String mTag = "TAG";

    public static void error(String msg) {
        if (isDebug) {
            Log.e(mTag, msg);
        }
    }

    public static void warn(String msg) {
        if (isDebug) {
            Log.w(mTag, msg);
        }
    }

    public static void info(String msg) {
        if (isDebug) {
            Log.i(mTag, msg);
        }
    }

    public static void debug(String msg) {
        if (isDebug) {
            Log.d(mTag, msg);
        }
    }

    public static void verbose(String msg) {
        if (isDebug) {
            Log.v(mTag, msg);
        }
    }

    public static void e(String msg) {
        if (isDebug) {
            Log.e(mTag, msg);
        }
    }

    public static void w(String msg) {
        if (isDebug) {
            Log.w(mTag, msg);
        }
    }

    public static void i(String msg) {
        if (isDebug) {
            Log.i(mTag, msg);
        }
    }

    public static void d(String msg) {
        if (isDebug) {
            Log.d(mTag, msg);
        }
    }

    public static void v(String msg) {
        if (isDebug) {
            Log.v(mTag, msg);
        }
    }


    public static void w(String tag, String msg) {
        if (isDebug) {
            if (tag == null || "".equalsIgnoreCase(tag.trim())) {
                tag = mTag;
            }
            Log.w(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            if (tag == null || "".equalsIgnoreCase(tag.trim())) {
                tag = mTag;
            }
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            if (tag == null || "".equalsIgnoreCase(tag.trim())) {
                tag = mTag;
            }
            Log.d(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            if (tag == null || "".equalsIgnoreCase(tag.trim())) {
                tag = mTag;
            }
            Log.v(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            if (tag == null || "".equalsIgnoreCase(tag.trim())) {
                tag = mTag;
            }
            Log.e(tag, msg);
        }
    }

    public static void setDebug(boolean isDebug) {
        LogUtils.isDebug = isDebug;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    /**
     * 点击Log跳转到指定源码位置
     *
     * @param tag
     * @param msg
     */
    public static void showLog(String tag, String msg) {
        if (isDebug&&!TextUtils.isEmpty(msg) ) {
            if (TextUtils.isEmpty(tag)) tag = mTag;
            StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
            int currentIndex = -1;
            for (int i = 0; i < stackTraceElement.length; i++) {
                if (stackTraceElement[i].getMethodName().compareTo("showLog") == 0) {
                    currentIndex = i + 1;
                    break;
                }
            }
            if (currentIndex >= 0) {
                String fullClassName = stackTraceElement[currentIndex].getClassName();
                String className = fullClassName.substring(fullClassName
                        .lastIndexOf(".") + 1);
                String methodName = stackTraceElement[currentIndex].getMethodName();
                String lineNumber = String
                        .valueOf(stackTraceElement[currentIndex].getLineNumber());

                Log.i(tag, msg + "\n  ---->at " + className + "." + methodName + "("
                        + className + ".java:" + lineNumber + ")");
            } else {
                Log.i(tag, msg);
            }
        }
    }

}
