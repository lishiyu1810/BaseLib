# BaseLib

android工具类库

## 一、导入
步骤1.将JitPack存储库添加到构建文件中，将其添加到存储库末尾的根build.gradle中：
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
步骤2.添加依赖项
[![](https://jitpack.io/v/lishiyu1810/BaseLib.svg)](https://jitpack.io/#lishiyu1810/BaseLib)
Tag为版本号
```java
	dependencies {
	        implementation 'com.github.lishiyu1810:BaseLib:Tag'
	}
```

## 二、工具类简介

类名  | 说明  
 ---- | ----- 
 ToastUtils  | 吐司相关 
 LogUtils  | 日志输出
SPUtils  | SharedPreferences数据存储 
TimeUtils  | 时间相关
ConstUtils  | 常量相关
ConvertUtils  | 转换相关




