# FunctionalProgramming
kotlin的函数式编程（FunctionalProgramming）使用示例:  
1 java回调代替  
[链接名称](https://www.baidu.com/)
*************




-----------------------------
# 模块化 插件化 组件化  
# AMS   
![正常大小的圆角矩形](https://img.shields.io/badge/language-java-red.svg)
![带logo社交样式](https://img.shields.io/badge/GitHub-12k+-yellow.svg?style=social&logo=github)
[![](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![License](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Arsenal](https://img.shields.io/badge/Arsenal%20-%20SmartRefresh-4cae4c.svg)](https://android-arsenal.com/details/1/6001)
[![JCenter](https://img.shields.io/badge/%20JCenter%20-1.1.0-5bc0de.svg)](https://bintray.com/scwang90/maven/SmartRefreshLayout/_latestVersion)
[![MinSdk](https://img.shields.io/badge/%20MinSdk%20-%2012%2B%20-f0ad4e.svg)](https://android-arsenal.com/api?level=12)
[![Methods](https://img.shields.io/badge/Methods%20%7C%20Size%20-%20784%20%7C%20121%20KB-d9534f.svg)](http://www.methodscount.com/?)
``` java
@Override
protected void onDestroy() {
    EventBus.getDefault().unregister(this);
    super.onDestroy();
}
```

```kotlin
        var a = 1f
        text.setOnClickListener {
            println("text click")
            //点击事件失效
            text.startAnimation(TranslateAnimation(-100f,100f, -100f, 100f).apply {
                duration = 1000
                repeatMode = Animation.REVERSE
                fillAfter = true
            })
            text.animate().setDuration(1000)
                .translationX(a++)
                .translationY(a++)
                .start()
        }
```
