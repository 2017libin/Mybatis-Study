# Mybatis-Study

## Mybatis-01
> 基于配置文件的开发
1. mybatis-config.xml：基本配置
2. mybatis-config-01.xml
   1. 导入其他配置文件
   2. 别名配置
3. mybatis-config-02.xml
   1. 使用日志
## Mybatis-02、03
> 基于注解的开发
1. Lomlock的基本使用 
2. 关联和集合都能过**子查询**或者**联合查询**来实现
   1. 关联 - association   【多对一】
   2. 集合 - collection   【一对多】
   3. javaType和ofType
      1. JavaType  用来指定实体类中属性的类型
      2. ofType  用来指定映射到List或者集合中的 pojo类型，泛型中的约束类型！
## Mybatis-04
> 动态SQL
1. if标签：选择所有为true的分支
3. choose - when - otherwise标签：选择第一个匹配的分支，都不匹配则选择otherwise分支
4. set标签：生成set语句
5. where标签：生成where语句
6. sql标签：可共用的sql片段，通过include标签进行导入
7. 