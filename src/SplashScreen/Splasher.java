package SplashScreen;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import SplashScreen.*;
import jio.System.Drawing.*;

public class Splasher {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setAppName(java.lang.String value) {
    try {
      Javonet.getType("SplashScreen.Splasher").set("AppName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIcon(Image value) {
    try {
      Javonet.getType("SplashScreen.Splasher").set("Icon", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBackgroundImage(Image value) {
    try {
      Javonet.getType("SplashScreen.Splasher").set("BackgroundImage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static SplashForm getSplashForm() {
    try {
      Object res = Javonet.getType("SplashScreen.Splasher").<NObject>get("SplashForm");
      if (res == null) return null;
      return new SplashForm((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSplashForm(SplashForm param) {
    try {
      Javonet.getType("SplashScreen.Splasher").set("SplashForm", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Show() {
    try {
      Javonet.getType("SplashScreen.Splasher").invoke("Show");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Close() {
    try {
      Javonet.getType("SplashScreen.Splasher").invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
