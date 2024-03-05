# 玩具级 starter

## 为什么做这个 starter

主要是为了跑通发布自定义 sdk 到 Maven 中央仓库的流程，自己以后写的 starter 可以让任何开发人员使用，无需下载源码本地 install

## 功能

- 传入 apikey 生成一个客户端，利用该客户端直接调用 sdk 编写者封装好的方法：输入例如 `codeep` ，返回 `hellocodeep`

## 如何使用

> ❗ 注意：由于该项目使用 SpringBoot 的版本是 3.0.2，而 SpringBoot 在 3 版本之后就最低支持 JDK 17 了，所以请确保你的 JDK 版本为 17+，以及 SpringBoot 版本在 3 以上

### 引入依赖
```
<dependency>
    <groupId>io.github.codeeeep</groupId>
    <artifactId>yuapi-client-sdk</artifactId>
    <version>0.0.1</version>
</dependency>
```

### 配置 YML

```
yuapi:
  client:
    api-key: test
```

### 注入客户端,直接访问

这里在 Spring Boot Test 中实验 
```
@SpringBootTest
class TestStarterApplicationTests {

    @Resource
    private YuApiClient yuApiClient;

    @Test
    void contextLoads() {
        String result = yuApiClient.getName("codeep");
        System.out.println(result);
    }

}
```

## 参考博客

这里有个很大的坑，网上的大部分博客都是基于 2024 年之前的，但不幸的是 [https://issues.sonatype.org/](https://issues.sonatype.org/) 在今年 2 月换了发布网站 [https://central.sonatype.org/](https://central.sonatype.org/)
所以，参考官方文档进行部署更为稳妥，这里贴出写的较好的博客仅供参考

[官方文档1](https://central.sonatype.org/publish/publish-maven/)

[官方文档2](https://central.sonatype.org/publish/requirements/)

[https://www.jb51.net/article/284320.htm](https://www.jb51.net/article/284320.htm)

[https://www.jb51.net/article/249377.htm](https://www.jb51.net/article/249377.htm)

[https://blog.csdn.net/pdsu161530247/article/details/105429597/](https://blog.csdn.net/pdsu161530247/article/details/105429597/)