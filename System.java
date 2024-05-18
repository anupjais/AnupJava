// anupjaiswal:~$javap java.lang.System
// Compiled from "System.java"
public final class java.lang.System
{
  public static final java.io.InputStream in;
  public static final java.io.PrintStream out;
  public static final java.io.PrintStream err;
  static java.lang.ModuleLayer bootLayer;
  public static void setIn(java.io.InputStream);
  public static void setOut(java.io.PrintStream);
  public static void setErr(java.io.PrintStream);
  public static java.io.Console console();
  public static java.nio.channels.Channel inheritedChannel() throws java.io.IOException;
  public static void setSecurityManager(java.lang.SecurityManager);
  public static java.lang.SecurityManager getSecurityManager();
  public static native long currentTimeMillis();
  public static native long nanoTime();
  public static native void arraycopy(java.lang.Object, int, java.lang.Object, int, int);
  public static native int identityHashCode(java.lang.Object);
  public static java.util.Properties getProperties();
  public static java.lang.String lineSeparator();
  public static void setProperties(java.util.Properties);
  public static java.lang.String getProperty(java.lang.String);
  public static java.lang.String getProperty(java.lang.String, java.lang.String);
  public static java.lang.String setProperty(java.lang.String, java.lang.String);
  public static java.lang.String clearProperty(java.lang.String);
  public static java.lang.String getenv(java.lang.String);
  public static java.util.Map<java.lang.String, java.lang.String> getenv();
  public static java.lang.System$Logger getLogger(java.lang.String);
  public static java.lang.System$Logger getLogger(java.lang.String, java.util.ResourceBundle);
  public static void exit(int);
  public static void gc();
  public static void runFinalization();
  public static void load(java.lang.String);
  public static void loadLibrary(java.lang.String);
  public static native java.lang.String mapLibraryName(java.lang.String);
  static {};
}
