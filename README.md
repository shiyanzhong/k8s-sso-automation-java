# k8s-sso-automation-java
Kubernetes 企业级 SSO 单点登录 UI 自动化测试框架

## 一、项目概述
本项目是基于 Java + Selenium + TestNG + Allure 开发的 UI 自动化测试系统，
用于测试部署在 Kubernetes 上且使用 SSO 单点登录的企业系统，支持：
1. SSO 登录自动化
2. 核心页面加载验证
3. 表单提交、数据展示等业务流程自动化测试
4. 自动生成测试报告（通过率、失败详情、执行日志）

## 二、如何运行测试框架
1. 环境准备：JDK 25 + Maven 3.9.10
2. 进入项目根目录
3. 执行测试：
   mvn clean test
4. 生成并查看报告：
   allure serve allure-results

## 三、如何在 Kubernetes 环境中部署和运行
1. 构建 Docker 镜像
   docker build -t k8s-sso-automation .
2. 部署为 K8s 任务
   kubectl apply -f k8s-test-job.yaml
3. 查看运行状态
   kubectl logs job/k8s-sso-automation-job
4. 获取测试报告完成验证