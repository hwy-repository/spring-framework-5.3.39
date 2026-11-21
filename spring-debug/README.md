# Spring Framework 源码调试模块

本模块用于本地调试 Spring Framework 5.3.39 源码，当前包含一个示例：

- `ClassPathXmlApplicationContextTest`：通过 `ClassPathXmlApplicationContext` 以 XML 方式创建容器

## 环境要求

- **JDK**：必须使用 JDK 8u262 及以上（源码使用了 `jdk.jfr.*`，旧版 JDK 8 如 8u131 不含该 API）。
  注意**不要使用 JDK 11**，构建插件开启了 `-Werror`，JDK 11 下 `isAccessible()` 等弃用警告会被当作编译错误。
  本机可用：`C:\Users\he875\.jdks\corretto-1.8.0_482`。
- 将 IDEA 的 Project SDK 与 Gradle JVM 都指向该 JDK，然后 Reload Gradle Project。

## 运行方式

在 IDEA 中直接运行 `ClassPathXmlApplicationContextTest` 的 `main` 方法即可
（注意使用已配置好的 Gradle 模块 `spring.spring-debug.main`，避免出现同名残留模块）。

命令行下可先编译验证：

```bash
./gradlew :spring-debug:compileJava
```

## 排查记录

搭建过程中遇到的编译失败问题及完整排查过程，见：

[2026-11-22-spring源码编译失败问题排查.md](note/2026-11-22-spring源码编译失败问题排查.md)
