#### 在VSCode 下开发的processing项目

一个电子钢琴
![part6](part6.gif)
在方格上点击不同的区域，演奏不同的音符。

##### 基本介绍

​	用gradle和vscode开发完成，使用java的processing库，并没有使用processing的官方PDE

​	除了processing外还使用了java音频处理库minim，依赖在build.gradle有配置

##### 运行方式

1. 如果计算机中安装了gradle，直接打开piano文件夹，打开终端输入`gradle run`,就可以运行
2. 如果没有gradle，请先安装gradle，然后执行步骤1