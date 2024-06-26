// anupjaiswal:~$javap java.lang.ModuleLayer
// Compiled from "ModuleLayer.java"
public final class java.lang.ModuleLayer
{
  public java.lang.ModuleLayer defineModulesWithOneLoader(java.lang.module.Configuration, java.lang.ClassLoader);
  public java.lang.ModuleLayer defineModulesWithManyLoaders(java.lang.module.Configuration, java.lang.ClassLoader);
  public java.lang.ModuleLayer defineModules(java.lang.module.Configuration, java.util.function.Function<java.lang.String, java.lang.ClassLoader>);
  public static java.lang.ModuleLayer$Controller defineModulesWithOneLoader(java.lang.module.Configuration, java.util.List<java.lang.ModuleLayer>, java.lang.ClassLoader);
  public static java.lang.ModuleLayer$Controller defineModulesWithManyLoaders(java.lang.module.Configuration, java.util.List<java.lang.ModuleLayer>, java.lang.ClassLoader);
  public static java.lang.ModuleLayer$Controller defineModules(java.lang.module.Configuration, java.util.List<java.lang.ModuleLayer>, java.util.function.Function<java.lang.String, java.lang.ClassLoader>);
  public java.lang.module.Configuration configuration();
  public java.util.List<java.lang.ModuleLayer> parents();
  java.util.stream.Stream<java.lang.ModuleLayer> layers();
  public java.util.Set<java.lang.Module> modules();
  public java.util.Optional<java.lang.Module> findModule(java.lang.String);
  public java.lang.ClassLoader findLoader(java.lang.String);
  public java.lang.String toString();
  public static java.lang.ModuleLayer empty();
  public static java.lang.ModuleLayer boot();
  jdk.internal.module.ServicesCatalog getServicesCatalog();
  void bindToLoader(java.lang.ClassLoader);
  static java.util.stream.Stream<java.lang.ModuleLayer> layers(java.lang.ClassLoader);
  static {};
}
