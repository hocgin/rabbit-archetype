# rabbit-archetype

> 这是一个脚手架，用于快速生成服务项目的框架。

![Maven Central](https://img.shields.io/maven-central/v/in.hocg.archetype/rabbit-archetype?style=flat-square)

如果对实现细节感兴趣可以参考: [实现细节](https://maven.apache.org/guides/mini/guide-creating-archetypes.html)

## 常见问题

### 关于 Jetbrains 产品添加 archetype 失败的问题

> [问题链接](https://youtrack.jetbrains.com/issue/IDEA-271557?_ga=2.175042914.1516110539.1646804655-206781671.1619053496)

官方已在 2022.1 版本进行修复。

如果不能进行升级或者需要在低版本下使用，可以参考使用 `mvn archetype:generate`
方式。或者参考这个链接：[手动创建 UserArchetypes.xml](https://stackoverflow.com/a/30451155)
