## 学习笔记
#### shell命令学习
* 按列求和：awk '{sum += $1};END {print sum}' filename
* 文件的编码转换：iconv fileName -c -t utf-8 > newFile

#### git常用命令
* 从一个远程分支创建本地分支：git checkout origin/featureName -b localFeatureName
