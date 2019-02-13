---
title: README
tags: Redis
grammar_cjkRuby: true
---
### 1. redis下载与安装
wget http://download.redis.io/releases/redis-4.0.6.tar.gz

tar -zxvf redis-4.0.6.tar.gz

yum install gcc

cd redis-4.0.6

make MALLOC=libc　　

cd src && make install

**服务化配置**
cd  redis-4.0.6/utils && ./install_server.sh

reboot 重启即可

验证: redis-cli 
安装成功,输出如下:
![安装成功输出](./images/1550039622430.png)

### 2. springboot整合redis


### 3. redis基本配置详解

### 4. redis高可用方案及优缺点

### 5. redis秒杀方案及优缺点