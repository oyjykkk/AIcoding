# AICoding

心理健康助手全栈项目（前端 `ai-vue` + 后端 `ai-springboot`）。

## 目录结构

```text
AIcoding/
├── ai-vue/           # Vue 3 + Vite 前端
├── ai-springboot/    # Spring Boot 后端
├── sql/              # 数据库脚本（建表 / 初始化）
├── .gitignore
└── .gitattributes
```

## 环境要求

- Node.js 18+（推荐使用 **pnpm**）
- JDK 17+
- Maven 3.8+（或使用项目自带 `mvnw`）
- MySQL 8+

## 启动说明

### 1. 数据库

将建表 / 初始化脚本放入 `sql/`，并在 MySQL 中创建对应库后执行。

后端数据源配置见：`ai-springboot/src/main/resources/application.yaml`

### 2. 后端

```bash
cd ai-springboot
./mvnw spring-boot:run
```

Windows 可用：

```bash
cd ai-springboot
mvnw.cmd spring-boot:run
```

### 3. 前端

```bash
cd ai-vue
pnpm install
pnpm dev
```

> 本仓库前端锁定文件为 `pnpm-lock.yaml`，请使用 pnpm，不要混用 npm/yarn。

## 说明

- 大体积压缩包、`node_modules`、`target`、IDE 本地配置等已由根目录 `.gitignore` 统一忽略。
- 本地/远程接口地址与端口以各子项目现有配置为准，按需自行调整。
