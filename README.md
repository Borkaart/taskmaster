# 📝 TaskMaster Pro - Gestão de Tarefas Privadas

O **TaskMaster** é uma aplicação Full Stack desenvolvida em Java e Spring Boot para organização de tarefas. Diferente de listas comuns, este sistema oferece um ambiente multiusuário onde cada conta possui seu próprio banco de dados de tarefas privado e seguro.

---

## 🚀 Novas Funcionalidades (V2.0)

- **Sistema de Autenticação:** Login e cadastro de usuários com Spring Security.
- **Privacidade de Dados:** Cada usuário visualiza e gerencia apenas as suas próprias tarefas.
- **Segurança de Dados:** Criptografia de senhas utilizando o algoritmo **BCrypt**.
- **Interface Dinâmica:** UI moderna com Tailwind CSS e indicadores de prioridade baseados em Enums.
- **Persistência Relacional:** Relacionamento `@ManyToOne` entre Tarefas e Usuários no banco de dados.

---

## 🛠️ Tecnologias Utilizadas

- **Backend:** Java 17, Spring Boot 3, Spring Data JPA, Spring Security.
- **Frontend:** Thymeleaf, Tailwind CSS.
- **Banco de Dados:** H2 Database (In-memory para desenvolvimento).
- **Segurança:** BCrypt Password Encoder.

---

## 📸 Como ficou o projeto?

<img width="1069" height="834" alt="image" src="https://github.com/user-attachments/assets/bd51dd36-98a4-4109-af42-eec2b08e1620" />


---

## ⚙️ Como executar o projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Borkaart/taskmaster.git](https://github.com/Borkaart/taskmaster.git)

Importe o projeto na sua IDE (IntelliJ, Eclipse, etc).

Execute a classe TaskmasterApplication.

Acesse http://localhost:8080/cadastro para criar seu primeiro usuário.

---

## 📬 Contato

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/paulo-henrique-dos-anjos/)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:pborkart@outlook.com)
